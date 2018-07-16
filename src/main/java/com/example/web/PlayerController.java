package com.example.web;

import com.example.domain.Player;
import com.example.service.PlayerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("players")
public class PlayerController {
    @Autowired
    PlayerService playerService;

    @ModelAttribute
    PlayerForm setUpForm() {
        return new PlayerForm();
    }

    @RequestMapping(method = RequestMethod.GET)
    String list(Model model) {
        List<Player> players = playerService.findAll();
        model.addAttribute("players", players);
        return "players/list";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    String create(@Validated PlayerForm form, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return list(model);
        }
        Player player = new Player();
        BeanUtils.copyProperties(form, player);
        playerService.create(player);
        return "redirect:/players";
    }

    @RequestMapping(value = "edit", params = "form", method = RequestMethod.GET)
    String editForm(@RequestParam Integer playerId, PlayerForm form) {
        Player player = playerService.findOne(playerId);
        BeanUtils.copyProperties(player, form);
        return "players/edit";
    }

    @RequestMapping(value = "edit", method = RequestMethod.POST)
    String edit(@RequestParam Integer playerId, @Validated PlayerForm form, BindingResult result) {
        if (result.hasErrors()) {
            return editForm(playerId, form);
        }
        Player player = new Player();
        BeanUtils.copyProperties(form, player);
        player.setPlayerId(playerId);
        playerService.update(player);
        return "redirect:/players";
    }

    @RequestMapping(value = "edit", params = "goToTop")
    String goToTop() {
        return "redirect:/players";
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    String delete(@RequestParam Integer playerId) {
        playerService.delete(playerId);
        return "redirect:/players";
    }
}

package com.example.api;

import com.example.domain.Player;
import com.example.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("api/players")
public class PlayerRestController {
    @Autowired
    PlayerService playerService;

    // 選手全件取得
    @RequestMapping(method = RequestMethod.GET)
//    List<Player> getPlayers() {
//        List<Player> players = playerService.findAll();
//        return players;
//    }
    Page<Player> getPlayers(@PageableDefault Pageable pageable) {
        Page<Player> players = playerService.findAll(pageable);
        return players;
    }
    // 選手１件取得
    @RequestMapping(value = "{playerId}", method = RequestMethod.GET)
    Player getPlayer(@PathVariable Integer playerId) {
        Player player = playerService.findOne(playerId);
        return player;
    }
    // 選手新規作成
//    @RequestMapping(method = RequestMethod.POST)
//    @ResponseStatus(HttpStatus.CREATED)
//    Player postPlayers(@RequestBody Player player) {
//        return playerService.create(player);
//    }
    // 新規作成したリソースにアクセスするためのURIをHTTPレスポンスのLocationヘッダに設定
    @RequestMapping(method = RequestMethod.POST)
    ResponseEntity<Player> postPlayers(@RequestBody Player player, UriComponentsBuilder uriBuilder) {
        Player created = playerService.create(player);
        URI location = uriBuilder.path("api/players/{playerId}").buildAndExpand(created.getPlayerId()).toUri();
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(location);
        return new ResponseEntity<>(created, headers, HttpStatus.CREATED);
    }
    // 選手1件更新
    @RequestMapping(value = "{playerId}", method = RequestMethod.PUT)
    Player putPlayer(@PathVariable Integer playerId, @RequestBody Player player) {
        player.setPlayerId(playerId);
        return playerService.update(player);
    }
    // 選手1件削除
    @RequestMapping(value = "{playerId}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteCustomer(@PathVariable Integer playerId) {
        playerService.delete(playerId);
    }
}

package com.example.service;

import com.example.domain.Player;
import com.example.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    PlayerRepository playerRepository;

    public List<Player> findAll() {
        return playerRepository.findAllOrderByName();
    }

    public Player findOne(Integer playerId) {
        return playerRepository.findOne(playerId);
    }

    public Player create(Player player) {
        return playerRepository.save(player);
    }

    public Player update(Player player) {
        return playerRepository.save(player);
    }

    public void delete(Integer playerId) {
        playerRepository.delete(playerId);
    }

    public boolean exists(Integer playerId) {
        return playerRepository.exists(playerId);
    }

    public Page<Player> findAll(Pageable pageable) {
        return playerRepository.findAll(pageable);
    }
}
package com.example.service;

import com.example.domain.Player;
import com.example.domain.PlayerProfile;
import com.example.repository.PlayerProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerProfileService {
    @Autowired
    PlayerProfileRepository playerProfileRepository;

    public PlayerProfile find() {
        return playerProfileRepository.findPlayerProfile();
    }

    public PlayerProfile create(PlayerProfile playerProfile) {
        return playerProfileRepository.save(playerProfile);
    }

    public PlayerProfile update(PlayerProfile playerProfile) {
        return playerProfileRepository.save(playerProfile);
    }

    public void delete(Integer playerId) {
        playerProfileRepository.delete(playerId);
    }

    public boolean exists(Integer playerId) {
        return playerProfileRepository.exists(playerId);
    }
}
package com.example.repository;

import com.example.domain.PlayerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PlayerProfileRepository extends JpaRepository<PlayerProfile, Integer> {
    @Query("SELECT x FROM PlayerProfile x WHERE x.playerId")
    PlayerProfile findPlayerProfile();
}

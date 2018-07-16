package com.example.repository;

import com.example.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
    @Query("SELECT x FROM Player x ORDER BY x.lastName")
    List<Player> findAllOrderByName();
}

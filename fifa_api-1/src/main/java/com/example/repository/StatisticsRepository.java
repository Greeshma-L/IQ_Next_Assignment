package com.example.repository;

import com.example.entity.Statistics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StatisticsRepository extends JpaRepository<Statistics, Long> {

    @Query("SELECT s FROM Statistics s " +
            "WHERE (:gamesPlayed is null or s.games = :gamesPlayed) " +
            "AND (:minutesPlayed is null or s.minutes = :minutesPlayed) " +
            "AND (:goalsScored is null or s.goals = :goalsScored) " +
            "AND (:birthYear is null or s.birthYear = :birthYear)")
    List<Statistics> findByFilters(Integer gamesPlayed, Integer minutesPlayed, Integer goalsScored, Integer birthYear);

   
}

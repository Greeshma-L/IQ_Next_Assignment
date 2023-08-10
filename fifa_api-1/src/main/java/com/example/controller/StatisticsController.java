package com.example.controller;

import com.example.entity.Statistics;
import com.example.repository.StatisticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/statistics_api")
public class StatisticsController {

    @Autowired
    StatisticsRepository statisticsRepository;


    //returns all players' statistics data
    @GetMapping("/get-all-details")
    public ResponseEntity<List<Statistics>> getAllStatisticsData() {
        List<Statistics> statsList = new ArrayList<>();
        statisticsRepository.findAll().forEach(statsList::add);
        return new ResponseEntity<>(statsList, HttpStatus.OK);
    }
    
    // returns results of all statistical data of the player based upon the player id
    @GetMapping("/get-by-id/{id}")
    public Statistics getStatisticsDataById(@PathVariable Long id) {
        return statisticsRepository.findById(id).orElse(null);
    }

    //returns players' defense with filters
    @GetMapping("/apply-filter")
    public List<Statistics> getStatisticsDataWithFilters(
            @RequestParam(required = false) Integer gamesPlayed,
            @RequestParam(required = false) Integer minutesPlayed,
            @RequestParam(required = false) Integer goalsScored,
            @RequestParam(required = false) Integer birthYear) {
        return statisticsRepository.findByFilters(gamesPlayed, minutesPlayed, goalsScored, birthYear);
    }

   
}


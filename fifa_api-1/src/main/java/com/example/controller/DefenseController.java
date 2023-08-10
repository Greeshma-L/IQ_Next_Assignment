package com.example.controller;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.entity.*;
import org.springframework.http.ResponseEntity;
import com.example.repository.DefenseRepository;
import java.util.*;

@RestController
@RequestMapping("/defense_api")
public class DefenseController {
	

	@Autowired
	DefenseRepository defenseRepository;
	

	//returns all players' defense data
	 @GetMapping("/get-all-details")
	 public ResponseEntity<List<Defense>> getAllDefenseData() {
		 List<Defense> defList= new ArrayList<>();
		 defenseRepository.findAll().forEach(defList::add);
		 return new ResponseEntity<List<Defense>>(defList,HttpStatus.OK);
		
	 }
	 
	 //returns results of all defense data of the player based upon the player id
	 @GetMapping("/get-by-id/{id}")
	 public Defense getDefenseDataById(@PathVariable Long id) {
	     return defenseRepository.findById(id).orElse(null);
	 }
	 
	 //returns players' defense with filters 
	 @GetMapping("/apply-filter")
	 public List<Defense> getDefenseDataWithFilters(
	     @RequestParam(required = false) String position,
	     @RequestParam(required = false) String team,
	     @RequestParam(required = false) Integer tackles,
	     @RequestParam(required = false) Integer tacklesWon) {
	     return defenseRepository.findByFilters(position, team, tackles, tacklesWon);
	 }
	 
}


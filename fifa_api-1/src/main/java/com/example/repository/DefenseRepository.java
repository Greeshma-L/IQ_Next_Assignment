package com.example.repository;
import org.springframework.data.jpa.repository.*;
import java.util.List;
import com.example.entity.*;


public interface DefenseRepository extends JpaRepository<Defense,Long>{
	@Query("SELECT d FROM Defense d " +
	       "WHERE (:position is null or d.position = :position) " +
	       "AND (:team is null or d.team = :team) " +
	       "AND (:tackles is null or d.tackles = :tackles) " +
	       "AND (:tacklesWon is null or d.tacklesWon = :tacklesWon)")
	List<Defense> findByFilters(String position, String team, Integer tackles, Integer tacklesWon);
	
	
}

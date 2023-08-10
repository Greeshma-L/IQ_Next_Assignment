package com.example.entity;


import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "player_stats")
public class Statistics implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "player")
    private String player;

    @Column(name = "position")
    private String position;

    @Column(name = "team")
    private String team;

    @Column(name = "age")
    private String age;

    @Column(name = "club")
    private String club;

    @Column(name = "birth_year")
    private Integer birthYear;

    @Column(name = "games")
    private Integer games;

    @Column(name = "games_starts")
    private Integer gamesStarts;

    @Column(name = "minutes")
    private Integer minutes;

    @Column(name = "minutes_90s")
    private Double minutes90s;

    @Column(name = "goals")
    private Integer goals;

    @Column(name = "assists")
    private Integer assists;

    @Column(name = "goals_pens")
    private Integer goalsPens;

    @Column(name = "pens_made")
    private Integer pensMade;

    @Column(name = "pens_att")
    private Integer pensAtt;

    @Column(name = "cards_yellow")
    private Integer cardsYellow;

    @Column(name = "cards_red")
    private Integer cardsRed;

    @Column(name = "goals_per90")
    private Double goalsPer90;

    @Column(name = "assists_per90")
    private Double assistsPer90;

    @Column(name = "goals_assists_per90")
    private Double goalsAssistsPer90;

    @Column(name = "goals_pens_per90")
    private Double goalsPensPer90;

    @Column(name = "goals_assists_pens_per90")
    private Double goalsAssistsPensPer90;

    @Column(name = "xg")
    private Double xg;

    @Column(name = "npxg")
    private Double npxg;

    @Column(name = "xg_assist")
    private Double xgAssist;

    @Column(name = "npxg_xg_assist")
    private Double npxgXgAssist;

    @Column(name = "xg_per90")
    private Double xgPer90;

    @Column(name = "xg_assist_per90")
    private Double xgAssistPer90;

    @Column(name = "xg_xg_assist_per90")
    private Double xgXgAssistPer90;

    @Column(name = "npxg_per90")
    private Double npxgPer90;

    @Column(name = "npxg_xg_assist_per90")
    private Double npxgXgAssistPer90;

	public Statistics() {
		
	}

	public Statistics(Integer id, String player, String position, String team, String age, String club,
			Integer birthYear, Integer games, Integer gamesStarts, Integer minutes, Double minutes90s, Integer goals,
			Integer assists, Integer goalsPens, Integer pensMade, Integer pensAtt, Integer cardsYellow,
			Integer cardsRed, Double goalsPer90, Double assistsPer90, Double goalsAssistsPer90, Double goalsPensPer90,
			Double goalsAssistsPensPer90, Double xg, Double npxg, Double xgAssist, Double npxgXgAssist, Double xgPer90,
			Double xgAssistPer90, Double xgXgAssistPer90, Double npxgPer90, Double npxgXgAssistPer90) {
		super();
		this.id = id;
		this.player = player;
		this.position = position;
		this.team = team;
		this.age = age;
		this.club = club;
		this.birthYear = birthYear;
		this.games = games;
		this.gamesStarts = gamesStarts;
		this.minutes = minutes;
		this.minutes90s = minutes90s;
		this.goals = goals;
		this.assists = assists;
		this.goalsPens = goalsPens;
		this.pensMade = pensMade;
		this.pensAtt = pensAtt;
		this.cardsYellow = cardsYellow;
		this.cardsRed = cardsRed;
		this.goalsPer90 = goalsPer90;
		this.assistsPer90 = assistsPer90;
		this.goalsAssistsPer90 = goalsAssistsPer90;
		this.goalsPensPer90 = goalsPensPer90;
		this.goalsAssistsPensPer90 = goalsAssistsPensPer90;
		this.xg = xg;
		this.npxg = npxg;
		this.xgAssist = xgAssist;
		this.npxgXgAssist = npxgXgAssist;
		this.xgPer90 = xgPer90;
		this.xgAssistPer90 = xgAssistPer90;
		this.xgXgAssistPer90 = xgXgAssistPer90;
		this.npxgPer90 = npxgPer90;
		this.npxgXgAssistPer90 = npxgXgAssistPer90;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public Integer getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}

	public Integer getGames() {
		return games;
	}

	public void setGames(Integer games) {
		this.games = games;
	}

	public Integer getGamesStarts() {
		return gamesStarts;
	}

	public void setGamesStarts(Integer gamesStarts) {
		this.gamesStarts = gamesStarts;
	}

	public Integer getMinutes() {
		return minutes;
	}

	public void setMinutes(Integer minutes) {
		this.minutes = minutes;
	}

	public Double getMinutes90s() {
		return minutes90s;
	}

	public void setMinutes90s(Double minutes90s) {
		this.minutes90s = minutes90s;
	}

	public Integer getGoals() {
		return goals;
	}

	public void setGoals(Integer goals) {
		this.goals = goals;
	}

	public Integer getAssists() {
		return assists;
	}

	public void setAssists(Integer assists) {
		this.assists = assists;
	}

	public Integer getGoalsPens() {
		return goalsPens;
	}

	public void setGoalsPens(Integer goalsPens) {
		this.goalsPens = goalsPens;
	}

	public Integer getPensMade() {
		return pensMade;
	}

	public void setPensMade(Integer pensMade) {
		this.pensMade = pensMade;
	}

	public Integer getPensAtt() {
		return pensAtt;
	}

	public void setPensAtt(Integer pensAtt) {
		this.pensAtt = pensAtt;
	}

	public Integer getCardsYellow() {
		return cardsYellow;
	}

	public void setCardsYellow(Integer cardsYellow) {
		this.cardsYellow = cardsYellow;
	}

	public Integer getCardsRed() {
		return cardsRed;
	}

	public void setCardsRed(Integer cardsRed) {
		this.cardsRed = cardsRed;
	}

	public Double getGoalsPer90() {
		return goalsPer90;
	}

	public void setGoalsPer90(Double goalsPer90) {
		this.goalsPer90 = goalsPer90;
	}

	public Double getAssistsPer90() {
		return assistsPer90;
	}

	public void setAssistsPer90(Double assistsPer90) {
		this.assistsPer90 = assistsPer90;
	}

	public Double getGoalsAssistsPer90() {
		return goalsAssistsPer90;
	}

	public void setGoalsAssistsPer90(Double goalsAssistsPer90) {
		this.goalsAssistsPer90 = goalsAssistsPer90;
	}

	public Double getGoalsPensPer90() {
		return goalsPensPer90;
	}

	public void setGoalsPensPer90(Double goalsPensPer90) {
		this.goalsPensPer90 = goalsPensPer90;
	}

	public Double getGoalsAssistsPensPer90() {
		return goalsAssistsPensPer90;
	}

	public void setGoalsAssistsPensPer90(Double goalsAssistsPensPer90) {
		this.goalsAssistsPensPer90 = goalsAssistsPensPer90;
	}

	public Double getXg() {
		return xg;
	}

	public void setXg(Double xg) {
		this.xg = xg;
	}

	public Double getNpxg() {
		return npxg;
	}

	public void setNpxg(Double npxg) {
		this.npxg = npxg;
	}

	public Double getXgAssist() {
		return xgAssist;
	}

	public void setXgAssist(Double xgAssist) {
		this.xgAssist = xgAssist;
	}

	public Double getNpxgXgAssist() {
		return npxgXgAssist;
	}

	public void setNpxgXgAssist(Double npxgXgAssist) {
		this.npxgXgAssist = npxgXgAssist;
	}

	public Double getXgPer90() {
		return xgPer90;
	}

	public void setXgPer90(Double xgPer90) {
		this.xgPer90 = xgPer90;
	}

	public Double getXgAssistPer90() {
		return xgAssistPer90;
	}

	public void setXgAssistPer90(Double xgAssistPer90) {
		this.xgAssistPer90 = xgAssistPer90;
	}

	public Double getXgXgAssistPer90() {
		return xgXgAssistPer90;
	}

	public void setXgXgAssistPer90(Double xgXgAssistPer90) {
		this.xgXgAssistPer90 = xgXgAssistPer90;
	}

	public Double getNpxgPer90() {
		return npxgPer90;
	}

	public void setNpxgPer90(Double npxgPer90) {
		this.npxgPer90 = npxgPer90;
	}

	public Double getNpxgXgAssistPer90() {
		return npxgXgAssistPer90;
	}

	public void setNpxgXgAssistPer90(Double npxgXgAssistPer90) {
		this.npxgXgAssistPer90 = npxgXgAssistPer90;
	}

	@Override
	public String toString() {
		return "Statistics [id=" + id + ", player=" + player + ", position=" + position + ", team=" + team + ", age="
				+ age + ", club=" + club + ", birthYear=" + birthYear + ", games=" + games + ", gamesStarts="
				+ gamesStarts + ", minutes=" + minutes + ", minutes90s=" + minutes90s + ", goals=" + goals
				+ ", assists=" + assists + ", goalsPens=" + goalsPens + ", pensMade=" + pensMade + ", pensAtt="
				+ pensAtt + ", cardsYellow=" + cardsYellow + ", cardsRed=" + cardsRed + ", goalsPer90=" + goalsPer90
				+ ", assistsPer90=" + assistsPer90 + ", goalsAssistsPer90=" + goalsAssistsPer90 + ", goalsPensPer90="
				+ goalsPensPer90 + ", goalsAssistsPensPer90=" + goalsAssistsPensPer90 + ", xg=" + xg + ", npxg=" + npxg
				+ ", xgAssist=" + xgAssist + ", npxgXgAssist=" + npxgXgAssist + ", xgPer90=" + xgPer90
				+ ", xgAssistPer90=" + xgAssistPer90 + ", xgXgAssistPer90=" + xgXgAssistPer90 + ", npxgPer90="
				+ npxgPer90 + ", npxgXgAssistPer90=" + npxgXgAssistPer90 + "]";
	}
	
	

    
}

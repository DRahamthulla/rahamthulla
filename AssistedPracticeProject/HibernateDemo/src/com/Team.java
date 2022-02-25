package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teamID;
	private  String teamNmae;
    
	public Team() {
		
	}
	public int getTeamid() {
		return teamID;
	}

	public void setTeamid(int teamid) {
		this.teamID = teamid;
	}

	public String getTeamNmae() {
		return teamNmae;
	}

	public void setTeamNmae(String teamNmae) {
		this.teamNmae = teamNmae;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

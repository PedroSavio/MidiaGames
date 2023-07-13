package com.saviomidia.initProj.dto;

import com.saviomidia.initProj.entities.GameList;

public class GameListDTO {
	private Integer id;
	private String name;
	
	public GameListDTO() {}

	public GameListDTO(GameList entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

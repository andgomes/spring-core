package org.andgomes.rpg;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.andgomes.rpg.annotation.Dragon;

@Component
@Dragon
public class DragonQuest implements Quest {

	private String description;

	@Autowired
	public void setDescription(
			@Value("${dragonquest.desc}") String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
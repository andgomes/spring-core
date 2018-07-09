package org.andgomes.rpg;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import org.andgomes.rpg.annotation.Dragon;

@Component
@Dragon
public class DragonKillerKnight implements Knight {

	private Quest quest;

	@Autowired
	public DragonKillerKnight(@Dragon Quest quest) {
		setQuest(quest);
	}

	public void setQuest(Quest quest) {
		this.quest = quest;
	}

	public Quest getQuest() {
		return quest;
	}

	public boolean isInAQuest() {
		return getQuest() != null;
	}

}
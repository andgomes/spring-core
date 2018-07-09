package org.andgomes.rpg;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import org.andgomes.rpg.annotation.HolyGraal;

@Component
@HolyGraal
public class RoundTableKnight implements Knight {

	private Quest quest;

	@Autowired
	public RoundTableKnight(@HolyGraal Quest quest) {
		setQuest(quest);
	}

	public void setQuest(Quest quest) {
		this.quest = quest;
	}

	public Quest getQuest() {
		return quest;
	}

	public boolean isInAQuest() {
		return quest != null;
	}

}
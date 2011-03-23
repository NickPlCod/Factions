package com.bukkit.mcteam.factions.commands;

import com.bukkit.mcteam.factions.struct.Relation;

public class FCommandRelationNeutral extends FRelationCommand {
	
	public FCommandRelationNeutral() {
		aliases.add("neutral");
	}
	
	public void perform() {
		relation(Relation.NEUTRAL, parameters.get(0));
	}
	
}

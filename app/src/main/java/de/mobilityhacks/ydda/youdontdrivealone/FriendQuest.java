package de.mobilityhacks.ydda.youdontdrivealone;

public class FriendQuest extends Quest {
	
	public FriendQuest(String name, String description, int xpForPoints, int pointValue) {
		this.name = name;
		this.description = description;
		bar = new Bar(xpForPoints);
		this.pointValue = pointValue;
	}	
}

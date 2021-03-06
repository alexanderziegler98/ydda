package de.mobilityhacks.ydda.youdontdrivealone.social;

import android.content.Context;

import java.util.Random;

import de.mobilityhacks.ydda.youdontdrivealone.social.Bar;

//quests in general (super class for personal quest and friend quest)

/**
 * Quests will be created in a random way
 */
public class Quest {
    static int n = 0; //amount of quests
	String name;
	String description = null;
    String type;
	Bar bar;
    public Quest() {
        //factory();

    }

	int pointValue; //how many points do you get for completing this quest
	static int getN() {
        return n;
    }
	int getPointValue() {
		return pointValue;
	}
	
	Bar getBar() {
		return bar;
	}
	
	//for progressbar in android (theoretically)
	void update() {
		getBar().setCurrentXP();
	}

    /**
     * Computes a random Quest object
     * @return a subclass of the Quest class
     */
    public static Quest factory(Context context) {
        if (n%3 == 0) {
            return new QuestAvg(context);
        }
        else if (n%3 == 1) {
            return new QuestKms(context);
        }
        else {
            return new QuestPercentage(context);
        }
        /*String q = compQuest();
        if (q.equals("Avg")) {
            return new QuestAvg();
        }
        else if (q.equals("Kms")) {
            return new QuestKms();
        }
        else if (q.equals("Percentage")){
            return new QuestPercentage();
        }
        else {
            return null;
        }*/
    }
    public String getName() {
        return name;
    }
    public String getDesc() {
        return description;
    }
    public static String compQuest() {
        /*Random r = new Random();
        double q = r.nextDouble();

        if (q < 0.33) {
            return "Avg";
        }
        else if (q < 0.67) {
            return "Kms";
        }
        else {
            return "Percentage";
        }*/
        return "";
    }
    public static String computeType() {
        Random r = new Random();
        double t = r.nextDouble();
        if (t <= 0.5) {
            return "single";
        }
        else {
            return "group";
        }
    }

}

import java.util.List;
import java.util.ArrayList;
import java.util.*;

class DnDCharacter {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int hitpoint;

    public DnDCharacter() {
        strength = ability(rollDice());
        dexterity = ability(rollDice());
        constitution = ability(rollDice());
        intelligence = ability(rollDice());
        wisdom = ability(rollDice());
        charisma = ability(rollDice());
    }

    int ability(List<Integer> scores) {
        int mn = scores.get(0);
        int sum = 0;
        for(int i=0;i<4;i++){
            sum += scores.get(i);
            mn = Math.min(mn, scores.get(i));
        }
        return sum - mn;
    }

    List<Integer> rollDice() {
        List<Integer> roll = new ArrayList<>();
        
        roll.add(1 + (int)(Math.random() * 6));
        roll.add(1 + (int)(Math.random() * 6));
        roll.add(1 + (int)(Math.random() * 6));
        roll.add(1 + (int)(Math.random() * 6));

        return roll;
    }

    int modifier(int input) {
        return (input % 2 == 0) ? ((input - 10) / 2) : ((input < 10) ? ((input - 11) / 2) : (((input - 10) / 2)));
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return modifier(constitution) + 10;
    }
}

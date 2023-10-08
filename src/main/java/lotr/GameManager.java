package lotr;

import java.util.Random;

public class GameManager {
    
    public static void fight(Character c1, Character c2) {
        // Character first = CharacterFactory.createCharacter();
        // Character second = CharacterFactory.createCharacter();
        System.out.println("Now: " + c1.getClass().getSimpleName() + " vs " + c2.getClass().getSimpleName());

        Random random = new Random();
        while (true) {
            int move = random.nextInt(10) + 1;
            if (move%2 == 0) {
                c1.kick(c2);
                c2.kick(c1);
            } else {
                c2.kick(c1);
                c1.kick(c2);
            }

            System.out.println("HP's:\n" + "fighter 1 – " + c1.getHp() + "\nfighter 2 – " + c2.getHp());

            if ((c1.isAlive() && !c2.isAlive()) || (!c1.isAlive() && c2.isAlive()) || (!c1.isAlive() && !c2.isAlive())) {
                System.out.println("The winner is: " + ((c1.getHp() > c2.getHp()) ? "player 1" : "player 1"));
                break;
            }
        }
    }

    public static void main(String[] args) {
        Character first = CharacterFactory.createCharacter();
        Character second = CharacterFactory.createCharacter();
        while (first.getClass().getSimpleName() == second.getClass().getSimpleName()) {
            second = CharacterFactory.createCharacter();
        }
        fight(first, second);
    }

}

package lotr;

import kick.KingStrategy;

public class Knight extends Character{

    public Knight() {
        super((int) (Math.random() * 10) + 5, (int) (Math.random() * 10) + 5, new KingStrategy());
    }
    
}

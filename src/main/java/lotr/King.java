package lotr;

import kick.KingStrategy;

public class King extends Character{

    public King() {
        super((int) (Math.random() * 10) + 5, (int) (Math.random() * 10) + 5, new KingStrategy());
    }
    
}

package kick;

import lotr.Character;

public class KingStrategy implements KickStrategy{

    @Override
    public void kick(Character whoKick, Character opponent) {
        int damage = (int) (Math.random() * (whoKick.getPower() + 1));
        opponent.setHp(opponent.getHp() - damage);
    }
    
}

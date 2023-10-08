package kick;

import lotr.Character;

public class ElfStrategy implements KickStrategy{

    @Override
    public void kick(Character whoKick, Character opponent) {
        if (opponent.getHp() > whoKick.getHp()) {
            whoKick.setPower(whoKick.getPower() - 1);
        } else {
            opponent.setHp(0);
        }
    }
    
    
}

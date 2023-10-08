package lotr;

import kick.KickStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public abstract class Character {
    private int hp;
    private int power;
    private KickStrategy KickStrategy;


    public void kick(Character c){
        KickStrategy.kick(this, c);
    }

    public boolean isAlive() {
        return getHp() >0 ;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + this.hp + ", power=" + this.power + "}";
    }

    public void setHp(int hp) {
        this.hp = hp > 0 ? hp : 0;
    }
}

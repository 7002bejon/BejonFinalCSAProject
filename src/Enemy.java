public class Enemy {
    private int hp;
    private int attack;

    public Enemy(int hp, int attack) {
        this.hp = hp;
        this.attack = attack;
    }

    public void changeHP(int change) {
        hp += change;
    }

    public int getHP() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }
}

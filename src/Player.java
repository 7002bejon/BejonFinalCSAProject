public class Player {
    private int hp;
    private int attack;
    private String job;

    public Player(int hp, int attack, String job) {
        this.hp = hp;
        this.attack = attack;
        this.job = job;
    }

    public void changeHP(int change) {
        hp += change;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }


}


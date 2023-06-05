public class Player {
    private int hp;
    private int attack;
    private String job;

    public Player(int hp, int attack, String job) {
        this.hp = hp;
        this.attack = attack;
        this.job = job;
    }

    public Player() {
        hp = 0;
        attack = 0;
        job = null;
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

    public String getJob() {return job;}


    public void setHp(int hpNew) {hp = hpNew;}

    public void setAttack(int attackNew) {attack = attackNew;}

    public void setJob(String jobNew) {job = jobNew;}



}


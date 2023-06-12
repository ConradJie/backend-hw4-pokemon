import java.util.Random;

public abstract class Pokemon {
    private String name;
    private int level;
    private String food;
    private String sound;
    private String type;
    private int hp;
    private int xp;
    public Pokemon(String name) {
        this.name = name;
        this.type = "Pokemon";
        this.food = "a lot";
        this.sound = "noisy";
        this.level = 0;
        this.hp = 100;
        this.xp = 0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void eats() {
        System.out.println(this.getName() + " eats " + this.food);
    }

    public void speaks() {
        System.out.println(this.getName() + " speaks " + this.sound);
    }

    public void won() {
        this.setHp(getHp() + 1);
    }

    public void lost() {
        this.setHp(getHp() - 1);
    }

    public void showHealthPoints() {
        System.out.println("Health points of " + getName() + ": " + getHp());
    }

    public abstract void action();

    public void attack(Pokemon opponent) {
        Random random = new Random();
        boolean won = getHp() + random.nextInt(100) >= opponent.getHp() + random.nextInt(100);
        if (won) {
            won();
            opponent.lost();
        } else {
            lost();
            opponent.won();
        }
        System.out.printf("%s has %s from %s\n",
                getName(),
                won ? "won" : "lost",
                opponent.getName());
    }

    @Override
    public String toString() {
        return "{name: " + this.name +
                ", type: " + this.type +
                ", sounds: " + this.sound +
                ", food: " + this.food +
                ", level: " + this.level +
                ", hp: " + this.hp +
                ", xp: " + this.xp + "}";
    }
}

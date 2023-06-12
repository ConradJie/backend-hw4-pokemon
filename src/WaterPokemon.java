import java.util.Random;

public class WaterPokemon extends Pokemon {
    private int speed;
    private int presure;

    public WaterPokemon(String name, int speed, int presure) {
        super(name);
        this.speed = speed;
        this.presure = presure;
        this.setType("Water");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPresure() {
        return presure;
    }

    public void setPresure(int presure) {
        this.presure = presure;
    }

    public void surf() {
        System.out.println(this.getName() + " surf at speed " + this.speed);
    }

    public void hydroPump() {
        System.out.println(this.getName() + " uses a hydro prump with a precure of " + this.presure);
    }

    @Override
    public void action() {
        Random random = new Random();
        if (random.nextInt(2) % 2 == 0) {
            surf();
        } else {
            hydroPump();
        }

    }

    @Override
    public String toString() {
        return "{name: " + getName() +
                ", type: " + getType() +
                ", sounds: " + getSound() +
                ", food: " + getFood() +
                ", hp: " + getHp() +
                ", xp: " + getXp() +
                ", speed: " + getSpeed() +
                ", presure: " + getPresure() + "}";
    }
}

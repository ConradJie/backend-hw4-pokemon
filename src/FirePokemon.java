import java.util.Random;

public class FirePokemon extends Pokemon {
    private String inferno;
    private String pyroBall;

    public FirePokemon(String name, String inferno, String pyroBall) {
        super(name);
        this.inferno = inferno;
        this.pyroBall = pyroBall;
        this.setType("Fire");
    }

    public String getInferno() {
        return inferno;
    }

    public void setInferno(String inferno) {
        this.inferno = inferno;
    }

    public String getPyroBall() {
        return pyroBall;
    }

    public void setPyroBall(String pyroBall) {
        this.pyroBall = pyroBall;
    }

    public void inferno() {
        System.out.println(this.getName() + " uses " + this.inferno + " inferno");
    }

    public void pyroBall() {
        System.out.println(this.getName() + " uses " + pyroBall + " pyro ball");
    }

    @Override
    public void action() {
        Random random = new Random();
        if (random.nextInt(2) % 2 == 0) {
            inferno();
        } else {
            pyroBall();
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
                ", inferno: " + getInferno() +
                ", pyroBall: " + getPyroBall() + "}";

    }
}

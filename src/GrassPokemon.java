public class GrassPokemon extends Pokemon {
    private String stuff;
    private int liter;

    public GrassPokemon(String name, String stuff, int liter) {
        super(name);
        this.stuff = stuff;
        this.liter = liter;
        this.setType("Grass");

    }

    public String getStuff() {
        return stuff;
    }

    public void setStuff(String stuff) {
        this.stuff = stuff;
    }

    public int getLiter() {
        return liter;
    }

    public void setLiter(int liter) {
        this.liter = liter;
    }

    public void rainDance() {
        System.out.println(getName() + " does a rain dance and gets " + this.liter + " liters of water");
    }

    public void scratch() {
        System.out.println(getName() + " scratches " + this.stuff);
    }

    @Override
    public void action() {
        rainDance();
    }

    @Override
    public String toString() {
        return "{name: " + getName() +
                ", type: " + getType() +
                ", sounds: " + getSound() +
                ", food: " + getFood() +
                ", hp: " + getHp() +
                ", xp: " + getXp() +
                ", stuff: " + getStuff() +
                ", liter:" + getLiter() + "}";
    }
}


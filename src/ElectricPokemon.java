public class ElectricPokemon extends Pokemon {
    int volt;
    int accurancy;

    public ElectricPokemon(String name, int volt, int accurancy) {
        super(name);
        this.volt = volt;
        this.accurancy = accurancy;
        this.setType("Electric");
    }

    public int getVolt() {
        return volt;
    }

    public void setVolt(int volt) {
        this.volt = volt;
    }

    public int getAccurancy() {
        return accurancy;
    }

    public void setAccurancy(int accurancy) {
        this.accurancy = accurancy;
    }

    public void voltTackle() {
        System.out.println(getName() + " does a volt tackle with " + getVolt() + " volt");
    }

    public void electroBall() {
        System.out.println(getName() + " throws an electro ball with " + getAccurancy() + " yard accurency");
    }

    @Override
    public void action() {
        voltTackle();
    }

    @Override
    public String toString() {
        return "{name: " + getName() +
                ", type: " + getType() +
                ", sounds: " + getSound() +
                ", food: " + getFood() +
                ", hp: " + getHp() +
                ", xp: " + getXp() +
                ", volt: " + getVolt() +
                ", accurancy: " + getAccurancy() + "}";
    }
}

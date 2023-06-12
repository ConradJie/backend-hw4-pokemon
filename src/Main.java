import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        FirePokemon fire = new FirePokemon("Fighter", "red", "thunder");
        fire.setFood("hot peppers");
        fire.setSound("zoef");
        WaterPokemon water = new WaterPokemon("Aqua", 10, 100);
        water.setFood("seaweed");
        water.setSound("blub");
        GrassPokemon grass = new GrassPokemon("Hopper", "soil", 10);
        grass.setSound("Moo");
        ElectricPokemon electric = new ElectricPokemon("Disco", 220, 5);

        electric.setSound("wham");
        electric.eats();
        electric.speaks();

        System.out.println(fire);
        System.out.println(water);
        System.out.println(grass);
        System.out.println(electric);

        electric.action();
        grass.action();
        electric.attack(grass);
        electric.showHealthPoints();
        grass.showHealthPoints();

        for (int i = 0; i < 5; i++) {
            fire.action();
            water.action();
            fire.attack(water);
            fire.showHealthPoints();
            water.showHealthPoints();
        }

    }
}

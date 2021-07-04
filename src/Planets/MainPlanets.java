package Planets;

public class MainPlanets {
    public static void main(String[] args) {

        Planet pl[] = new Planet[4];
        pl[0] = new Earth();
        pl[1] = new Mars();
        pl[2] = new Mercury();
        pl[3] = new Uranus();
        for (int i=0; i< pl.length; i++) {
            float g = ((PlanetInterface) pl[i]).getG();
            String n = ((Planet) pl[i]).getPlName();
            System.out.println("Planet " + n + " has a g=" + g + "м/с2");
        }
    }
}






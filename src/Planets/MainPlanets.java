package Planets;

public class MainPlanets {
    public static void main(String[] args) {

        Planet pl[] = new Planet[4];
        pl[0] = new Earth();
        pl[1] = new Mars();
        pl[2] = new Mercury();
        pl[3] = new Uranus();
        for (Planet i : pl) {
            System.out.println("Planet " + i + " has a g=" + i.getG() + "м/с2");
        }
    }
}






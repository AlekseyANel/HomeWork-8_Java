package Planets;

public class Uranus extends Planet implements PlanetInterface {
    String plName="Уранус";
    int number = 7;
        double mas = 41260000;
        float G = (float) 8.87;

    public String getPlName() {
        return plName;
    }
        int getNumber() {
            return number;
        }
        double getMas() {
            return mas;
        }

        public float getG() {
            return G;
        }
    }

package Planets;

public class Uranus extends Planet implements PlanetInterface {
        int number = 7;
        double mas = 41260000;
        float G = (float) 8.87;

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

package Planets;

public class MainPlanets {
    public static void main(String[] args) {

        Planet pl[] = new Planet[4];
        pl[0] = new Earth();
        pl[1] = new Mars();
        pl[2] = new Mercury();
        pl[3] = new Uranus();
        for (Planet i : pl) {
            System.out.println("Planet "+i+ " has a " + i.G);
        }
    }


    abstract class Planet {
        int number; //№ планеты от солнца
        double mas; // масса
        float G; //ускорение св.падения

        abstract int getNumber();
        abstract double getMas();
    }

    interface PlanetInterface {
        float getG(); //как-бы аьстрактный метод получения G
    }

    class Earth extends Planet implements PlanetInterface {
        int number = 3;
        double mas = 597360000;
        float G = (float) 9.780327;

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

    class Mars extends Planet implements PlanetInterface {
        float G = (float) 3.721 ;
        int number = 4;
        double mas = 997360000;

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

    class Mercury extends Planet implements PlanetInterface {
        int number = 1;
        double mas = 97360000;
        float G = (float) 3.7;

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

    class Uranus extends Planet implements PlanetInterface {
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
}






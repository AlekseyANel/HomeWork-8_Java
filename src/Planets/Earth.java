package Planets;

public class Earth extends Planet implements PlanetInterface {
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

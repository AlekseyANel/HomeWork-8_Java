package Planets;

public class Mars extends Planet implements PlanetInterface {
    String plName="Марс";
    float G = (float) 3.721 ;
    int number = 4;
    double mas = 997360000;


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
package Planets;

public    class Mercury extends Planet implements PlanetInterface {
    String plName="Меркурий";
    int number = 1;
    double mas = 97360000;
    float G = (float) 3.7;

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
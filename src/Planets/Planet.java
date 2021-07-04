package Planets;

abstract class Planet {
    String plName; // имя планеты
    int number; //№ планеты от солнца
    double mas; // масса

    abstract String getPlName();
    abstract int getNumber();
    abstract double getMas();
}
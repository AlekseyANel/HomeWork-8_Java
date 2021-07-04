package Planets;

abstract class Planet {
    int number; //№ планеты от солнца
    double mas; // масса
    float G; //ускорение св.падения

    abstract int getNumber();
    abstract double getMas();
}
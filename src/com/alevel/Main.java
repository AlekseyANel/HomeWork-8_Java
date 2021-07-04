package com.alevel;

public class Main {

    public static void main(String[] args) {
        Week[] weeks = Week.values();//создали массив weeks на основе энама-перечисления Week
        for (Week w : weeks) {//циклом перебираем каждый объект массива weeks
            System.out.println(w.getDayName()+w.getWww());//выводим два метода с захваченными значениями
            // полей оъектов энама Week

        }

    }
}

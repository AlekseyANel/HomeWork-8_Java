package com.alevel;

public enum Week {//Основной энам
    MONDAY("Monday", WorkDays.WORKDAY.workName),//объект энама Week с двумя полями
    TUESDAY("Tuesday", WorkDays.WORKDAY.workName),
    WEDNESDAY("Wednesday", WorkDays.WORKDAY.workName),
    THURSDAY("Thursday", WorkDays.WORKDAY.workName),
    FRIDAY("Friday", WorkDays.WORKDAY.workName),
    SATURDAY("Saturday", WorkDays.WEEKENDDAY.workName),
    SUNDAY("Sunday", WorkDays.WEEKENDDAY.workName);

    String dayName;
    String www;
    Week(String dayName, String www) {//конструктор для присваивания константе в ENAMe текстовые поля
        this.dayName=dayName;
        this.www = www;
        }

    enum WorkDays {//вложенный энам
        WORKDAY(" - is a work day"),//объект энама WorkDays с одним полем
        WEEKENDDAY(" - is weekend day");

        String workName;
        WorkDays(String workName){//конструктор для присваивания константе в ENAMe WorkDays текстовое имя
            this.workName=workName;
        }

    }


    public String getDayName() {//метод геттер для получения значения переменной/поля dayName
        return dayName;
    }
    public String getWww() {//метод геттер для получения значения переменной/поля www
        return www;
    }
}

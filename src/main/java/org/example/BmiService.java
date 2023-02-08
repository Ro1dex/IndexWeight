package org.example;

public class BmiService {

    public double calculate(double height, int i) {
        //степень для оператора
        int a2 = 2;
        //Переводим в метры
        double heightM = height / 100;
        //Оператор для воведения в степень
        return i / Math.pow(heightM,a2);
    }
}

package org.example;

public class BmiService {

    public double calculate(double height, int weight) {
        //степень для оператора
        int degree = 2;
        //Переводим в метры
        double heightM = height / 100;
        //Оператор для воведения в степень
        return weight / Math.pow(heightM,degree);
    }
}

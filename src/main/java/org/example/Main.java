package org.example;

public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        //Рост в см
        int growth = 180;
        //Вес
        int weight = 70;

        double index = service.calculate(growth, weight);

        System.out.println(index);

    }
}
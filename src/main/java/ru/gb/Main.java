package ru.gb;
import ru.gb.converter.Celsius;
import ru.gb.converter.Fahrenheit;
import java.util.Scanner;
/**** Основной класс приложения. Здесь мы можем описать
 * его основное назначение и способы взаимодействия с ним.*/

public class Main {

    /**
     * Точка входа в программу. С неё всегда всё начинается.
     *
     * @param args стандартные аргументы командной строки
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру: ");
        double temperature = scanner.nextDouble();
        System.out.println("Выберите единицу измерения (C/F): ");
        String unit = scanner.next();
        if (unit.equalsIgnoreCase("C")) {
            Celsius converter = new Celsius();
            float result = converter.convert((float) temperature);
            System.out.println(Decorator.decorate(result) + "F");
        } else if (unit.equalsIgnoreCase("F")) {
            Fahrenheit converter = new Fahrenheit();
            float result = converter.convert((float) temperature);
            System.out.println(Decorator.decorate(result) + "C");
        } else {
            System.out.println("Неверная единица измерения");
        };
    }
}
package by.epam.unit03.main;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Task08 tempObject = new Task08();
        tempObject.function();
    }

    private void function() {
        String arithmetic;
        String stop = "";
        double x;
        double y;
        while (!stop.equals("#")) {
            System.out.println("Введите значение х");
            x = new Scanner(System.in).nextInt();
            System.out.println("Введите значение у");
            y = new Scanner(System.in).nextInt();
            System.out.println("Введите арифметический знак");
            arithmetic = new Scanner(System.in).next();
            if (arithmetic.equals("+")) {
                System.out.println("Результат:" + (x + y));
            } else if (arithmetic.equals("-")) {
                System.out.println("Результат:" + (x - y));
            } else if (arithmetic.equals("*")) {
                System.out.println("Результат:" + (x * y));
            } else if (arithmetic.equals("/") & (y != 0)) {
                System.out.println("Результат:" + (x / y));
            } else if (arithmetic.equals("/") & (y == 0)) {
                System.out.println("ERROR: Деление на \"0\" недопустимо");
            } else {
                System.out.println("ERROR: Введен неверный арифметический знак");
            }
            System.out.println("Для того, что бы завершить работу калькулятора, введите \"#\"");
            System.out.println("Для продолжения работы введите любой символ и нажмите \"ENTER\"");
            stop = new Scanner(System.in).next();
        }

    }
}

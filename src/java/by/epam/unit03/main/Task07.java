package by.epam.unit03.main;

import java.util.*;

public class Task07 {
    public static void main(String[] args) {

        String romanNumber = "V";
        Task07 tempObject = new Task07();
        System.out.println(tempObject.converter(romanNumber));
    }

    // Я так понимаю, что "цифра" - это от 0 до 9? тогда все просто:
    private int converter(String romanNumber){
        String[] romanStrings = {"Пустое значение", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        if (!Arrays.asList(romanStrings).contains(romanNumber)){
            return 0;
        }
        return Arrays.asList(romanStrings).indexOf(romanNumber);
    }
    // либо можно сделать перебор массива через фор
    // либо можно городить if/switch

    // либо делать через Map`ы,
    // это если нужно сделать для числа любого размера, либо для конвертации в обратную сторону
}

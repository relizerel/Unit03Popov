package by.epam.unit03.main;

import com.sun.istack.internal.NotNull;

import java.util.List;

public class Task03 {
    public static void main(String[] args) {
        int startNumber = 0;
        int endNumber = 10;
        Task03 tempObject = new Task03();
        System.out.println(tempObject.createList(startNumber, endNumber));
    }

    private int createList(int start, int end){
        int result = 1;
        while (start <= end) {
            int temp = 0;
            for (int i = 0; i <= start; i++){
                temp = temp + i;
            }
            start++;
//            System.out.println(result + " * " + temp);
            if (temp == 0) continue;
            result *= temp;
        }
        return result;
    }
}

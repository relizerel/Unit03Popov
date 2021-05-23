package by.epam.unit03.main;

import java.util.ArrayList;
import java.util.List;

public class Task01 {
    public static void main(String[] args) {
        Task01 tempObject = new Task01();
        int endNumber = 3;
        tempObject.function1(endNumber);
//        System.out.println(tempObject.function2(endNumber));
    }

    private void function1(int end){
        for (int i = 1; i <= end; i++){
            for (int j = 1; j <= end; j++){
                System.out.print(i*j + " ");
            }
            System.out.println(" ");
        }
    }

    private List<String> function2(int end){
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= end; i++){
            List<Integer> temp = new ArrayList<>();
            for (int j = 1; j <= end; j++){
                temp.add(j-1, i*j);
            }
            result.add("\n" + temp);
        }
        return result;
    }
}

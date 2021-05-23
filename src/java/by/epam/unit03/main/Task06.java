package by.epam.unit03.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task06 {
    public static void main(String[] args) {
        int a = 1_234_567_456;
        int b = 387_456_789;
        Task06 tempObject = new Task06();
        tempObject.function(a, b);
    }

    private void function(int a, int b){
        List<Integer> tempA = createList(a);
        List<Integer> tempB = createList(b);
        Set<Integer> result = new TreeSet<>();
        for (int i: tempA){
            for (int j: tempB){
                if (i == j){
                    result.add(j);
                }
            }
        }
        System.out.println(result);
    }

    private List<Integer> createList(int x){
        List<Integer> result = new ArrayList<>();
        while (x != 0) {
            result.add(x % 10);
            x /= 10;
        }
        return result;
    }
}

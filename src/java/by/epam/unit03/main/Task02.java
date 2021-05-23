package by.epam.unit03.main;

public class Task02 {
    public static void main(String[] args) {
        Task02 tempObject = new Task02();
        int startNumber = 0;
        int endNumber = 99;
        System.out.println(tempObject.function(startNumber, endNumber));
    }

    private int function(int start, int end){
        int result = 0;
        while (start <= end) {
            result = result + start;
//            System.out.println(result + " + " + start);
            start++;
        }
        return result;
    }
}

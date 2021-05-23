package by.epam.unit03.main;

public class Task04 {
    public static void main(String[] args) {
        int x = -5;
        Task04 tempObject = new Task04();
        tempObject.function(x);
    }

    private void function(double x){
        System.out.println("    x     y   ");
        while (x <= 5) {
            double y = 5 - (x * x /2);
            System.out.println("    " + x + "    " + y);
            x = x + 0.5;
        }
    }
}

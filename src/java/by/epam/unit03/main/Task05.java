package by.epam.unit03.main;

public class Task05 {
    public static void main(String[] args) {
        double a = -5;
        double b = 5;
        double h = 0.5;
        Task05 tempObject = new Task05();
        tempObject.function(a, b, h);
    }
    private void function(double a, double b, double h){
        double x = a;
        while (x <= b) {
            double y = 2 * Math.tan(x/2) + 1;
            System.out.println("    " + x + "    " + y);
            x = x + h;
        }
    }
}

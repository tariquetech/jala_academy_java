public class MethodOverloadingExFive {

    public int addition(int a, int b) {
        return a + b;
    }

    public double addition(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloadingExFive obj = new MethodOverloadingExFive();
        int sum = obj.addition(10,11);
        double sum1 = obj.addition(5.5,5.8);
        System.out.println("Sum (int): " + sum);
        System.out.println("Sum (double): " + sum1);
    }
}

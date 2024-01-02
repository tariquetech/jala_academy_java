public class MethodOverloadingExFourth {

    public void displayInfo(int number) {
        System.out.println("Number: " + number);
    }

    public void displayInfo(String message) {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        MethodOverloadingExThird obj = new MethodOverloadingExThird();
        obj.displayInfo(42);
        obj.displayInfo("Hello, how are you!");

    }
}

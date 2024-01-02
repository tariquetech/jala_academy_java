public class MethodOverloadingExThird {

    public void displayInfo(String message) {
        System.out.println("Message: " + message);
    }

    public void displayInfo(int number) {
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        MethodOverloadingExThird obj = new MethodOverloadingExThird();
        obj.displayInfo("Good Morning!");
        obj.displayInfo(32);

    }
}

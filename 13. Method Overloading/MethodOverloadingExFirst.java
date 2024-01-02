public class MethodOverloadingExFirst {

    public int addition(int a,int b){
        int c = a+b;
        return c;
    }
    public int addition(int a,int b,int c){
        int sum = a+b+c;
        return sum;
    }

    public static void main(String[] args) {
        MethodOverloadingExFirst obj = new MethodOverloadingExFirst();
        int sum = obj.addition(5,5);
        int sum1 = obj.addition(5,5,5);
        System.out.println("Result of First Addition Method "+sum);
        System.out.println("Result of Second Addition Method "+sum1);
    }
}
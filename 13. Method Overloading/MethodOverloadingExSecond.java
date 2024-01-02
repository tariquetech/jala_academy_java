public class MethodOverloadingExSecond {

    public void addition(int a,int b){
        int c = a+b;
        System.out.println(c);
    }
    public void addition(int a,int b,String msg){
        int sum = a+b;
        System.out.println(msg+" "+sum);
    }

    public static void main(String[] args) {
        MethodOverloadingExSecond obj = new MethodOverloadingExSecond();
        obj.addition(5,5);
        obj.addition(6,5,"Addition of 6 and 5 is:");
    }
}
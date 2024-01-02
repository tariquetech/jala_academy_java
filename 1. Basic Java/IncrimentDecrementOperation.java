class IncrimentDecrementOperation {


public static void main(String[] args){

   int a = 5;

   incr(a);       // 5
   decr(a);       // 5
   incr1(a);       // 5
   decr1(a);       // 5
 
}

public static void incr(int a){
  System.out.println(a++);
}

public static void decr(int a){
  System.out.println(a--);
}

public static void incr1(int a){
  System.out.println(++a);
}

public static void decr1(int a){
  System.out.println(--a);
}


}

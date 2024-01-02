class StaticProblemOne{

  
  public static void main(String[] args){
  // 1. Different ways creating a string

    // (one way) Using String Literal:
    String str1 = "Hello, World!";
    System.out.println(str1);

    // (second way) Using the new Keyword:
    String str2 = new String("Hello, World!");
    System.out.println(str2);

    // (third way) Using StringBuilder or StringBuffer
    StringBuilder stringBuilder = new StringBuilder("Hello");
    stringBuilder.append(", World!");
    String str3 = stringBuilder.toString();
    System.out.println(str3);


    // 2. Concatenating two strings using + operator
    String str4 = "Mohammad";
    String str5 = "Tarique"; 
    System.out.println(str4 + " " + str5);

   // 3. Finding the length of the string
    String myName = "Mohammad Tarique Gulam Rabbani";
    int length = myName.length();
    System.out.println("Length of name is "+length);

   // 4. Extract a string using Substring
   String sub = str5.substring(2,5);
   System.out.println(sub);
  
   // 5. Searching in strings using indexOf()
   String str6 = "My Name is Mohammad Tarique"; 
   
   int search = str6.indexOf("Mohammad"); // return 11 
   System.out.println(search);


   // 6. Matching a String Against a Regular Expression With matches()
    
   String str7 = "helloA12";
   // regular expression that matches strings containing at least one 
   // uppercase letter, one lowercase letter, and one digit (number)
   String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).+$";

   boolean flag =  str7.matches(regex);
   if(flag){
        System.out.println("The string matches the regular expression.");
   } else {
        System.out.println("The string does not match the regular expression.");
   }  

  
   // 7 Comparing strings using the methods equals()

   String str8 = "Tarique";
   String str9 = "tarique";
   boolean status =  str8.equals(str9);
   if(status){
    System.out.println("String is equal");
   }else{
    System.out.println("String is not equal");
   }


   
   // 8 equalsIgnoreCase(), startsWith(), endsWith() and compareTo()

   // equalsIgnoreCase(): compares two strings ignoring their case.
   boolean status1 = str1.equalsIgnoreCase(str2);
   if (status1) {
    System.out.println("Strings are equal (case-insensitive)");
     } else {
    System.out.println("Strings are not equal");
    }

    // startsWith(): checks if a string starts with a specified prefix.
    String str10 = "Hello, World!";

    boolean status2 = str10.startsWith("Hello");

    if (status2) {
        System.out.println("String starts with 'Hello'");
    } else {
        System.out.println("String does not start with 'Hello'");
    }

    // endsWith(): checks if a string ends with a specified suffix.
    boolean status3 = str10.endsWith("World!");
    if (status3) {
       System.out.println("String ends with 'World!'");
    } else {
       System.out.println("String does not end with 'World!'");
    }

    // compareTo(): compares two strings lexicographically.
    // The compareTo() method returns a negative value if the calling 
    // string comes before the argument string, 
    // a positive value if it comes after, and 0 if the strings are equal.

     String str11 = "apple";
     String str12 = "banana";

     int result = str11.compareTo(str12);

     if (result < 0) {
         System.out.println("str11 comes before str12 "+result);
     } else if (result > 0) {
         System.out.println("str11 comes after str12 "+result);
     } else {
         System.out.println("str11 and str12 are equal "+result);
     }


   // 9 Trimming strings with trim()

   String strWithSpace = "       hiii        ";
   String strTrim =  strWithSpace.trim();
   System.out.println("Without Trim Function String is : " +strWithSpace);
   System.out.println("With Trim Function String is : " +strTrim);
 

   // 10. Replacing characters in strings with replace()
   String replaceStr = myName.replace('T','K');
   System.out.println(replaceStr);
  

   // 11. Splitting strings with split()
   String strWithComma = "apple,orange,banana,grape";
   String[] splitStr = strWithComma.split(",");
   for (String fruits : splitStr) {
       System.out.println(fruits);       
   }

   // 12. Converting Numbers to Strings with valueOf()
   int number = 123;
   String numberToStr = String.valueOf(number);
   System.out.println(numberToStr);

   // 13. Converting integer objects to Strings
        // Integer object
        Integer intValue = 42;

        // Method 1: Using String.valueOf()
        String stringValue1 = String.valueOf(intValue);

        // Method 2: Using Integer.toString()
        String stringValue2 = Integer.toString(intValue);

        // Print the results
        System.out.println("Method 1 - String value: " + stringValue1);
        System.out.println("Method 2 - String value: " + stringValue2);


   // 14. Converting to uppercase and lowercase
   String str13 = "Apple";
    
   String upperCase = str13.toUpperCase();
   System.out.println(upperCase);

   String lowerCase = str13.toLowerCase();
   System.out.println(lowerCase);




  }







}
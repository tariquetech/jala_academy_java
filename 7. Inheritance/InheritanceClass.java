class A {
    int varA;

    void methodA1() {
        System.out.println("Method A1");
    }

    void methodA2() {
        System.out.println("Method A2");
    }

    void overrideMethod() {
        System.out.println("Override Method in A");
    }
}

class B extends A {
    int varB;

    void methodB1() {
        System.out.println("Method B1");
    }

    void methodB2() {
        System.out.println("Method B2");
    }

    @Override
    void overrideMethod() {
        System.out.println("Override Method in B");
    }
}

class C extends B {
    int varC;

    void methodC1() {
        System.out.println("Method C1");
    }

    void methodC2() {
        System.out.println("Method C2");
    }

    @Override
    void overrideMethod() {
        System.out.println("Override Method in C");
    }
}

public class InheritanceClass {
    public static void main(String[] args) {
    
        A objA = new A();
        B objB = new B();
        C objC = new C();

        // Call methods of class A
        objA.methodA1();
        objA.methodA2();
        objA.overrideMethod();
        System.out.println("VarA in A: " + objA.varA);

        // Call methods of class B
        objB.methodB1();
        objB.methodB2();
        objB.overrideMethod();
        System.out.println("VarA in B: " + objB.varA);
        System.out.println("VarB in B: " + objB.varB);

        // Call methods of class C
        objC.methodC1();
        objC.methodC2();
        objC.overrideMethod();
        System.out.println("VarA in C: " + objC.varA);
        System.out.println("VarB in C: " + objC.varB);
        System.out.println("VarC in C: " + objC.varC);

        // Call overridden method with super class reference
        A refB = new B();
        refB.overrideMethod(); // Calls overrideMethod() in B

        A refC = new C();
        refC.overrideMethod(); // Calls overrideMethod() in C
    }
}

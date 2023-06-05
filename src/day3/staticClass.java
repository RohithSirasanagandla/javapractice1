package day3;

public class staticClass {
    static int staticVariable;

    static {
        staticVariable = initializeStaticVariable();
    }

    static int initializeStaticVariable() {
        // Perform some computation or logic to initialize the static variable
        return 42;
    }

    static int getStaticVariable() {
        return staticVariable;
    }
    public static void main(String[] args) {
        int value = staticClass.getStaticVariable();
        System.out.println("Static Variable: " + value);
    }
}

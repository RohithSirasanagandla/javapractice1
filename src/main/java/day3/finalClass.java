package day3;

public class finalClass {
    final int finalVariable = 4;

    final void finalMethod() {
        System.out.println("Final Method");
    }
    public static void main(String[] args) {
        finalClass finalObj = new finalClass();
        System.out.println("Final Variable: " + finalObj.finalVariable);
        finalObj.finalMethod();
    }
}

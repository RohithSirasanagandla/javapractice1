package day3;

public class InterfaceImplementation implements interface1,interface2{
    public void abstractMethod1() {
        System.out.println("Implementation of abstractMethod1");
    }

    public void abstractMethod2() {
        System.out.println("Implementation of abstractMethod2");
    }

    public static void main(String[] args) {
        InterfaceImplementation myObj = new InterfaceImplementation();
        myObj.abstractMethod1();
        myObj.abstractMethod2();
    }
}

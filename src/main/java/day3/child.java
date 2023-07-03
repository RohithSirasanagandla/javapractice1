package day3;

public class child extends parent{
    protected int childVariable;

    public child(int parentVariable, int childVariable) {
        super(parentVariable);
        this.childVariable = childVariable;
    }

    public child(int childVariable) {
        super(0);
        this.childVariable = childVariable;
    }
    public static void main(String[] args) {
        child childObj1 = new child(10, 20);
        System.out.println("Parent Variable: " + childObj1.parentVariable);
        System.out.println("Child Variable: " + childObj1.childVariable);

        child childObj2 = new child(30);
        System.out.println("Parent Variable: " + childObj2.parentVariable);
        System.out.println("Child Variable: " + childObj2.childVariable);
    }
}

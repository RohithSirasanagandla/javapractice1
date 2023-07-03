// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello this is Rohith");
//day 3 assignment
        Product product = new Product();
        product.setPrice(12.5);
        double price = product.getPrice();
        System.out.println("Price for single quantity: " + price);

        int quantity = 7;
        double totalPrice = product.getPrice(quantity);
        System.out.println("Price for " + quantity + " quantities: " + totalPrice);

        //runtime polymorphism
        Department department = new SalesDepartment(20);
        int departmentSize = department.getDepartmentSize();
        System.out.println("Department Size: " + departmentSize);
    }
}
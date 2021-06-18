package Inheritance;

public class Motorcycle extends Vehicle {

    public  Motorcycle(String brand) {
        this.brand = brand;
    }

    @Override
    public void wheelsNumber() {
        System.out.println("Number of wheels is: 2");
    }

    public void getData() {
        System.out.println("The brand of the motorcycle is: " +  this.brand);
        System.out.println("The motorcycle can also:");
        honk();
        System.out.println("Another important fact: ");
        wheelsNumber();
        System.out.println();
    }

}

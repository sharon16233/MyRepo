package Inheritance;

public class PrivateCar extends Vehicle {

    public PrivateCar(String brand) {
        this.brand = brand;
    }

    public void getData() {
        System.out.println("The brand of the car is: " +  this.brand);
        System.out.println("The car can also:");
        honk();
        System.out.println("Another important fact: ");
        wheelsNumber();
        System.out.println();
    }

}
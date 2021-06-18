package ThirdLevel;

public class Cat {

    private String name;
    private String color;
    private int age;
    private String id;

    public Cat(String name, String color, int age, String id) {
        setName(name);
        setColor(color);
        setAge(age);
        setId(id);
    }

    public void doNoise() {
        System.out.println("Meow");
    }

    public void printCatInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Color: " + getColor());
        System.out.println("Age: " + getAge());
        System.out.println("Id: " + getId());
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return this.id;
    }

}

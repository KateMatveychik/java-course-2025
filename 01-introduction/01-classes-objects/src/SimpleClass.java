// SimpleClass.java
public class SimpleClass {
    private String name;

    public SimpleClass(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Объект класса SimpleClass: " + name);
    }

    public static void main(String[] args) {
        SimpleClass obj = new SimpleClass("Тестовый объект");
        obj.printInfo();
    }
}
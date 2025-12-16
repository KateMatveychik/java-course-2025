public class ObjectEqualsExample {

    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Alice", 25);
        Person p3 = new Person("Bob", 30);

        System.out.println("p1.equals(p2) = " + p1.equals(p2)); // true
        System.out.println("p1.equals(p3) = " + p1.equals(p3)); // false
    }
}

/* Практика №1: переопределение метода equals() */

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // проверка на идентичность ссылок
        if (obj == null || getClass() != obj.getClass()) return false; // проверка типа
        Person other = (Person) obj;
        return this.age == other.age && this.name.equals(other.name);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

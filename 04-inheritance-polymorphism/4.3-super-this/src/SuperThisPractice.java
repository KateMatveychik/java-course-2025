public class SuperThisPractice {

    public static void main(String[] args) {

        // Практика №1: использование super
        ChildClass child1 = new ChildClass(10, 20);
        child1.show(); // демонстрирует доступ к полю и методу суперкласса

        // Практика №3: использование this() в конструкторах
        A a1 = new A();
        A a2 = new A(5);
        A a3 = new A(5, 10);
        A a4 = new A(5, 10, 15);

        System.out.println("Создан объект A с a4: a=" + a4.a + ", b=" + a4.b + ", c=" + a4.c + ", z=" + a4.z);
    }
}

/* Практика №1: использование super */

// Суперкласс
class Parent {
    int value;

    public Parent(int value) {
        this.value = value;
    }

    public void showValue() {
        System.out.println("Parent value = " + value);
    }
}

// Подкласс, демонстрирующий все варианты super
class ChildClass extends Parent {
    int value;

    public ChildClass(int parentValue, int childValue) {
        super(parentValue); // обращение к конструктору суперкласса
        this.value = childValue;
    }

    public void show() {
        System.out.println("Child value = " + this.value); // this обращается к полю текущего объекта
        System.out.println("Parent value через super = " + super.value); // доступ к полю суперкласса
        super.showValue(); // доступ к методу суперкласса
    }
}

/* Практика №2: вызов метода method() в классе C
 * В классе C метод method() использует super.a и super.method().
 * Так как переменная a и метод method() не определены в классе B,
 * компилятор ищет их в ближайшем суперклассе, где они объявлены — в классе A.
 * Следовательно, при выполнении:
 * - super.a берёт значение поля a из класса A
 * - super.method() вызывает метод method() из класса A
 *
 * Результат выполнения метода C.method():
 * - значение поля a из класса A будет выведено
 * - метод A.method() будет выполнен и выведет свою строку
 *
 * super обращается к ближайшему доступному элементу
 * в иерархии наследования, если он не определён в промежуточном классе.
 */

/* Практика №3: переписывание конструкторов с this() */

class A {
    int a;
    int b;
    int c;
    int z;

    public A() {
        this(0); // вызов конструктора с 1 параметром
    }

    public A(int a) {
        this(a, 0); // вызов конструктора с 2 параметрами
    }

    public A(int a, int b) {
        this(a, b, 0); // вызов конструктора с 3 параметрами
    }

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.z = 1;
    }
}

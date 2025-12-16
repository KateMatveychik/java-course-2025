public class DefaultStaticExample {

    public static void main(String[] args) {

        // Практика №1: вызов методов интерфейса
        MyClass obj = new MyClass();

        // Вызов default метода через объект
        obj.defaultMethod();

        // Вызов статического метода интерфейса через имя интерфейса
        MyInterface.staticMethod();

        /*
         * - default метод можно вызвать через объект класса, который реализует интерфейс
         * - static метод вызывается только через имя интерфейса, не через объект
         */
    }
}

/* Практика №1: интерфейс с default и static методами */
interface MyInterface {

    // default метод — неабстрактный, может переопределяться в классе
    default void defaultMethod() {
        System.out.println("Вызов default метода интерфейса");
    }

    // static метод — вызывается через имя интерфейса
    static void staticMethod() {
        System.out.println("Вызов static метода интерфейса");
    }
}

/* Класс, реализующий интерфейс */
class MyClass implements MyInterface {
    // Можно переопределить default метод, если нужно изменить поведение
    @Override
    public void defaultMethod() {
        System.out.println("Переопределенный default метод в MyClass");
    }
}

/* Практика №2: конфликт методов при реализации двух интерфейсов */
interface InterfaceA {
    default void show() {
        System.out.println("InterfaceA show");
    }
}

interface InterfaceB {
    default void show() {
        System.out.println("InterfaceB show");
    }
}

class MyClassConflict implements InterfaceA, InterfaceB {

    /*
     * Если два интерфейса имеют одинаковый default метод, класс должен переопределить этот метод,
     * иначе компилятор выдаст ошибку конфликта. В переопределенном методе можно явно вызвать
     * нужный default метод через InterfaceName.super.methodName().
     */
    @Override
    public void show() {
        // можно выбрать, какой метод вызвать
        InterfaceA.super.show(); // вызов метода из InterfaceA
        InterfaceB.super.show(); // вызов метода из InterfaceB
    }
}

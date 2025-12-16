public class FinalExample {

    public static void main(String[] args) {

        // Практика №1: демонстрация final-метода
        Child1 child1 = new Child1();
        child1.show(); // вызывает final-метод суперкласса

        // Практика №2: демонстрация final-класса
        FinalClass obj = new FinalClass();
        obj.display();
        // Попытка создать класс-наследник от FinalClass вызовет ошибку компиляции
        // class SubFinal extends FinalClass {} //ошибка компиляции

    }
}

/* Практика №1: final-метод */
class Parent1 {
    // final-метод нельзя переопределять
    public final void show() {
        System.out.println("Это final-метод суперкласса");
    }
}

class Child1 extends Parent1 {
    // Попытка переопределить метод show() вызовет ошибку компиляции
    // public void show() { System.out.println("Переопределение"); } // ❌ ошибка
}

/* Практика №2: final-класс */
final class FinalClass {
    public void display() {
        System.out.println("Это метод final-класса");
    }
}

// Попытка наследования от final-класса невозможна
// class SubFinal extends FinalClass {} //ошибка компиляции

public class StaticPractice {
    public static void main(String[] args) {
        System.out.println("Варианты вызова статического метода printVars():\n");

        // 1. Через имя класса
        A.printVars();

        // 2. Через объект
        A obj = new A();
        obj.printVars();

        // 3. Через null-ссылку
        A nullRef = null;
        nullRef.printVars();

        /*
         * Статический метод printVars() можно вызвать:
         * 1. A.printVars() - через имя класса (лучший способ)
         * 2. obj.printVars() - через объект (не рекомендуется)
         * 3. nullRef.printVars() - через null
         *
         * Все способы работают, потому что статические методы
         * принадлежат классу, а не конкретному объекту.
         */
    }
}

class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println("a = " + a + ", b = " + b);
    }
}
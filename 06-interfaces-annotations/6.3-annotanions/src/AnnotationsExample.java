public class AnnotationsExample {

    public static void main(String[] args) {

        // Примеры использования аннотаций
        Child2 child = new Child2();
        child.show();

        OldClass oldClass = new OldClass();
        oldClass.oldMethod(); // компилятор выдаст предупреждение о устаревшем методе

        @SuppressWarnings("unchecked")
        java.util.List list = new java.util.ArrayList();
        list.add("Hello"); // предупреждение компилятора об unchecked cast подавлено
    }
}

/* Объяснение:
 * @Override — используется для указания, что метод переопределяет метод суперкласса.
 *              Компилятор проверяет правильность переопределения.
 * @Deprecated — помечает метод, класс или поле как устаревшее.
 *              Компилятор выдаёт предупреждение при использовании.
 * @SuppressWarnings — подавляет определённые предупреждения компилятора,
 *                    например unchecked cast, deprecation и др.
 */

class ParentClass {
    void show() {
        System.out.println("Метод родителя");
    }
}

class Child2 extends ParentClass {
    @Override
    void show() {
        System.out.println("Метод ребёнка, переопределяет родителя");
    }
}

class OldClass {
    @Deprecated
    void oldMethod() {
        System.out.println("Этот метод устарел");
    }
}

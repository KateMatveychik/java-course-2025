public class MethodsExample {
    public static void main(String[] args) {
        System.out.println("Примеры перегрузки и переопределения методов\n");

        // Демонстрация перегрузки методов
        Calculator calc = new Calculator();
        System.out.println("ПЕРЕГРУЗКА (overloading):");
        System.out.println("calc.add(5, 3) = " + calc.add(5, 3));
        System.out.println("calc.add(2.5, 3.5) = " + calc.add(2.5, 3.5));
        System.out.println("calc.add(1, 2, 3) = " + calc.add(1, 2, 3));

        // Демонстрация переопределения методов
        System.out.println("\nПЕРЕОПРЕДЕЛЕНИЕ (override):");
        Animal animal = new Animal();
        Dog dog = new Dog();
        System.out.println("animal.makeSound() = " + animal.makeSound());
        System.out.println("dog.makeSound() = " + dog.makeSound());

        // Полиморфизм
        System.out.println("\nПОЛИМОРФИЗМ:");
        Animal myPet = new Dog();
        System.out.println("Animal myPet = new Dog();");
        System.out.println("myPet.makeSound() = " + myPet.makeSound());
    }
}

/*
 * ПЕРЕГРУЗКА МЕТОДОВ (overloading):
 * - Несколько методов с одинаковым именем в одном классе
 * - Различаются по параметрам (тип, количество)
 * - Тип возвращаемого значения не учитывается
 * - Компилятор выбирает нужный метод по аргументам
 */
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

/*
 * ПЕРЕОПРЕДЕЛЕНИЕ МЕТОДОВ (override):
 * - Метод в дочернем классе с тем же именем и параметрами
 * - Изменяет поведение унаследованного метода
 * - Аннотация @Override помогает избежать ошибок
 * - Полиморфизм: вызов метода зависит от типа объекта
 */
class Animal {
    String makeSound() {
        return "Животное издает звук";
    }
}

class Dog extends Animal {
    @Override
    String makeSound() {
        return "Собака лает";
    }
}

/*
 * Ключевые различия:
 *
 * Перегрузка:
 * - В одном классе
 * - Разные параметры
 * - Статическое связывание (компиляция)
 *
 * Переопределение:
 * - В родительском и дочернем классах
 * - Одинаковые параметры
 * - Динамическое связывание (выполнение)
 * - Полиморфизм
 */
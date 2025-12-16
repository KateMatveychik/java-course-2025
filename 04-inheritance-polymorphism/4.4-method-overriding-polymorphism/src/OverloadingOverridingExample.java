public class OverloadingOverridingExample {

    public static void main(String[] args) {

        // Практика №1: перегруженные методы
        Calculator1 calc = new Calculator1();
        System.out.println("sum(int, int) = " + calc.sum(5, 10));
        System.out.println("sum(double, double) = " + calc.sum(5.5, 10.2));
        System.out.println("sum(int, int, int) = " + calc.sum(1, 2, 3));

        // Практика №2: переопределенные методы
        Pet pet = new Pet();
        Puppy puppy = new Puppy();
        Pet polyPuppy = new Puppy(); // полиморфизм

        pet.makeSound(); // метод класса Pet
        puppy.makeSound();    // метод класса Puppy
        polyPuppy.makeSound(); // вызов метода Puppy через Pet ссылку — динамическое связывание

        // Практика №3: использование @Override для проверки ошибок
        // Если метод с аннотацией @Override не совпадает с суперклассом, компилятор выдаёт ошибку
    }
}

/* Практика №1: перегрузка методов */

class Calculator1 {
    // Перегруженные методы sum
    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }
}

/* Практика №2: переопределение методов */

class Pet {
    public void makeSound() {
        System.out.println("Pet makes sound");
    }
}

class Puppy extends Pet {
    @Override
    public void makeSound() {
        System.out.println("Puppy barks");
    }

    // Если тип возвращаемого значения не совпадет с Pet.makeSound()
    // например, public int makeSound(), компилятор выдаст ошибку
}

/* Практика №3: использование @Override для обнаружения ошибок */

class Kitten extends Pet {
    // Например, хотим переопределить метод, но ошиблись в имени:
    //@Override
    //public void makeSouund() { System.out.println("Kitten meows"); } // ошибка компиляции — аннотация @Override помогает обнаружить опечатку

    @Override
    public void makeSound() {
        System.out.println("Kitten meows");
    }
}

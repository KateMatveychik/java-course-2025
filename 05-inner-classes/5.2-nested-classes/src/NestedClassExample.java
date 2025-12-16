public class NestedClassExample {

    public static void main(String[] args) {

        // Практика №1: использование вложенного класса в интерфейсе
        OuterInterface.Nested nestedObj = new OuterInterface.Nested();
        nestedObj.showMessage();

        /*
         * Вложенный static класс в интерфейсе доступен через имя интерфейса:
         * InterfaceName.NestedClass obj = new InterfaceName.NestedClass();
         * Методы такого класса вызываются как обычно через объект.
         */
    }
}

/* Интерфейс с вложенным static классом */
interface OuterInterface {

    // Вложенный класс внутри интерфейса всегда static по умолчанию
    class Nested {
        public void showMessage() {
            System.out.println("Вызов метода вложенного класса в интерфейсе");
        }
    }
}

/* Внешний класс с вложенным static классом */
class OuterClass {
    static int staticValue = 100;

    // Вложенный класс (nested) — статический, не имеет ссылки на объект внешнего класса
    public static class NestedClass {
        public void printStatic() {
            // Доступно только к статическим полям внешнего класса
            System.out.println("Статическое поле внешнего класса: " + staticValue);
        }
    }
}

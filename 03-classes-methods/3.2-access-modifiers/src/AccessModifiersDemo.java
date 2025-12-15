// AccessModifiersDemo.java - ВСЁ В ОДНОМ ФАЙЛЕ
public class AccessModifiersDemo {
    public static void main(String[] args) {
        System.out.println("Демонстрация модификаторов доступа\n");

        Example obj = new Example();

        // public - доступно
        System.out.println("public: " + obj.publicField);
        obj.publicMethod();

        // protected - доступно (тот же пакет)
        System.out.println("\nprotected через метод: " + obj.getProtected());

        // default - доступно (тот же пакет)
        System.out.println("default через метод: " + obj.getDefault());

        // private - только через методы
        System.out.println("private через метод: " + obj.getPrivate());
    }
}

class Example {
    // Все 4 модификатора
    public String publicField = "public";
    protected String protectedField = "protected";
    String defaultField = "default"; // package-private
    private String privateField = "private";

    // Методы
    public void publicMethod() {
        System.out.println("public метод");
    }

    protected void protectedMethod() {
        System.out.println("protected метод");
    }

    void defaultMethod() {
        System.out.println("default метод");
    }

    private void privateMethod() {
        System.out.println("private метод");
    }

    // Геттеры
    public String getProtected() {
        return protectedField;
    }

    public String getDefault() {
        return defaultField;
    }

    public String getPrivate() {
        return privateField;
    }
}

/*
 * public - везде
 * protected - пакет + наследники
 * default - только пакет
 * private - только класс
 */
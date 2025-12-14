public class InstanceOfPractice2 {
    public static void main(String[] args) {
        // 1. Примеры с разными объектами
        Object obj = "Привет";
        System.out.println("obj = \"Привет\"");
        System.out.println("obj instanceof String: " + (obj instanceof String));
        System.out.println("obj instanceof Integer: " + (obj instanceof Integer));

        // 2. Пример с null
        Object nullObject = null;
        System.out.println("\nnullObject = null");
        System.out.println("nullObject instanceof String: " + (nullObject instanceof String));

        // 3. Практическое применение
        System.out.println("\nПрактический пример:");
        Object[] objects = {"строка", 123, null};

        for (Object o : objects) {
            if (o instanceof String) {
                System.out.println(o + " - это строка");
            } else if (o instanceof Integer) {
                System.out.println(o + " - это число");
            } else if (o == null) {
                System.out.println("null - это null");
            }
        }
    }
}
public class Practice5 {
    public static void main(String[] args) {
        // Примеры операций с разными типами

        int i = 10;
        double d = 3.5;
        float f = 2.5f;
        long l = 100L;

        // Автоматическое преобразование результата к большему типу (из типов операндов)
        System.out.println("int + double = double: " + (i + d));
        System.out.println("float + long = float: " + (f + l));
        System.out.println("int / int = int: " + (7 / 2));
        System.out.println("int / double = double: " + (7 / d));
    }
}
public class Practice6 {
    public static void main(String[] args) {
        // Примеры явного (сужающего) преобразования

        // 1. double -> int (потеря дробной части)
        double d = 123.456;
        int i = (int) d;  // 123

        // 2. int -> byte (возможно переполнение)
        int largeInt = 300;
        byte b = (byte) largeInt;  // 44 (переполнение)

        // 3. long -> int
        long l = 1000L;
        int i2 = (int) l;  // 1000

        // 4. float -> short
        float f = 1500.75f;
        short s = (short) f;  // 1500

        System.out.println("double -> int: " + d + " -> " + i);
        System.out.println("int -> byte: " + largeInt + " -> " + b);
        System.out.println("long -> int: " + l + " -> " + i2);
        System.out.println("float -> short: " + f + " -> " + s);
    }
}
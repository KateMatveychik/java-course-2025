public class Practice1 {
    public static void main(String[] args) {

        // 1. ЦЕЛОЧИСЛЕННЫЕ ТИПЫ (4 типа)
        // byte - 8 бит
        byte byteValue = 100;
        byte byteZero = 0;  // Нулевое значение для byte

        // short - 16 бит
        short shortValue = 1000;
        short shortZero = 0;  // Нулевое значение для short

        // int - 32 бит
        int intValue = 100000;
        int intZero = 0;  // Нулевое значение для int

        // 1.4 long - 64 бит
        long longValue = 10000000000L;
        long longZero = 0L;  // Нулевое значение для long

        // 2. С ПЛАВАЮЩЕЙ ТОЧКОЙ (2 типа)
        // float - 32 бит, 6-7 знаков точности
        float floatValue = 3.14f;  // Суффикс f обязателен!
        float floatZero = 0.0f;    // Нулевое значение для float

        // double - 64 бит, 15-16 знаков точности
        double doubleValue = 3.14159;  // По умолчанию дробные числа - double
        double doubleZero = 0.0;       // Нулевое значение для double


        // 3. СИМВОЛЬНЫЙ ТИП
        //char - 16 бит
        char charValue = 'A';           // Символ в одинарных кавычках
        char charZero = '\u0000';       // Нулевое значение для char (символ NUL)


        // 4. БУЛЕВСКИЙ ТИП
        // boolean - true или false
        boolean boolValue = true;
        boolean boolZero = false;  // Нулевое значение для boolean


        System.out.println("   1. byte:   значение = " + byteValue + ", нуль = " + byteZero);
        System.out.println("   2. short:  значение = " + shortValue + ", нуль = " + shortZero);
        System.out.println("   3. int:    значение = " + intValue + ", нуль = " + intZero);
        System.out.println("   4. long:   значение = " + longValue + ", нуль = " + longZero);
        System.out.println("   5. float:  значение = " + floatValue + ", нуль = " + floatZero);
        System.out.println("   6. double: значение = " + doubleValue + ", нуль = " + doubleZero);
        System.out.println("   7. char:   значение = '" + charValue + "', нуль = '\u0000' (невидимый)");
        System.out.println("   8. boolean: значение = " + boolValue + ", нуль = " + boolZero);


    }
}
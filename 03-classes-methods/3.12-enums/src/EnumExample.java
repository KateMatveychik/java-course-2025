public class EnumExample {

    public static void main(String[] args) {

        /*
         * Практика №1
         * Инициализация элементов перечисления
         */
        Day today = Day.MONDAY;
        Day tomorrow = Day.TUESDAY;

        System.out.println("Сегодня: " + today);
        System.out.println("Завтра: " + tomorrow);

        // Используем switch с enum
        switch (today) {
            case MONDAY:
                System.out.println("Начало недели!");
                break;
            case FRIDAY:
                System.out.println("Пятница!");
                break;
            default:
                System.out.println("Обычный день");
        }


        /*
         * Практика №2
         * Собственное перечисление с дополнительным методом
         */
        Season currentSeason = Season.SUMMER;

        System.out.println("Текущий сезон: " + currentSeason);
        System.out.println("Описание сезона: " + currentSeason.getDescription());
    }
}


//Перечисление для практики №1

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

/*
 * Перечисление для практики №2
 * Дополнительно содержит поле и метод
 */
enum Season {
    WINTER("Снег выпал"),
    SPRING("Снег растаял"),
    SUMMER("Тепло"),
    AUTUMN("Листья опали");

    // Дополнительное поле для хранения описания
    private String description;

    // Конструктор для enum
    Season(String description) {
        this.description = description;
    }

    // Метод для получения описания сезона
    public String getDescription() {
        return description;
    }
}

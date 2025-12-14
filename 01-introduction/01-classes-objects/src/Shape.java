// Абстрактный класс Shape
abstract class Shape {
    // Абстрактный метод - должен быть реализован в наследниках
    abstract double getArea();

    // Статический метод для демонстрации LSP
    public static void printArea(Shape shape) {
        System.out.println("Площадь фигуры: " + shape.getArea());
    }
}
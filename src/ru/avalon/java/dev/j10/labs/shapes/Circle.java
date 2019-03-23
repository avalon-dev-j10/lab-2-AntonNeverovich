package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse {

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    
    private float area = (float) (Math.random() * 10 + 1);
    public static int count; // Счетчик количества объектов класса Circle

    public Circle() { count++; }

    public Shape Circle() {
        return new Circle();
    }

    @Override
    public float getArea() {
        return this.area;
    }

    @Override
    public float getLength() {
        return 0f;
    }

    @Override
    public float getRadius() {
        return 0f;
    }
    
    
}

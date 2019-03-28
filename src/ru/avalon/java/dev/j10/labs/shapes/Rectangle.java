package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon {

    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    
    public static int count; // Счетчик количества объектов класса Rectangle

    /**
     * Построение четырехугольника через четыре случайные точки пространства float.
     * <p>
     * Точки формируют стороны четырехугольника
     */
    // Точка А(x1, y1)
    private final float x1, y1;
    // Точка В(x2, y2)
    private final float x2, y2;
    // Точка С(x3, y3)
    private final float x3, y3;
    // Точка D(x4, y4)
    private final float x4, y4;

    /**
     * Создаем линии четырехугольника.
     * <p>
     * Важно, чтобы линии замкнулись в фигуру, для этого должны сопасть
     * координаты начала первной линии и конца последней.
     */
    // Линия АВ
    private final float lineAB;
    // Линия ВС
    private final float lineBC;
    // Линия С
    private final float lineCD;
    // Линия С
    private final float lineDA;
    
    public Rectangle() {
        this.x1 = Point.getX();
        this.y1 = Point.getY();
        this.x2 = Point.getX();
        this.y2 = Point.getY();
        this.x3 = Point.getX();
        this.y3 = Point.getY();
        this.x4 = Point.getX();
        this.y4 = Point.getY();
        this.lineAB = (float) (Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2))));
        this.lineBC = (float) (Math.sqrt((Math.pow(x3 - x2, 2)) + (Math.pow(y3 - y2, 2))));
        this.lineCD = (float) (Math.sqrt((Math.pow(x4 - x3, 2)) + (Math.pow(y4 - y3, 2))));
        this.lineDA = (float) (Math.sqrt((Math.pow(x1 - x4, 2)) + (Math.pow(y1 - y4, 2))));
        count++;
    }

    @Override
    public float getArea() {
        return (float)(Math.sqrt((this.getPerimeter() / 2) 
                * ((this.getPerimeter() / 2) - lineAB)
                * ((this.getPerimeter() / 2) - lineBC) 
                * ((this.getPerimeter() / 2) - lineCD) 
                * ((this.getPerimeter() / 2) - lineDA)));
    }

    @Override
    public float getPerimeter() {
        return lineAB + lineBC + lineCD + lineDA;
    }
}

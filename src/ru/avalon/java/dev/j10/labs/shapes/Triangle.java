package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon {

    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    
    public static int count; // Счетчик количества объектов класса Triangle
    
    /**
     * Построение треугольника через три случайные точки пространства float. 
     * <p>
     * Точки формируют стороны трегульника
     */
    // Точка А(x1, y1)
    private final float x1, y1;
    // Точка В(x2, y2)
    private final float x2, y2;
    // Точка С(x3, y3)
    private final float x3, y3;
    
    /**
     * Создаем линии треугольника.
     * <p>
     * Важно, чтобы линии замкнулись в фигуру, для этого должны сопасть
     * координаты начала первной линии и конца последней.
     */
    // Линия АВ
    private final float lineAB;
    // Линия ВС
    private final float lineBC;
    // Линия СА
    private final float lineCA;
    
    public Triangle() {
        this.x1 = Point.getX();
        this.y1 = Point.getY();
        this.x2 = Point.getX();
        this.y2 = Point.getY();
        this.x3 = Point.getX();
        this.y3 = Point.getY();
        this.lineAB = (float)(Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2))));
        this.lineBC = (float)(Math.sqrt((Math.pow(x3 - x2, 2)) + (Math.pow(y3 - y2, 2))));
        this.lineCA = (float)(Math.sqrt((Math.pow(x1 - x3, 2)) + (Math.pow(y1 - y3, 2))));
        count++;
    }

    public Shape Triangle() {
        return new Triangle();
    }

    @Override
    public float getArea() {
        return (float)(Math.sqrt((this.getPerimeter() / 2) 
                * ((this.getPerimeter() / 2) - lineAB) 
                * ((this.getPerimeter() / 2) - lineBC) 
                * ((this.getPerimeter() / 2) - lineCA)));
    }

    @Override
    public float getPerimeter() {
        return lineAB + lineBC + lineCA;
    }
    
    
}

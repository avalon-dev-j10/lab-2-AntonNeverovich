package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import ru.avalon.java.dev.j10.labs.shapes.*;

public class Main {

    public static void main(String[] args) {
        
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         */
        
        Shape[] shapes = new Shape[20];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = ShapeFactory.getInstance();
        }
        
        // Проверка количества созданных фигур
        System.out.println("Количество кругов: " + Circle.count);
        System.out.println("Количество четырехугольников: " + Rectangle.count);
        System.out.println("Количество треугольников: " + Triangle.count);
        
        // Вывод в консоль значений площади созданных фигур.
        for (Shape sh : shapes) {
            System.out.printf("%.2f", sh.getArea());
            System.out.print("\t");
        }

        System.out.println();
        
         /*
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
         */
         
         /* Сортируем массив фигур по возрастанию значений площадей фигур.
         * Сортировка происходит с помощью переопределнного метода compareTo
         * в интефейсе Shape 
         */
         Arrays.sort(shapes);
         
         
         // Проверка сортировки массиваю Вывод значений площадей фигур по возрастанию в консоль
         for (Shape sh : shapes) {
            System.out.printf("%.2f", sh.getArea());
            System.out.print("\t");
        }
         
         System.out.println();

         // Вывод в консоль фигуры с максимальной площадью.
         // Фигура с максимальной площадью - последняя в отсортированном массиве.
         int index = shapes.getClass().toString().lastIndexOf(".");
         String className = shapes[shapes.length - 1].getClass().toString().substring(index - 1);
         System.out.print("Фигура с максимальной площадью: " + className + ", площадью: ");
         System.out.printf("%.2f", shapes[shapes.length - 1].getArea());
         
         System.out.println();
    }
}

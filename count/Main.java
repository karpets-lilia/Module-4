package count;

/*Опишите класс реализующий десятичный счетчик, который может увеличивать ил уменьшать своё значение
 * на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию
 * и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния , и метод
 * позволяющий получить его текущее состояние. Написать код , демонстрирующийвсе возможности класса.*/

public class Main {
    public static void main(String[] args) {
        Counter a = new Counter(5, 10, 6);
        Counter b = new Counter(6, 4, 7);
        Counter c = new Counter(5, 3);
        System.out.println("a: " + a.value());
        System.out.println("b: " + b.value());
        System.out.println("c: " + c.value());
        System.out.println("----------------------");
        for (int i = 0; i < 2; ++i) {
            a.inc();
            b.inc();
            c.inc();
        }
        System.out.println("a: " + a.value());
        System.out.println("b: " + b.value());
        System.out.println("c: " + c.value());
        System.out.println("----------------------");
        for (int i = 0; i < 20; ++i) {
            a.dec();
            b.dec();
            c.dec();
        }
        System.out.println("a: " + a.value());
        System.out.println("b: " + b.value());
        System.out.println("c: " + c.value());
        System.out.println("----------------------");
    }
}


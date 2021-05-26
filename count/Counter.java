package count;

/*Опишите класс реализующий десятичный счетчик, который может увеличивать ил уменьшать своё значение
 * на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию
 * и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния , и метод
 * позволяющий получить его текущее состояние. Написать код , демонстрирующийвсе возможности класса.*/
public class Counter {
    int current, max, min;

    public Counter(int min2, int max2, int current2) {
        min = min2;
        max = max2;
        current = current2;

        if (max < min) {
            int tmp = max;
            max = min;
            min = tmp;
        }

        if (current < min)
            current = min;
        if (current > max)
            current = max;
    }

    public Counter(int min2, int max2) {
        this(min2, max2, min2);
        current = min;
    }

    public Counter() {
        this(0, 16, 0);
    }

    public void inc() {
        current++;
        if (current > max)
            current = min;
    }

    public void dec() {
        current--;
        if (current < min)
            current = max;
    }

    public int value() {
        return current;
    }
}

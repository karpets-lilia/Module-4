package time;
/*Составьте описание класса для представления времени. Предусмотрите возможности
установки времении изменения его отдельных полей(час, минута, секунда)с проверкой допустимости значений.
В случае недопустимых значений полейполе устанавливается в значение 0. Создать меиоды изменения времени на
заданное количество часов, минут , секунд.*/
public class Main {
    public static void main(String[] args) {
        Time a = new Time(5, 44, 3);
        Time b = new Time(50, 3);
        Time c = new Time();
        a.print();
        b.print();
        c.print();
        System.out.println("-----------------");

        a.set_hh(25);
        a.set_mm(22);
        a.set_ss(50);
        b.add_seconds(50);
        c.add_seconds(70);
        a.print();
        b.print();
        c.print();
        System.out.println("-----------------");

        a.add_minutes(20);
        b.add_hours(3);
        c.add_hours(33);
        a.print();
        b.print();
        c.print();
        System.out.println("-----------------");
    }
}


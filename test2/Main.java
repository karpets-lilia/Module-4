package test2;

/*Создйте  класс  Test2 c  двумя  переменными.  Добавьте  конструктор  с
входными  параметрами.  Добавьте конструктор, инициализирующий члены класса
по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.*/

public class Main {
    public static void main(String[] args) {
        int c, d;
        Test2 t1 = new Test2(2,4);
        c = t1.getA();
        d = t1.getB();

        System.out.println("Значение первой переменной: " + c);
        System.out.println("Значение второй переменной: " + d);
    }
}

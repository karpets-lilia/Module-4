package test1;

/*Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
    переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
    наибольшее значение из этих двух переменных.*/
public class Main {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        int a = 1;
        int b = 2;
        t1.show(a, b);
        System.out.println("Измененные переменные: ");
        t1.changeNumber(a, b);
        System.out.println("Сумма значений переменных " + t1.sumNumber(a, b));
        System.out.println("Наибольшее значение из двух переменных " + t1.whatIsMore(a, b));
    }
}

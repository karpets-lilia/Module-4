package student;
import static student.Student.printExcellentStudent;

/*Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
        из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
        номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[10];

        students[0] = new Student("Иванов В.И.", 15, new int[]{9, 9, 9, 9, 9});
        students[1] = new Student("Иванова С.Н.", 20, new int[]{9, 8, 8, 10, 9});
        students[2] = new Student("Сидоров В.М.", 15, new int[]{4, 5, 7, 10, 6});
        students[3] = new Student("Семенчук К.Г.", 24, new int[]{10, 10, 10, 10, 10});
        students[4] = new Student("Ревинский С.В.", 20, new int[]{10, 9, 8, 10, 9});
        students[5] = new Student("Трубчик Н.Г.", 24, new int[]{9, 9, 10, 10, 9});
        students[6] = new Student("Кац Д.Т.", 21, new int[]{9, 9, 8, 10, 9});
        students[7] = new Student("Рыжикова Р.П.", 15, new int[]{3, 6, 5, 7, 4});
        students[8] = new Student("Серый А.С.", 15, new int[]{7, 9, 8, 7, 9});
        students[9] = new Student("Плетюхов П.А.", 15, new int[]{10, 9, 9, 10, 9});

        printExcellentStudent(students);
    }
}

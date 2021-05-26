package student;

public class Student {
    private String surnameAndInitials;
    private int group;
    private int[] grades;

    Student(String name, int group, int[] grades) {
        this.surnameAndInitials = name;
        this.group = group;
        this.grades = grades;
    }

   public static void printExcellentStudent(Student[] students) {
        for (Student student : students) {
            int minGrade = 10;
            for (int grade : student.grades) {
                if (grade < minGrade) {
                    minGrade = grade;
                }
            }
            if (minGrade >= 9) {
                System.out.printf("Умный студент: %s, из группы %d. %n", student.surnameAndInitials, student.group);
            }
        }
    }
}

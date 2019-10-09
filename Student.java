package task3;

public class Student {
    private String name;
    private int numberGroup;
    private int[] progress = new int[5];
 
    private Student(String name, int numberGroup, int[] progress) {
        this.name = name;
        this.numberGroup = numberGroup;
        this.progress = progress;
    }
 
    private static void showBest(Student[] listStudents) {
        for (Student student : listStudents) {
            int flag = 0;
            for (int a : student.progress) {
                if (a < 9) {
                    flag++;
                }
            }
            if (flag == 0)
                System.out.println(student.name + "  " + student.numberGroup);
        }
    }
 
    public static void main(String[] args) {
        Student[] listStudent = {
                new Student("Иванов", 11, new int[]{5, 6, 7, 3, 9}),
                new Student("Петров", 11, new int[]{9, 10, 9, 9, 9}),
                new Student("Сидоров", 12, new int[]{8, 6, 7, 3, 10}),
                new Student("Жидков", 13, new int[]{5, 10, 7, 6, 9}),
                new Student("Лазарев", 11, new int[]{9, 10, 9, 9, 9}),
                new Student("Сорокин", 12, new int[]{8, 6, 7, 7, 10}),
                new Student("Колосов", 13, new int[]{9, 10, 9, 9, 9})};
        showBest(listStudent);
    }
}

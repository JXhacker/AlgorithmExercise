package NIUKE.KAOYAN.Java;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/3/25
 */
public class SortByGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int nums = scanner.nextInt();
            int method = scanner.nextInt();
            List<Student> students = new ArrayList<>();
            for (int i = 0; i < nums; i++) {
                Student newStudent = new Student(scanner.next(), scanner.nextInt());
                students.add(newStudent);
            }
            //降序
            if (method == 0) {
                Collections.sort(students, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o2.score - o1.score;
                    }
                });
            } else {
                Collections.sort(students, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.score - o2.score;
                    }
                });
            }
            for (Student s : students) {
                System.out.println(s.name + " " + s.score);
            }
        }
    }
}

class Student {
    public String name;
    public int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}


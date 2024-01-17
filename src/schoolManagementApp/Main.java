package schoolManagementApp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Lizzy = new Teacher(1, "Lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 550);
        Teacher dani = new Teacher(3, "Daniel", 580);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Lizzy);
        teacherList.add(mellisa);
        teacherList.add(dani);

        Student mark = new Student(1, "Mark Budu", 5);
        Student cliff = new Student(2, "Clifford", 12);
        Student law = new Student(3, "Lawrencia", 35);

        List<Student> studentList = new ArrayList<>();
        studentList.add(mark);
        studentList.add(cliff);
        studentList.add(law);

        School Drobo_DA = new School(teacherList,studentList);
        law.payFees(1200);
        cliff.payFees(2000);

        System.out.println(Drobo_DA.getStudents());
        System.out.println("Drobo_DA has earned: $" + Drobo_DA.getTotalMoneyEarned());
    }
}

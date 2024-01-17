package schoolManagementApp;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     * implement this when a new school object is created
     * @param teachers lists of teachers in the school
     * @param students lists of students in the school
     */
    public School(List<Teacher> teachers, List<Student> students){
        this.students = students;
        this.teachers = teachers;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * @return lists of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * @param teacher adds a teacher to the school
     */
    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    /**
     * @return lists of all students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * @param student the student to be added
     */
    public void addStudent(Student student) {
        this.students.add(student);
    }

    /**
     * @return total money the school management has acquired
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * @param moneyEarned the money to be added to total money
     */
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     * @return total money spent
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update total money spent
     * @param moneySpent
     */
    public void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent += moneySpent;
    }
}

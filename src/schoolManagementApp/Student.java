package schoolManagementApp;

/*
* This class is responsible for tracking
* students.
* */

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;




    public Student(int id, String name, int grade){
        feesPaid = 0;
        feesTotal = 1000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //setter for updating student grade
    public void updateGrade(int grade){
        this.grade = grade;
    }

    //setter for updating student's fees paid
    public void payFees(int fees){
        this.feesPaid += fees;
        School.updateTotalMoneyEarned(fees);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }
}

package schoolManagementApp;

public class Teacher {
    private int id;
    private String name;
    private int salary;

    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return id;
    }

    public int getSalary(){
        return salary;
    }

    public void updateSalary(int salary){
        this.salary = salary;
    }
}

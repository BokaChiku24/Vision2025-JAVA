package inheritanceconcept;

class Employee {
    int id;
    String name, grade;
    float salary;
    void setData(int id, String name, String grade, float salary) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.salary = salary;
    }
    void displayData() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Grade: " + grade);
        System.out.println("Employee Salary: " + salary);
    }
    float getSalary(){
        if(grade.equalsIgnoreCase("Officer")){
            return salary * 1.10f;
        }
        if(grade.equalsIgnoreCase("Manager")){
            return salary * 1.20f;
        }
        return salary;
    }
}

public class Manager extends Employee {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setData(1, "John Doe", "Manager", 50000);
        manager.displayData();
        System.out.println("Manager's Salary with 10% increase: " + manager.getSalary());
    }
}

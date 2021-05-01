
package javacampday3;

public class Instructor extends User {
    private int instructorId;
    private double salary;
    
    
    public void Instructor(int instructorId,double salary){
        this.instructorId=instructorId;
        this.salary=salary;
    }
    
    

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructor_id(int instructorId) {
        this.instructorId = instructorId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}

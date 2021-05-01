
package javacampday3;

public class Student extends User{
    
    private int studentId;
    
    public void Student(int studentId){
        this.studentId=studentId;
    }
   
    public int getStudentId(){
        return studentId;
    }
}

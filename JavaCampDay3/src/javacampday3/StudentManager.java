
package javacampday3;

public class StudentManager {
    public void addCourse(String courseName){
        System.out.println("----------");
        System.out.println(courseName + " kursu eklendi.");
    }
    public void attributesStudent(Student student){
        System.out.println("----------");
        System.out.println("Öğrencinin adı: "+student.getFirstName() + "\nSoyadı: "+student.getLastName()+"\nId'si: "+student.getStudentId()+"\nEmaili: "+student.getEmail());
    }
    


    
}

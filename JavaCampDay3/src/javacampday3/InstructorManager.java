
package javacampday3;

public class InstructorManager {
    public void addCourse(String courseName){
        System.out.println("----------");
        System.out.println("Yeni kursunuz eklendi: "+courseName);
    }
    public void attributesInstructer(Instructor instructor){
        System.out.println("----------");
        System.out.println("Eğitmenin adı: "+instructor.getFirstName() + "\nSoyadı: "+instructor.getLastName()+"\nId'si: "+instructor.getInstructorId()+"\nMaaşı: "+instructor.getSalary());
    }
}

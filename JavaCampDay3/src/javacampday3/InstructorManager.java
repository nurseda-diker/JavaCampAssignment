
package javacampday3;

public class InstructorManager {
    public void attributesInstructer(Instructor instructor){
        System.out.println("----------");
        System.out.println("Eğitmenin adı: "+instructor.getFirstName() + "\nSoyadı: "+instructor.getLastName()+"\nId'si: "+instructor.getInstructorId()+"\nMaaşı: "+instructor.getSalary());
    }
}

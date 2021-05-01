
package javacampday3;

public class JavaCampDay3 {

    public static void main(String[] args) {
        
        User user =new User();
        user.User("Nur","Diker","nur@gmail.com");
        UserManager userManager=new UserManager();
        userManager.newUser(user);
        
        Student student=new Student();
        student.Student(1);
        student.setFirstName("Ayşe");
        student.setLastName("Yılmaz");
        student.setEmail("ayse@gmail.com");
        
        StudentManager studentManager=new StudentManager();
        studentManager.attributesStudent(student);
        studentManager.addCourse("Java/React");
        
        Instructor instructor=new Instructor();
        instructor.Instructor(2, 5000);
        instructor.setFirstName("Engin");
        instructor.setLastName("Demiroğ");
        
        InstructorManager instructorManager=new InstructorManager();
        instructorManager.addCourse("C#/Angular");
        instructorManager.attributesInstructer(instructor);
        
        
        
        
        
    }
    
}


package javacamphomework;

public class CourseManager {
    
    public void Category(Course course){
        System.out.println("Course name: "+ course._name);
    }
    
    public void addStudent(Student student,Course course){
        System.out.println(student._name +" " + course._name + " " + "kursuna eklendi.");
    }
}

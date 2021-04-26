
package javacamphomework;

public class JavaCampHomework {

    public static void main(String[] args) {
      Student student1 =new Student(1,"Nur","nur@gmail.com");
      Student student2=new Student(2,"Seda","seda@gmail.com");
      
      Course course1=new Course(1,"C#+Angular","Engin Demiroğ");
      Course course2=new Course(2,"Java+React","Engin Demiroğ");
      
      Student[] students={student1,student2};
      Course[] courses={course1,course2};
      
      for(Student student:students){
          System.out.println("Student id: "+ student._id + "\n"+
                             "Student name: " + student._name +"\n"+
                             "student email:" + student._email
                            );
          System.out.println("--------------------");
      }
      
      for(Course course:courses){
          System.out.println("Course id: " + course._id + "\n" +
                             "Course name: " +course._name + "\n" +
                             "Course educator: " +course._educator
                             );
          System.out.println("--------------------");
      }
      
      
      CourseManager courseManager=new CourseManager();
      courseManager.Category(course1);
      courseManager.Category(course2);
      
        System.out.println("--------------------");
      
      CourseManager courseManager2=new CourseManager();
      courseManager2.addStudent(student1, course1);
      courseManager2.addStudent(student2, course2);
              
      
    }
    
}

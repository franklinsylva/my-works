
package composition;
import java.util.List;


public class Student {
    String name;
    List<Course> courseList;

    public Student(String name, List<Course> courseList) {
        this.name = name;
        this.courseList = courseList;
    }
    
    public void displayStudentDetails(){
        System.out.printf("%s enrolled in the following courses %n",name);
        for(Course course:courseList){
            System.out.printf("%s",course.displayCourses());
        }
        
    }
    
}

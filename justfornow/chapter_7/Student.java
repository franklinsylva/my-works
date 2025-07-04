package chapter_7;


public class Student {
    int studentId=101;
    String firstName="John";
    String lastName="Williams";
    String gender ="Male";
    int age=25;
    
    public void study()
    {
        System.out.println("List of Courses");
        System.out.println("Java");
        System.out.println("Web Development");
        System.out.println("Moblie App");
    }
    
    public void display()
    {
        System.out.printf("StudentID: %d%n",studentId);
        System.out.printf("Student FirstName: %s%n",firstName);
         System.out.printf("Student LastName: %s%n",lastName);
        System.out.printf("StudentID: %s%n",gender);
        System.out.printf("StudentID: %d%n",age);

        study();
    }
    
}

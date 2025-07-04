
package chapter_9.inheritance;


public class GraduatesStudent extends Student{
    String researchTopic;

    public GraduatesStudent(String researchTopic, String studentId, String name, int age, String gender) {
        super(studentId, name, age, gender);
        this.researchTopic = researchTopic;
    }
    
    
    
    public void conductResearch(){
        System.out.printf("%s is conducting a research on %s%n",name,researchTopic );
    }
   
    @Override public void display(){
        super.display();
        System.out.printf("Research Topic: %s%n",researchTopic);
    }
}

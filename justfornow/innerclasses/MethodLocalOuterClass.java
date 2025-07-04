
package innerclasses;
import composition.Course;//how to call another package to a different package;

public class MethodLocalOuterClass {
    public void outerMethod(){
        System.out.println("This is an outer method");
    
    class MethodLocalInner{
        public void display(){
            System.out.println("This is an inner class method");
        }
    }
    MethodLocalInner inner=new MethodLocalInner();//read more about classes and inner classes;
    inner.display();
    }
    public static void main(String[] args) {
        MethodLocalOuterClass outer= new MethodLocalOuterClass();
        outer.outerMethod();
//        Course c=new Course();
    }
  
}

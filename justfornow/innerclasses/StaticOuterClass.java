
package innerclasses;

public class StaticOuterClass {
    
   
    private static String message ="This is an outer class";
    static int y=50;
    
    public static void checkMe(){
        System.out.println("This is a Static method");
    }
    
   static class StaticInnerClass{
        int x=10;
        public void display(){
            System.out.printf("%s%n",message);
            System.out.println(y);
            System.out.printf("%d%n",x);
            OuterClass.checkMe();
        }
    }
 
  
    public static void main(String[] args) {
        StaticOuterClass.StaticInnerClass inner=new StaticOuterClass.StaticInnerClass();
        
        inner.display();
    }

    
}

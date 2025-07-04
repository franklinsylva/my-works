
package innerclasses;


public class OuterClass {
    private String message ="This is an outer class";
    static int y=50;
    
    public static void checkMe(){
        System.out.println("This is a Static method");
    }
    
    class InnerClass{
        int x=10;
        public void display(){
            System.out.printf("%s%n",message);
            System.out.println(y);
            System.out.printf("%d%n",x);
            OuterClass.checkMe();
        }
    }
    public static void main(String[] args) {
        OuterClass outerclass=new OuterClass();
        
        OuterClass.InnerClass inner=outerclass.new InnerClass();
        inner.display();
        
    }
    
}

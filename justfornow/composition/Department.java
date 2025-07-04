
package composition;

public class Department {
    String departmentName;
    
    public Department(String departmentName){
        this.departmentName=departmentName;
    }
    
    
    public String displaydepartmentName(){
        return "Department" +" "+ departmentName;
    }
    
}

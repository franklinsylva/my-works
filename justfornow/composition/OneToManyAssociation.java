
package composition;
import java.util.List;


public class OneToManyAssociation {
    public static void main(String[] args) {
        Department hr =new Department("Human Resources");
        Department systemAdmin=new Department("System Admin");
        Department finance =new Department("Finance");
        Department rd =new Department("Research&Development");
        
        
        List<Department>departments=List.of(hr,systemAdmin,finance,rd);
        Company company=new Company("Niit",departments);
        
        company.displayCompanyDetails();
    }
    
    
}

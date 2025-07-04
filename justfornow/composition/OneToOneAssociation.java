
package composition;

public class OneToOneAssociation {
    public static void main(String[] args) {
        Address address1=new Address("No 1 kaduna Streeet","Port Harcourt","River State","Nigeria");
        Person person1=new Person("John",address1);
        person1.displayPerson();
        address1.displayAddress();
//        System.out.println("");
        
        
        Address address2=new Address("No 1 clinton Street","Port Harcourt","Alabama","Usa");
        Person person=new Person("Houston",address2);
        person.displayPerson();
        address2.displayAddress();
    }
   }
    


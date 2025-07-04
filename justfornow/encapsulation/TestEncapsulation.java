package encapsulation;
import java.util.Scanner;


public class TestEncapsulation 
{
    public static void main(String[]args)
    {
//        Scanner scan=new Scanner(System.in);
//        System.out.print("Enter account Number: ");
//        String accNumber=scan.nextLine();
//        
//        
//        System.out.print("Enter account Name: ");
//        String accName=scan.nextLine();
//        
//        System.out.print("Enter account Balance: ");
//        double accBal=scan.nextDouble();
//        scan.nextLine();
//        
//        System.out.print("Enter bvn: ");
//        String bvn=scan.nextLine();
//        
//        
//        System.out.print("Enter account Type: ");
//        String accType=scan.nextLine();




  
        EncapsulationPratice encaps=new EncapsulationPratice("4255321323","Kate run");
        encaps.display();
        System.out.println();
        
        
        EncapsulationPratice enc=new EncapsulationPratice("1234567890","Miracle doe");
        enc.display();
        System.out.println();
        
        
         EncapsulationPratice encap=new EncapsulationPratice("543423123","David doe");
         encap.display();
         System.out.println();
        
        
         EncapsulationPratice enca=new EncapsulationPratice("0923432234","Dan doe");
         enca.display();
         System.out.println();
        
        
        
        
       
    }
    
}

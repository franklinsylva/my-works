
package composition;


public class Address {
    String street;
    String city;
    String state;
    String country;
    
    
    public Address(String city,String state,String country,String street){
      this.state=state;
      this.city=city;
      this.street=street;
      this.country=country;
      
      
    }
    
  public void displayAddress(){
      System.out.printf("%s,%s,%s,%s%n",city,state,country,street);
  }  
}

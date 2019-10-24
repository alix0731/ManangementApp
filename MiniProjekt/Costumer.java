import java.util.Scanner;

public class Costumer{

   private String name;
   private String adress;
   private int cpr;
   private String tlf;
   private String email;
   
   Scanner input = new Scanner(System.in);

   public Costumer(){
   
   }
   
   
   public void createCostumer(){
   
      while(true){
         try{
         
            System.out.println("\n|Create costumer|");
            
            System.out.print("Name: ");
            String name = input.nextLine();
            
            System.out.print("Adress: ");
            String adress = input.nextLine();
            
            System.out.print("Cpr: ");
            int cpr = input.nextInt();
            
            System.out.print("Tlf: ");
            String tlf = input.next();
            
            System.out.print("Email: ");
            String email = input.next();
            
            this.name = name; 
            this.adress = adress; 
            this.cpr = cpr; 
            this.tlf = tlf;
            this.email = email;
         
               
            break;
         }
         catch(Exception e){
         
            System.out.println("Wrong input! Please try again");
         
         }
      
      }
   
   
   
   }
      
   public String  getInfo(){
   
      String info = "Costumer name: " + name + "\nAdress: " + adress + "\nCpr: " + cpr + "\nTlf: " + tlf + "\nEmail: "+ email + "\n\n";
   
      return info;
   }
   
   public String getName(){
   
      return name;
   
   }



}
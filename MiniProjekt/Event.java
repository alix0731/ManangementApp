
import java.util.Scanner;

public class Event {

Scanner input = new Scanner(System.in);

   private String name;
   private String description; 
   private String type; 
   private String date;
   private int duration; 
   private String facilitator;
   
   Payment invoice = new Payment(500);
   

   //Konstruktør
   public Event() {
   
   
      System.out.println("\n|Create event|");
            
      System.out.print("What is the name of the event?: ");
      String name = input.nextLine();
            
      System.out.print("What is the description of the event?: ");
      String description = input.nextLine();
            
      System.out.print("What type event is it?: ");
      String type = input.nextLine();
            
      System.out.print("What date is the event?: ");
      String date = input.nextLine();
            
      System.out.print("What is the facilitators name?: ");
      String facilitator = input.nextLine();
               
      System.out.print("What is the duration of the event?: ");
      int duration = input.nextInt();
   
   
      this.name = name;  
      this.description = description;
      this.type = type; 
      this.date = date; 
      this.duration = duration; 
      this.facilitator = facilitator;
   
   }
 
   
   public String  getInfo(){
   
      String info = "Event name: " + name + "\nDescription: " + description + "\nType: " + type + "\nDate: " + date + "\nFacilitator: "+ facilitator + "\nDuration: "+ duration + "\nTotal Price: " + invoice.calculate(duration) + "DKK\n\n";
   
      return info;
   }
}






import java.util.*;
public class Program {

   static Scanner input;
   static Menu createMenu = new Menu();
   
   public Program(){
   
   }
 
   public static void main(String[]args){
      
      while(true){        
         try{
            input = new Scanner(System.in);
         
            System.out.println("\n|WELCOME TO PLANORGAN|\nSelect a Login?:");
            System.out.println("------------------------------");
            System.out.println("|1.Secretary                 |");
            System.out.println("|2.Facilitator               |");
            System.out.println("------------------------------");
            System.out.println("|0.Exit program              |");
            System.out.println("------------------------------");
         
            System.out.print("Type number: ");
            int menuNumber = input.nextInt();
         
                     
            if(menuNumber == 1){
            
               createMenu.menuSecretary();
            }
         
            if(menuNumber == 2){
            
               createMenu.menuFacilitator();
            }
            
            if(menuNumber == 0){
               break;
            }
         
            if(menuNumber>2){
            
               System.out.println("The menu only have 3 options! Please choose the accessible options:\n");
            }
         }
         catch(InputMismatchException e){
            //e.printStackTrace();
            System.out.println("The menu only takes integers. Try Again!\n");
         }
      }
   }
}
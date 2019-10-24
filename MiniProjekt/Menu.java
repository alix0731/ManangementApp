import java.util.*;
public class Menu {

   Scanner input;
   
   ArrayList<Arrangement> arrangements;
   
   Arrangement arrange1;
   
   ArrayList<String> costumerList = new ArrayList<String>();
   ArrayList<String> arrangementNameList = new ArrayList<String>();



 
   public void menuSecretary(){
   
      arrangements = new ArrayList<Arrangement>();
      Arrangement arrange;
      
      
      
      while(true){
       
         input = new Scanner(System.in);
      
         System.out.println("\n|Please enter Login|");
         System.out.print("Enter UserId: ");
         String inputId = input.next();
       
         System.out.print("Enter pass: ");
         String inputPass = input.next();
      
         Login login = new Login("Secretary", "1234");
         
       
       //Login for Sekretær
         if(inputId.equals(login.getName()) && inputPass.equals(login.getPass())){
         
            do{
            
               System.out.println("\n|PlanOrgan Menu| ");
               System.out.println("----------------------------------------------------------");
               System.out.println("|1.Create arrangement                                    |");
               System.out.println("|2.Edit arrangement                                      |");
               System.out.println("|3.Delete arrangement                                    |");
               System.out.println("|4.Assign people to arrangements                         |");
               System.out.println("|5.List of costumers who are signed up an arrangement    |");
               System.out.println("|6.List of arrangements participants are associated with |");
               System.out.println("----------------------------------------------------------");
               System.out.println("|0.Exit menu                                             |");
               System.out.println("----------------------------------------------------------");
            
            
            
               int in;
            
               System.out.print("choose a number: ");
               input = new Scanner(System.in);
               in = input.nextInt();
            
               try{
               //Create Arrangement
                  if(in == 1){
                  
                  
                     input = new Scanner(System.in);
                  
                     System.out.print("What is the name of arrangement you want to create?: ");
                     String inputName = input.next();
                  
                     arrange = new Arrangement(inputName);
                     arrangements.add(arrange);
                  
                  
                  //System.out.print("What is the name of the file you want to create?: ");
                     arrange.createFile(inputName);
                  
                  
                     arrange.createEvent();
                  
                  
                  //////
                  //Indsætter kunde navn i en ArrayList til menu 5
                     costumerList.add(arrange.newCostumer.getName());
                  // hvilket arrangement kunden er tilknyttet (se menu 5)
                     arrangementNameList.add(inputName);
                  
                  
                  
                                    
                  }
               
               //Edit arrangement
                  if(in == 2){
                  
                     System.out.println("\n|List of arrangements|");
                  
                     for(int i = 0; i < costumerList.size(); i++){
                     
                        System.out.println((i+1) + ". " + arrangementNameList.get(i));
                                      
                     }
                  
                  
                     arrange = new Arrangement("ny");
                  
                     if(arrange.readFile()){ //Tjekker om filen er læst
                     
                        arrange.replacement(); //metoden som skal bytte orderne
                     
                        arrange.writeToFile();
                     
                     }
                  
                  
                  }
               
               //Delete Arrangement
                  if(in == 3){
                  
                     System.out.println("\n|List of arrangements|");
                  
                     for(int i = 0; i < costumerList.size(); i++){
                     
                        System.out.println((i+1) + ". " + arrangementNameList.get(i));
                                      
                     }
                  
                  
                     arrange = new Arrangement("ny");
                  
                  
                     System.out.print("What arrangement do you want to delete?: ");
                     String delete = input.next();
                  
                     arrange.deleteFile(delete);
                  
                  }
               
               // Assign people to arrangements
                  if(in == 4){
                  
                     arrange = new Arrangement("ny");
                  
                  
                     System.out.println("\nWhich arrangement do you want to sign participants on?: ");
                     System.out.println("\n|Arrangement list|");
                     for(int i = 0; i < arrangementNameList.size(); i++){
                        System.out.println((i+1) + "." + arrangementNameList.get(i));
                     }
                  
                     System.out.print("Type arrangement name: ");
                     input = new Scanner(System.in);
                     String arrangeNameP = input.next();
                  
                     arrange.createFile(arrangeNameP + "Participant");
                  
                     System.out.print("How many participants do you want to add?: ");
                     int antalParticipant = input.nextInt();
                  
                     for(int i = 0; i < antalParticipant; i++){
                        System.out.print("Type name of participant?: ");
                        String participantName = input.next();
                        arrange.writeFile("- " + participantName + "\n");
                     }
                     arrange.closeFile();
                     System.out.println("Participants added succesfully...");
                  
                  }
               
               //List of people who are signed up an arrangement
                  if(in == 5){
                  
                     System.out.println("\n| List of people who are signed up an arrangement |\n");
                  
                     for(int i = 0; i < costumerList.size(); i++){
                     
                        System.out.print((i+1) + ". Name: " + costumerList.get(i));
                        System.out.println(" | Arrangement: " + arrangementNameList.get(i));
                                      
                     }
                  
                  //For at indtaste arrangement navn, så den bliver printet ud
                     arrange = new Arrangement("ny");
                     
                     System.out.println("\nType arrangement name to see content: ");
                  
                     if(arrange.readFile()){ //Tjekker om filen er læst
                     
                     }
                      
                  }
               
               //List of arrangements participants are associated with
                  if(in == 6){
                  
                     System.out.println("\n|List of participants|");
                  
                     for(int i = 0; i < arrangementNameList.size(); i++){
                     
                        System.out.println((i+1) + ". Arrangement: " + arrangementNameList.get(i) + "Participant");
                                      
                     }
                  
                  
                     arrange = new Arrangement("ny");
                     
                     System.out.println("\nType arrangement name to see content: ");
                  
                     if(arrange.readFile()){ //Tjekker om filen er læst
                     
                     }
                     System.out.println("--------------------");
                  }
               
               
                  if(in == 0){
                     System.out.println();
                     break;
                  }
               
                  if(in > 6){
                     System.out.println("The menu only have 0-6 options! Please choose the accessible options:\n");
                  
                  }
               
               }
               catch(Exception e){
               
                  System.out.println("The menu only takes integers. Try Again!\n");
               
               }
            
            }while(true);
           
         }else{
            System.out.println("Wrong userId or password. Try Again!\n");
         }
         
         //Når vi trykker exit
         break;
        
      }
   
   
   
   }
   
       
   
    
   public void menuFacilitator(){
   
        
      
      while(true){
       
         input = new Scanner(System.in);
      
         System.out.println("\n|Please enter Login|");
         System.out.print("Enter UserId: ");
         String inputId = input.next();
       
         System.out.print("Enter pass: ");
         String inputPass = input.next();
      
         Login login1 = new Login("Facilitator", "9876");
       
       //Login for Sekretær
         if(inputId.equals(login1.getName()) && inputPass.equals(login1.getPass())){
         
            do{
            
               System.out.println("\n|PlanOrgan Menu| ");
               System.out.println("---------------------------------------------------");
               System.out.println("|1.List of people who are signed up an arrangement|");
               System.out.println("|2.List of arrangements people are associated with|");
               System.out.println("---------------------------------------------------");
               System.out.println("|0.Exit menu                                      |");
               System.out.println("---------------------------------------------------");
            
            
            
               System.out.print("choose a number: ");
                              
               try{
               
                  input = new Scanner(System.in);
                  int in = input.nextInt();
               
               //List of people who are signed up an arrangement
                  if(in == 1){
                     System.out.println("\n| List of people who are signed up an arrangement |\n");
                  
                     for(int i = 0; i < costumerList.size(); i++){
                     
                        System.out.print((i+1) + ". Name: " + costumerList.get(i));
                        System.out.println(" | Arrangement: " + arrangementNameList.get(i));
                                      
                     }
                  
                  //For at indtaste arrangement navn, så den bliver printet ud
                     Arrangement arrange = new Arrangement("ny");
                     
                     System.out.println("\nType arrangement name to see content: ");
                  
                     if(arrange.readFile()){ //Tjekker om filen er læst
                     
                     }
                      
                  }
                              
               //List of arrangements people are associated with
                  if(in == 2){
                  
                     System.out.println("\n|List of participants|");
                  
                     for(int i = 0; i < arrangementNameList.size(); i++){
                     
                        System.out.println((i+1) + ". Arrangement: " + arrangementNameList.get(i) + "Participant");
                                      
                     }
                  
                  
                     Arrangement arrange = new Arrangement("ny");
                     
                     System.out.println("\nType arrangement name to see content: ");
                  
                     if(arrange.readFile()){ //Tjekker om filen er læst
                     
                     }
                     System.out.println("--------------------");
                  
                                         
                  }
                  //Exit menu
                  if(in == 0){
                     break;
                  }
                  
                  if(in > 2){
                     System.out.println("The menu only have 2 options! Please choose the accessible options:\n");
                  }
               }
               catch(Exception e){
               
               
                  System.out.println("The menu only takes integers. Try Again!\n");
               
               }
            
            
            
            }while(true);
           
         }else{
            System.out.println("Wrong login! Please try again...");
         }
         //exit til login menu
         break;
       
      }
   
   
   
   }
   
                     
          

}
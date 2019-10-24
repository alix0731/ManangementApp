public class Payment{

   double total; 
   double hourPrice;
   
   public Payment(int x){
   
      hourPrice = x;
   
   
   }

   public double calculate(int x){
   
      total = x * hourPrice;  
   
   return total;
   
   }


}
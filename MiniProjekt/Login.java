import java.util.*;
public class Login{

   private String userId;
   private String userPass;

   public Login(String userId, String userPass){
   
      this.userId = userId;
      this.userPass = userPass;
   
   }
   
   public String getName(){
   
      return userId;
   
   }
   public String getPass(){
   
      return userPass;
   
   }




}

public class Main {
 
   public int test(int n1, int n2) {
     try{
           return n1/n2;
      }catch(ArithmeticException e){
         throw e; 
      }
   }
 
   public static void main(String[] args) 
   {
      Main main = new Main();
      try{
          System.out.println(main.test(30, 0));
      }catch(Exception e){
          e.printStackTrace();
      }
   }
}

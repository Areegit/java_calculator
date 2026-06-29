import java.util.Scanner;
public class Calculator{
    public static void main (String[] args){
     Scanner input =new Scanner(System.in);
     System.out.println("enter the first number: ");
     double x = input.nextDouble();
      System.out.println("enter the operator(+,-,*,/): ");
     char op = input.next().charAt(0);
     System.out.println("enter the second number: ");
     double y = input.nextDouble();
     
     if (op=='+'){
        System.out.println(x+" + "+y+" = "+add(x , y));
     }
     else if (op=='-'){
        System.out.println(x+" - "+y+" = "+sub(x , y));
     }
     else if (op=='*'){
         System.out.println(x+" * "+y+" = "+multi(x , y));
     }
     else if (op=='/'){
         if (y==0){
             System.out.println("not defined");
         }
         else {
         System.out.println(x+" / "+y+" = "+divi(x , y));
         }
     }
     else {
         System.out.println("invalid operator , try again ");
     }
      input.close();
    }
    
       public static double add(double x ,double y) {
         return x+y;
     } 
     public static double sub(double x ,double y){
         return x-y;
     }
     public static double multi(double x ,double y){
         return x*y;
     }
     public static double divi(double x ,double y){
         return x/y;
     }
    
}

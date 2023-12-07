import java.util.Scanner;
class Factorial
  {
    public static void main(String arg[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the factorial of your number:");
      int n=sc.nextInt();
      int fact=display(n);
      System.out.println("the factorial number is:"+fact);
    }
    public static int display(int n){
      int fact=1;
      for(int i=1;i<=n;i++){
        fact*=i;
      }
      return fact;
    }
  }

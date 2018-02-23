import java.util.Scanner;

public class NameAgeAndSalary{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Hello. What is your name?");
    String name = input.next();
    
    System.out.println("Hi, " + name + "!  How old are you?");
    int age = input.nextInt();
    
    System.out.println("So You're " + age + " That's not old at all!");
    System.out.println("How much do you make, " + name);
    double Salary = input.nextDouble();
    
    System.out.println(Salary + "! I hope that's per hour and not per year! LOL");
    
    
    
    }
}

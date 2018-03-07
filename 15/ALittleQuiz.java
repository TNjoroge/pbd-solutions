import java.util.Scanner;

public class ALittleQuiz{
   public static void main( String [] args ) {
   Scanner input = new Scanner(System.in);
   
   int firstNumber =0;
   int secondNumber =0;
   int thirdNumber =0; 
   
   System.out.println("Are you ready for a quiz?");
   String answer = input.next();
   System.out.println("Okay, here it comes!");
   
   System.out.println("Q1) What is the captial of Alaska?");
   System.out.println("             1) Melbourne");
   System.out.println("             2) Anchorage");
   System.out.println("             3) Juneau");
   int firstRepsone = input.nextInt();
  
   if (firstRepsone == 3){
   System.out.println("That right");
   } else {
   System. out.println("Sorry, that wrong");
   }
   
   
   System.out.println("Q2) Can you store the value \"cat\"  in a variable of datatype int?");
   System.out.println("             1) Yes");
   System.out.println("             2) No");
   int secondRepsone = input.nextInt();
   
   if (secondRepsone == 2) {
   System.out.println("That right");
   } else {
   System.out.println("Sorry, \"cat\" is a string. int can only store whole numbers"); 
   }
   
   System.out.println("Q3) What is the result of 9+6/3?");
   System.out.println("              1) 5");
   System.out.println("              2) 11");
   System.out.println("              3) 15/3");
   int thirdRepsone = input.nextInt();
   
   if (thirdRepsone == 2) {
   System.out.println("That correct");
   } else { 
   System.out.println("That incorrect");
   }
   
    if (firstRepsone == 3){
    firstNumber = firstNumber += 1;
    }
    if (secondRepsone == 2) {
    secondNumber = secondNumber +=1;
    }
    if (thirdRepsone ==2) {
    thirdNumber = thirdNumber +=1;
    }
    
    int finalAnswer = firstNumber + secondNumber + thirdNumber; 
    
   
   System.out.println("Overall, you got" +  finalAnswer  +"out of 3 correct.");
   System.out.println("Thanks for playing");
   

   }


}

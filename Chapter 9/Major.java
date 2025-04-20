import java.util.Scanner;
enum Major{       //Creating enum
       ACC,CHEM,CIS,ENG,HIS,PHYS
   }
  
class Majors //Class Majors with enum Major data member
{
   Major m;
  
   Majors()
   {
       m=null;
   }
  
   void inputMajor()
   {
       //String userInput;
       Scanner s1=new Scanner(System.in);
       System.out.println("Enter any Major(ACC,CHEM,CIS,ENG,HIS,PHYS) : ");
       m=Major.valueOf(s1.next()); //Convert String word to enum Major
   }
  
   void displayMajorFall()
   {
       switch(m)   // Condition check for each major fall
       {
           case ACC:
           case CIS:
               System.out.println("You are in Business Division");
               break;
           case CHEM:
           case PHYS:
               System.out.println("You are in Science Division");
               break;
           case ENG:
           case HIS:
               System.out.println("You are in Humanities Division");
               break;
           default:
               System.out.println("You are in Unknown Division");
       }
   }
  
   public static void main(String args[])
   {
       Majors m1=new Majors();   // Object of Majors class
       m1.inputMajor(); //User input
       m1.displayMajorFall(); //Display major fall
   }
}
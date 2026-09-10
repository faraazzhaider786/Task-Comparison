import java.util.Scanner;
public class TaskByMe{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Your Name:");
    String name = input.nextLine();
    System.out.println("Enter your marks");
    String marks = input.nextInt();
    if(marks >= 90){
      System.out.println(name + ", got A grade ");
    }else if(marks>=80){
      System.out.println(name + ", got B grade ");
    }else if(marks > = 70){
      System.out.println(name + ", got C grade");
    }else{
      System.out.println(name + ", got D grade");
    }
  }
}

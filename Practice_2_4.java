/*prompt the user to enter
the length and width and 
find the area and perimeter
*/
   
   //importing a scanner
   import java.util.Scanner;

//Name of the Class
public class Practice_2_4 {

   //Main Method
   public static void main(String[] args) {
  
      //creating a new scanner
      Scanner input = new Scanner(System.in);
      
      //prompting the user to enter the length
      System.out.println("Enter the Length:     ");    
      //taking input from a user into the scanner
      double length = input.nextDouble();
      
      //prompting the user to enter the width
      System.out.println("Enter the Width:      ");
      //taking input from the user into the scanner
      double width = input.nextDouble();
      
      //diplaying the length and width
      //the user put into the scanner
      System.out.println("Length = " + length);
      System.out.println("Width = " + width);
      
      //using the inputs to find the area 
      double area = length * width;
      
      //using the inputs to find the perimeter
      double perimeter = 2*(length + width);
      
      System.out.println("Area:" + area);
      System.out.println("Perimeter:" + perimeter);   
   
   }
}//End of Class Practice_2_4   
import java.util.*;

class area{
public static void main(String args[]){

System.out.print("Enter radius: ");
Scanner input = new Scanner(System.in);

double radius = input.nextDouble();
double circle = 3.14 * radius * radius;
System.out.println(" the area of circle is: "+ circle);

System.out.print("Enter side: ");
double side = input.nextDouble();
double square = side * side;
System.out.println(" the area of square is: " + square);
}
}

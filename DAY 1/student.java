import java.util.*;

class student{
public static void main(String args[]){

Scanner input = new Scanner(System.in);

System.out.print("enter reg no: ");
long reg = input.nextLong();


System.out.println("enter marks: ");
int m1 =input.nextInt();
int m2 =input.nextInt();
int m3 =input.nextInt();
int m4 =input.nextInt();
int m5 =input.nextInt();

int total = m1+m2+m3+m4+m5;
System.out.println("the total is: "+ total);

double avg = (double) total/5;
System.out.println("the average is: "+avg);

}
}
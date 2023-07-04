import java.util.Scanner;
public class areacircumfereceofcircle{
public static void main(String[] args){
System.out.println(" enter the radius of circle");
Scanner val=new Scanner(System.in);
int r=val.nextInt();
double a=3.14*r*r;
double c=2*3.14*r;
System.out.println("area of circle is:"+a);
System.out.println("circumference of circle is:"+c);
}}

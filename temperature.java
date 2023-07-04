import java.util.Scanner;
public class temperature{
public static void main(String[] args){
System.out.println("enter the temperature in f:");
Scanner val=new Scanner(System.in);
int t=val.nextInt();
int c=t-273;
System.out.println("temperature in centigrade:"+c);
}}

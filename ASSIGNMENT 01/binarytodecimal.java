import  java.util.Scanner;
class binarytodecimal
{
public static void main(String [] args)
{
int bin, power=0,temp,decimal=0;
Scanner s = new Scanner(System.in);
System.out.print("Enter binary no:\t");
bin= s.nextInt();

while(bin>0)
{
temp=bin%10;
bin=bin/10;
decimal=decimal+temp*(int) Math.pow(2, power);
power++;
}
System.out.print(decimal);
}
}
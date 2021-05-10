import java.util.Scanner;
class octaltodecimal
{
public static void main(String[] args)
{
int rem, power=0,temp,decimal=0,octal;
Scanner s=new Scanner(System.in);
System.out.print("Enter octal no:\t");
octal= s.nextInt();

while(octal>0)
{
temp=octal%10;
octal=octal/10;
decimal=decimal+temp*(int)Math.pow(8,power);
power++;

}
System.out.print(decimal);
}
}
import java.util.Scanner;
class binarytooctal
{
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);
int power=0,temp,bin,decimal=0,octal=0,index=0;
int rem[]=new int[20];
System.out.print("Enter binary no:\t");
bin=s.nextInt();

while(bin>0)
{
temp= bin%10;
bin=bin/10;
decimal=decimal+temp*(int)Math.pow(2,power);
power++;
}
while(decimal>0)
{
rem[index]=decimal%8;
index++;
decimal=decimal/8;
}
index--;

while(index>=0)
{
System.out.print(rem[index]);
index--;
}

}

}
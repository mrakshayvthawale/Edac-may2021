import java.util.Scanner;
class decimaltooctal
{
public static void main(String [] args)
{
int num,index=0;
int rem[]=new int[20];
Scanner s = new Scanner(System.in);
System.out.println("Enter decimal no:\t");
num = s.nextInt();

while(num>0)
{
rem[index]=num%8;
index++;
num=num/8;
}
index--;

while(index>=0)
{
System.out.print(rem[index]);
index--;
}
}
}
import java.util.Scanner;
class decimaltobinary
{
public static void main(String [] args)
{
int num,index=0;
int rem[] = new int[20];
Scanner s = new Scanner(System.in);
System.out.println("Enter a Decimal no \t");
 num=s.nextInt();

while(num>0) //(NUM!=O)
{
rem[index]=num%2;   //REM[INDEX]=[0][1][2][3]
index++;                       // 2  1  0
num=num/2;
}
index--;
while(index>=0)
{
System.out.print(rem[index]);
index--;


/*
for(int i=index;i>=0;i--)
{
	System.out.print(rem[i]);
}   */
}
}
}

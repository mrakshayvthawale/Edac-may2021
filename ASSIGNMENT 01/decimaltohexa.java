import java.util.Scanner;
class decimaltohexa
{
public static void main(String[]args)
{
int num,index=0;
char rem[]=new char[20];
Scanner s = new Scanner(System.in);
System.out.println("Enter decimal no:\t");
num=s.nextInt();

while(num>0)
{
	int temp=0;
temp=num%16;
if(temp<10)
{
	rem[index]= (char)(temp+48);
	index++;
}
else{
	rem[index]=(char)(temp+55);
	index++;
}
	
num=num/16;
}
index--;
while(index>=0)
{
	
System.out.print(rem[index]);
index--;
}
}
}
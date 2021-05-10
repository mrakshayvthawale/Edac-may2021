import java.util.Scanner;
class binarytohexa
{
public static void main(String[] args)
{
	int decimal=0,index=0,temp,bin,power=0;
char rem[]=new char[30];
Scanner s = new Scanner(System.in);
System.out.print("Enter binary value:\t");
 bin=s.nextInt();

while(bin>0)
{
	temp=bin%10;
	bin=bin/10;
	decimal=decimal+temp*(int)Math.pow(2,power);
	power++;
	
}


while(decimal>0)
{
	temp=0;
	temp=decimal%16;
	if(temp<10)
	{
		rem[index]=(char)(temp+48);
		index++;
	}
	else
	{
		rem[index]=(char)(temp+55);
		index++;
	}		
	
	decimal=decimal/16;
	
}
index--;
while(index>=0)
{
	System.out.print(rem[index]);
	index--;
}

}
}
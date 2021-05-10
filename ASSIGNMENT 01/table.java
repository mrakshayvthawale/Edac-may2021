import java.util.Scanner;

class table
{
public static void main(String[]args)
{
Scanner s =  new Scanner(System.in);
System.out.println("Enter a Table to print: ");
int t = s.nextInt();
int i;
for(i=1;i<=10;i++)
{
System.out.println(t+"*"+i+"="+(t*i));	
}


}
}
import java.util.Scanner;
class pattern10
{
public static void main(String[]args)
{
Scanner s = new Scanner(System.in);
//System.out.println("Enter no of rows and no of columns");
//int nr=s.nextInt();
//int nc=s.nextInt();
for (int c= 1;c<=5;c++)
{
for(int r=5;r>=c;r-- )
{
System.out.print(" ");
}

for(int r=1;r<=5;r++)
{
System.out.print("*");
}

System.out.println(" ");
}


}
}

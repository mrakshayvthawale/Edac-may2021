import java.util.Scanner;
class pattern12
{
public static void main(String[]args)
{
Scanner s = new Scanner(System.in);
//System.out.println("Enter no of rows and no of columns");
//int nr=s.nextInt();
//int nc=s.nextInt();
for (int c= 1;c<=4;c++)
{
for(int r=5;r>=c;r-- )
{
System.out.print("*");
}
System.out.println(" ");
}

for (int c2= 1;c2<=5;c2++)
{
for(int r2=1;r2<=c2;r2++ )
{
System.out.print("*");
}
System.out.println(" ");
}

}
}

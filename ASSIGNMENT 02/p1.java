//import java.util.Scanner;
class p1
{
public static void main(String[]args)
{
//Scanner s = new Scanner(System.in);
//System.out.println("Enter no of rows and no of columns");
//int nr=s.nextInt();
//int nc=s.nextInt();
for (int c= 1;c<=9;c++)
{
for(int r=8;r>=c;r-- )
{
System.out.print(" ");
}
for(int r=1;r<=c;r++)
{
System.out.print(" "+c);
}

System.out.println(" ");
}

}

}

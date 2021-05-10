import java.util.Scanner;
class pp15
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
System.out.print(" "+r);
}
System.out.println(" ");
}

}

}

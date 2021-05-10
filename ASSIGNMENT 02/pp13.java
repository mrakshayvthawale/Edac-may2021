import java.util.Scanner;
class pp13
{
public static void main(String[]args)
{
Scanner s = new Scanner(System.in);
//System.out.println("Enter no of rows and no of columns");
//int nr=s.nextInt();
//int nc=s.nextInt();
for (char c= 65;c<=69;c++)
{
for(char r=69;r>=c;r-- )
{
System.out.print(" ");
}

for(char r=65;r<=c;r++ )
{
System.out.print(" "+c);
}



System.out.println(" ");
}

}

}

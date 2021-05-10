import java.util.Scanner;
class avg
{
public static void main(String[]args)
{
Scanner s = new Scanner(System.in);

System.out.println("First number input: ");
int a = s.nextInt();
System.out.println("Second number input: ");
int b = s.nextInt();
System.out.println("Third number input: ");
int c = s.nextInt();


System.out.println("Avg= "+(a+b+c)/3);

}
}
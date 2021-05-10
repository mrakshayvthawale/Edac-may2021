

import java.util.Scanner;
class ari
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.println("Input first number");
int a = s.nextInt();
System.out.println("Input second number");
int b = s.nextInt();

System.out.println(a+"+"+b+"="+(a+b));
System.out.println(a+"-"+b+"="+(a-b));
System.out.println(a+"*"+b+"="+(a*b));
System.out.println(a+"/"+b+"="+(a/b));
System.out.println(a+"%"+b+"="+(a%b));

}
}


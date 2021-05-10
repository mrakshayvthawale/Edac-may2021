import java.util.Scanner;
class binaryAdd
{
public static void main(String []args)
{
Scanner s = new Scanner(System.in);

int i=0,carry=0;
int [] sum = new int [20];

System.out.println("Enter a binary no\t");
long b1 = s.nextLong();

System.out.println("Enter a binary no\t");
long b2 = s.nextLong();
                                  
while(b1!=0 || b2!=0)     
{           
sum[i]=(int)(( b1%10 + b2%10 + carry)%2);
i++;
carry=(int)(( b1%10 + b2%10 + carry)/2);
b1=b1/10;
b2=b2/10;
}
if (carry!=0)
{
sum[i]=carry;
i++;
}
i--;
while(i>=0)
{
System.out.print(sum[i]);
i--;
}
}
}
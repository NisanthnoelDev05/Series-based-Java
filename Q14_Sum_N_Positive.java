import java.util.Scanner;
public class Main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int c=0,s=0;
while(c<n)
{
int x=sc.nextInt();
if(x>0)
{
s+=x;
c++;
}
}
System.out.println(s);
}
}
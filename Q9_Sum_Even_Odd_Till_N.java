import java.util.Scanner;
public class Main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int es=0,os=0;
for(int i=1;i<=n;i++)
if(i%2==0)
es+=i;
else
os+=i;
System.out.println(es);
System.out.println(os);
}
}
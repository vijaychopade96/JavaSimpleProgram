import java.util.Scanner;
public class pattern2
{
public static void main(String args[])
{
int lim;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name");
lim =sc.nextInt();
char ch='a';
for(int i=1;i<=lim;i++)
{
for(int j=1;j<=i;j++)
{
System.out.println("" +ch);
}
ch++;
System.out.println();
}
}
}

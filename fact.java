import java.util.*;
class fact
{
public static void main(String args[])
{
int sum=1,i;
Scanner in=new Scanner(System.in);
int n=in.nextInt();
for(i=1;i<=n;i++)
sum=sum*i;
System.out.println(sum);
}
}
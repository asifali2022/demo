import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]={31,28,31,30,31,30,31,31,30,31,30,31};
    for(int i=0;i<=12;i++)
     {
      if(n==i)
      {
        System.out.println("a[i]");
      }
    }
	}
}
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int  a[]=new int[n];
      for(int i=0;i<n;i=i+1)
        {
            a[i]=sc.nextInt();
        }
    float pc=0;
    float nc=0;
    float zc=0;
    for(int i=0;i<n;i=i+1)
        {
           if(a[i]>0)
           {
             pc=++pc;
           }
      else if(a[i]<0)
           {
             nc=++nc;
           }
      else if(a[i]==0)
           {
             zc=++zc;
           }
        }
    float pco=pc/n;
    float nco=nc/n;
    float zco=zc/n;
   
    System.out.printf("%1.6f",pco);
    System.out.println();
    System.out.printf("%1.6f",nco);
    System.out.println();
    System.out.printf("%1.6f",zco);
    
	}
}
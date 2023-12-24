package data_strcutures;

import java.util.*;
public class linearsearch
{	public static void main(String[] args) 
{
int a[ ],i,n,key;
        	Scanner rd = new Scanner(System.in);
        		System.out.println("Enter number of Elements: ");
        		n = rd.nextInt( );
        		a = new int[n];
        	System.out.println("Enter " +n+" Elements of an Array: ");
        	for(i=0;i<a.length;i++)
            			a[i] = rd.nextInt( );
        		System.out.println("Enter the Key element to Search: ");
        	key = rd.nextInt( );
        	for(i=0;i<a.length;i++)
        		{
            			if(a[i] == key)
                			break;
}
        	if (i == a.length)	System.out.println("The Element is not present");
        		else		System.out.println("\n\tElement Found at position: " +(i+1));
}
}


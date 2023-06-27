//my package name is LAB_3
package Lab_3;
import java.util.Scanner;
public class Q1 {
	public static void main(String []args) {
	Scanner ob=new Scanner(System.in);
	System.out.print("Array Size : ");
	int size;
	size=ob.nextInt();
	int array[]= new int[size];
	System.out.print("Enter the elemnets : ");
	for(int i=0;i<size;i++)
	{
		array[i]=ob.nextInt();
	}
	int temp=0;
	for(int i=0;i<array.length;i++)
	{
		for(int j=i+1;j<array.length;j++)
		{
			if(array[i]>array[j])
			{
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
	}
	for(int i=0;i<array.length;i++)
	{
		System.out.println(array[i]);
	}
	
}
}

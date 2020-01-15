import java.util.Scanner;

public class ArrayDemo {
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayDemo ar = new ArrayDemo();
		// TODO Auto-generated method stub
		int[] array ;
		
		System.out.println("Enter the 5 numbers \r");
		array=ar.getIntegers(5);
		System.out.println("Printing the array");
		ar.printArray(array);
		System.out.println("Sorting the array  ");
		int[]array2= ar.sortIntegers(array);
		ar.printArray(array2);

	}
	public   int[] getIntegers(int numbers)
	{ int [] array1= new int[numbers];
		for(int i =0 ;i <numbers;i++)
		{ array1[i]=scan.nextInt();
			
		}
		return array1;			
	}
	
	public void printArray(int[] numbers)
	{  
		for(int i=0 ; i<numbers.length;i++)
	{
		System.out.println(numbers[i]);
	}
		
	}
	public int[] sortIntegers(int[] numbers)
	{ int[] array = new int[numbers.length];
		for(int i=0; i<numbers.length;i++)
		{  array[i]=numbers[i];}
		
		boolean flag=true;
		int temp;
		while(flag)
		{
			flag=false;
			for(int i =0; i<array.length-1;i++)
			{
				if(array[i]<array[i+1])
				{
					temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
					flag=true;
				}
			}
		}
		return array;
	}

}


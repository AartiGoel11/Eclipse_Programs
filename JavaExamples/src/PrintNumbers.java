
public class PrintNumbers {

	public static void main(String[] args) {
     printNumbers(1);
	}

	private static void printNumbers(int i) {
		if(i<=10)
		{
			System.out.println(i);
			printNumbers(i+1);
		}
		
	}

}

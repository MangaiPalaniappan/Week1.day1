package week1.day1.Assigments;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Number=13;
		boolean Flag = false;
		
		for(int i=1;i<=Number/2;i++) {
			
			if(Number%2==0)
				Flag=true;
		}
		
		if(Flag=true) {
			System.out.println(Number + " is not a prime number");
		}
		
		else {
			System.out.println(Number + "is a prime number");
		}
			

	}

}

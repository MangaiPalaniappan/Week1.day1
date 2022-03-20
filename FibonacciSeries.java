package week1.day1.Assigments;



public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int FirstNumber =0,SecondNumber=1,Sum=0,range=8;
 System.out.println(FirstNumber);
 System.out.println(SecondNumber);
 
    for(int i=2;i<range;i++){
	 Sum=FirstNumber+SecondNumber;
	System.out.println(""+Sum );
	 FirstNumber=SecondNumber;
	 SecondNumber=Sum;
	 
	 
	 
 }
 
 
 
	}

}

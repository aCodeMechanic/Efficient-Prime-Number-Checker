public class PrimeNumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumberChecker.isPrime(1);
	}
	
	public static boolean isPrime(int num){
	    if ( (num >= 2 && num%2 == 0) || (num < 2) ) {
	        System.out.println(num + " is not prime");
	        return false;
	    }
	    
	    for(int i = 3; i < ((int)Math.sqrt(num) + 1); i+=2){
	        if(num % i == 0){
	            System.out.println(num + " is not prime");
	            return false;
	        }
	    }
	    System.out.println(num + " is prime");
	    return true; 
	}
	
}

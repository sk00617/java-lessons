package primenumbers;

public class PrimeNumberValidator {
	public boolean isNumberPrime(int number) {
		boolean isPrime=true;
		if (number==1)
			return !isPrime;
		else
			for(int i=2; i<=number/2; i++)
				if(number%i == 0 )
					return !isPrime;
		return isPrime;
	}

}



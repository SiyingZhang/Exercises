## 204 Count Primes

//Count the number of prime numbers less than a non-negative number, n.

### How to determin a prime number?

	boolean isPrime(int n) {
		for(int i=2; i<n; i++){
			if(n%i == 0) return false
		}
		return true;
	}
	
	//we don't need to judge every integer, so change i<n into i<n/2
	
	//this is the right IDEA!
	boolean isPrime(int n) {
	    //check if n is a multiple of 2
	    //ignore all odd number
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	

ignore all even number, and judge odd numbers. 
	
	public class Solution {
    public int countPrimes(int n) {
        if(n<3) return 0;
        
        boolean[] notPrime = new boolean[n]; //initialized with false
        int count = n/2;
        
        for(int i=3; i*i<n; i+=2) {
            if(notPrime[i])
                continue;
            for(int j=i*i; j<n; j+= 2*i) {
                if(!notPrime[j]) {
                    --count;
                    notPrime[j] = true;
                }
            }
        }
        
        return count;
    }
	}
	
package recursion;

public class Recursion {
	
	// Class examples
	public static int sum_up(int n) {
		//base case
		if (n <=0 ) {
			return 0;
		}
		//Recursive case
		else {
			return n + sum_up(n-1);
		}
	}

	public static int sum_up_tail(int n) {
		return sum_up_tail(n, 0);
	}
	public static int sum_up_tail(int n, int tmp) {
		if (n < 1 ) {
			return tmp;
		}
		else {
			return sum_up_tail(n-1, tmp+n);
		}
	}
    
    public static void print_up_to(int n) {
    	if (n >= 1) {
    		print_up_to(n, 1);
    	}
    	System.out.println();
    }
    	
    private static void print_up_to(int n, int current) {
    	System.out.print(current + " ");
    	if (n > 1) {
    		print_up_to(n-1, current+1);
    	}
    }
    
    public static int fact (int n)
    {
        int ret;
         
        if (n <= 1)
            ret = 1;
        else
            ret = n * fact(n-1);
         
        return ret;
    }
     
    // Activity 4 
     public static int fib(int n)
     {
    if (n < 1)
    	return 0;

    if (n <= 2)
    	return 1;

    return fib(n - 1) + fib(n - 2);
     }
     
     public static int gcd(int num1, int num2)
     {
    	 
    	 if (num2 <= num1 && (num2 % num1 == 0)) 
    	  return num2; 
    	 
    	if (num1 < num2) 
   			return gcd(num2,num1);
   		
    	else 	
    		return gcd(num2, num1 % num2);
     }
     public static int power (int x, int y)
     {
    	 if (y != 0)
             return (x * power(x, y - 1));
         else
             return 1;
     }
	
	

    // Project 4 
     public static int balance (int x, int y)
     {
    	 int balance = 0;
    	 if (x - y <= 1 || y - x <= 1)
    	 {
    		 if (x > y)
    		 {
    			 balance = y; 
    		 }
    		 if (x < y) 
    		 {
    			 balance = x;
    		 } 	
    		 else 
    			 balance = x;
    	 }
    	 if (x > y)
    	 {
    		 balance = (x - 1) + (y + 1); 
    	 }
    	 if (x < y) 
    	 {
    		 balance = (y - 1) + (x + 1);
    	 } 	 
    	 	
		 return balance;
     }
     
     
     
     
     public static int Ackermann(int m, int n)
     {
    	 int a = 0;
    	 if ( m == 0)
    	 {
    		a = n + 1;
    	 }
    	 if (m > 0 && n == 0)
    	 {
    		a = Ackermann(m - 1, 1);
    	 }
    	 if (m > 0 && n > 0)
    	 {
    		 a = (Ackermann(m-1, Ackermann(m, n-1)));
    	 }
    	 return a;
     }
     
     
	 public static double pi_approximation(int n)
	 {
		 return pi_approximation_helper(n, -1);
	 } 
     
     
	 public static double pi_approximation_helper (int n, double pi)
	 {
	   double Pi = 0.0;
	    for (int a = 0; a < 9999999; a++) 
	    {
	        Pi += (Math.pow(-1, n-1)/((2*n)-1)); 
	        n++;
	    }
	    return 4 * Pi;
	 }
     
	 public static void collatz(int n)
	 { 
		 if(n == 1)
		 {
			 System.out.println(1);;
		 }
		 else 
		 {
			 if ((n % 2) == 0)
			 {
			 System.out.print(n + ", ");
			 collatz(n/2);
			 }
			 else
			 {
			 collatz((3*n) + 1);
			 }
		 }
	 }
	 
     
     
     
}

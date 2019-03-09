package fibo;
import java.math.BigInteger;
public class fibo {
	public static BigInteger fibonacci(int n) {
	    BigInteger n1=new BigInteger("0");
	    BigInteger n2=new BigInteger("1");
	    int i;
	    BigInteger fib=new BigInteger("0");
		if(n==1)
			fib=new BigInteger("0");
		if(n==2)
			fib=new BigInteger("1");
		for(i=3;i<=n;i++) {
			fib=n1.add(n2);
			n1=n2;
			n2=fib;	
	}
		return fib;
	}
}

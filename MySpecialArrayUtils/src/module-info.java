
public class MySpecialArrayUtils{
	public static void reverse(int[] arr) {
		int i,j,n,t;
		n=arr.length;
		j=n-1;
		for(i=0;i<=(n/2);i++) {
			t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
			j--;
		}
	}
	public static int[] sumEvenOdd(int[] arr) {
		int i,n;
		n=arr.length;
		int []sum=new int[2];
		for(i=0;i<n;i++) {
			if(arr[i]%2 == 0)
				sum[0] += arr[i];
			else
				sum[1] += arr[i];
		}
		return sum;
	}
	public static double average(int[] arr) {
		double j,n,aver=0;
		int i;
		n=arr.length;
		for(i=0;i<n;i++) {
			j = arr[i]/n;
			aver += j;
		}
		if( Math.abs( Math.ceil(aver) - aver) < Math.pow(10,-7) )
			aver=Math.ceil(aver);
		return aver;
	}
	public static void moveValue(int[] arr, int val) {
		int i,n,j;
		n=arr.length;
		for(i=0;i<n;i++) {
			if(arr[i]==val) {
				for(j=i;j<n-1;j++) {
				arr[j]=arr[j+1];
				}
				arr[n-1]=val;
		}
		}
	}
	public static int[][] transpose(int[][] arr) {
        int n,k,i,j;
        n = arr.length;
        k = arr[0].length;
        int [][]trans=new int[k][n];
        for(i=0;i<n;i++) {
        	for(j=0;j<k;j++) {
        		trans[k][n]=arr[n][k];
        	}
        }
        return trans;
    }
}

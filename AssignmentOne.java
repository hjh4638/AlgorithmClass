package algorithm;

public class AssignmentOne {
	public static int aaa = 0;
	public static void main(String[] args) {
		//int[] A={2,2,1,2,1,5,6,5,5,1};
//		int[] A={1,2,3,4};
//		idoitSort(A, 1, A.length);
//		System.out.println("처음개수 : "+A.length);
//		for(int i=0;i<A.length;i++){
//			System.out.println(A[i]);
//		}
//		System.out.println("개수 "+A.length);
//		System.out.println("횟수 : "+aaa);
		
		quicksort(0, S.length-1);
		for(int i=0;i<S.length;i++){
			System.out.println(S[i]);
		}
	}
	public static int fib_1(int n, int dept){
		if(n<=1){
			return 1;
		}
		int temp=fib(n-1) + fib(n-2); 
		return temp;
		
	}
	public static int fib(int n){
		if(n<=1){
			return 1;
		}
		else return fib(n-1) + fib(n-2) + 2;
	}
	public static int fib2(int n){
		int i;
		int[] f = new int[n+1];
		
		f[0]=1;
		if(n>0){
			f[1]=1;
			for(i=2;i<=n;i++){
				aaa++;
				f[i]=f[i-1]+f[i-2]+2;
			}
		}
		return f[n];
	}
	public static long fib(long n) {
	  return fibo_iter(n, 1, 1);
	 }
	 
	 public static long fibo_iter(long x, long a, long b) {
	  if (x==0) return a;
	  else return fibo_iter(x-1, b, a+b+2);
	 }
	 
	 public static int[] mul(int[] a, int[] b){
		 aaa++;
		 int[] arr = new int[3];
		 arr[0] = a[0]*b[0]+a[1]*b[1];
		 arr[1] = a[0]*b[1]+a[1]*b[2];
		 arr[2] = a[1]*b[1]+a[2]*b[2];
		 return arr;
	 }
	 public static int fibMatrix(int n){
		 if(n<2) return 1;
		 int[] pa = {1,1,0};
		 return pow(pa,n)[0];
	 }
	 public static int[] pow(int[] A, int n){
		 if (n == 1) return A;
		 if ((n & 1) == 0) {
			 return pow(mul(A,A), n/2);
		 }
	    else return mul(A,pow(mul(A,A), (n-1)/2));
	 }
	 public static int[] idoitSort(int[] A, int low, int high){
		 int t;
		 aaa++;
		 if(A[high-1]<A[low-1]){
			 int temp;
			 temp = A[low-1];
			 A[low-1]=A[high-1];
			 A[high-1]=temp;
		 }
		 if((high-low)>1){
			 t=(high-low+1)/3;
			 idoitSort(A, low, high-t);
			 idoitSort(A, low+t, high);
			 idoitSort(A, low, high-t);
		 }
		 return A;
	 }
	 static int[] S = {15,22,13,27,12,10,20,25};
	 public static void quicksort(int low,int high){
		 int pivotpoint;
		 
		 if(high>low){
			 pivotpoint = partition(low,high);
			 quicksort(low, pivotpoint-1);
			 quicksort(pivotpoint+1, high);
		 }
	 }
	 public static int partition (int low,int high){
		 int i,j,pivotpoint = 0;
		 int pivotitem;
		 int temp;
		 pivotitem = S[low];
		 j=low;
		 for(i=low+1;i<=high;i++){
			 if(S[i]<pivotitem){
				 j++;
				 temp = S[i];
				 S[i]=S[j];
				 S[j]=temp;
			 }

		 }
		 pivotpoint = j;
		 temp=S[low];
		 S[low]=S[pivotpoint];
		 S[pivotpoint]=temp;
		 return pivotpoint;
	}
	 
}

package algorithm;

public class ChapterOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a = {7,2,6,9,6,4,4,58,9,4,3};
//		for(int i=0;i<a.length;i++){
//			System.out.println(a[i]);
//		}
//		System.out.println(a.length);
//		exchangesort(11, a);
//		for(int i=0;i<a.length;i++){
//			System.out.println(a[i]);
//		}
//		int[][][] asdfas=new int[4][4][4];
//		int[][] a1 = { {2,3} ,{4,1}};
//		int[][] a2 = {{5,7},{6,8}};
//		int[][] c1 = new int[2][2];
//		matrixmult(2, a1, a2, c1);
//		for(int i=0;i<2;i++){
//			for(int j=0;j<2;j++){
//				System.out.println(c1[i][j]);
//			}
//		}
		System.out.println(fib(3));
	}
	public static void exchangesort(int n, int[] S){
		int i,j;
		int tem;
		for(i=0;i<n-1;i++){
			for(j=i+1;j<n;j++){
				if(S[j]>S[i]){
					tem = S[j];
					S[j]=S[i];
					S[i]=tem;
				
				}
			}
		}
	}
	public static void matrixmult(int n, int[][] A, int[][] B, int[][] C){
		int i,j,k;
		
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				C[i][j]=0;
				for(k=0;k<n;k++){
					C[i][j] = C[i][j] + A[i][k] * B[k][j];
				}
			}
		}
	}
	public static int binsearch(int n, int[] S, int x){
		int location, low, high, mid;
		
		low=0;high =n-1;
		location =0;
		while(low<=high && location ==0){
			mid = (int)Math.ceil(((double)low+(double)high)/2);
			if(x==S[mid]){
				location=mid+1;
			}
			else if(x<S[mid]){
				high = mid-1;
			}
			else
				low = mid+1;
		}
		return location;
	}
	public static int fib(int n){
		if(n<=1){
			return n;
		}
		else return fib(n-1) + fib(n-2);
	}
}

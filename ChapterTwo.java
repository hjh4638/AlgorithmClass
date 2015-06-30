package algorithm;

public class ChapterTwo {
	public static void main(String[] args) {
	
//		int[] s = {27, 10, 12, 20, 25, 13, 15, 22};
//		mergesort(s.length, s);
//		for(int i=0;i<s.length;i++){
//			System.out.println(s[i]);
//		}
		re(1234);
	}
	static int x=12;
	static int[] S={10,12,13,14,18,20,25,27,30,35,40,45,47};
	public static int location(int low,int high){
		int mid;
		if(low>high){
			return -1;
		}
		else{
			mid = (low+high)/2;
			if(x==S[mid])
				return mid;
			else if(x<S[mid])
				return location(low, mid-1);
			else 
				return location(mid+1, high);
		}
	}
	public static void mergesort(int n, int[] S){
		if(n>1){
			final int h = n/2, m= n-h;
			int[] U = new int[h], V=new int[m];
			
			for(int i=0;i<h;i++){
				U[i]=S[i];
			}
			for(int i=0;i<m;i++){
				V[i]=S[h+i];
			}
			mergesort(h,U);
			mergesort(m, V);
			merge(h,m,U,V,S);
		}
	}
	public static void merge(int h, int m, int[] U, int[] V, int[] S){
		int i=0,j=0,k=0;
		while(i<h&&j<m){
			if(U[i]<V[j]){
				S[k]=U[i];
				i++;
			}
			else{
				S[k]=V[j];
				j++;
			}
			k++;
		}
		if(i>h){
			for(int q=j;q<m;q++){
				S[k]=V[q];
				k++;
			}
		}
		else{
			for(int q=i;q<h;q++){
				S[k]=U[i];
				k++;
			}
		}
	}
	public static void re(int number){
		if(number < 10){
			System.out.println(number);
		}
		else{
			re(number/10);
			System.out.println(number%10);
		}
	}
}

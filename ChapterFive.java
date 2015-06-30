package algorithm;

public class ChapterFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queens(0);
	}
	
	final static int n = 5;
	static int col[] = new int[n+1];
	public static void queens( int i) {
	     int j;
		
	     if (promising(i)){
	    	 	//완전한 해가 되었을
				if (i==n){
					for(int k=1;k<=n;k++){
						System.out.println(col[k]);
					}
					System.out.println("-------------");
				}
				//재귀를 돌리자~
				else{
					for (j=1; j<=n; j++) {
						col[i+1] = j;
						queens(i+1) ;
					}
				}
	     }
	}
	public static boolean promising (int i)
	{
	      int k;   
	      boolean swi ;

	      k = 1;
	      swi = true ;
	      while (k<i && swi) {
	           if( (col[i]==col[k]) || Math.abs(col[i]-col[k]) == i-k){
		           swi = false ;
	           }
	           k++;
	      }
	      return swi;
	}

}

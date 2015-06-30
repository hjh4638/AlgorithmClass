package algorithm;

public class ChapterFour {
	public static int[][] prim(
	            int n, int W[][]) 
	{
	int i, vnear;
	int [ ] nearest = new int[2..n] ;
	int min;
	int[ ] distance = new int[2..n] ;
	edge e;
	set_of_edges  F = ¨ª;
	
	for (i=2; i<=n; i++)  { 
	    nearest[i]= 1; 	
	    distance[i] = W[1][i];
	}
	repeat( n-1 times ) {       
		min = ¡Ä ;
		 for (i=2; i<=n; i++) 
		    if (        distance[i] < min) {
		         min = distance[i] ;  vnear = i ;
		    }

		 min = ¡Ä ;
		 for (i=2; i<=n; i++) 
		    if (        distance[i] < min) {
		         min = distance[i] ;  vnear = i ;
		    }
		 add e to F ;
		 distance[vnear] = -1 ;
		 for (i=2; i<=n; i++)
		     if (W[i][vnear] < distance[i]) {
		          distance[i] = W[i][vnear] ; 
		          nearest[i] = vnear ;
		     }

	}
	return F ;
	}

}

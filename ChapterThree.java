package algorithm;

public class ChapterThree {

	public static void main(String[] args) {
		
		int[][] w = {
				{0,1,9999,1,5},
				{9,0,3,2,9999},
				{9999,9999,0,4,9999},
				{9999,9999,2,0,3},
				{3,9999,9999,9999,0}
		};
		int[][] p=new int[w.length][w.length];
		floyd2(w.length, w,p);
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){			
				System.out.println("i to j="+i + "  "+ j);
				path(i,j,p);
				System.out.println("--------");
			}
		}
	}
	public static void floyd(int n, int[][] D){
		int i,j,k;
		
		for(k=0;k<n;k++){
			for(i=0;i<n;i++){
				for(j=0;j<n;j++){
					D[i][j]= (D[i][j] <= (D[i][k]+D[k][j])) ? D[i][j] :D[i][k]+D[k][j]; 
				}
			}
		}
	}
	public static void floyd2(int n, int[][] D, int[][] P){
		int i,j,k;
		for(k=0;k<n;k++){
			for(i=0;i<n;i++){
				for(j=0;j<n;j++){
					if(D[i][k]+D[k][j]<D[i][j]){
						P[i][j]=k+1;
						D[i][j]=D[i][k]+D[k][j];
					}
				}
			}
		}
	}
	public static void path(int q,int r,int[][] P){
		if(P[q][r]!=0){
			path(q,P[q][r]-1,P);
			System.out.println(" " + "v"+"" + (P[q][r]-1));
			path(P[q][r]-1,r,P);
		}
	}
	public static nodetype search(nodetype tree,int keyin){
		boolean found;
		nodetype p;
		p=tree;
		found = false;
		while(!found){
			if(p.key == keyin){
				found = true;
			}
			else if(keyin<p.key){
				p=p.left;
			}
			else
				p=p.right;
		}
		return p;
		
	}
//	public static int travel(int n, int[][] W, int[][] P){
//		int i,j,k;
//		int minlength;
//		int[][] D = new int[n][n-1];
//		
//		for(i=2;i<=n;i++){
//			D[i]
//		}
//	}
}
class nodetype{
	public int key;
	public nodetype left;
	public nodetype right;
}


package coding;

public class IS_sorted {
	 public static void main(String[] args) {
		 int A1[]= {1,2,3,0,0,0};
		 int A2[]= {2,5,6};
		 int m=3,n=3,K=0,L=0;
		 int q[]=new int[m+n];
		for(int i=0;i<m+n;i++) {
			if(A1[K]!=0&&A1[K]<A2[L]) {
				q[i]=A1[K];
				System.out.println(i+ ":" +q[i]);
				K++;
			}
			else if(A2[K]!=0&&A2[L]<A1[K]) {
				q[i]=A2[L];
				System.out.println(i+ ":" +q[i]);
				L++;
			}
			else if(A2[K]!=0&& A1[K]!=0&&A2[L]==A1[K]) {
				System.out.println(i+ ":" +q[i]);
				q[i]=A1[K];
				K++;
			}
			else if(A1[K]==0) {
				
				q[i]=A2[L];
				System.out.println(i+ ":" +q[i]);
				L++;
			}
			else {q[i]=A1[K];
			System.out.println(i+ ":" +q[i]);
			K++;}
		}
	}	
	

	
}

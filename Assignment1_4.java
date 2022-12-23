
public class Assignment1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 14;
		
		for(int i=1; i<=n;i++) {
			for(int j =1; j<=n; j++) {
				if(i==n|| i==n-1 || i >= n/2 && j==1 || i>=n/2 && j==n || i>=n/2 && i-j>=6 || i>=n/2 && i+j>=21)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		

	}

}

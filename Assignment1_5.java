
public class Assignment1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 14;
		
		for(int i=1; i<=n;i++) {
			for(int j =1; j<=n; j++) {
				if(i==n|| i==1 || j==1 ||i >= n/2 && j==1 ||  i>=n/2 && i-j>=6 || i<=n/2 && i+j <= 8)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}

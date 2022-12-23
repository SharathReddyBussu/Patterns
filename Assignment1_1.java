//Printing INEURON
public class Assignment1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==1 || i==n || j==n/2)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.print("  ");
			
			
			for(int j=1; j<=n; j++) {
				if(j==1 || j==n || i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");

			
			for(int j=1; j<=n; j++) {
				if(i==1 || i==n || j==1 || i==n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			
			
			for(int j=1; j<=n; j++) {
				if(j==1 && i!=n  || j==n && i!=n || i==n && j!=n && j!=1 )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			
			
			for(int j=1; j<=n; j++) {
				if(j==1 || i==1 && j!=n || i==n/2 && j!=n || j==n && i!=1 && i<n/2 || i>n/2 && j>n/2 && i==j  )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			
			
			for(int j=1; j<=n; j++) {
				if(j==1 && i!=1 && i!=n || i==1 && j!=1 && j!=n || j==n && i!=1 && i!=n || i==n && j!=1 && j!=n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			
			
			for(int j=1; j<=n; j++) {
				if(j==1 || j==n || i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			
			
			
			System.out.println(" "); 
		}
		
	}

}

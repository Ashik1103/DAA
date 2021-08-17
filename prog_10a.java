// 10.	Write Java programs to 
// (a) Implement All-Pairs Shortest Paths problem using Floyd's algorithm. 
	import java.util.Scanner;
public class FloydsClass {
	static final int MAX = 20; 	// max. size of cost matrix
	static int a[][];			// cost matrix
	static int n; 				// actual matrix size

	public static void main(String args[]) {
		a = new int[MAX][MAX];
		ReadMatrix();
		Floyds();				// find all pairs shortest path
		PrintMatrix();
	}

	static void ReadMatrix() {
		System.out.println("Enter the number of vertices\n");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		System.out.println("Enter the Cost Matrix (999 for infinity) \n");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
	}
	
	static void Floyds() {
		for (int k = 1; k <= n; k++) {
			for (int i = 1; i <= n; i++)
				for (int j = 1; j <= n; j++)
					if ((a[i][k] + a[k][j]) < a[i][j])
						a[i][j] = a[i][k] + a[k][j];
		}
	}
	
	static void PrintMatrix() {
		System.out.println("The All Pair Shortest Path Matrix is:\n");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
				System.out.print(a[i][j] + "\t");
			System.out.println("\n");
		}
		}
}


Output

Enter the number of vertices: 4
EEnter the Cost Matrix (999 for infinity)
0 		999	3	999	
2		0	999	999
999	7	0	1
6		999	999	0

TThe All Pair Shortest Path Matrix is:
0	10	3	4
2	0	5	6
7	7	0	1
6	16	9	0

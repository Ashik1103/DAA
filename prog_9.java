// 9.	Find Minimum Cost Spanning Tree of a given connected undirected graph using Prim's algorithm. 

import java.util.Scanner;

public class PrimsClass {

	final static int MAX = 20;
	static int n; // No. of vertices of G
	static int cost[][]; // Cost matrix
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ReadMatrix();
		Prims();
	}

	static void ReadMatrix() {
		int i, j;
		cost = new int[MAX][MAX];

		System.out.println("\n Enter the number of nodes:");
		n = scan.nextInt();
		System.out.println("\n Enter the cost matrix:\n");
		for (i = 1; i <= n; i++)
			for (j = 1; j <= n; j++) {
				cost[i][j] = scan.nextInt();
				if (cost[i][j] == 0)
					cost[i][j] = 999;
			}
	}

	static void Prims() {

		int visited[] = new int[10];
		int ne = 1, i, j, min, a = 0, b = 0, u = 0, v = 0;
		int mincost = 0;

		visited[1] = 1;
		while (ne < n) {
			for (i = 1, min = 999; i <= n; i++)
				for (j = 1; j <= n; j++)
					if (cost[i][j] < min)
						if (visited[i] != 0) {
							min = cost[i][j];
							a = u = i;
							b = v = j;
						}
			if (visited[u] == 0 || visited[v] == 0) {
	System.out.println("Edge" + ne++ + ":(" + a + "," + b + ")" + "cost:" + min);
				mincost += min;
				visited[b] = 1;
			}
			cost[a][b] = cost[b][a] = 999;
		}
		System.out.println("\n Minimun cost" + mincost);
	}

}

Output

 Enter the number of nodes: 4
Enter the cost matrix:
 0	 20	 10	 50
20 	0 	60 	999
10 	60 	0	 40
50 	999 	40	 0

Enter Source: 1
1 --> 3 = 10    Sum = 10
1 --> 2 = 20    Sum = 30
3 --> 4 = 40    Sum = 70

Total cost: 70

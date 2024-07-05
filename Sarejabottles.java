import java.util.Scanner;
 
public class Bottles {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=n;
		int[][] bottles=new int[n][2];
		for(int i=0;i<n;i++) {
			bottles[i][0]=sc.nextInt();
			bottles[i][1]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i!=j && bottles[i][0]==bottles[j][1]){
					count--;
				    break;
				}
				else
					continue;
			}
		}
		System.out.println(count);
		
	}
}

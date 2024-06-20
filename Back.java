package firstProject;
import java.util.Scanner;

public class Back{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String guest=sc.next().toUpperCase();
		String host=sc.next().toUpperCase();
		String clutter=sc.next().toUpperCase();
		String z=guest+host;
		int x=z.length();
		if(x==clutter.length()) {
			boolean flag=false;
			for(char ch='A';ch<='Z';ch++) {
				if(z.contains(String.valueOf(ch))) {
					z=z.replaceAll(String.valueOf(ch),"");
					int c=z.length();
					clutter=clutter.replaceAll(String.valueOf(ch),"");
					int d=clutter.length();
					if(c!=d) {
						flag=false;
						break;}
					else
						flag=true;
				}
					
			}
			if(flag)
				System.out.println("YES");
			else
				System.out.println("NO");
				
		}
		else {
			System.out.println("NO");
		}
		}
}
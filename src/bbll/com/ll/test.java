package bbll.com.ll;

import java.util.Scanner;

public class test {

	public static int a[][] = new int[2000][2000];
	public static void GameTable(int n) {
		if(n == 1) {
			a[1][1] = 1;
			return;
		}
		GameTable(n/2);
		copy(n);
	}
	public static void copy(int n) {
		int m = n/2;
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=m;j++) {
				a[i][j+m] = a[i][j]+m;
				a[i+m][j] = a[i][j+m];
				a[i+m][j+m] = a[i][j];
			}
		}
	}
	

	public static void table(int k,int [][]b) {
		int r1,r2;

		int n=1;
		for(int i=1;i<=k;i++) {
			n*=2;
		}
		for(int i=1;i<=n;i++) {
			b[1][i]=i;
		}
		int m=1;
		for(int s=1;s<=k;s++) {
			n/=2;
			for(int t=1;t<=n;t++)
				for(int i=m+1;i<=m*2;i++)
					for(int j=m+1;j<=m*2;j++) {
						r1=j+(t-1)*m*2;
						r2=j+(t-1)*m*2-m;
						b[i][r1] = b[i-m][r2];
						b[i][r2] = b[i-m][r1];
					}
					m*=2;
		}
	}
	
	public static void main(String[] args) {
		int x,c;
		//递归
		System.out.println("======递归测试======");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入参数人员：");
		x = sc.nextInt();
		GameTable(x);
		System.out.println(x+"安排如下:");
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=x;j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
		System.out.println("18软件二班  罗文桃  235120008");

		System.out.println("======非递归测试======");
		//非递归

		System.out.println("请输入参数人员：");
		c = sc.nextInt();
		table(x,a);
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=x;j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
		System.out.println("18软件二班  罗文桃  235120008");
	}
}

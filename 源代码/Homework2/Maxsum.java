package Homework1;

public class Maxsum {
	/*
	 * 处理一维数组
	 */
	public static int max1(int a[], int start){
		int max = 0;
		int sum = -1000;
		int i=start, count=0;
		while(count < a.length){
			if(i == a.length)
				i = 0;
			sum = ((sum+a[i]) > a[i]) ? sum+a[i] : a[i];
			max = max > sum ? max : sum;
			i++;
			count++;
		}
		return max;
	}	
	
	/*
	 * 处理二维数组
	 */
	public static int max2(int[][] a){
		int m = a.length;
		int n = a[0].length;
		int temp[] = new int[n];
		int max = 0;
		int tempMax = 0;
		for(int i=0; i<m; i++){//从第0行开始暴力搜索
			for(int k=0; k<n; k++)
				temp[k] = 0;
			for(int j=i; j<m; j++){
				for(int p=0; p<n; p++){
					temp[p] += a[j][p];
				}
				tempMax = max1(temp, 0);//利用已有的一维算法
				max = max > tempMax ? max : tempMax;
			}
		}
		return max;
	}
	
	/*
	 * 处理二维数组 /a
	 */
	/*
	public static int max2_a(int[][] a){
		int m = a.length;
		int n = a[0].length;
		int flag[][] = new int[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				if(a[i][j] > 0){
					flag[i][j] = 1;
				}
			}
		}
		for(int i=1; i<m; i++){
			for(int j=0; j<n; j++){
				if(flag[i][j] == 1){
					int k=j;
					int tempUp=0, tempLeft=0;
					while(flag[i][k] != 1 && k!=0){
						tempUp += flag[i][k];
						k--;
					}
					k=i;
					while(flag[])
				}
			}
		}
		return 0;
	}*/
	
	/*
	 * 处理二维数组 /h
	 */
	public static int max2_h(int[][] a){
		int m = a.length;
		int n = a[0].length;
		int temp[] = new int[n];
		int max = 0;
		int tempMax = 0;
		for(int i=0; i<m; i++){
			for(int k=0; k<n; k++)
				temp[k] = 0;
			for(int j=i; j<m; j++){
				for(int p=0; p<n; p++){
					temp[p] += a[j][p];
				}
				for(int k=0; k<n; k++){
					tempMax = max1(temp, k);
					max = max > tempMax ? max : tempMax;
				}
			}
		}
		return max;
	}
	
	/*
	 * 处理二维数组 /v
	 */
	public static int max2_v(int[][] a){
		int m = a.length;
		int n = a[0].length;
		int temp[] = new int[n];
		int max = 0;
		int tempMax = 0;
		for(int i=0; i<m; i++){
			for(int k=0; k<n; k++)
				temp[k] = 0;
			int count=0;
			int j=i;
			while(count < m){
				if(j == m)
					j = 0;
				for(int p=0; p<n; p++)
					temp[p] += a[j][p];
				tempMax = max1(temp, 0);
				max = max > tempMax ? max : tempMax;
				j++;
				count++;
			}
		}
		return max;
	}
	
	/*
	 * 处理二维数组 /v/h
	 */
	public static int max2_v_h(int[][] a){
		int m = a.length;
		int n = a[0].length;
		int temp[] = new int[n];
		int max = 0;
		int tempMax = 0;
		for(int i=0; i<m; i++){
			for(int k=0; k<n; k++)
				temp[k] = 0;
			int count=0;
			int j=i;
			while(count < m){
				if(j == m)
					j = 0;
				for(int p=0; p<n; p++)
					temp[p] += a[j][p];
				for(int k=0; k<m; k++){
					tempMax = max1(temp, k);
					max = max > tempMax ? max : tempMax;
				}
				j++;
				count++;
			}
		}
		return max;
	}
}

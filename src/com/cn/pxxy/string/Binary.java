package com.cn.pxxy.string;

public class Binary {
	/**递归*/
	public int binary(int[] arr,int i,int j,int target) {
		//int start = i,end = j;
		int mid = (i+j)/2;
		while(i<=mid && j>=mid ) {
			
			if(arr[mid] == target) {
				return mid;
			}else if(target < arr[mid]) {
				return binary(arr,i,mid-1,target);
			}else if(target > arr[mid]) {
				return binary(arr,mid+1,j,target);
			}else {
				//return 0;
			}
		}
		return -1;
	}
	/**非递归 */
	public int no_binary(int[] arr,int n,int target) {
		int start = 0,end = arr.length;
		while(start<=end) {
			
			int mid = (start+end)/2;
			
			if(target==arr[mid]) {
				return mid;
			}else if(target >arr[mid]) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {5,15,20,35,38,58,68,70,90};
		Binary bn = new Binary();
		int k1 = bn.binary(arr,0,arr.length-1,70);//递归测试
		int k2 = bn.no_binary(arr,arr.length-1,59);//非递归测试
		System.out.println(k2);
		System.out.println("软工1802，罗文桃，235120008");
	}

}

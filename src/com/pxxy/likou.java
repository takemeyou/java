package com.pxxy;

import java.util.Arrays;

public class likou {

    public static void main(String[] args) {
        int[] num = new int[]{0,0,1,1,1,2,2,3,3,4};
        likou li = new likou();
        int i = li.removeDuplicates(num);
        System.out.println("===================");
        for (int i1 = 0; i1 < i; i1++) {
            System.out.println(num[i1]);
        }
        System.out.println("===================");
        System.out.println(i);
    }
    public int removeDuplicates(int[] nums) {
        int i,j,len=nums.length,number,k=len-1;
        for(i=0;i<k;i++){
            for(j=i+1;j<=k;j++){
                if(nums[i]==nums[j] && j<=k){
                    while(nums[i]==nums[j]&& j<=k){
                        number = nums[j];
                        nums[j] = nums[k];
                        nums[k] = number;
                        k--;
                        len--;
                    }
                    nums[j] = nums[j];
                }
            }
        }

        for (int i1 = 0; i1 <= k; i1++) {
            System.out.println(nums[i1]);
        }
        System.out.println("===================");

        for(i=1;i<=k;i++){
            if(nums[i]<nums[i-1]){
                number = nums[i];
                nums[i] = nums[i-1];
                for(j=i-1;nums[j]>number;j--){
                   nums[j+1] = nums[j];
                }
                nums[j+1] = number;
            }
        }





        //Arrays.copyOf(nums,k);
        //Arrays.copyOfRange(nums,0,k);
        /*for (int i1 = 0; i1 < nums.length; i1++) {
            System.out.println(nums[i1]);
        }*/

        /*Arrays.copyOf(nums,k);
        System.out.println(nums.length);
        Arrays.sort(nums);
        for (int i1 = 0; i1 <= k; i1++) {
            System.out.println(nums[i1]);
        }*/
        return len;
    }


    public void removeDuplicates1(int[] nums){
        Arrays.sort(nums);
        int number,len = nums.length,k=len-1;

        number = nums[0];
        for(int i=1;i<k;i++){

            if(nums[i]==number){
                for(int j=i+1;j<=k;j++){
                    nums[j-1] = nums[j];
                }
            }
        }


    }




}

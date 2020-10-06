package likou;

import java.util.*;

public class test {

    public static void main(String[] args){
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        int[] nums0 = new int[]{0, 0, 0, 0};
        test test = new test();
       List<List<Integer>> list = test.threeSum(nums);
        System.out.println(list.toString());


    }

        public List<List<Integer>> threeSum(int[] nums){
            int i,j,k,len = nums.length,p=len-1,num;
            List<Integer> list1;boolean flag = false;
            List<List<Integer>> list2 = new ArrayList<>();
            for(i=0;i<=p-2;i++){
                for(j=i+1;j<=p-1;j++){
                    for(k=j+1;k<=p;k++){
                        if((nums[i]+nums[j]+nums[k])==0){
                            list1 = new ArrayList<Integer>();
                            list1.add(nums[i]);
                            list1.add(nums[j]);
                            list1.add(nums[k]);
                            //System.out.println(list1.toString());
                            list2.add(list1);
                        }
                    }
                }
            }
            for(int n=0;n<list2.size()-1;n++){
                for(int h=0;h<3;h++){
                    for(int k1 =0;k1<3;k1++){
                        if(list2.get(n).get(h) != list2.get(n+1).get(k1)){
                            flag = true;
                            //break;
                        }
                    }

                }
                if(!flag){
                    list2.remove(list2.get(n));
                    System.out.println(list2.get(n)+"====");
                }else{
                    list2.remove(list2.get(n));
                }
                flag = false;
            }

            for(int w=0;w<list2.size();w++)
                Collections.sort(list2.get(w));
            return list2;



        }
}

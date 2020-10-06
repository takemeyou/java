package likou;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        int[] nums0 = new int[]{0,0,0,0};
        Solution solution = new Solution();
        List<List<Integer>> list = solution.threeSum(nums);
        List<Integer> list1;
        //Iterator iterator = list.iterator();
        /*while(iterator.hasNext()) {
            List<Integer> list1 = (List<Integer>) iterator.next();
            System.out.println(list1);
        }*/
       /* for(int k=0;k<list.size();k++){
            for(int t=0;t<3;t++){


            }
           // list1 = list.get(k);


        }*/



        /*boolean flag = false;
        for(int n=0;n<list.size()-1;n++){
            for(int h=0;h<3;h++){
                for(int k =0;k<3;k++){
                    if(list.get(n).get(h) != list.get(n+1).get(k)){
                        flag = true;
                        //break;
                    }
                }

            }
            if(flag){
                list.remove(list.get(n));
                System.out.println(list.get(n)+"====");
            }else{
                list.remove(list.get(n));
            }
            flag = false;
        }
*/
        System.out.println("===================");

        //System.out.println(list.toString());
    }

    public List<List<Integer>> threeSum(int[] nums) {

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
                        System.out.println(list1.toString());
                        list2.add(list1);
                    }
                }
            }
        }
        System.out.println(list2.toString()+"--------------");
        for(int w=0;w<list2.size();w++)
            Collections.sort(list2.get(w));
        System.out.println(list2.toString()+"------vvvvvv--------");
        int listsize = list2.size();
        for(int n=0;n<listsize;n++){//list中的第n个元素
            //第n个元素与其他集合元素进行比较
            for(int h=0;h<3;h++) {//list2中的第n个元素集合中的第h个数
                    for (int r = n + 1; r < list2.size(); r++) {//
                        for (int k1 = 0; k1 < 3; k1++) {//被比较的第k1个数
                            //System.out.println(n +" *** "+ h+" *** "+k1);
                            //System.out.println(list2.get(n).get(h)+" 比较 "+list2.get(r).get(k1));
                            if ((list2.get(n).get(h) != list2.get(r).get(k1))) {
                                flag = true;
                            }
                            if (flag)
                                break;
                        }
                        //System.out.println(flag);
                        //比较完之后看flag的状态，true：两个元素不相同，false：两个元素相同
                       /* if (!flag) {
                           list2.remove(r);//如果相同，则移除掉一个
                            System.out.println(list2.get(n) + "====" + n);
                        }
                        flag = false;*/

                    }

            }
        }


        System.out.println("===================*");
        /*for(int w=0;w<list2.size();w++)
            Collections.sort(list2.get(w));
*/


        System.out.println(list2.toString());
        return list2;

    }
}

package com.javarush.task.task02.task0201;

import java.util.Arrays;

/*
Реализуем метод print
*/
public class Solution {
    public static void main(String[] args) {
     //   print("Java easy to learn!");
        int[] nums = {1, 2, 10, 1, 2, 20, 4};
     //   int sum; // = Math.
       // int[] mass = new int[5];
/*        Arrays.fill(mass,0);
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }*/
 /*       System.out.println(has77(nums));
        System.out.println(has12(nums));
        System.out.println(twoTwo(nums));
        System.out.println(sameEnds(nums, 3));*/
        System.out.println(tripleUp(nums));
       // System.out.println(fizzArray3(5,10));
        for (int num:fizzArray3(5,10)){
            System.out.println(num);
        }
        for (int num: shiftLeft(nums)){
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num1: withoutTen(nums)){
            System.out.print(num1 + " ");
        }

    }

    public static int sum67(int[] nums){
        int sum =0;

        boolean isSum = true;
        for (int i = 0; i < nums.length; i++){
            if (nums[i]==6) isSum = false;
            if (isSum){
                sum=sum+nums[i];
            }
            if (nums[i]==7) isSum = true;
        }
        return sum;
    }

    public static boolean has77(int[] nums) {
        int[] res = new int[nums.length];
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==7){
                res[k] = i;
                k++;
            }
        }
        if(k < 2){
            return false;
        }else if(k == 2){
            return ((res[1]-res[0]) < 3);
        }else{
            for(int i = 1; i < k; i++){
                if((res[i]-res[i-1]) < 3){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean has12(int[] nums) {
        boolean isHas12 = false;
        for(int num: nums){
            if (num == 1){
                isHas12 = true;
            }
            if(num ==2 && isHas12){
                return true;
            }
        }
        return false;
    }

    public static boolean modThree(int[] nums) {
        boolean result = false;
        for (int i = 0;i<nums.length-2;i++)
            if( (nums[i] % 2 == 0 && nums[i+1] % 2 == 0 && nums[i+2] % 2 == 0)|| (!(nums[i] % 2 == 0) && !(nums[i+1] % 2 == 0) && !(nums[i+2] % 2 == 0)))
                result = true;
        return result;
    }

    public static boolean twoTwo(int[] nums) {
              int index =0;
            for (int i=0; i<(nums.length); i++)
            {
                if(nums[i]==2)
                {
                    i++;
                    if(!(i<(nums.length)) || nums[i] !=2) return false;
                    while(i<nums.length && nums[i] ==2) i++;
                }
            }
            return true;
        }

    public static boolean sameEnds(int[] nums, int len) {
        boolean isSame = false;
        if(len == 0) return true;
        for(int i = 0; i < len; i++){
            if(nums[i]==nums[nums.length-(len-i)]){
                isSame = true;
            }else{
                isSame = false;
            }
        }
        return isSame;
    }

    public static boolean tripleUp(int[] nums) {
        if(nums.length < 3) {
            return false;
        }
        for(int i = 0; i < nums.length-2; i++){
            if(nums[i]==nums[i+1]-1 && nums[i]==(nums[i+2]-2))
                return true;
        }
        return false;
    }

    public static int[] fizzArray3(int start, int end) {
        int[] fizz = new int[end-start];
        for(int i = 0; i < fizz.length && fizz.length !=0; i++){
            fizz[i] = start + i;
        }
    return fizz;
    }

    public static int[] shiftLeft(int[] nums) {

        if(nums.length != 0){
            int temp = nums[0];
            for(int i = 0; i<nums.length-1; i++){
                nums[i] = nums[i+1];
            }
            nums[nums.length-1] = temp;
        }
        return nums;
    }

    public static int[] tenRun(int[] nums) {
        int temp = 0;
        boolean isTen = false;
        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i]%10 == 0)
            {
                temp = nums[i];
                isTen = true;
            }
            if(isTen) {
                nums[i] = temp;
            }
        }
        return nums;
    }

    public static int[] pre4(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 4 && i > 0) {
                int[] foo;
                foo = new int[i];
                for (int j = 0; j < foo.length; j++) {
                    foo[j] = nums[j];

                }
                if (nums[0] != 4)
                    return foo;
            }
        }
        int[] bar;
        bar = new int[0];
        return bar;
    }

    public static int[] post4(int[] nums) {
        for (int i =nums.length-1; i >= 0; i--) {

            if (nums[i] == 4) {
                int[] foo;
                foo = new int[nums.length-1-i];
                for (int j = 0; j < foo.length; j++) {
                    foo[j] = nums[i+j+1];
                }
                return foo;
            }
        }
        int[] bar;
        bar = new int[0];
        return bar;
    }

    public static int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 10) {
            } else {
                result[j] = nums[i];
                j++;
            }
        }
        return result;
    }

    public static int[] zeroMax(int[] nums) {
        int max = 0;

        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[i] % 2 != 0)
                max = Math.max(max, nums[i]);
            if (nums[i] == 0)
                nums[i] = max;
        }
        return nums;
    }

    public static int[] evenOdd(int[] nums) {
        int countE = 0;
        int countO = nums.length-1;
        int[] array = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                array[countE] = nums[i];
                countE++;
            }
            else {
                array[countO] = nums[i];
                countO--;
            }
        }
        return array;
    }

    public static String[] fizzBuzz(int start, int end) {
        int n = end - start;
        String[] result = new String[n];

        int pos = 0;
        for (int i = start; i < end; i++) {
            boolean fizz = i % 3 == 0;
            boolean buzz = i % 5 == 0;

            if (fizz && buzz) result[pos] = "FizzBuzz";
            else if (fizz) result[pos] = "Fizz";
            else if (buzz) result[pos] = "Buzz";
            else result[pos] = String.valueOf(i);
            pos++;
        }
        return result;
    }

    public static int[] fix45(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==4 &&nums[i+1]!=5){
                for(int j=0;j<nums.length;j++){
                    if(nums[j]==5 && j==0){
                        nums[0]=nums[i+1];
                        nums[i+1]=5;
                    }
                    if(nums[j]==5 && nums[j-1]!=4){
                        nums[j]=nums[i+1];
                        nums[i+1]=5;
                        break;
                    }
                }
            }
        }
        return nums;
    }

    public static boolean canBalance(int[] nums) {
        int lSum = 0;

        for (int i = 0; i < nums.length; i++) {
            lSum += nums[i];
            int rSum = 0;
            for (int j = nums.length-1; j > i; j--) {
                rSum += nums[j];
            }
            if (rSum == lSum)
                return true;
        }
        return false;
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        int j=0;
        for(int i=0;i<outer.length&&j<inner.length;i++)
            if(outer[i]==inner[j])j++;
        return j==inner.length;
    }

    public static int[] squareUp(int n) {
        int nums[] = new int[n*n];
        int a = n;
        for(int i = 0; i < n; i++) {
            int pos = n*n - i - 1;
            for(int j = 0; j < a; j++) {
                nums[pos -n*j] = i+1;
            }
            a--;
        }
        return nums;
    }

    public static int[] seriesUp(int n) {
        int[] result = new int[n * (n + 1) / 2];
        int i = 0;
        for (int j = 1; j <= n; ++j)
            for (int k = 1; k <= j; ++k)
                result[i++] = k;
        return result;
    }

    public static int maxMirror(int[] nums) {
        int len = nums.length;
        int count= 0;
        int max = 0;
        for (int i = 0; i < len; i++){
            count=0;
            for (int j = len-1; i + count < len && j > -1; j--){
                if(nums[i+count] == nums[j]){
                    count++;
                }
                else{
                    if (count > 0){
                        max = Math.max(count,max);
                        count = 0;
                    }
                }
            }
            max = Math.max(count,max);
        }
        return max;
    }

    public static void print(String s) {
        for (int i = 0; i < 4; i++) {
            System.out.println(s);  // pechatayem
        }
    }
}

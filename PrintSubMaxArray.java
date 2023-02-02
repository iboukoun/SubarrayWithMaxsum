package Blessing;

import java.util.ArrayList;

public class PrintSubMaxArray {
    public static void main(String[] args){
        //  Integer to our arraylist
        ArrayList<Integer>arr =new ArrayList<>();
        arr.add(-14);arr.add(-15);arr.add(-21);
        arr.add(-22);arr.add(-15);arr.add(-23);
        arr.add(16);arr.add(-7);arr.add(2);
        arr.add(9);arr.add(-1);arr.add(0);
        arr.add(-9);arr.add(-8);arr.add(-17);
        arr.add(-14);arr.add(2);arr.add(13);
        // Printing out the array given
        System.out.print("Input Given = [");
        for(int i = 0; i<arr.size();i++){
            System.out.print(arr.get(i) + ",");
        }System.out.print(arr.get(arr.size()-1));
            System.out.print("]");
            System.out.println("");

        //method call
        SubarrayMaxSum(arr);


    }
    //Method to print the elements
    // of Subarray with maximum sum
    static void SubarrayMaxSum(ArrayList<Integer>numbers){
        //Initialize presentMax and finalMax
        // with first value of numbers ;ex[1,2,3]
        int presentMax =numbers.get(0);
        int finalmax = numbers.get(0);
        // Initialize endIndex startIndex,finalStartIndex
        int startIndex = 0, endIndex=0 , finalStartIndex=0;
        // go through all the elements of the array
        for(int i = 1;i< numbers.size();i++){
            // update presentMax and startIndex
            if(numbers.get(i)> presentMax+ numbers.get(i)){
                presentMax=numbers.get(i);
                startIndex=i;
                //update presentMax only
            } else if (numbers.get(i) < presentMax + numbers.get(i)) {
                presentMax+=numbers.get(i);
            }
            // Update finalStartIndex , endIndex and finalmax;
            if (finalmax<presentMax){
                finalmax=presentMax;
                endIndex=i;
                finalStartIndex=startIndex;

            }
        }
        // Printing the elements of subarray with max sum
        System.out.print("Solution = [");
        for(int i = finalStartIndex; i< endIndex;i++){
            System.out.print(numbers.get(i)+",");
        }
        System.out.print(numbers.get(endIndex));
        System.out.print("]");
    }

}

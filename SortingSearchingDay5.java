
package javaapplication2;

import java.util.Arrays;

public class SortingSearchingDay5 {
    public static void main(String []args){
    
//Day 5
    //Linear search - searching element one by one 
        int[]arr = {11,12,13,14,15};
        int target =11;
        int index=-1;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                index=i;
                break;
            }
        }
        if(index != -1)
        {
            System.out.println("Target - "+target+ " Found at index - " +index);
        }
        else
        {
            System.out.println("Element not found");
        }
        
    //Binary Search 
    //works on sorted arrray - checks the middle if value is small go left otherwise right
        
        int []arr1 = {12,34,54,89,90};
        Arrays.sort(arr1);
        
        int index1=-1;
        int low=0;
        int high = arr1.length -1;
        int target1 = 89;
        
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr1[mid] ==target1)
            {
                index1=mid;
                break;
            }
            else if(target1 <arr1[mid])
            {
                high = mid-1;  //go left
            }
            else
            {
                low = mid+1;  //go right
            }
        }
        
        if(index1 !=-1)
        {
            System.out.println("Target - "+target1 +" Found at index - "+ index1);
        }
        else
        {
            System.out.println("Not found");
        }
        

        System.out.println("Bubble Sort :  ");
    //Bubble sort - sort the elements
    //we repeatedly compare neighboring elements and swap them if they are in the wrong order.
        
        int []num ={80,45,11,78,02,10};
        int temp;
        for(int i=0; i<num.length;i++)
        {
            for(int j=0 ; j<num.length-i-1;j++)
            {
                if(num[j]>num[j+1])
                {
                    temp = num[j+1];
                    num[j+1] =num[j];
                    num[j]=temp;
                    
                }
            }
        }
        
        //to print
        for(int i=0; i<num.length ;i++)
        {
            System.out.print(num[i]+ " ");
        }
        
        System.out.println(" ");
        System.out.println("Selection Sort :  ");
        
     //Selection sort 
     //it finds the minimum value from unsorted part and place it at correct index
        int []sel ={2,11,10,89,56,34,81};
        int n =sel.length;
        for(int i=0; i<n-1;i++)
        {
            int minIndex =i;
            for(int j=i+1;j<n;j++)
            {
                if(sel[j]<sel[minIndex])
                {
                    minIndex=j;
                }
            }
            int temp1 = sel[minIndex];
            sel[minIndex] = sel[i];
            sel[i]=temp1;
        }
        
        //to print
        for(int i=0;i<n ; i++)
        {
            System.out.print(sel[i]+" ");
        }
        
        System.out.println(" ");
        System.out.println("Insertion Sort :  ");
        
    //Insertion Sort
    //store the next element in a variable (key), shift elements greater than key to the right, then put key in the first empty spot.
    
        int []ins ={2,11,45,12,98,90};
        int key;
        for(int i=1;i<ins.length;i++)
        {
            key=ins[i];
            int j = i - 1;
                while(j >=0 && ins[j]>key)
                {
                    ins[j+1] =ins[j];
                    j--;
                    ins[j+1] =key;
                }
        }
        
        //print
        for(int i=0;i<ins.length;i++)
        {
            System.out.print(ins[i]+" ");
        }
    }
        
}

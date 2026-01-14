
package javaapplication2;

import java.util.HashMap;

public class ArrayHashMapDay6 {
    public static void main(String[]args){  
//Day6
    //Move Zero to End
    //Copying the elements to k , and rest of zero are set at last to fill the space
        int []n ={0,2,45,1,0,23,0};
        int k=0;
        for(int i=0;i<n.length;i++)
        {
            if(n[i]!=0)
            {
                n[k]=n[i];
                k++;
            }
        }
        while(k<n.length)
        {
            n[k]=0;
            k++;
        }
        //print
        for (int val : n)
        {
            System.out.print(val + " ");
        }
        
        System.out.println(" ");
        
    //Finding first non repeating element - using hashmap
        int[]arr = {2,4,10,9,2,4,9};
        HashMap<Integer,Integer> map = new HashMap<>();
        
        //Count frequency
        for(int num :arr)
        {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        //find non repeating element
        for(int num :arr)
        {
            if(map.get(num) ==1)
            {
                System.out.println("First non repeating element: "+num);
                break;
            }
        }
        
    //Pair with given sum - using hashmap
        int []sum = {2,3,11,10,8};
        int target = 10;
        HashMap<Integer ,Integer> map1 =new HashMap<>();
        boolean found =false;
        
        for(int num :sum)
        {
            int complement = target-num;
            if(map1.containsKey(complement))
            {
                System.out.println("Pair found : "+complement+ " ," + num);
                found=true;
                break;
            }
           
            map1.put(num, 1);
        }
        if(found!=true)
        {
            System.out.println("Pair not found");
        }
    }
}


package javaapplication2;

import java.util.HashMap;

public class AdvancedArrayDay7 {
    public static void main(String[]args){
        
//Hashmap storex key and its value , while putting the data we have to store it key with value 
//map.put(key , value);
//While getting the map - map.get(key)
//map.containsKey(key) - it checks the if that key is written before or not

        
//Day7
    //Subarray - Kadane's algorith
    //Find a subarray whose sum is the larget possible value
    
        int []n = {-3,7,3,-5,-9,1,-4};
        int maxEndingHere =n[0];
        int maxSoFar=n[0];

        for(int i=1 ;i<n.length;i++)
        {
            maxEndingHere= Math.max(n[i], maxEndingHere+n[i]); //it finds max between current num and n[0]+current 
            maxSoFar =Math.max(maxSoFar, maxEndingHere); // it finds max between current n[0] and maxEndingHere
        }
        System.out.println("Maximum sum of subaray : "+maxSoFar);

    
    
    //Subarray with given sum (Positive integer)
    
        int []n1={20,34,4,10,1,10};
        int sum =21;
        int start =0;
        int currentsum =n1[0];
        boolean found =false;
    
        for(int end=1; end<n1.length;end++)
        {
            currentsum +=n1[end];
            while(currentsum >sum && start <=end)
            {
                currentsum -= n1[start];
                start++;
                
            }
            if(currentsum == sum)
            {
                System.out.println("Subarray found from index : "+start+ " to : "+end);
                found =true;
                break;
            }
           
        }
        if(!found){
            System.out.println("No sub array found");
        }
    
    //Count subarray with given sum using hashmap
    //Find how many subarray exist with the sum value equal to target .
        int []n2 ={2,4,6,1,3,7};
        //[4,6],[6,1,3],[3,7] is subarray that count 10
        int target =10;
        int current =0;
        int count =0;
        HashMap<Integer ,Integer> map = new HashMap<>();
        
        map.put(0,1);
        
        for(int val :n2)
        {
            current += val;           
            if(map.containsKey(current -target))
            {
                count+=map.get(current - target);
            }
            map.put(current, map.getOrDefault(current, 0)+1);
        }

            System.out.println("Count is: "+ count);
    
    }
}

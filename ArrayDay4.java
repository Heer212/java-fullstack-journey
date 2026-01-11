
package javaapplication2;

import java.util.HashMap;

public class ArrayDay4 {
    public static void main(String[]args){
        
        //Day4
        //Frequenct count of elements
        int[] num = {2, 3, 2, 4, 3, 2};

        for(int i = 0; i < num.length; i++) 
        {
            boolean alreadyCounted = false;
            for(int k = 0; k < i; k++) {
                if(num[i] == num[k]) {
                    alreadyCounted = true;
                    break;
                }
            }
            if(alreadyCounted) continue;  // Skip duplicates

            int count = 0;
            for(int j = 0; j < num.length; j++) {
                if(num[i] == num[j]) {
                    count++;
                }
            }
            System.out.println(num[i] + " = " + count + " times");
        }
        
        //First and last occurance of an element
        String txt = "Java is powerful and Java is fun";
        String target = "Java";
        String []words = txt.split(" ");
        
        int first =-1;
        int last =-1;
        for(int i=0; i<words.length ;i++)
        {
            if(words[i].equals(target))
            {
                if(first == -1)
                {
                    first =i;
                }
                last = i;
            }
        }
        
        System.out.println("First word position - " +first);
        System.out.println("Last  word position - "+last);

        
        //Second minimum element
        int []n = {34,67,23,89,20,12,38};
        int min=Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;
        for(int i=n.length-1; i>=0 ;i--)
        {
            if(n[i]<min)
            {
                secondmin = min;
                min = n[i];
            }
            else if(n[i]<secondmin && n[i]!= min)
            {
                secondmin=n[i];
            }
            
        }
        System.out.println("Minimum = "+min);
        System.out.println("Second minimum = "+secondmin);
        
        
        //Array rotation -right 
        int []arr ={1,2,3,4,5};
        int k=2;
        int n1 =arr.length;
        int[]rotated =new int[n1];
        
        for(int i=0;i<n1 ;i++)
        {
            rotated[(i+k)% n1] =arr[i];
        }
        for(int i=0;i<n1;i++)
        {
            System.out.print(rotated[i]+" ");
        }
        
        System.out.println(" ");
        //Hashmap  - frequency count - optimized
        int []num1 ={2,3,3,3,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i : num1)
        {
            if(map.containsKey(i))
            {
                map.put(i, map.get(i)+1);
            }
            else
            {
                map.put(i, 1);
            }
        }
        for(int key : map.keySet())
        {
            System.out.println(key + " = " + map.get(key) + " times");
        }
    }
}

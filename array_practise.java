package javaapplication2;


public class array_practise {
    public static void main(String[] args){
        
        //string array
        String[]fruits ={"Apple","Mango","Orange"};
        int l = fruits.length;
        System.out.println("Length - " +l);
        System.out.println(fruits[0]);
        
        //Find max , min
        int []arr ={34,45,12,56,11};
        int large =arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]> large)  //Less than(<) to find min!
            {
                large =arr[i];
            }
        }
        System.out.println("Max =" +large);
        
        //reverse array
        int []arr1 = {1,2,3,4,5};
        int start =0;
        int end = arr1.length-1;
        
        while(start<end)
        {
            int temp = arr1[start];
            arr1[start] = arr1[end];
            arr1[end] =temp;
            
            start++;
            end--;
        }
        System.out.println("Reverse array:");
        for(int n :arr1)
        {
            System.out.println(n);
        }
        
        //Sum of elements
        int []sum={1,2,3,4,5};
        int t=0;
        for(int y =0; y<sum.length ;y++)
        {
            t += sum[y];

        }            
        System.out.println("Total = " +t);
        
        //Count odd and even
        int []abc ={2,4,6,3,7,9};
        int odd=0;
        int even=0;
        
        for(int z=0; z<abc.length ;z++)
        {
            if(abc[z]%2==0)
            {
                even +=abc[z];
            }
            else
            {
                odd += abc[z];
            }
        }
        System.out.println("ODD Total = "+odd);
        System.out.println("Even Total = "+even);
        
        
    }
}


package javaapplication2;

public class ArrayBasics {
    public static void main(String[]args){
        
        //Array 
        String []fruits = {"Apple","Mango","Orange"};
        for(int i=0;i<fruits.length;i++)
        {
            System.out.println(fruits[i]);
        }
        
        //Print even num
        int []num = {12,4,41,23,67,83,52,89,88};
        for(int i=0; i<num.length;i++)
        {
            if(num[i]%2==0)
            {
                System.out.println("Even number - "+num[i]);
            }
//            else{ System.out.println("Odd- " + num[i]); }
        }

        //Sum of all elements
        int total=0;
        for(int i=0; i<num.length;i++)
        {
            total = total+num[i];
        }
        System.out.println("Total - "+total);
        
        //Average of array element
        int avg=0;
        avg = total/num.length; 
        System.out.println("Average - "+avg); 
        
        //Max and min
        int max=num[0];
        for(int i=1; i<num.length;i++)
        {
            if(num[i]>max)
            {
                max=num[i];
            }
        }
        System.out.println("Maximum = "+max);
        
        int min=num[0];
        for(int i=0; i<num.length;i++)
        {
            if(num[i]<min)
            {
                min=num[i];
            }
        }
        System.out.println("Minimum = "+min);
        
        
        //Reverse array
        for(int i=num.length-1 ;i>=0;i--)
        {
            System.out.print(num[i] +" ");
        }
        System.out.println("");
        
        //Second largest value
        int maximum =num[0];
        int second =Integer.MIN_VALUE;
        for(int i=1; i<num.length;i++)
        {
            if(num[i]>maximum)
            {
                second = maximum;
                maximum=num[i];
            }
            else if(num[i]<maximum && num[i]>second)
            {
                second=num[i];
            }
        }
        System.out.println("Maximum = "+maximum);
        System.out.println("Second Maximum = "+second);
    }
}

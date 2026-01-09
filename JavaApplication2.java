
package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {
    public static void main(String[] args) {
    
        Scanner sc =new Scanner(System.in);

       String msg ="Hello Java";
       System.out.println(msg +"Basic program ");
       
       double a = 5000000;
       int b = 30000;
       double c =a+b;
       System.out.println("Addition is : "+c);
       
       char x = 'H';
       char y = 'E';
       char z = 'E';
       char q = 'R';
       System.out.println("Char addtion "+x + y + z +q);
       
       String heer ="Hello World!";
       System.out.println(heer);
       
       boolean b1 = true;
       System.out.println("Is I am learning java ?"+b1);
       

//       String input =sc.nextLine();
//       System.out.println("The user input is: "+input);
       
//       int h =sc.nextInt();
//       int e = sc.nextInt();
//       System.out.println("Multiply :"+(h*e));
       
       int s =10;
       int p =20 ;
       if(s == p )
       {
           System.out.println("S "+(s)+"is equal P");
       }
       else
       {
           System.out.println("P "+(p)+" is not equal");
       }
       
       int age=18;
       if(age >18)
       {
           System.out.println("You are eligible to vote");
       }
       else if(age ==18)
       {
           System.out.println("You are eligible to vote next year");
       }
       else
       {
           System.out.println("Not eligible to vote");
       }
       
//       System.out.println("The numbers between 10-15 are(For loop):");
//       for(int i=10; i<=15;i++)
//       {
//           System.out.print(i);
//       }
//       
//       System.out.println("While loop");
//       
//       int g =2;
//       while(g<10)
//       {
//           System.out.println(g);
//           g++;
//       }
       
//       int n = sc.nextInt();
//       if(n%2==0)
//       {
//           System.out.println("Number is even");
//       }
//       else
//       {
//           System.out.println("ODD number");
//       }
       
//       for(int d=1; d<=50;d++)
//       {
//           if(d%2==0)
//           {
//               System.out.println(d);
//           }
//       }
       
//       123 - 321 -reverse
        int n =123;
        int rnum =0;
        int ognum =n;
        while(n!=0)
        {
            int lastnum = n%10;  //Extract the last num (3)
            rnum = rnum *10 +lastnum; //Store the last num in reverse
            n /=10; // Remove the num from n
        }
        System.out.println("Number -"+ognum);
        System.out.println("Reverse - "+rnum);
        
        
        //Fibonnaci series  - addition of two is digit 3
        int n1=0;
        int n2=1;
        System.out.println("Fibonnaci Series....");
        for(int u=0;u<10;u++)
        {
            
            System.out.print(n1+" "); 
            //swap number - 0+1 =1 , 1+1=2, 1+2=3,2+3=5...
            int n3 =n2+n1;
            n1=n2;
            n2=n3;
        }
       
    }
    
}

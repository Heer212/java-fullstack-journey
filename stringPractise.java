
package javaapplication2;

public class stringPractise {
    public static void main(String[]args){
        
        // == and equals
        String s1 ="JAVA";
        String s2 = "JAVA";
        String s3 = "Java";
        String s4 = new String("JAVA");
        System.out.println(s1==s2); //JAVA == JAVA
        System.out.println(s1.equals(s3)); // JAVA !=Java
        System.out.println(s1.equals(s4)); 
        
        //String immutability
        String s ="Hello";
        s.concat("World!");
        System.out.println(s); // does not print world
        
        s= s.concat("World");
        System.out.println(s); //HelloWorld
        
        //methods
        String name="HeerSukhadia";
        String txt = "I love Java";
        String[]parts =txt.split(" "); // it seprates each word after space
        
        System.out.println("Length : "+name.length());//4
        System.out.println("Character at 3 : "+name.charAt(3)); // r
        System.out.println("Substring : "+name.substring(4,12));
        System.out.println("To Lower case: "+ name.toLowerCase());
        for (String word : parts)
        {
            if (word.length() > 0) {
                System.out.println("Split : " + word);
                System.out.println("Length : " + word.length());
                System.out.println("First char : " + word.charAt(0));
                System.out.println("Last char : " + word.charAt(word.length()-1));
            }
        }

        System.out.println("To char Array : "+name.toCharArray());
        
        //reverse a string
        String h="Het";
        String rev="";
        for(int i=h.length()-1; i>=0;i--)
        {
            rev = rev+ h.charAt(i);
        }           
        System.out.println("Reverse :"+rev);
        
        //palindrome
        String pal ="Madam";
        String rev1="";
        
        pal =pal.toLowerCase();
        for(int i=pal.length()-1; i>=0;i--)
        {
            rev1 = rev1+ pal.charAt(i);
        }
        if(pal.equals(rev1))
        {
            System.out.print("Palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
        
        
        //Count vowels and consonants
        String v ="JavaProgramming";
        v = v.toLowerCase();
        int vcount=0;
        int ccount=0;
        for(int i= 0; i<v.length();i++)
        {
            char ch = v.charAt(i);
            if(ch >= 'a' && ch <= 'z') 
            {   // only alphabets
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vcount++;
                } else {
                    ccount++;
                }
            }
        }
        System.out.println("Vovels :" +vcount + " Consonants : "+ccount);
        
        //duplicate character
        String dup ="programming";
        
        for(int i=0;i<dup.length();i++)
        {
            for(int j=i+1;j<dup.length();j++)
            {
                if(dup.charAt(i)== dup.charAt(j))
                {
                    System.out.println("Duplicate - "+dup.charAt(j));
                }
            }
        }
        
        //Reverse each word
        String txt1 = "Java is powerful";
        String []words = txt1.split(" ");
        for(String word:words)
        {
            for(int i=word.length()-1;i>=0;i--)
            {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }
    }
}

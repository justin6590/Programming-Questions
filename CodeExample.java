import java.util.*;

public class StringReverse {
 public static void main(String[] args) {
  String input,output;
  Scanner sr=new Scanner(System.in);
  System.out.println("Please Enter a String:");
  input=sr.nextLine();
  int n=input.length();
  char tmp[]=new char[n];
  char nxt[]=new char[n];
  tmp=input.toCharArray();
  int m=0;
  for(int i=n-1;i>=0;i--) {
      nxt[m]=tmp[i];
      m++;
  }
  System.out.print("Reversed String is: ");
  for(int i=0;i<n;i++) {
      System.out.print(nxt[i]);
    }
  }
}



import java.util.Scanner;

public class CountingOccurences {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter a String:");
        String str=input.nextLine();
        int count=0;
        String temp=""; 
        for(int i=0;i<str.length();i++) {
		char c=str.charAt(i);  
			for(int j=i;j<str.length();j++) {
                char k=str.charAt(j);  
   				if(c==k && temp.indexOf(c)==-1)                                                                          
                {
                count=count+1;
                }
            }
             if(temp.indexOf(c)==-1) {
            temp=temp+c; 
System.out.println("Character:  " + c + "  occurs:  " + count + " times");
             }   
              count=0;
        }
    }
}
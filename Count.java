import java.util.Scanner; 
public class Count 
{ 
public static void main(String args[]) 
{ 
Scanner sc = new Scanner(System.in); 

String s=""; 
int firstnum=0; 

System.out.print("Enter a string: "); 
s = sc.nextLine(); 
int digitCount =0; 
int charCount=0, spaccount=0; 
for(int i=0;i<s.length();i++){ 
if(s.charAt(i)==' ') 
spaccount++; 

else if((s.charAt(i) >='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')) 
charCount++; 

else if(s.charAt(i) >= '0' && s.charAt(i)<='9') 
digitCount++; 

} 
System.out.println("digitCount charCount spaccount"); 
System.out.println(digitCount+ " "+ charCount+" "+ spaccount); 
} 
}
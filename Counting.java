import java.util.*;

public class Counting
{

	public static void main(String[] args)
	{
    	Scanner input = new Scanner(System.in);
    	System.out.println("Please Enter a String:");
    	String str = input.nextLine();
    	LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<String, Integer>();
    
    	for( int i = 0; i < str.length(); i++ )
    	{
    		String currentLetter = Character.toString(str.charAt(i));
    	
    		if (hashMap.containsKey(currentLetter))
    		{
    			hashMap.put(currentLetter, hashMap.get(currentLetter) + 1); 
    		}
    		else
    		{
    			hashMap.put(currentLetter, 1); 
    		}    
    	}
    
    	for(String key : hashMap.keySet())
    	{
         	System.out.println("Value of " + key + " is: "+hashMap.get(key));
    	}        
  	}
} 
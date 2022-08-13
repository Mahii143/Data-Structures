/****************************************************************************************************************************************
13-08-22

If the matrix that can be rearranged contains no repeated elements in any of its column then print YES else NO

i/o:
3 3
4 5 5
7 4 5
7 6 6

o/p:
YES

Explanation:

The matrix can be arranged like:
4 4 5
5 5 6
6 7 7

Where no repeated elements at any of the columns.

O(r*c) solution would be using a Hashmap.
Put all the elements with their occurrence count in a HashTable
If the count is greater than of the column value then print NO
Else print YES


****************************************************************************************************************************************/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		//Hashtable object creation
		Hashtable<Integer,Integer> ht1 = new Hashtable<Integer,Integer>();
		
		int r = sc.nextInt(), c = sc.nextInt();
		
		for(int i=0;i<r*c;i++){
		    
		    //get the input value
		    int key = sc.nextInt();
		    
		    //If the input value is already in the hastable then increment its count
		    if(ht1.containsKey(key)) 
		    {
		        ht1.put(key,(ht1.get(key)+1));
		    }
		    
		    //Else put count as 1
		    else{
		        ht1.put(key,1);
		    }
		    
		    
		    //If the count of the key is greater than the column then its a NO 
		    if(ht1.get(key)>c) {
		        System.out.println("NO");
		        System.exit(0);
		    }
		}
		
		//If all elements count is less than or equals to column then print YES
		System.out.println("YES");
	}
}

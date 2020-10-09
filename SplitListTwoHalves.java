import java.util.ArrayList; 
import java.util.List; 
  
public class SplitListTwoHalves { 
  
    // function to split a list into two sublists in Java 
    public static List[] split(List<String> list) 
    { 
        // create two empty lists 
        List<String> first = new ArrayList<String>(); 
        List<String> second = new ArrayList<String>(); 
  
        // get size of the list 
        int size = list.size(); 
  
        // First size)/2 element copy into list 
        // first and rest second list 
        for (int i = 0; i < size / 2; i++) 
            first.add(list.get(i)); 
  
        // Second size)/2 element copy into list 
        // first and rest second list 
        for (int i = size / 2; i < size; i++) 
            second.add(list.get(i)); 
  
        // return a List of array 
        return new List[] { first, second }; 
    } 
  
    public static void main(String[] args) 
    { 
        // create an ArrayList 
        List<String> list = new ArrayList<String>(); 
  
        list.add("Geeks"); 
        list.add("Practice"); 
        list.add("Contribute"); 
        list.add("IDE"); 
        list.add("Courses"); 
  
        // call split method which return List of array 
        List[] lists = split(list); 
  
        System.out.println(lists[0]); 
        System.out.println(lists[1]); 
    } 
} 







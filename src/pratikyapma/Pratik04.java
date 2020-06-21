package pratikyapma;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class Pratik04 {
  
	public static void main(String[] args) {
   
		String arr[]={"Tomato", "Potato", "Pair"};
  
		System.out.println(Arrays.toString(isFourLetters(arr)));
        }
  
	
	public static String[] isFourLetters(String[] s) {
 
		List<String> list= new ArrayList<>();
   
		for(String w:s){
      if(w.length()==4){
        list.add(w);
      }
    }
    String arr1[] = list.toArray(new String[0]);
    return arr1;
  }
}
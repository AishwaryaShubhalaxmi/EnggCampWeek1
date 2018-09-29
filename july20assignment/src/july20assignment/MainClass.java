package july20assignment;

import java.util.*;
import java.util.Map.Entry;

public class MainClass {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> ob = new HashMap<Integer, String>();
		ob.put(2, "White");
		ob.put(3, "Red");
		ob.put(5, "Blue");
		ob.put(10, "Green");
		ob.put(25, "Black");
		ob.put(20, "Blue");
		ob.put(30, "Pink");
		ob.put(29, "Brown");
		for(Entry m: ob.entrySet()){
			System.out.println(m.getKey() + " " + m.getValue());
		}
		 
		 for(int i=20;i<30;i++){
				if(ob.containsKey(i)){	
		    	    ob.remove(i); 
				System.out.println(i);}
				}
	  }
	}



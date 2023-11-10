package pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Collection_1 {
	public static void main(String as[]) {
		
	     Map<String,Integer> map=new HashMap();
	     map.put("A",1);
	     map.put("B",2);
	     map.put("C",3);
	     map.put("D",4);
	     map.put("E",5);
	     
	    for(Map.Entry<String,Integer> mymap:map.entrySet()) {
	    	System.out.println(map.keySet()+"\t"+map.values());
	    }
	    
	    List<Integer> list=new ArrayList<>(map.values());
	    System.out.println(list);
	    
	    Set<String> set=new HashSet<>(map.keySet());
	    System.out.println(set);
	    
	    Integer a[]=map.values().toArray(new Integer[0]);
	    System.out.println(Arrays.toString(a));
	    
	    List<Integer> mylist=Arrays.asList(a);
	    Set<Integer> myset=new HashSet<>(Arrays.asList(a));
	    System.out.println(mylist);
	    System.out.println(myset);
	    
	    Integer b[]=list.toArray(new Integer[0]);
	    System.out.println(Arrays.toString(b));
	    
	}	
	}



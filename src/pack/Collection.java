package pack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Collection {

	public static void main(String[] args) throws IOException { 
	      Map<String,Integer> map=new HashMap();
	       map.put("A",1);
	       map.put("B",2);
	       map.put("C",3);
	       map.put("D",4);
	       map.put("E",5);
	       
	     	      
	      for(Map.Entry<String,Integer> mymap:map.entrySet()) {
	    	  System.out.println(mymap.getKey()+"\t"+mymap.getValue());
	       
	     
	      }{
	    	  System.out.println("Converting map into list,set and array");
	    	  List<String> list=new ArrayList<String>(map.keySet());
		      System.out.println(list);

		      Integer b[]=map.values().toArray(new Integer[0]);
		      System.out.println(Arrays.toString(b));
		      
		      Set<Integer> set=new HashSet<Integer>(map.values());
		      for(int c:set) {
		    	  System.out.println(c);
	    	  
	      }
		      {
		    	  System.out.println("Converting list to array and array to list");
		    	  String a[]=list.toArray(new String[0]);
		    	  System.out.println(Arrays.toString(a));
		    	  
		    	  List<Integer> mylist=Arrays.asList(b);
		    	  System.out.println(list);
		    	  
		    	  Integer c[]=set.toArray(new Integer[0]);
		    	  System.out.println(Arrays.toString(c));
		    	  
		    	  Set<Integer> set1=new HashSet<>(Arrays.asList(c));
		    	  System.out.println(set1);
		    	  
		    	  
		      }
	     
	      }
		
	}
	}



package pack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8 {

	public static void main(String[] args) throws IOException {
     List<Integer> list=Arrays.asList(10,18,17,19,56,19,18,18);
     Map<Integer,Long> map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
     System.out.println(map);
     
     map.entrySet().stream().sorted(Map.Entry.<Integer,Long>comparingByValue()).forEach(System.out::println);
	}
}

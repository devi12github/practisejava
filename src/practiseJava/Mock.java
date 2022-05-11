package practiseJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
   List <String> color = new ArrayList<String>();  
  
	color.add("red");
	color.add("blue");
	color.add("white");
	System.out.println(color);
	color.add(0,"black");
	color.add(4, "rose");
	System.out.println(color);
	
	String element = color.get(0);
	
	System.out.println(element);
	color.remove(3);
	System.out.println(color);
	
	for(String e:color) {
		System.out.println(e);
	}
	
	System.out.println(color.contains("red"));
	
	
	Collections.sort(color);
	
	System.out.println(color);
	
	
	
	}
}
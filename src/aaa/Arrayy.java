package aaa;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrayy {

	public static void main(String[] args) {
		ArrayList<String> x=new ArrayList<>();
		x.add("true");
		x.add("false");
		x.add("java");
		x.add("selenium");
		x.add( 4,"auto");
		//for (int i = 0; i < x.size(); i++) {
			//System.out.println(x.get(i));
		//for (String Sr : x) {
			//System.out.println(Sr);
		Iterator itr=x.iterator(); 
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
			
		}
			
			
		}





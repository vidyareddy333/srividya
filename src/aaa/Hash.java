package aaa;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hash {

	public static void main(String[] args) {
Set<Object> x=new HashSet<Object>();
x.add("true");
x.add("0.10");
x.add("1");
x.add( "sele");
x.add( "sele");

Iterator<Object> itr=x.iterator();
while (itr.hasNext()) {
	
System.out.println(itr.next());
	
}
	
}

}
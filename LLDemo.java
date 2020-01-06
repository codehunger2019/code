package generic;
import java.util.Collections;
import java.util.LinkedList;
public class LLDemo {
public static void main(String[] args) {
	LinkedList<String> ll=new LinkedList<String>();
	ll.add("Deepawali");
	ll.add("Sankranti");
	ll.add("Ugadi");
	ll.add("Holi");
	//ll.add(1,"Christmas");
	System.out.println(ll);
	Collections.sort(ll);
	System.out.println(ll);
	Collections.sort(ll,Collections.reverseOrder());
	System.out.println(ll);
}
}

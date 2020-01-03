package generic;
import java.util.*;

public class LiVsSe{
	public static void main(String[] args) {
		
	
	List<String> lst=new ArrayList<String>();
	lst.add("Guldi"); 
	lst.add("Mahesh");
	lst.add(null);
	lst.add("Rahul");
	lst.add("Mansi");
	lst.add("Rahul");
	lst.add(null);
	
	Set<String> set=new HashSet<String>();
	set.add("Guldi");
	set.add("Mahesh");
	set.add(null);
	set.add("Rahul");
	set.add("Mansi");
	set.add("Rahul");
	set.add(null);
	System.out.println(lst);
	System.out.println(set);
}
}
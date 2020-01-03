package generic;
import java.util.ArrayList;
public class EpLstDemo {
	public static void main(String[] args) {

		Employee e1=new Employee("Raju",25000);
		Employee e2=new Employee("Varun",22000);
		Employee e3=new Employee("Vijaya",18000);
		ArrayList<Employee> lst=new ArrayList<Employee>();
		lst.add(e1);
		lst.add(e2);
		lst.add(e3);
		
		for(int i=0;i<lst.size();i++) {
			Employee emp=lst.get(i);
		System.out.println(emp);
	}
	}
}

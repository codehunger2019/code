package generic;
import java.util.ArrayList;
public class LstIteration1 {
	//ArrayList program

		public static void main(String[] args) {
			ArrayList<String> lst=new ArrayList<String>();
			lst.add("white");
			lst.add("pink");
			lst.add("yellow");
			lst.add("orange");
			
			/*forward direction*/
			for(int i=0;i<lst.size();i++) {
				String s=lst.get(i);
				System.out.println(s);
			}
			System.out.println("---------------------------------");
			
			/*backward direction*/
			for(int i=lst.size()-1;i>=0;i--) {
				String s=lst.get(i);
				System.out.println(s);
			}
		}

	}




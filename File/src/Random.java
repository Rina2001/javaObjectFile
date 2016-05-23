import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Random {
 static {
	 System.out.println("Hello World");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List lst=new ArrayList();
		
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		
		Collections.shuffle(lst);
		
		Iterator ran=lst.iterator();
		while(ran.hasNext()){
			
			System.out.println(ran.next());
		}
		
	}

}

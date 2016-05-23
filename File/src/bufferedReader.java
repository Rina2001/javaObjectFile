import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedReader {

	public static void main(String[] args)throws IOException {
	char c;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Input Character");
	do{
		c=(char)br.read();		
		System.out.print(c);
		br.mark(2);
		br.reset();
	}while(c!='q');
	System.out.println("Terminated");
}
}

import java.io.InputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.BufferedReader;
public class BufferedReaderDemo2 {
	    
	public static double sum(){
		float s;
		s=1.1f+1.1f;
		return s;
		
	}
	
	
	public static void main(String[] args) throws Exception {
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		is=new FileInputStream(new File("C:\\Users\\chen rina\\Desktop\\test.txt"));
		isr=new InputStreamReader(is);
		System.out.println(isr.getEncoding());
		br=new BufferedReader(isr);
		System.out.println((char)br.read());
		System.out.println((char)br.read());
		System.out.println((char)br.read());
		System.out.println((char)br.read());
		br.mark(4);
		System.out.println("mark is doned");
		System.out.println((char)br.read());
		System.out.println((char)br.read());
		
		br.reset();
		System.out.println("Reset is invoked");
		System.out.println((char)br.read());
		
		System.out.println(BufferedReaderDemo2.sum());
	}

}

import java.io.FileReader;
import java.io.FileWriter;

public class filereader {
	public static void main(String[] args)throws Exception {
		FileWriter f=new FileWriter("test.txt");
		f.write("HEllo");
		FileReader r=new FileReader("test.txt");
		char c;
		int rr;
		while((rr=r.read())!=-1){
			System.out.println((char)rr);
		}
	}
}

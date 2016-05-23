import java.io.*;
public class CharacterStreamAsByteInputStream {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileInputStream ins=new FileInputStream("C:\\Users\\chen rina\\Desktop\\test.txt");
		InputStreamReader t=new InputStreamReader(ins);
		BufferedWriter br=new BufferedWriter(t);
		
		System.out.println((char)t.read());
		
	}

}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class FileCopyDemoTest {
	public static void main(String[] args)throws IOException  {
		// TODO Auto-generated method stub
		FileInputStream in=null;
		InputStream st;
		FileOutputStream out=null;
		char c;
		try{
			in=new FileInputStream("C:\\Users\\chen rina\\Desktop\\test.txt");
			BufferedReader bwr=new BufferedReader(new InputStreamReader(in));
			out=new FileOutputStream("C:\\Users\\chen rina\\Desktop\\testCopy.txt");
					while((bwr.read())!=-1){
						out.write((char)bwr.read());
					}
                      				
		}catch(IOException ex){System.out.println(ex.getStackTrace());}
		finally{
			if(in!= null){
				in.close();
			}
			if(out!=null){
				out.close();
			}
		}
		FileInputStream fis=new FileInputStream("C:\\Users\\chen rina\\Desktop\\testCopy.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(fis));
					
					System.out.println(br.readLine());
				
		fis.close();
			
	}
}

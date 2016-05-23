package compareFile;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.File;
import java.io.FileInputStream;
public class fileCompare {

	public static void main(String[] args) {
		InputStream input1,input2;
		File f;
		int f1,f2;
		try{
			input1=new FileInputStream("C:/Users/chen rina/workspace/JavaReview/FileInputStream/inputStream.txt");
			input2=new FileInputStream("C:/Users/chen rina/workspace/JavaReview/FileInputStream/inputStreamCopy.txt");
			do{
				f1=input1.read();
				f2=input2.read();
				System.out.println("F1 = "+f1+" F2="+f2);
				if(f1!=f2){
					
					System.out.println("Data is not not the same;");
					 //return;
				}
				
			}while(f1!=-1 && f2!=-1);
			System.out.println("Data is the same");
		}catch(Exception e){
			System.out.println(e);
		}
	}

}

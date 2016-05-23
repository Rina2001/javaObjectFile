package FileCopy;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
public class FileCopyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte ch[]={'c','h','e','n',' ','r','i','n','a'};
		FileInputStream input;
		FileOutputStream output;
		BufferedInputStream bf;
		try{
			input=new FileInputStream("C:/Users/chen rina/workspace/JavaReview/FileInputStream/inputStream.txt");
			bf=new BufferedInputStream(input);
			
			//copy file
			File f=new File("C:/Users/chen rina/workspace/JavaReview/FileInputStream/inputStreamCopy.txt");
			// if file is existing
			if(f.exists()==true){
				System.out.println("File Is existing");
			}
				output=new FileOutputStream(f);
					while(bf.available()>0){
						output.write((char)bf.read());
					}
			System.out.println("Copy Complete");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}

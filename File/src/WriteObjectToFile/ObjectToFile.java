package WriteObjectToFile;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.util.Set;

import java.util.HashSet;
/*
 * @Chen Rina
 *  Message ches te sor say tov ning. Choul merl pong tver mich sor say oy klei
 */
public class ObjectToFile{

	static String strFile="ObjectToFile.bin";
	
	public static void writeObject() throws Exception{
				//Read Object from file
			Set<Object> readSet=new HashSet<>();
			Set<Object> set=new HashSet<>();
				set.add(new Student(1,"Rina", "male",2));
				set.add(new Student(2,"rina", "Female",22));
				//----------------------------------------------------------------
					
				//Write Object to file
				ObjectOutputStream objOutput;//write object of memory
				OutputStream buffer;//write data out of memory
				//Write Object to file
			//	buffer=new BufferedOutputStream(new FileOutputStream(strFile));
				objOutput=new ObjectOutputStream(new FileOutputStream(strFile));
				objOutput.writeObject(set);
				objOutput.close();
					System.out.println("Writing is Complete\n");
			
	}
	//Read Object To File
	public static void readObject()throws Exception{
		//Read Object 
		ObjectInputStream objInput;
		InputStream bfInputStream;
		
			bfInputStream=new BufferedInputStream(new FileInputStream(strFile));
			objInput=new ObjectInputStream(bfInputStream);
			
			//Read Object to Set collection
				Set<Object> l=(Set<Object>)objInput.readObject();
		//Read set Element MultiObject
				for(Object obj:l){
					Student stu=(Student)obj;
					System.out.println(stu.getName()+" "+
							   stu.getSex()+"  "+
							   stu.getAge());
				}
	}
	
	public static void main(String[] args)throws Exception {
		
		//Write Object to file
		writeObject();
		//ReadObject to file
		readObject();
		
	}
}

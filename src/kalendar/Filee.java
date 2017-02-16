package kalendar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Filee {
	 ArrayList<String> reminder;
	 String remindS1;
	public Filee(ArrayList<String> reminder, String remindS1) {

		this.reminder = reminder;
		this.remindS1 = remindS1;
	}
	
	public ArrayList<String> getReminder() {
		return reminder;
	}

	public void setReminder(ArrayList<String> reminder) {
		this.reminder = reminder;
	}

	public String getRemindS1() {
		return remindS1;
	}

	public void setRemindS1(String remindS1) {
		this.remindS1 = remindS1;
	}
	
	public void add(String remindS) throws IOException{
	    reminder.add(remindS);
		Path path=Paths.get(remindS1);
		try (BufferedWriter writer=Files.newBufferedWriter(path)){
			for(int i=0;i<reminder.size();i++){
				writer.write(reminder.get(i));
				writer.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public  void write(){
		Path path=Paths.get(remindS1);
    try(BufferedReader reader=Files.newBufferedReader(path)) {
			String line;
			while((line=reader.readLine())!=null){
			reminder.add(line);	
			}
			
			
		}catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

}

}
}
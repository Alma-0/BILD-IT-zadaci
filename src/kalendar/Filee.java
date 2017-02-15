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
	 String remindS;
	public Filee(ArrayList<String> reminder, String remindS) {

		this.reminder = reminder;
		this.remindS = remindS;
	}
	
	public ArrayList<String> getReminder() {
		return reminder;
	}

	public void setReminder(ArrayList<String> reminder) {
		this.reminder = reminder;
	}

	public String getRemindS() {
		return remindS;
	}

	public void setRemindS(String remindS) {
		this.remindS = remindS;
	}

	
	public void add(String remindS) throws IOException{
	    reminder.add(remindS);
		Path path=Paths.get(remindS);
		
		//pomocu Bufferedwritera upisi u fajl elemente iz liste
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
	//metoda ispisiIzFajla() kojom iz fajla ubacujem podatke u ArrayList
	public  void ispisiIzFajlaUListu(){
		//pristup fajlu 
		Path path=Paths.get(remindS);
		//pomocu BufferedReadera citam iz fajla
    try(BufferedReader reader=Files.newBufferedReader(path)) {
			//varijabla za linije u fajlu
			String line;
			
			//sve dok vrijednost nije null citaj i ubacuj u listu
			while((line=reader.readLine())!=null){
			reminder.add(line);	
			}
			
			
		}catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

}

}

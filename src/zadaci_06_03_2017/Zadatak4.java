package zadaci_06_02_2017;



public class Zadatak4 {

	public static void main(String[] args) {
		String[] array1 = splitN("ab#12#453", "#");
		String[] array2 = splitN("a?b?gf#e", "[?#]");
		
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + ",");
		}

		System.out.println();

		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + ",");
		}
	}
		
		public static String[] splitN(String str, String regex){
		
		    String[] storeSplit = new String[str.length()];
		    char compare1, compare2;
		    int counter = 0;

		    
		    for(int i=0; i<str.length(); i++) {
		        storeSplit[i] = "";
		    }

		    
		    for(int i=0; i<str.length(); i++) {
		        compare1 = str.charAt(i);
		        compare2 = regex.charAt(0);

		            if(!(compare1 == compare2)) {
		                storeSplit[counter] += ""+str.charAt(i);
		            } else {
		                counter++;
		                storeSplit[counter] = ""+str.charAt(i);
		                counter++;
		            }
		    }
		    return storeSplit; }
		

}

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws FileNotFoundException {
        int user;
        ArrayList<String> list = new ArrayList<>();
        list.add("Press 1 to learn about salary.");
        list.add("Press 2 to learn about the job.");
        list.add("Press 3 to learn about demand.");
        list.add("Press 4 to view current students.");
        list.add("Press 5 to quit.");
        for (String element : list) {
            System.out.println(element);
        }        
	    Scanner input = new Scanner(System.in);
	       user = input.nextInt();
           
	        
	    while(!(user == 5)) {
	        switch(user){
	            case 1:
	            	System.out.println("$98,345 average salary in South Florida!");
	            	for (String element : list) {
                        System.out.println(element);}
                    user = input.nextInt();
	            	break;
	            case 2:
	            	System.out.println("US News - 100 Best Jobs!");
                    for (String element : list) {
                        System.out.println(element);}
	            	user = input.nextInt();
	            	break;
	            case 3:
	            	System.out.println("Top 10 Forbes In-Demand Jobs!");
                    for (String element : list) {
                        System.out.println(element);}
	            	user = input.nextInt();
	            	break;
	            case 4:
				try {
					BufferedReader reader = new BufferedReader(new FileReader("names.txt"));
					String line;
					while((line = reader.readLine()) != null){
						System.out.println(line);}
                    reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
                    for (String element : list) {
                        System.out.println(element);}
	            	user = input.nextInt();
	            	break;
	            default:
	            	System.out.println("Choose 1-5");
                    for (String element : list) {
                        System.out.println(element);}
	            	user = input.nextInt();
	        }
	    }	
	}
}

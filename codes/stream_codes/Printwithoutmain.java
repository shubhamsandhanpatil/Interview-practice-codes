package stream_codes;

public class Printwithoutmain {
	
	    static {
	        System.out.println("Hello, this is printed from the static block!");
	        System.exit(0); // Terminate the program to avoid `main` execution error
	    }
	}


//works only until java 6 on java 7 onwords main() is compulsory;



import java.io.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			Homework1.Into.init(args);
		} catch (IOException e){
			System.out.println(e.getMessage());
		} 
	}
}

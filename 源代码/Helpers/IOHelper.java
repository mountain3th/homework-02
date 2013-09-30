package Helpers;
import java.io.*;

public class IOHelper {
	/*public IOHelper(String fileName) throws IOException {
		setFile(fileName);
	}
	
	public void setFile(String fileName) throws IOException {
		file = new File(fileName);	
	}
	
	// Read all the contexts by lines in the file.
	@SuppressWarnings("resource")
	public void readByLine() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		int line = 0;
		String[] temp = null;
		while((lines[line]=reader.readLine()) != null){
			temp = lines[line].split(",");
			
			line++;			
		}
		
		
		reader.close();
	}
	
	// Read all the contexts by bytes in the file.
	public void readByBytes() throws IOException {
		InputStream in = new FileInputStream(file);
		int length;
		while((length=in.read(byteContext)) != -1){
			
		}
		in.close();
	}
	
	// Read all the contexts by chars in the file.
	// Mostly used in reading some numbers and texts.
	public void readByChars() throws IOException {
		Reader reader = new InputStreamReader(new FileInputStream(file));
		int character;
		int i = 0;
		while((character=reader.read()) != -1){
			intNumber[i++] = character;
		}
		reader.close();
	}
	
	public int readNextInt() throws IOException{
		int next = 0;
		
		return next;
	}
	
	public int readInt(int row, int column, int a[]){
		return 0;
	}
	
	File file = null;
	
	int flag = 0;
	int[] intNumber = new int[1024];
	String[] stringToInt = new String[1024];
	String[] lines = new String[1024];
	byte[] byteContext = new byte[1024]; 
	char[] charContext = new char[1024];*/
	
	public enum readMode{
		NUMBER,
		WORD;
	}
	
	public static StreamTokenizer stok = null;
	
	public static boolean init(File file, Enum<?> mode) throws IOException {
		if(file.isFile() && file.exists()){
			Reader read = new BufferedReader(new FileReader(file));
			stok = new StreamTokenizer(read);
			if(mode == readMode.NUMBER)
				stok.parseNumbers();
			return true;
		}
		return false;
	}
	
	public static int readNextInt() throws IOException {
		stok.nextToken();
		while(stok.ttype != StreamTokenizer.TT_NUMBER){
			if(stok.ttype == StreamTokenizer.TT_EOF)
				return 0;
			stok.nextToken();
		}
		return (int)stok.nval;
	}
}

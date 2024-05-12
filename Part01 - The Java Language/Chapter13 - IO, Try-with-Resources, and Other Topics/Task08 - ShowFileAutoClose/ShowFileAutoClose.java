import java.io.*;

class ShowFileAutoClose {
	public static void main(String[] args) throws IOException {
		int i;

		if(args.length != 1) {
			System.out.println("Usage: ShowFileAutoClose filename");
			return;
		}
		try(FileInputStream fin = new FileInputStream(args[0])) {
			do {
				i = fin.read();
				if(i != -1)
					System.out.print((char) i); 
			} while(i != -1);
		} catch(FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch(IOException e) {
			System.out.println("An I/O Error Occured");
		} 
	}
}
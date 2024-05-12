import java.io.*;
import java.nio.file.*;

class NIOStreamWrite {
	public static void main(String[] args) {
		try (OutputStream fout = new BufferedOutputStream(Files.newOutputStream(Path.of("test.txt")))) {
		for(int i = 0; i < 26; i++)
			fout.write((byte)('A' + i));
		} catch(InvalidPathException e) {
			System.out.println("Path Error " + e);
		} catch(IOException e) {
			System.out.println("I/O Error: " + e);
		}
	}
}
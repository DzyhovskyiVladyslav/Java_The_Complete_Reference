import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

class PathDemo {
	public static void main(String[] args) {
		Path filepath = Path.of("examples\\test.txt");
		System.out.println("File Name: " + filepath.getName(1));
		System.out.println("Path: " + filepath);
		System.out.println("Absolute Path: " + filepath.toAbsolutePath());
		System.out.println("Parent: " + filepath.getParent());
		if(Files.exists(filepath))
			System.out.println("File exists");
		else
			System.out.println("File does not exist");
		try {
			if(Files.isHidden(filepath))
				System.out.println("File is hidden");
			else
				System.out.println("File is not hidden");
		} catch(IOException e) {
			System.out.println("I/O Error: " + e);
		}
		Files.isWritable(filepath);
		System.out.println("File is writable");
		Files.isReadable(filepath);
		System.out.println("File is readable");
		try {
			BasicFileAttributes attribs = Files.readAttributes(filepath, BasicFileAttributes.class);
			if(attribs.isDirectory())
				System.out.println("The file is a directory");
			else
				System.out.println("The file is not a directory");
			if(attribs.isRegularFile())
				System.out.println("The file is a normal file");
			else
				System.out.println("The file is not a normal file");
			if(attribs.isSymbolicLink())
				System.out.println("The file is a symbolic link");
			else
				System.out.println("The file is not a symbolic link");
			System.out.println("File last modified: " + attribs.lastModifiedTime());
			System.out.println("File size: " + attribs.size() + " Bytes");
		} catch(IOException e) {
			System.out.println("Error reading attributes: " + e);
		}
	}
}
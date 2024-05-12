class DirList {
	public static void main(String[] args) {
		String dirname = "\\MyDir";
		DirectoryStream.Filter<Path> how = new DirectoryStream.Filter<Path>() {
			public boolean accept(Path filename) throws IOException {
				if(Files.isWritable(filename)) 
					return true;
				return false;
			}
		};
		try (DirectoryStream<Path> dirstrm = Files.newDirectoryStream(Path.of(dirname), how)) {
			System.out.println("Directory of " + dirname);
			for(Path entry : dirstrm) {
				BasicFileAttributes attribs = Files.readAttributes(entry, BasicFileAttributes.class);
				if(attribs.isDirectory())
					System.out.print("<DIR> ");
				else
					System.out.print(" ");
				System.out.println(entry.getName(1));
			}
		} catch(InvalidPathException e) {
			System.out.println("Path Error " + e);
		} catch(NotDirectoryException e) {
			System.out.println(dirname + " is not a directory.");
		} catch (IOException e) {
			System.out.println("I/O Error: " + e);
		}
	}
}
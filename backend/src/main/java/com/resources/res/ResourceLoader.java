package com.resources.res;

import java.io.File;

// Dynamic file locator

public class ResourceLoader {
	
	private static String folderName;
	private static String documentName;
	
	public static File getFilesFolder( String fName, String dName ) {
		
		folderName = fName;
		documentName = dName;
		String userDirectory = System.getProperty( "user.dir" );
		System.out.println("userDirectory");
		System.out.println(userDirectory);
		return new File( userDirectory + "\\" + folderName + "\\" + documentName );
		}

}

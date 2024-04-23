package com.resources.res;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ResourceLoader {
    
    private static String folderName;
    private static String documentName;
    
    public static File getFilesFolder(String fName, String dName) {
        folderName = fName;
        documentName = dName;
        String r = "/" + folderName + "/" + documentName;
        
        File file = new File(r);
        
        return file;
    }
}

 
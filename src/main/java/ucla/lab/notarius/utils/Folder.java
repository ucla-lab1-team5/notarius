/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucla.lab.notarius.utils;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hanumonke
 */
public class Folder {
   
    public static List<String> getFileList (String dir) throws IOException {
        List<String> fileList = new ArrayList<>();
        // create a Path object for the specified directory 
        Path directory = Paths.get(dir); 
  
        // use DirectoryStream to list files which are present in specific 
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(directory)) { 
            
          //with forEach loop get all the path of files present in directory   
            for (Path file : stream) { 
               fileList.add(file.getFileName().toString()); 
            } 
        } 
        return fileList;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Webscrapper.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Navin
 */
public class FileHandler {
    public static String read(String fileName) throws FileNotFoundException, IOException{
    
    BufferedReader reader=new BufferedReader(new FileReader(fileName));
    StringBuilder builder=new StringBuilder();
    String line="";
    
    while((line=reader.readLine())!=null){
    builder.append(line);
    }
    reader.close();
    return builder.toString();
    }
    public static void write(String fileName,String content) throws IOException{
    FileWriter writer=new FileWriter(fileName);
    writer.write(content);
    writer.close();
    
    }
}

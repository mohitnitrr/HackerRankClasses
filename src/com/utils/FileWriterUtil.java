package com.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterUtil {

	private  static BufferedWriter output= null;
	
	public static void fileIntialize(){

		try {
            File file = new File("output.txt");
            output = new BufferedWriter(new FileWriter(file));
            
        } catch ( IOException e ) {
            e.printStackTrace();
        }
		
	}
	public static void fileWriter(String s){
		 
			try {	
				output.append(s);
				//output.write("\n");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public static void fileCloser(){
		try {
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

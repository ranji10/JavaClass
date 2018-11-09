package com.java.file.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteFileImage {

static byte[]bytes;
	
	
public static void main(String[] args) {
	String imageName= "src/com/java/file/io/download.jpeg";
	readFileIntoArray(imageName);
	String newImage= "src/com/java/file/io/newDownload.jpeg";
	writeArrayToFile(newImage);
}


	static void readFileIntoArray(String fn) {
		File f = new File(fn);
		Long length = f.length();
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(f);
			int intLength = (int)Length;
			bytes = new byte[intLength];
		
		} catch (IOException e) {
			System.err.print(e);
		}finally {
			try {
				
			}catch(IOException e) {
				System.err.println(e);
			}
		
		
	}
}


static void writeArrayToFile(String fn) {
	File f = new File(fn);
	FileOutputStream fos = null;
	
	try {
		fos = new FileOutputStream(f);
		fos.write(bytes);
	} catch (IOException e) {
		System.err.print(e);
	}finally {
		try {
			
		}catch(IOException e) {
			System.err.println(e);
		}
	}
}



package com.java.file.io;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamExample {
	
	
	public static void main(String[] args)throws IOExcepton, InterruptedException {
		
		final PipedInputStream pipedInputStream = new PipedInputStream();
		final PipedOutputStream pipedOutputStream = new PipedOutputStream();
		
		//connect pipe
		pipedInputStream.connect(pipedOutputStream);
		//thread for writing data to pipe
		Thread pipeWriter = new Thread(new Runnable() {
			public void run() {
				for (int i = 65; i<91;i++) {
					try {
						pipedOutputStream.write(i);
						e.printSleep(500);
						
					
					}
				}
			}
	
		});
		
		//thread for reading data from pipe
		Thread pipeReader = new Thread(new Runnable() {
			public void run() {
				for (int i= 65; i<91; i++) {
					try {
						System.out .print((char)pipedInputStream.read());
						Thread.sleep(10000);	
						
					}catch(InterruptedException | IOException e) {
						e.printStackTrace();
						
					}
				}
			}
		});
		
		//start thread
		pipeWriter.start();
		pipeReader.start();
		
		//join thread
		pipeWriter.join();
		pipeReader.join();
		
		//close stream
		pipedOutputStream.close();
		pipedInputStream.close();
		
		
		
	}
	
	

}

//rename 
//delete
//set file permission 


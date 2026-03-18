package com;

import java.io.FileReader;
class MyResource implements AutoCloseable {
    public void use() {
        System.out.println("Using resource");
        int result = 10/0;
    }

    @Override
    public void close() {
        System.out.println("Resource closed");
    }
}


public class BeforeJava7FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FileReader  fr=null;
		try(//FileReader fr = new FileReader("abc.txt");
				MyResource res = new MyResource();
				) {
				res.use();
			// reading logic 	
		}
	}

}

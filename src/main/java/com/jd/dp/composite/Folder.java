package com.jd.dp.composite;

import java.util.ArrayList;
import java.util.List;

public class  Folder extends File{

	 private List<File> files;
	    public Folder(String name){
	        super(name);
	        files = new ArrayList<File>();
	    }
	    public void display() {
	        for(File file : files){
	            file.display();
	        }
	    }
	    public void add(File file){
	        files.add(file);
	    }
	    public void remove(File file){
	        files.remove(file);
	    }
	 
	 
	 
}

/*
    Author: MICHAEL BROOKS

*/
package com.CS340.smokingsurvey;

import java.io.BufferedReader;
import java.io.InputStream;
import java.util.ArrayList;

public class FilesList {
	
	public BufferedReader r;
	public FilesList nextFile;
	public FilesList prevFile;
	Question question = new Question();
	
	public FilesList(){
		r = null;
		nextFile = null;
		prevFile = null;

	}
	public FilesList(BufferedReader rr){
		r = (rr);
		nextFile = null;
		prevFile = null;

		//answers = {"h", "a", "e", "r"};
		
		
		
		
	}
}

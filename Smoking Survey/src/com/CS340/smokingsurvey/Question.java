/*
Author: MICHAEL BROOKS, GUSTAVO DE LA ROSA
*/


package com.CS340.smokingsurvey;

import java.util.ArrayList;

public class Question {
	String questionType;//holds the type of question to display, radio, checkbox, or slider
	String currentText; //Originally used as line reader, before we had a format for our input files. Not used anymore.
	String question;	//Question being asked
	ArrayList<String> answers = new ArrayList<String>();	//List of possible answers for the user
	ArrayList<String> locations = new ArrayList<String>();	//List of locations for each answer choice to jump to
	ArrayList<String> selectedAnswers = new ArrayList<String>();	//List of answers selected by user
	int id;
	
	public Question(){				//Constructor for question
		questionType = null;
		currentText = null;
		question = null;
	}
}

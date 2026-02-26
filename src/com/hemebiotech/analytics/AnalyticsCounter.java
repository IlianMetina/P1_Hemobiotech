package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class AnalyticsCounter {
	private static int headacheCount = 0;	// initialize to 0
	private static int rashCount = 0;		// initialize to 0
	private static int pupilCount = 0;		// initialize to 0

	public static void main(String[] args) throws Exception {
		// first get input

//		System.out.println("Ligne récupérée : " + line);

		ReadSymptomDataFromFile readSymptoms = new ReadSymptomDataFromFile("symptoms.txt");
		readSymptoms.GetSymptoms();

//		while (line != null) {
//
//			i++;	// increment i
//			System.out.println("symptom from file: " + line);
//			if (line.equals("headache")) {
//				headCount++;
//				System.out.println("number of headaches: " + headCount);
//			}
//			else if (line.equals("rash")) {
//				rashCount++;
//				System.out.println("number of rash: " + rashCount + 5);
//			}
//			else if (line.contains("pupils")) {
//				pupilCount++;
//				System.out.println("number of pupils: " + pupilCount);
//			}
//
//			line = reader.readLine();	// get another symptom
//		}

	}
}

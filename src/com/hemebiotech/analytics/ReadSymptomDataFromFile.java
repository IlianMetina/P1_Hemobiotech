package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}
	
	@Override
	public List<String> GetSymptoms() {
		ArrayList<String> result = new ArrayList<String>();

		if (filepath != null) {
			System.out.println(filepath);
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {
					result.add(line);
					line = reader.readLine();
					System.out.println("Ligne récupérée while: " + line);
				}
				reader.close();
				FileWriter writer = new FileWriter ("result.out");
				ArrayList<String> seenSymptomsList = new ArrayList<String>();
				TreeMap<String, Integer> symptoms = new TreeMap<>();

				for (int i = 0; i < result.size(); i++){

					String symptom = result.get(i);

//						System.out.println("Ligne présente dans le tableau result pour l'index " + i + " :");
//						System.out.println(symptom);
					if(!seenSymptomsList.contains(symptom)){
						seenSymptomsList.add(symptom);
						int count = 0;
						for (int j = i; j < result.size(); j++){
							if(result.get(j).equals(symptom)){
								count++;
							}
						}
						symptoms.put(symptom, count);
						System.out.println("HashMap : " + symptoms);
						writer.write(symptom + " : " + count + "\n");
					}


				}
					writer.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

}

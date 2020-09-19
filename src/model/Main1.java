package model;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

import javafx.util.Pair;

public class Main1{
	////HashTable API Java
	
	public static void main (String[] args) {
		Scanner lector= new Scanner(System.in);
		Hashtable <String, Integer> hashMap=new Hashtable <String, Integer>();
		ArrayList <String> elements= new ArrayList<String>();
		int cases= Integer.parseInt(lector.nextLine());
		lector.nextLine();
		
		String line=lector.nextLine();
		while(!line.equals("")) {
			if(hashMap.containsKey(line)) {
				hashMap.replace(line, hashMap.get(line),hashMap.get(line)+1);

			}else {

				hashMap.put(line, 0);
				elements.add(line);
			}
			line=lector.nextLine();
		}
		

		int amountOfTrees=hashMap.size();
		for (int j = 0; j < elements.size(); j++) {
			String key=elements.get(j);
			System.out.println(key + " "+ ((double)hashMap.get(key)/(double)amountOfTrees)*100);
		}
	
	}
}

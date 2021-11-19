package test5;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		String[] countries = { "Japan", "India", "Spane", "Brazil","Auastrellia","America" };
		int size = countries.length;

		for (int i = 0; i < size - 1; i++) {  
			for (int j = i + 1; j < countries.length; j++) {
				if (countries[i].compareTo(countries[j]) > 0) {
					String temp = countries[i];
					countries[i] = countries[j];
					countries[j] = temp;
				}
			
			}
		}
		String sortedCountries = (Arrays.toString(countries));
		System.out.print("The sorted countries are : \n"+sortedCountries);
	}
}

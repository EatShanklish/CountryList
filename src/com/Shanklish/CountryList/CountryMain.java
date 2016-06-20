package com.Shanklish.CountryList;

import java.io.IOException;
import java.util.Scanner;

public class CountryMain
    {

	public static void main( String[] args ) throws IOException
	{
	    Scanner scan = new Scanner(System.in);
	   
	    
	    System.out.println("If you would like to view the list of countries, enter 1. If you would like to add a country to the existing list, enter 2:");
	    int choice = scan.nextInt();
	    
	    if(choice == 1)
		{
		    CountriesTextFile reader = new CountriesTextFile();
		    reader.readFromFile();
		    
		}
	    
	    else if (choice == 2)
		{
		    CountriesTextFile writer = new CountriesTextFile();
		    writer.writeToFile();
		}
	    else 
	    {
    		 CountriesTextFile writer = new CountriesTextFile();
    		 System.out.println("Enter the country you would like to remove");
    		 writer.deleteFromFile(scan.next());
	    }
	    
	}

    }

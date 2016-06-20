package com.Shanklish.CountryList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class CountriesTextFile
    {
	Scanner scan = new Scanner(System.in);
	ArrayList<String> listofCountries = new ArrayList<String>();	
	
	//Reads and prints the contents of the file
	public void readFromFile()
	{
	    String fileName = "countries.txt";
	    String line = null;
	    
	    try
		{
		    FileReader fileReader = new FileReader(fileName);
		    BufferedReader bufferedReader = new BufferedReader(fileReader);
		    
		    
		    while( (line = bufferedReader.readLine()) != null)	
			{
			    System.out.println(line);
			    listofCountries.add(line);
			}
		    		   
		    bufferedReader.close();		    
		}
	    
	    catch (IOException e)
		{
		      System.out.println("error of some sort");
		}
	   
	}
	
	
	
	public void writeToFile() throws IOException
	{
	    String fileName = "countries.txt";
	    
	    FileWriter fileWriter = null;
	    BufferedWriter bufferedWriter = null;
	    String choice = "y";
	    
	   while(choice.equalsIgnoreCase("y"))
	       {
        	    try
        		{
        		    fileWriter = new FileWriter("countries.txt", true);
        		    
        		    bufferedWriter = new BufferedWriter(new FileWriter(fileName, true));
        		}
        	    catch (IOException e)
        		{
        		    // TODO Auto-generated catch block
        		    e.printStackTrace();
        		}	//TODO try and catch
        	    
	    
        	    System.out.println("enter your new country:");
        	    String countryChoice = scan.nextLine();
        	    
        	    bufferedWriter.append("\n");
        	    bufferedWriter.append(countryChoice);
        	   
        	    System.out.println("would you like to add another? (Y/N)");
        	    choice = scan.nextLine();
	    
	       }
	    
	    bufferedWriter.close();
	    fileWriter.close(); 
	   
	}
	
	//TODO - DOESNT WORK(deleting input from arrayList, not the file itself)
	public void deleteFromFile(String s)
	{   
		   for ( int i = 0 ; i < listofCountries.size() ; i++ )
		    {
			if(listofCountries.get(1).equalsIgnoreCase(s))
			    listofCountries.remove(i);
		    }
	}
    }

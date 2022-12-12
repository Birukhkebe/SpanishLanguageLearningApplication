package com.example.spanishlanguagelearningapplication;

import com.example.spanishlanguagelearningapplication.VocabularyList;

import java.sql.Connection;
import java.sql.DatabaseMetaData;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.ArrayList;

//import VocabularyList;

public class DatabaseConnection extends VocabularyList
{
	public static Connection createDatabaseConnection(String databaseString)
	{	
		Connection dbConnection = null;	
	
		try
		{
			dbConnection = DriverManager.getConnection(databaseString);
		}

		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		return dbConnection;
	}

	ArrayList <String> getVocabList(String column)
	{
		Connection dbConnection = createDatabaseConnection("jdbc:sqlite:Vocabulary.db");
		VocabularyList recordList = new VocabularyList();
		recordList.selectRecords(dbConnection,"SELECT * FROM VERB;");

		// First try/catch block moves cursor to row 1
		try
		{
			recordList.result.next();

		}

		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}

		ArrayList <String> vocabList = new ArrayList<>();

		for(int i=0; i<100; i++)
		{
			try
			{
				vocabList.add(recordList.result.getString(column));
				recordList.result.next();
			}

			catch(SQLException e)
			{
				System.out.println(e.getMessage());
			}
		}

		return vocabList;
	}
	
	public static void main(String[] args)
	{
		/*Connection dbConnection = createDatabaseConnection("jdbc:sqlite:Vocabulary.db");
		VocabularyList recordList = new VocabularyList();
		recordList.selectRecords(dbConnection,"SELECT * FROM VERB;");

		// First try/catch block moves cursor to row 1
		try
		{
			recordList.result.next();
		}

		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}

		for(int i=0; i<100; i++)
		{
			try
			{
				System.out.println(recordList.result.getString("ENG_Infinitive"));
				System.out.println(recordList.result.getString("SPN_Infinitive"));
				recordList.result.next();
			}

			catch(SQLException e)
			{
				System.out.println(e.getMessage());
			}
		}*/
	}
}



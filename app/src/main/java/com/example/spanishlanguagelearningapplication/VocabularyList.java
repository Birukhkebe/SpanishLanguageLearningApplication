package com.example.spanishlanguagelearningapplication;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VocabularyList
{
    ResultSet result;
    public void selectRecords(Connection dbConnection, String sqlStatementString)
    {
        try
        {
            Statement sqlStatementObject = dbConnection.createStatement();
            result = sqlStatementObject.executeQuery(sqlStatementString);
        }

        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

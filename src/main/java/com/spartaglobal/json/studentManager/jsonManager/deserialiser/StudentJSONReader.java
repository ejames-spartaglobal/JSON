package com.spartaglobal.json.studentManager.jsonManager.deserialiser;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StudentJSONReader {
    private JSONObject studentJSONDetails;


    public StudentJSONReader(String fileName){

        try {
            //A simple file reader obj
            FileReader studentJSON = new FileReader(fileName);
            //deserialising string to a object
            JSONParser jsonParser = new JSONParser();
            Object studentObject = jsonParser.parse(studentJSON);
            //JSON Simple needs a cast from an Object to the JSON simple object of JSONObject
            studentJSONDetails = (JSONObject) studentObject;
        } catch (ParseException | IOException e ){
            e.printStackTrace();
        }
    }

    public JSONObject getStudentJSONDetails(){
        return studentJSONDetails;
    }
}

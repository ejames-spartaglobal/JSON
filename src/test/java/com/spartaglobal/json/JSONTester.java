package com.spartaglobal.json;

import com.spartaglobal.json.studentManager.jsonManager.deserialiser.StudentDTO;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class JSONTester {
    StudentDTO studentDTO = new StudentDTO("resources/student.json");

    @Test
    public void ageTester(){

    assertEquals(studentDTO.getAge(), Long.valueOf(22));
    }

    @Test
    public void firstNameTester(){
        assertEquals(studentDTO.getFirstName(),"Bill");
    }

    @Test
    public void lastNameTester(){
        assertEquals(studentDTO.getLastName(),"Stevens");
    }

    @Test
    public void degreeTester(){
        assertEquals(studentDTO.getDegree(),"Science 2.2");
    }
}

package com.spartaglobal.json;

import com.spartaglobal.json.studentManager.jsonManager.deserialiser.StudentDTO;
import com.spartaglobal.json.studentManager.jsonManager.serialiser.JsonStudentFactory;
import com.spartaglobal.json.studentManager.StudentFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        StudentFactory student1 =  new StudentFactory("Bill", "Stevens", "Science 2.2", 22);
//        JsonStudentFactory jsonStudentFactory=new JsonStudentFactory(student1);
//        jsonStudentFactory.printStudentJSON();

        StudentDTO studentDTO = new StudentDTO("resources/student.json");
        System.out.println(studentDTO.getFirstName());
        System.out.println(studentDTO.getLastName());
        System.out.println(studentDTO.getAge());

    }
}

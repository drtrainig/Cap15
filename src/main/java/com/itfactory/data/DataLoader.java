package com.itfactory.data;


import com.itfactory.model.Course;
import com.itfactory.model.Student;
import com.itfactory.utils.DataLoaderUtils;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataLoader {

    private Map<Course, List<Student>> dataMap;
    private List<Student> students;

    public DataLoader() {
        dataMap = new HashMap<>();
        students = new ArrayList<>();


        dataMap.get(curusl).add(student);
    }

    public void loadData() throws IOException {
        loadCourses();
        loadStudents();
        mapStudentsToCourses();
    }

    private void loadCourses() throws IOException {
        List<String> courseInputData = DataLoaderUtils.readFile(DataLoaderUtils.COURSE_FILE_PATH);

        for (String courseInputDatum : courseInputData) {
            String[] data = courseInputDatum.split(",");
            dataMap.put(createCourse(data), new ArrayList<>());
        }
    }

    private Course createCourse(String[] data) {
        int id = Integer.parseInt(data[0]);
        String name = data[1];
        double price = Double.parseDouble(data[2]);
        return new Course(id, name, price);
    }

    private void loadStudents() {

    }

    private void mapStudentsToCourses() {

    }

    public Map<Course, List<Student>> getDataMap() {
        return dataMap;
    }

}


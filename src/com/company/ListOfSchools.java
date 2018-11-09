package com.company;


import java.util.ArrayList;

/**
 * Created by vk586 on 11/8/18.
 */
public class ListOfSchools
    {
        ArrayList<School> schools = new ArrayList<>();
        public ListOfSchools()
            {
            }
        public void add(String Name, int MathScore, int ReadingScore, int WritingScore)
            {
                schools.add(new School(Name,MathScore,ReadingScore,WritingScore));
            }
    }

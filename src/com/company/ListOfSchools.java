package com.company;


import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by vk586 on 11/8/18.
 */
public class ListOfSchools
    {
        public ArrayList<School> schools = new ArrayList<>();
        public ListOfSchools()
            {
                //asdf
            }
        public void add(String Name, int MathScore, int ReadingScore, int WritingScore)
            {

                schools.add(new School(Name,MathScore,ReadingScore,WritingScore));
                if (schools.size()>1)
                    {
                        sortByTotalScore();
                    }
            }
        public void sortByTotalScore()
            {
                for (int i = 0; i < schools.size();i++)
                {
                    for (int j = 0; j < schools.size(); j++)
                    {
                        if (j == 0)
                            {
                                if (schools.get(j).getTotalScore() < schools.get(j + 1).getTotalScore())
                                    Collections.swap(schools, j, j+1);
                            }
                        else if (schools.get(j).getTotalScore() > schools.get(j-1).getTotalScore())
                            {
                                Collections.swap(schools, j, j-1);
                            }
                    }
                }
            }
        public School getSchool(int index)
            {
                return schools.get(index);
            }
        public double getStateAverage()
            {
                double i = 0;
                for(School school: schools)
                    {
                        i += school.getTotalScore();
                    }
                i = i / schools.size();
                return i;
            }
        public int getSize()
            {
                return schools.size();
            }
    }

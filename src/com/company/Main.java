package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main
    {

        public static void main(String[] args) throws IOException
            {
                Path path = Paths.get("/Users/vk586/IdeaProjects/AP Friday Sorting Hell/src/com/company/scores.txt");
                int numOfLines = (int)Files.lines(path).count();
                String [] text = new String [numOfLines];
                int index = -1;
                Scanner sf = new Scanner(new File("/Users/vk586/IdeaProjects/AP Friday Sorting Hell/src/com/company/scores.txt"));
                while(sf.hasNext())
                    {
                        index++;
                        text[index] = sf.nextLine();
                    }
                sf.close();

                ListOfSchools schools = new ListOfSchools();
                for (int i = 0; i < numOfLines; i++) {
                    Scanner sf2 = new Scanner(text[i]);
                    sf2.useDelimiter("\t");
                    sf2.next();
                    String n = sf2.next();
                    for (int j = 0; j < 16; j++) {
                        sf2.next();
                    }
                    if(sf2.hasNextInt())
                        {
                            int mS = sf2.nextInt();
                            int rS = sf2.nextInt();
                            int wS = sf2.nextInt();
                            schools.add(n, mS, rS, wS);
                        }
                }
                System.out.println(schools.getSchool(0).getName());
                System.out.println(schools.getSchool(1).getName());
                System.out.println(schools.getSchool(2).getName());
                System.out.println(schools.getSchool(3).getName());
                System.out.println(schools.getStateAverage());
            }

    }

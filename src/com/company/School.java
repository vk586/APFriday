package com.company;

/**
 * Created by vk586 on 11/8/18.
 */
public class School
    {
        public String name;
        public int mathScore;
        public int readingScore;
        public int writingScore;
        public double totalScore;

        public School(String Name, int MathScore, int ReadingScore, int WritingScore)
            {
                name = Name;
                mathScore = MathScore;
                readingScore = ReadingScore;
                writingScore = WritingScore;
                totalScore = (mathScore + readingScore + writingScore);
            }
        public double getTotalScore()
            {
                return totalScore;
            }
        public String getName()
            {
                return name;
            }
    }

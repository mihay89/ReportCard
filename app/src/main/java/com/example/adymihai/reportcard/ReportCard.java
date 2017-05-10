package com.example.adymihai.reportcard;

import java.util.ArrayList;

/**
 * Created by Ady Mihai on 09.05.2017.
 */

public class ReportCard {
    //name of the student
    private String mName;

    //the grades that can be given to each class from 1 to 10(romanian style..:) )
    private ArrayList<Integer> mGrades = new ArrayList<Integer>();
    // the general average


    /** Create a ReportCard object
     *
     * @param mathGrade grade for mMath
     * @param englishGrade grade for mEnglish
     * @param romanianGrade grade for mRomanian
     * @param chemistryGrade grade for mChemistry
     * @param computerScienceGrade grade for mComputerScience
     */
    public ReportCard( String name, int mathGrade, int englishGrade,
                      int romanianGrade, int chemistryGrade, int computerScienceGrade){
        mName = name;
    //Initialize the grades for each class
       mGrades.add(0, mathGrade);
        mGrades.add(1, englishGrade);
        mGrades.add(2, romanianGrade);
        mGrades.add(3, chemistryGrade);
        mGrades.add(4, computerScienceGrade);


    }
//return the grade for Math
public int getMathGrade(){
    return mGrades.get(0);
}
//return the grade for english
    public int getEnglishGrade(){
        return mGrades.get(1);
    }
    //return the grade for romanian
    public int getRomanianGrade(){
        return mGrades.get(2);
    }
    //return the grade for chemistry
    public int getChemistryGrade(){
        return mGrades.get(3);
    }
    //return grade for computerscience
    public int getComputerScienceGrade(){
        return mGrades.get(4);
    }
    // content of the Report Card in a String
    public String toString(){
        return mName + "\nMath: " + getMathGrade() +
                "\nEnglish:" + getEnglishGrade() +
                "\nRomanian: "+ getRomanianGrade() +
                "\nChemistry: " + getChemistryGrade() +
                "\nComputerScienceGrade: " + getComputerScienceGrade();
    }
}

/**
 * Title: HACS Description: CSE870 Homework 3: Implementing Design Patterns
 * Copyright: Copyright (c) 2002 Company: Department of Computer Science and
 * Engineering, Michigan State University
 *
 * @author Ji Zhang, Wei Zhu
 * @version 1.0
 * @author mjfindler
 * @version 2.0
 * <p>
 * update to Java 8
 */

package hacs;

import java.util.Date;

public class Solution {
    String author = "";
    String solutionFileName = "";
    Date submitDate = new Date();
    int grade;
    boolean reported = false;

    public Solution() {

    }

    public String getTheAuthor() {
        return author;
    }

    @Override
    public String toString() {
        String string = author + " " + solutionFileName + " Grade = " + getGradeInt();
        if (isReported())
            string += " reported.";
        else
            string += " not reported.";
        return (string);
    }

    public void setSolutionFileName(String solutionFileName) {
        this.solutionFileName = solutionFileName;
    }

    public void setTheAuthor(String author) {
        this.author = author;
    }

    String getGradeString() {
        if (isReported())
            return "" + grade;
        else
            return "-1";
    }

    int getGradeInt() {
        return grade;
    }

    public void setReported(boolean reported) {
        this.reported = reported;
    }

    public boolean isReported() {
        return reported;
    }
}
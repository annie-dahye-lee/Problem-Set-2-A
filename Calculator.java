/*
 * Annie Lee
 * Sept 29, 2021
 * Problem Set 2-A 
 */

import java.util.Arrays;

public class Calculator {

    // default empty constructor
    public Calculator() {       
    }

    // ------------------------- QUADRATIC FORMULA START -----------------------
    public double negativeQuadraticFormula(int a, int b, int c) {
        double negativeQuadraticAns 
        = (-b - Math.sqrt((b*b) - (4*a*c))) / (2 * a);

        // Print answer
        System.out.println("QUADRATIC FORMULA");
        System.out.print("The solutions for " + a + "x^2 + " + b + "x + " + c
            + " are " + negativeQuadraticAns  + " and ");

        return negativeQuadraticAns;
    }
    // ------------------------- QUADRATIC FORMULA END ------------------------

    // ------------------------- NEGATIVE QUADRATIC FORMULA START -----------------------
    public double quadraticFormula(int a, int b, int c) {
        double quadraticAns = (-b + Math.sqrt((b*b) - (4*a*c))) / (2 * a);

        // Print answer
        System.out.println(quadraticAns + ".");

        return quadraticAns;
    }
    // ------------------------- QUADRATIC FORMULA END -----------------------

    // ------------------------- SLOPE FORMULA START --------------------------
    public double slopeFormula(double x1, double y1, double x2, double y2) {
        double slopeAns = (y2 - y1) / (x2 - x1);

        // Print answer
        System.out.println("\nSLOPE FORMULA");
        System.out.println("A line connecting the points (" + (int) x1 + ", " +
            (int) y1 + ")" + " and (" + (int) x2 + ", " + (int) y2 + ") has a slope of "
            + slopeAns);

        return slopeAns;
    }
    // ------------------------- SLOPE FORMULA END --------------------------

    // -------------------------- MIDPOINT FORMULA START -----------------------
    public double midpointFormula(int x1, int y1, int x2, int y2) {
        // Formula
        double midpointX = (x1 + x2) / 2;
        double midpointY = (double) (y1 + y2) / 2;
        
        // Print answer
        System.out.println("\nMIDPOINT FORMULA");
        System.out.println("The midpoint between (" + (int) x1 + ", " + (int) y1 +
        ") and (" + (int) x2 + ", " + (int) y2 + ") is (" + midpointX + ", " +
        midpointY + ")" );
        
        return midpointX;
    } 
    // -------------------------- MIDPOINT FORMULA END ------------------------

    // ------------------- SUM OF AN ARITHMETIC SERIES START ------------------
    public double sumOfArithmeticSeries(int numOfTerms,  double firstTerm,
    double difference) {
        double addFirstTerm = firstTerm;
        double sum = 0;

        // Formula
        for (int i = 0; i < numOfTerms; i++) {
            sum += addFirstTerm;
            addFirstTerm += difference;
        }

        // Print answer
        System.out.println("\nSUM OF AN ARITHMETIC SERIES");
        System.out.println("The sum of the first " + numOfTerms + 
            " terms of an arithmetic series that starts with "+ firstTerm + 
            "\nand increases by " + difference + " is " + sum);

        return sum;   
    }
    // -------------- SUM OF AN ARITHMETIC SERIES END -----------------------

    // ------------ SUM OF A FINITE GEOMETRIC SERIES START -------------------
    public void sumOfGeometricSeries(int numOfTerms, double firstTerm, double commonRatio) {
        double geometricAns = (firstTerm * (1 - (int)(Math.pow(commonRatio, numOfTerms)))) / (1 - commonRatio);

        // Print answer
        System.out.println("\nSUM OF A FINITE GEOMETRIC SERIES");
        System.out.println("The sum of the first " + numOfTerms +
            " terms of a finite geometric series that starts with " + firstTerm + 
            "\nand increases by a rate of " + commonRatio + " is " + geometricAns);
    }
    // ------------ SUM OF A FINITE GEOMETRIC SERIES END -------------------

    public void display() {
        System.out.print('\u000C'); // clear terminal window each time you run
         
        negativeQuadraticFormula(1, 5, 6);
        quadraticFormula(1, 5, 6);
        slopeFormula(0, 0, 2, 3);
        midpointFormula(0, 0, 2, 3);
        sumOfArithmeticSeries(5, 1.0, 1.0);
        sumOfGeometricSeries(3, 3.0, 2.0);
    }

}
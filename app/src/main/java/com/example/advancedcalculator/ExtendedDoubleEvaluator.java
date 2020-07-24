// Written by Arild

package com.example.advancedcalculator;

import java.util.Iterator;

import com.fathzer.soft.javaluator.DoubleEvaluator;
import com.fathzer.soft.javaluator.Function;
import com.fathzer.soft.javaluator.Parameters;

// A subclass of DoubleEvaluator from the open-sourced Javaluator framework by Fathzer that supports square root and factorial function.
public class ExtendedDoubleEvaluator extends DoubleEvaluator {
    // Declaring the new functions
    private static final Function SQRT = new Function("sqrt", 1);
    private static final Function FAC = new Function("fac", 1);
    private static final Parameters PARAMS;
    public boolean isDegrees = true;

    static {
        // Gets the default DoubleEvaluator's parameters
        PARAMS = DoubleEvaluator.getDefaultParameters();
        // Adds the new sqrt and factorial function to these parameters
        PARAMS.add(SQRT);
        PARAMS.add(FAC);
    }

    public ExtendedDoubleEvaluator() {
        super(PARAMS);
    }

    // Factorial recursive method
    private double factorial(double d) {
        if (d == 0) {
            return 1;
        } else {
            return (d * factorial(d - 1));
        }
    }

    /* Overriding the evaluate method to include the new sqrt to the iteration, as well as adding a feature
       where the user can calculate the result of a trigonometric expression with degrees */
    @Override
    protected Double evaluate(Function function, Iterator<Double> arguments, Object evaluationContext) {
        if (function == SQRT) {
            // Implements the new function
            return Math.sqrt(arguments.next());
        } else if ((function == COSINE) && (isDegrees)) {
            return Math.cos(Math.toRadians(arguments.next()));
        } else if ((function == SINE) && (isDegrees)) {
            return Math.sin(Math.toRadians(arguments.next()));
        } else if ((function == TANGENT) && (isDegrees)) {
            return Math.tan(Math.toRadians(arguments.next()));
        } else if ((function == ATAN) && (isDegrees)) {
            return Math.atan(Math.toRadians(arguments.next()));
        } else if ((function == ASINE) && (isDegrees)) {
            return Math.asin(Math.toRadians(arguments.next()));
        } else if ((function == ACOSINE) && (isDegrees)) {
            return Math.acos(Math.toRadians(arguments.next()));
        } else if ((function == FAC)) {
            return factorial(arguments.next());
        } else {
            // If it's another function, pass it to DoubleEvaluator
            return super.evaluate(function, arguments, evaluationContext);
        }
    }
}

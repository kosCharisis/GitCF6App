package gr.aueb.cf.ch5;

/**
 * Demo of float / double expressions.
 */
public class ExpressionsApp {

    public static void main(String[] args) {
        int intNum = 10;
        float floatNum = 0.8F;
        double doubleNum = 12.8;

        float resultFloat = 0;
        double resultDouble = 0;

        resultFloat = floatNum + intNum; //int, long, short, byte promotes to float
        resultDouble = doubleNum + floatNum + intNum;

        System.out.printf("Result float: %05.2f\t%e\t%g\n", resultFloat, resultFloat,resultFloat);
        System.out.printf("Result double: %08.3f", resultDouble);
    }
}

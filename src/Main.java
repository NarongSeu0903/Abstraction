    import Util.Util;

    /**
     * Main class to demonstrate the generic Util class with different number types.
     */
    public class Main {
        public static void main(String[] args) {

            Util<Integer> intUtil = new Util <Integer>();
            Integer int1 = 10;
            Integer int2 = 5;

            System.out.println("===== Integer Operations =====");
            System.out.println("Numbers: " + int1 + ", " + int2);
            System.out.println("Sum: " + intUtil.sum(int1, int2));
            System.out.println("Difference: " + intUtil.subtract(int1, int2));
            System.out.println("Product: " + intUtil.multiply(int1, int2));
            System.out.println();

            Util<Double> doubleUtil = new Util <Double>();
            Double double1 = 10.5;
            Double double2 = 2.5;

            System.out.println("===== Double Operations =====");
            System.out.println("Numbers: " + double1 + ", " + double2);
            System.out.println("Sum: " + doubleUtil.sum(double1, double2));
            System.out.println("Difference: " + doubleUtil.subtract(double1, double2));
            System.out.println("Product: " + doubleUtil.multiply(double1, double2));
            System.out.println();

            Util<Float> floatUtil = new Util <Float>();
            Float float1 = 7.5f;
            Float float2 = 3.2f;

            System.out.println("===== Float Operations =====");
            System.out.println("Numbers: " + float1 + ", " + float2);
            System.out.println("Sum: " + floatUtil.sum(float1, float2));
            System.out.println("Difference: " + floatUtil.subtract(float1, float2));
            System.out.println("Product: " + floatUtil.multiply(float1, float2));
        }
    }
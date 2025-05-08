package Util;

public class Util<T extends Number> {

        public T sum(T a, T b) {
            if (a instanceof Integer) {
                return (T) Integer.valueOf(a.intValue() + b.intValue());
            } else if (a instanceof Double) {
                return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
            } else if (a instanceof Float) {
                return (T) Float.valueOf(a.floatValue() + b.floatValue());
            } else if (a instanceof Long) {
                return (T) Long.valueOf(a.longValue() + b.longValue());
            } else {

                return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
            }
        }

        public T subtract(T a, T b) {
            if (a instanceof Integer) {
                return (T) Integer.valueOf(a.intValue() - b.intValue());
            } else if (a instanceof Double) {
                return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
            } else if (a instanceof Float) {
                return (T) Float.valueOf(a.floatValue() - b.floatValue());
            } else if (a instanceof Long) {
                return (T) Long.valueOf(a.longValue() - b.longValue());
            } else {
                return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
            }
        }


        public T multiply(T a, T b) {
            if (a instanceof Integer) {
                return (T) Integer.valueOf(a.intValue() * b.intValue());
            } else if (a instanceof Double) {
                return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
            } else if (a instanceof Float) {
                return (T) Float.valueOf(a.floatValue() * b.floatValue());
            } else if (a instanceof Long) {
                return (T) Long.valueOf(a.longValue() * b.longValue());
            } else {
                return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
            }
        }
}

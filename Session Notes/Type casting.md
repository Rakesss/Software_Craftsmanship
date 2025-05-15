
--------------------------------------Type Casting----------------------------------



1. Implicit Typecasting (Automatic Type Conversion)
Done automatically by the compiler.

Occurs when converting a smaller data type to a larger data type.

No data loss occurs.

Common in arithmetic expressions.

E.g-

'''Java
 public class ImplicitCasting {
    public static void main(String[] args) {
        int a = 10;
        double b = a;  // int is automatically converted to double

        System.out.println("Integer value: " + a);
        System.out.println("Converted to double: " + b);
    }
}
'''


2. Explicit Typecasting (Manual Type Conversion)
Done manually by the programmer using a cast operator.

Used when you need to force conversion, often from a larger data type to a smaller one.

Might lead to data loss or unexpected results

E.g-
'''Java

public class ExplicitCasting {
    public static void main(String[] args) {
        double a = 10.75;
        int b = (int) a;  // double is explicitly converted to int

        System.out.println("Double value: " + a);
        System.out.println("Converted to int (fraction lost): " + b);
    }
}
'''
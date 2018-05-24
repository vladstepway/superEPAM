package com.stepovoy.epam;


import static javafx.scene.input.KeyCode.L;

public class TypeTester {

    public static void testInt() {
        System.out.println("\n ************** TEST FOR INT****************\n");
        int a = 5, b = 2, c;
        System.out.println("===========================");
        System.out.println("| Arithmetical operators |");
        System.out.println("===========================");

        //addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);

        //subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);

        //multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);

        //division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);

        //modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);
        try {
            c = a / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
        try {
            c = a % 0;
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }

        //unary minus
        a = 5;
        c = -a;
        System.out.printf("-%d = %d\n", a, c);

        //unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);

        //prefix increment
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);

        //postfix increment
        a = 5;
        System.out.printf("%d++ = %d\n", a, a++);

        //prefix decrement
        a = 5;
        System.out.printf("--%d = %d\n", a, --a);

        //postfix decrement
        a = 5;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("======================");
        System.out.println("| Bitwise operators |");
        System.out.println("======================");

        // bitwise AND
        a = 5;
        c = a & b;
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        // bitwise OR
        c = a | b;
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise XOR
        c = a ^ b;
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise unary compliment
        c = ~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        //left shift
        c = a << 1;
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        //right shift
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        // right shift with negative number
        a = -5;
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        // zero fill right shift
        a = 5;
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        // zero fill right shift with negative number
        a = -5;
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));


        System.out.println("========================");
        System.out.println("| Assignment operators |");
        System.out.println("========================");

        c = 7;
        a = 5;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);

        System.out.println("========================");
        System.out.println("| Relational operators |");
        System.out.println("========================");

        //greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        //greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        //less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        //less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        //equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        //not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("=====================");
        System.out.println("| Logical operators |");
        System.out.println("=====================");

        //logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        //bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));
        //logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
        //bitwise logical OR
        System.out.printf("(%d >= %d) | (%d > 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
        //logical XOR
        System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        //logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));


        System.out.println("=====================");
        System.out.println("| Another operators |");
        System.out.println("=====================");

        System.out.println("Ternany operator :");
        //ternary operator
        System.out.printf("%d > %d ? %d : %d  -->  %d\n\n", a, b, a, b, (a > b ? a : b));

        System.out.println("Type cast operator :");

        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long L = 1000000000000000000L;
        float fl = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        String str1 = "123";
        String str2 = "string";
        Student student = new Student("Vladislav", 9);

        c = bt;
        System.out.printf("int = byte : c = %d ->> c = %d\n", bt, c);
        c = sh;
        System.out.printf("int = short : c = %d ->> c = %d\n", sh, c);
        c = ch;
        System.out.printf("int = char : c = '%c' ->> c = %d\n", ch, c);
        c = (int) L;
        System.out.printf("int = long : c = (int)%d ->> c = %d\n", L, c);
        c = (int) fl;
        System.out.printf("int = float : c = (int)%f ->> c = %d\n", fl, c);
        c = (int) d;
        System.out.printf("int = double : c = (int)%f ->> c = %d\n", d, c);
        //c = (int)bool;
        System.out.printf("int = boolean : c = (int)%b ->> Compile Error\n", bool);

        c = Integer.parseInt(str1);
        System.out.printf("int = String : c = Integer.parseInt(%s) ->> c = %d\n", str1, c);
        //c = Integer.parseInt(str2);
        System.out.printf("int = String : c = Integer.parseInt(%s) ->> Compile Error\n", str2);
        //c = (int)str1;
        System.out.printf("int = String : c = (int)%s ->> Compile Error\n", str1);
        //c = (int)str2;
        System.out.printf("int = String : c = (int)%s ->> Compile Error\n", str2);

        //c = (int)student;
        System.out.printf("int = Student : c = " + student.toString() + " ->> Compile Error\n");


    }

    public static void testBoolean() {
        System.out.println("\n ************** TEST FOR BOOLEAN****************\n");
        boolean a = true, b = false, c;
        System.out.println("===========================");
        System.out.println("| Arithmetical operators |");
        System.out.println("===========================");
        // c = a + b; // addition
        // c = a - b; // subtraction
        // c = a * b; // multiplication
        // c = a / b; // division
        // c = a % b; // modulus
        // c = -a; // unary minus
        // c = +a; // unary plus
        // c = ++a; // prefix increment
        // c = a++; // postfix increment
        // c = --a; // prefix decrement
        // c = a--; // postfix decrement
        System.out.println("=====================");
        System.out.println("| Bitwise operators |");
        System.out.println("=====================");
        c = a & b; // bitwise AND
        System.out.printf("%b & %b = %b\n", a, b, c);
        c = a | b; // bitwise OR
        System.out.printf("%b | %b = %b\n", a, b, c);
        c = a ^ b; // bitwise XOR
        System.out.printf("%b ^ %b = %b\n", a, b, c);
        // c = ~a; // bitwise unary compliment
        // c = a << 1; // left shift
        // c = a >> 1; //right shift
        // c = a >>> 1; // zero fill right shift

        System.out.println("========================");
        System.out.println("| Assignment operators |");
        System.out.println("========================");
        System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a);
        System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);
        System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);
        // c += a;
        // c -= a;
        // c *= a;
        // c /= a;
        // c %= a;
        // c >>= 1;
        // c <<= 1;
        // c >>>= 1;
        System.out.println("========================");
        System.out.println("| Relational operators |");
        System.out.println("========================");
        // equal to
        System.out.printf("%b == %b --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%b != %b --> %b\n", a, b, a != b);
        // c = a > b; // greater than
        // c = a >= b; // greater than or equal to
        // c = a < b; // less than
        // c = a <= b; // less than or equal to
        System.out.println("===========================");
        System.out.println("| Logical operators |");
        System.out.println("===========================");
        c = a && b; // logical AND
        System.out.printf("%b && %b = %b\n", a, b, c);
        c = a || b; // logical OR
        System.out.printf("%b || %b = %b\n", a, b, c);
        c = a ^ b; // logical XOR
        System.out.printf("%b ^ %b = %b\n", a, b, c);
        // logical NOT
        System.out.printf("!%b --> %b\n", a, !a);
        System.out.println("===========================");
        System.out.println("| Another operators |");
        System.out.println("===========================");
        System.out.println("\nTernary Operator:");
        System.out.printf(" %b ? %b : %b --> %b\n", c, a, b, (c ? a : b));
        System.out.println("\nType Cast Operator:");
        // byte bt = 1;
        // short sh = -32000;
        // char ch = '\u0002';
        // long l = 100000000000000000L;
        // float f = 1.9f;
        // double d = 123456789.625;
        //c = (boolean) bt;
        // c = (boolean) sh;
        //c = (boolean) ch;
        //c = (boolean) l;
        //c = (boolean) f;
        //c = (boolean) d;

    }

    public static void testByte() {
        System.out.println("\n ************** TEST FOR BYTE****************\n");
        byte a = 0b1111111, b = 0b101110, c;
        System.out.println("===========================");
        System.out.println("| Arithmetical operators |");
        System.out.println("===========================");

        //addition
        c = (byte) (a + b);
        System.out.printf("%d + %d = (byte)%d\n", a, b, c);

        //subtraction
        c = (byte) (a - b);
        System.out.printf("%d - %d = (byte)%d\n", a, b, c);

        //multiplication
        c = (byte) (a * b);
        System.out.printf("%d * %d = (byte)%d\n", a, b, c);

        //division
        c = (byte) (a / b);
        System.out.printf("%d / %d = (byte)%d\n", a, b, c);

        //modulus
        c = (byte) (a % b);
        System.out.printf("%d %% %d = (byte)%d\n", a, b, c);

        try {
            c = (byte) (a / b);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
        try {
            c = (byte) (a % b);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }

        //unary minus
        a = 120;
        c = (byte) -a;
        System.out.printf("-%d = (byte)%d\n", a, c);

        //unary plus
        c = (byte) +a;
        System.out.printf("+%d = (byte)%d\n", a, c);

        //prefix increment
        a = 127;
        System.out.printf("++%d = %d\n", a, ++a);

        //postfix increment
        a = 127;
        System.out.printf("%d++ = %d\n", a, a++);

        //prefix decrement
        a = 127;
        System.out.printf("--%d = %d\n", a, --a);

        //postfix decrement
        a = (byte) 127;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("======================");
        System.out.println("| Bitwise operators |");
        System.out.println("======================");

        // bitwise AND
        a = 5;
        c = (byte) (a & b);
        System.out.printf("%d & %d = (byte)%d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = (byte)%s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        // bitwise OR
        c = (byte) (a | b);
        System.out.printf("%d | %d = (byte)%d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = (byte)%s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise XOR
        c = (byte) (a ^ b);
        System.out.printf("%d ^ %d = (byte)%d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = (byte)%s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise unary compliment
        c = (byte) ~a;
        System.out.printf("~%d = (byte)%d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = (byte)%s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        //left shift
        c = (byte) (a << 1);
        System.out.printf("%d << 1 = (byte)%d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = (byte)%s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        // right shift
        c = (byte) (a >> 1);
        System.out.printf("%d >> 1 = (byte)%d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = (byte)%s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        // right shift with negative number
        a = (byte) -5;
        c = (byte) (a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        // zero fill right shift
        a = (byte) 5;
        c = (byte) (a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        // zero fill right shift with negative number
        a = (byte) -5;
        c = (byte) (a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
//
//
        System.out.println("========================");
        System.out.println("| Assignment operators |");
        System.out.println("========================");

        c = (byte) 7;
        a = (byte) 5;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);

        System.out.println("========================");
        System.out.println("| Relational operators |");
        System.out.println("========================");

        //greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        //greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        //less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        //less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        //equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        //not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("=====================");
        System.out.println("| Logical operators |");
        System.out.println("=====================");

        //logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        //bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));
        //logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
        //bitwise logical OR
        System.out.printf("(%d >= %d) | (%d > 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
        //logical XOR
        System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        //logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));


        System.out.println("=====================");
        System.out.println("| Another operators |");
        System.out.println("=====================");

        System.out.println("Ternany operator :");
        //ternary operator
        System.out.printf("%d > %d ? %d : %d  -->  %d\n\n", a, b, a, b, (a > b ? a : b));

        System.out.println("Type cast operator :");

        int integ = 1;
        short sh = -32000;
        char ch = '\u0002';
        long L = 1000000000000000000L;
        float fl = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        String str1 = "123";
        String str2 = "string";
        Student student = new Student("Vladislav", 9);

        c = (byte) integ;
        System.out.printf("byte = (byte)int : c = %d ->> c = %d\n", integ, c);
        c = (byte) sh;
        System.out.printf("byte = (byte)short : c = %d ->> c = %d\n", sh, c);
        c = (byte) ch;
        System.out.printf("byte = (byte)char : c = '%c' ->> c = %d\n", ch, c);
        c = (byte) L;
        System.out.printf("byte = (byte)long : c = (byte)%d ->> c = %d\n", L, c);
        c = (byte) fl;
        System.out.printf("byte = (byte)float : c = (byte)%f ->> c = %d\n", fl, c);
        c = (byte) d;
        System.out.printf("byte= (byte)double : c = (byte)%f ->> c = %d\n", d, c);
        //c = (byte)bool;
        System.out.printf("byte= boolean : c = (byte)%b ->> Compile Error\n", bool);

        c = Byte.parseByte(str1);
        System.out.printf("byte = String : c = Byte.parseByte(%s) ->> c = %d\n", str1, c);
        //c = Byte.parseByte(str2);
        System.out.printf("byte = String : c = Byte.parseByte(%s) ->> Compile Error\n", str2);
        //c = (byte)str1;
        System.out.printf("byte = String : c = (byte)%s ->> Compile Error\n", str1);
        //c = (byte)str2;
        System.out.printf("byte = String : c = (byte)%s ->> Compile Error\n", str2);

        //c = (byte)student;
        System.out.printf("byte = Student : c = " + student.toString() + " ->> Compile Error\n");


    }

    public static void testShort() {
        System.out.println("\n ************** TEST FOR SHORT****************\n");
        short a = 23003, b = 150, c;
        System.out.println("===========================");
        System.out.println("| Arithmetical operators |");
        System.out.println("===========================");

        //addition
        c = (short) (a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);

        //subtraction
        c = (short) (a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);

        //multiplication
        c = (short) (a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);

        //division
        c = (short) (a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);

        //modulus
        c = (short) (a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);

        try {
            c = (short) (a / 0);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
        try {
            c = (short) (a % 0);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }

        //unary minus
        a = (short) 523222342;
        c = (short) -a;
        System.out.printf("-%d = %d\n", a, c);

        //unary plus
        c = (short) +a;
        System.out.printf("+%d = %d\n", a, c);

        //prefix increment
        a = (short) 523423;
        System.out.printf("++%d = %d\n", a, ++a);

        //postfix increment
        a = (short) 53423;
        System.out.printf("%d++ = %d\n", a, a++);

        //prefix decrement
        a = (short) 525234;
        System.out.printf("--%d = %d\n", a, --a);

        //postfix decrement
        a = -3222;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("======================");
        System.out.println("| Bitwise operators |");
        System.out.println("======================");

        // bitwise AND
        a = (short) 7967575;
        c = (short) (a & b);
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        // bitwise OR
        c = (short) (a | b);
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise XOR
        c = (short) (a ^ b);
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise unary compliment
        c = (short) ~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        //left shift
        c = (short) (a << 1);
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        //right shift
        c = (short) (a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        // right shift with negative number
        a = (short) -57999;
        c = (short) (a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        // zero fill right shift
        a = 9999;
        c = (short) (a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        // zero fill right shift with negative number
        a = (short) -424325;
        c = (short) (a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));


        System.out.println("========================");
        System.out.println("| Assignment operators |");
        System.out.println("========================");

        c = (short) 736655;
        a = 5456;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);

        System.out.println("========================");
        System.out.println("| Relational operators |");
        System.out.println("========================");

        //greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        //greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        //less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        //less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        //equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        //not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("=====================");
        System.out.println("| Logical operators |");
        System.out.println("=====================");

        //logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        //bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));
        //logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
        //bitwise logical OR
        System.out.printf("(%d >= %d) | (%d > 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
        //logical XOR
        System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        //logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));


        System.out.println("=====================");
        System.out.println("| Another operators |");
        System.out.println("=====================");

        System.out.println("Ternany operator :");
        //ternary operator
        System.out.printf("%d > %d ? %d : %d  -->  %d\n\n", a, b, a, b, (a > b ? a : b));

        System.out.println("Type cast operator :");

        byte bt = 1;
        int inter = 645654;
        char ch = '\u0003';
        long L = 1000000000000000000L;
        float fl = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        String str1 = "123";
        String str2 = "string";
        Student student = new Student("Vladislav", 9);

        c = bt;
        System.out.printf("int = byte : c = %d ->> c = %d\n", bt, c);
        c = (short) inter;
        System.out.printf("short = int : c = %d ->> c = %d\n", inter, c);
        c = (short) ch;
        System.out.printf("short = char : c = '%c' ->> c = %d\n", ch, c);
        c = (short) L;
        System.out.printf("short = long : c = (short)%d ->> c = %d\n", L, c);
        c = (short) fl;
        System.out.printf("short = float : c = (short)%f ->> c = %d\n", fl, c);
        c = (short) d;
        System.out.printf("short = double : c = (short)%f ->> c = %d\n", d, c);
        //c = (short)bool;
        System.out.printf("short = boolean : c = (short)%b ->> Compile Error\n", bool);

        c = Short.parseShort(str1);
        System.out.printf("short = String : c = Short.parseShort(%s) ->> c = %d\n", str1, c);
        try {
            c = Short.parseShort(str2);
        } catch (NumberFormatException e) {
            System.out.println(e.toString()); // java.lang.NumberFormatException: For input string: "string"
        }
        System.out.printf("short = String : c = Short.parseShort(%s) ->> Compile Error\n", str2);
        //c = str1;
        System.out.printf("short = String : c = (short)%s ->> Compile Error\n", str1);
        // c = (short)str2;
        System.out.printf("short = String : c = (short)%s ->> Compile Error\n", str2);

        // c = (short)student;
        System.out.printf("int = Student : c = " + student.toString() + " ->> Compile Error\n");


    }

    public static void testLong() {
        System.out.println("\n ************** TEST FOR LONG****************\n");
        long a = 23002342343232423L, b = 23423523L, c;
        System.out.println("===========================");
        System.out.println("| Arithmetical operators |");
        System.out.println("===========================");

        //addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);

        //subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);

        //multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);

        //division
        c = (a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);

        //modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);

        try {
            c = a / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
        try {
            c = a % 0;
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }

        //unary minus
        a = 52322234453452L;
        c = -a;
        System.out.printf("-%d = %d\n", a, c);

        //unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);

        //prefix increment
        a = 32423523423L;
        System.out.printf("++%d = %d\n", a, ++a);

        //postfix increment
        a = 534236545643L;
        System.out.printf("%d++ = %d\n", a, a++);

        //prefix decrement
        a = 32423525234L;
        System.out.printf("--%d = %d\n", a, --a);

        //postfix decrement
        a = -3225453452L;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("======================");
        System.out.println("| Bitwise operators |");
        System.out.println("======================");

        // bitwise AND
        a = 23427967575L;
        c = (a & b);
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));

        // bitwise OR
        c = (a | b);
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));

        //bitwise XOR
        c = (a ^ b);
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));

        //bitwise unary compliment
        c = ~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n\n", Long.toBinaryString(a),
                Long.toBinaryString(c));

        //left shift
        c = (a << 1);
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n\n", Long.toBinaryString(a),
                Long.toBinaryString(c));

        //right shift
        c = (a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n\n", Long.toBinaryString(a),
                Long.toBinaryString(c));

        // right shift with negative number
        a = -3_572_342_992_349L;
        c = (a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n\n", Long.toBinaryString(a),
                Long.toBinaryString(c));

        // zero fill right shift
        a = 999999999999999999L;
        c = (a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));
        // zero fill right shift with negative number
        a = -424332423425L;
        c = (a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));


        System.out.println("========================");
        System.out.println("| Assignment operators |");
        System.out.println("========================");

        c = 234234736655L;
        a = 52342456L;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);

        System.out.println("========================");
        System.out.println("| Relational operators |");
        System.out.println("========================");

        //greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        //greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        //less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        //less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        //equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        //not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("=====================");
        System.out.println("| Logical operators |");
        System.out.println("=====================");

        //logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        //bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));
        //logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
        //bitwise logical OR
        System.out.printf("(%d >= %d) | (%d > 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
        //logical XOR
        System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        //logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));


        System.out.println("=====================");
        System.out.println("| Another operators |");
        System.out.println("=====================");

        System.out.println("Ternany operator :");
        //ternary operator
        System.out.printf("%d > %d ? %d : %d  -->  %d\n\n", a, b, a, b, (a > b ? a : b));

        System.out.println("Type cast operator :");

        byte bt = 1;
        int inter = 645654;
        char ch = '\u0003';
        short sh = -3252;
        float fl = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        String str1 = "123";
        String str2 = "string";
        Student student = new Student("Vladislav", 9);

        c = bt;
        System.out.printf("long = byte : c = %d ->> c = %d\n", bt, c);
        c = inter;
        System.out.printf("long = int : c = %d ->> c = %d\n", inter, c);
        c = ch;
        System.out.printf("long = char : c = '%c' ->> c = %d\n", ch, c);
        c = sh;
        System.out.printf("long = short : c = %d ->> c = %d\n", sh, c);
        c = (long) fl;
        System.out.printf("long = float : c = (long)%f ->> c = %d\n", fl, c);
        c = (long) d;
        System.out.printf("long = double : c = (long)%f ->> c = %d\n", d, c);
        //c = (short)bool;
        System.out.printf("long = boolean : c = (long)%b ->> Compile Error\n", bool);

        c = Long.parseLong(str1);
        System.out.printf("long = String : c = Long.parseLong(%s) ->> c = %d\n", str1, c);
        try {
            c = Long.parseLong(str2);
        } catch (NumberFormatException e) {
            System.out.println(e.toString()); // java.lang.NumberFormatException: For input string: "string"
        }
        System.out.printf("long = String : c = Long.parseLong(%s) ->> Compile Error\n", str2);
        //c = str1;
        System.out.printf("long = String : c = (long)%s ->> Compile Error\n", str1);
        // c = (long)str2;
        System.out.printf("long = String : c = (long)%s ->> Compile Error\n", str2);

        // c = (long)student;
        System.out.printf("long = Student : c = " + student.toString() + " ->> Compile Error\n");

    }

    public static void testFloat() {
        System.out.println("\n ************** TEST FOR FLOAT****************\n");
        float a = 324.12f, b = 12.3f, c;
        System.out.println("===========================");
        System.out.println("| Arithmetical operators |");
        System.out.println("===========================");

        //addition
        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);

        //subtraction
        c = a - b;
        System.out.printf("%f - %f= %f\n", a, b, c);

        //multiplication
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);

        //division
        c = (a / b);
        System.out.printf("%f / %f = %f\n", a, b, c);

        //modulus
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);

        c = a / 0;
        System.out.printf("%f = %f / 0 ", c, a);

        //unary minus
        a = 435.5f;
        c = -a;
        System.out.printf("-%f = %f\n", a, c);

        //unary plus
        c = +a;
        System.out.printf("+%f = %f\n", a, c);

        //prefix increment
        a = 435.f;
        System.out.printf("++%f = %f\n", a, ++a);

        //postfix increment
        a = 543.654f;
        System.out.printf("%f++ = %f\n", a, a++);

        //prefix decrement
        a = 435.6f;
        System.out.printf("--%f = %f\n", a, --a);

        //postfix decrement
        a = -823.2f;
        System.out.printf("%f-- = %f\n", a, a--);

        System.out.println("======================");
        System.out.println("| Bitwise operators |");
        System.out.println("======================");


        System.out.println("There is no any bitwise operators for float\n");

//        // bitwise AND
//        a =  345.1f;
//        c = (a & b);
//        System.out.printf("%f & %f = %f\n", a, b, c);
//
//        // bitwise OR
//        c =  (a | b);
//        System.out.printf("%f | %f = %f\n", a, b, c);
//
//
//        //bitwise XOR
//        c = (a ^ b);
//        System.out.printf("%f ^ %f = %f\n", a, b, c);
//
//
//        //bitwise unary compliment
//        c = ~a;
//        System.out.printf("~%f = %f\n", a, c);
//
//
//        //left shift
//        c =  (a << 1);
//        System.out.printf("%f << 1 = %f\n", a, c);
//
//
//        //right shift
//        c =  (a >> 1);
//        System.out.printf("%f >> 1 = %f\n", a, c);
//
//        // right shift with negative number
//        a =  -3_572_342_992_349L;
//        c =  (a >> 1);
//        System.out.printf("%f >> 1 = %f\n", a, c);
//
//
//        // zero fill right shift
//        a = 999999999999999999L;
//        c =  (a >>> 1);
//        System.out.printf("%f >>> 1 = %f\n", a, c);
//
//        // zero fill right shift with negative number
//        a =  -424332423425L;
//        c = (a >>> 1);
//        System.out.printf("%f >>> 1 = %f\n", a, c);


        System.out.println("========================");
        System.out.println("| Assignment operators |");
        System.out.println("========================");

        c = 31.5f;
        a = 52.4f;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("f/= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);
//        System.out.printf("%f |= %f --> c = %f\n", c, a, c |= a);
//        System.out.printf("%f &= %f --> c = %f\n", c, a, c &= a);
//        System.out.printf("%d >>= 1 --> c = %f\n", c, c >>= 1);
//        System.out.printf("%d <<= 1 --> c = %f\n", c, c <<= 1);
//        System.out.printf("%d >>>= 1 --> c = %f\n", c, c >>>= 1);
//        System.out.printf("%d ^= %d --> c = %f\n", c, a, c ^= a);

        System.out.println("========================");
        System.out.println("| Relational operators |");
        System.out.println("========================");

        //greater than
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        //greater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        //less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        //less than or equal to
        System.out.printf("%f <= %f %b\n", a, b, a <= b);
        //equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        //not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);

        System.out.println("=====================");
        System.out.println("| Logical operators |");
        System.out.println("=====================");

        //logical AND                                        s
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        //bitwise logical AND
        System.out.printf("(%f > %f & (%f > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));
        //logical OR
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
        //bitwise logical OR
        System.out.printf("(%f >= %f) | (%f > 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
        //logical XOR
        System.out.printf("(%f >= %f) ^ (%f != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        //logical NOT
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));


        System.out.println("=====================");
        System.out.println("| Another operators |");
        System.out.println("=====================");

        System.out.println("Ternany operator :");
        //ternary operator
        System.out.printf("%f > %f ? %f : %f  -->  %f\n\n", a, b, a, b, (a > b ? a : b));

        System.out.println("Type cast operator :");

        byte bt = 1;
        int inter = 645654;
        char ch = '\u0003';
        short sh = -3252;
        long lng = 155345345345L;
        double d = 123456789.625;
        boolean bool = true;
        String str1 = "123";
        String str2 = "string";
        Student student = new Student("Vladislav", 9);

        c = bt;
        System.out.printf("float = byte : c = %d ->> c = %f\n", bt, c);
        c = inter;
        System.out.printf("float = int : c = %d ->> c = %f\n", inter, c);
        c = ch;
        System.out.printf("float = char : c = '%c' ->> c = %f\n", ch, c);
        c = sh;
        System.out.printf("float = short : c = %d ->> c = %f\n", sh, c);
        c = lng;
        System.out.printf("float = long : c = %d ->> c = %f\n", lng, c);
        c = (float) d;
        System.out.printf("float = double : c = (float)%f ->> c = %f\n", d, c);
        //c = (float)bool;
        System.out.printf("long = boolean : c = (float)%b ->> Compile Error\n", bool);

        c = Float.parseFloat(str1);
        System.out.printf("long = String : c = Float.parseFloat(%s) ->> c = %f\n", str1, c);
        try {
            c = Float.parseFloat(str2);
        } catch (NumberFormatException e) {
            System.out.println(e.toString()); // java.lang.NumberFormatException: For input string: "string"
        }
        System.out.printf("float = String : c = Float.parseFloat(%s) ->> Compile Error\n", str2);
        //c = str1;
        System.out.printf("float = String : c = (float)%s ->> Compile Error\n", str1);
        // c = (float)str2;
        System.out.printf("float = String : c = (float)%s ->> Compile Error\n", str2);

        // c = (float)student;
        System.out.printf("float = Student : c = " + student.toString() + " ->> Compile Error\n");
    }

    public static void testDouble() {
        System.out.println("\n ************** TEST FOR DOUBLE****************\n");
        double a = 324.12, b = 12.3, c;
        System.out.println("===========================");
        System.out.println("| Arithmetical operators |");
        System.out.println("===========================");

        //addition
        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);

        //subtraction
        c = a - b;
        System.out.printf("%f - %f= %f\n", a, b, c);

        //multiplication
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);

        //division
        c = (a / b);
        System.out.printf("%f / %f = %f\n", a, b, c);

        //modulus
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);

        c = a / 0;
        System.out.printf("c = %f / 0 = %f \n", a, c);

        //unary minus
        a = 435.5;
        c = -a;
        System.out.printf("-%f = %f\n", a, c);

        //unary plus
        c = +a;
        System.out.printf("+%f = %f\n", a, c);

        //prefix increment
        a = 435.2;
        System.out.printf("++%f = %f\n", a, ++a);

        //postfix increment
        a = 543.654;
        System.out.printf("%f++ = %f\n", a, a++);

        //prefix decrement
        a = 435.6;
        System.out.printf("--%f = %f\n", a, --a);

        //postfix decrement
        a = -823.2;
        System.out.printf("%f-- = %f\n", a, a--);

        System.out.println("======================");
        System.out.println("| Bitwise operators |");
        System.out.println("======================");

        System.out.println("There is no any bitwise operators for double\n");
//        // bitwise AND
//        a =  345.1f;
//        c = (a & b);
//        System.out.printf("%f & %f = %f\n", a, b, c);
//
//        // bitwise OR
//        c =  (a | b);
//        System.out.printf("%f | %f = %f\n", a, b, c);
//
//
//        //bitwise XOR
//        c = (a ^ b);
//        System.out.printf("%f ^ %f = %f\n", a, b, c);
//
//
//        //bitwise unary compliment
//        c = ~a;
//        System.out.printf("~%f = %f\n", a, c);
//
//
//        //left shift
//        c =  (a << 1);
//        System.out.printf("%f << 1 = %f\n", a, c);
//
//
//        //right shift
//        c =  (a >> 1);
//        System.out.printf("%f >> 1 = %f\n", a, c);
//
//        // right shift with negative number
//        a =  -3_572_342_992_349L;
//        c =  (a >> 1);
//        System.out.printf("%f >> 1 = %f\n", a, c);
//
//
//        // zero fill right shift
//        a = 999999999999999999L;
//        c =  (a >>> 1);
//        System.out.printf("%f >>> 1 = %f\n", a, c);
//
//        // zero fill right shift with negative number
//        a =  -424332423425L;
//        c = (a >>> 1);
//        System.out.printf("%f >>> 1 = %f\n", a, c);


        System.out.println("========================");
        System.out.println("| Assignment operators |");
        System.out.println("========================");

        c = 31.5;
        a = 52.4;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("f/= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);
//        System.out.printf("%f |= %f --> c = %f\n", c, a, c |= a);
//        System.out.printf("%f &= %f --> c = %f\n", c, a, c &= a);
//        System.out.printf("%d >>= 1 --> c = %f\n", c, c >>= 1);
//        System.out.printf("%d <<= 1 --> c = %f\n", c, c <<= 1);
//        System.out.printf("%d >>>= 1 --> c = %f\n", c, c >>>= 1);
//        System.out.printf("%d ^= %d --> c = %f\n", c, a, c ^= a);

        System.out.println("========================");
        System.out.println("| Relational operators |");
        System.out.println("========================");

        //greater than
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        //greater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        //less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        //less than or equal to
        System.out.printf("%f <= %f %b\n", a, b, a <= b);
        //equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        //not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);

        System.out.println("=====================");
        System.out.println("| Logical operators |");
        System.out.println("=====================");

        //logical AND                                        s
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        //bitwise logical AND
        System.out.printf("(%f > %f & (%f > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));
        //logical OR
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
        //bitwise logical OR
        System.out.printf("(%f >= %f) | (%f > 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
        //logical XOR
        System.out.printf("(%f >= %f) ^ (%f != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        //logical NOT
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));


        System.out.println("=====================");
        System.out.println("| Another operators |");
        System.out.println("=====================");

        System.out.println("Ternany operator :");
        //ternary operator
        System.out.printf("%f > %f ? %f : %f  -->  %f\n\n", a, b, a, b, (a > b ? a : b));

        System.out.println("Type cast operator :");

        byte bt = 1;
        int inter = 645654;
        char ch = '\u0003';
        short sh = -3252;
        long lng = 155345345345L;
        float d = 54789.625f;
        boolean bool = true;
        String str1 = "123";
        String str2 = "string";
        Student student = new Student("Vladislav", 9);

        c = bt;
        System.out.printf("double = byte : c = %d ->> c = %f\n", bt, c);
        c = inter;
        System.out.printf("double = int : c = %d ->> c = %f\n", inter, c);
        c = ch;
        System.out.printf("double = char : c = '%c' ->> c = %f\n", ch, c);
        c = sh;
        System.out.printf("double = short : c = %d ->> c = %f\n", sh, c);
        c = lng;
        System.out.printf("double = long : c = %d ->> c = %f\n", lng, c);
        c = d;
        System.out.printf("double = float : c = %f ->> c = %f\n", d, c);
        //c = (double)bool;
        System.out.printf("double = boolean : c = (float)%b ->> Compile Error\n", bool);

        c = Double.parseDouble(str1);
        System.out.printf("double = String : c = Double.parseDouble(%s) ->> c = %f\n", str1, c);
        try {
            c = Double.parseDouble(str2);
        } catch (NumberFormatException e) {
            System.out.println(e.toString()); // java.lang.NumberFormatException: For input string: "string"
        }
        System.out.printf("double = String : c = Double.parseDouble(%s) ->> Compile Error\n", str2);
        //c = str1;
        System.out.printf("double = String : c = (double)%s ->> Compile Error\n", str1);
        // c = (double)str2;
        System.out.printf("double = String : c = (double)%s ->> Compile Error\n", str2);

        // c = (double)student;
        System.out.printf("double = Student : c = " + student.toString() + " ->> Compile Error\n");
    }

    public static void testChar() {
        System.out.println("\n ************** TEST FOR CHAR****************\n");
        char a = '5';
        char b = '2';
        char c;
        System.out.println("===========================");
        System.out.println("| Arithmetical operators |");
        System.out.println("===========================");

        //addition
        c = (char) (a + b);
        System.out.printf("%c + %c = %c\n", a, b, c);

        //subtraction
        c = (char) (a - b);
        System.out.printf("%c - %c = %c\n", a, b, c);

        //multiplication
        c = (char) (a * b);
        System.out.printf("%c * %c = %c\n", a, b, c);

        //division
        c = (char) (a / b);
        System.out.printf("%c / %c = %c\n", a, b, c);

        //modulus
        c = (char) (a % b);
        System.out.printf("%c %% %c = %c\n", a, b, c);
        try {
            c = (char) (a / 0);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
        try {
            c = (char) (a % 0);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }

        //unary minus
        a = 5;
        c = (char) -a;
        System.out.printf("-%c = %c\n", a, c);

        //unary plus
        c = (char) +a;
        System.out.printf("+%c = %c\n", a, c);

        //prefix increment
        a = 5;
        System.out.printf("++%c = %c\n", a, ++a);

        //postfix increment
        a = '6';
        System.out.printf("%c++ = %c\n", a, a++);

        //prefix decrement
        a = '4';
        System.out.printf("--%c = %c\n", a, --a);

        //postfix decrement
        a = '4';
        System.out.printf("%c-- = %c\n", a, a--);

        System.out.println("======================");
        System.out.println("| Bitwise operators |");
        System.out.println("======================");

        // bitwise AND
        a = '9';
        c = (char) (a & b);
        System.out.printf("%c & %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        // bitwise OR
        c = (char) (a | b);
        System.out.printf("%c | %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise XOR
        c = (char) (a ^ b);
        System.out.printf("%c ^ %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise unary compliment
        c = (char) ~a;
        System.out.printf("~%c = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        //left shift
        c = (char) (a << 3);
        System.out.printf("%c << 3 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 3 = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        //right shift
        c = (char) (a >> 2);
        System.out.printf("%c >> 2 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 2 = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));


        // zero fill right shift
        a = '6';
        c = (char) (a >>> 2);
        System.out.printf("%c >>> 2 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 2 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        // zero fill right shift with negative number
        a = '9';
        c = (char) (a >>> 1);
        System.out.printf("%c >>> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));


        System.out.println("========================");
        System.out.println("| Assignment operators |");
        System.out.println("========================");

        c = '7';
        a = '5';
        System.out.printf("%c += %c --> c = %c\n", c, a, c += a);
        System.out.printf("%c -= %c --> c = %c\n", c, a, c -= a);
        System.out.printf("%c *= %c --> c = %c\n", c, a, c *= a);
        System.out.printf("%c /= %c --> c = %c\n", c, a, c /= a);
        System.out.printf("%c %%= %c --> c = %c\n", c, a, c %= a);
        System.out.printf("%c |= %c --> c = %c\n", c, a, c |= a);
        System.out.printf("%c &= %c --> c = %c\n", c, a, c &= a);
        System.out.printf("%c >>= 1 --> c = %c\n", c, c >>= 1);
        System.out.printf("%c <<= 1 --> c = %c\n", c, c <<= 1);
        System.out.printf("%c >>>= 1 --> c = %c\n", c, c >>>= 1);
        System.out.printf("%c ^= %c --> c = %c\n", c, a, c ^= a);

        System.out.println("========================");
        System.out.println("| Relational operators |");
        System.out.println("========================");

        //greater than
        System.out.printf("%c > %c --> %b\n", a, b, a > b);
        //greater than or equal to
        System.out.printf("%c >= %c --> %b\n", a, b, a >= b);
        //less than
        System.out.printf("%c < %c --> %b\n", a, b, a < b);
        //less than or equal to
        System.out.printf("%c <= %c --> %b\n", a, b, a <= b);
        //equal to
        System.out.printf("%c == %c --> %b\n", a, b, a == b);
        //not equal to
        System.out.printf("%c != %c --> %b\n", a, b, a != b);

        System.out.println("=====================");
        System.out.println("| Logical operators |");
        System.out.println("=====================");

        //logical AND
        System.out.printf("(%c > %c) && (%c > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        //bitwise logical AND
        System.out.printf("(%c > %c) & (%c > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));
        //logical OR
        System.out.printf("(%c >= %c) || (%c != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
        //bitwise logical OR
        System.out.printf("(%c >= %c) | (%c > 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
        //logical XOR
        System.out.printf("(%c >= %c) ^ (%c != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        //logical NOT
        System.out.printf("!(%c >= %c) --> %b\n", a, b, !(a >= b));


        System.out.println("=====================");
        System.out.println("| Another operators |");
        System.out.println("=====================");

        System.out.println("Ternany operator :");
        //ternary operator
        System.out.printf("%c > %c ? %c : %c  -->  %c\n\n", a, b, a, b, (a > b ? a : b));

        System.out.println("Type cast operator :");

        byte bt = 1;
        short sh = -129;
        int integ = 45345;
        long L = 1000000L;
        float fl = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        String str1 = "123";
        String str2 = "string";
        Student student = new Student("Vladislav", 9);

        c = (char) bt;
        System.out.printf("char = byte : c = (char)%d ->> c = %c\n", bt, c);
        c = (char) sh;
        System.out.printf("char = short : c = (char)%d ->> c = %c\n", sh, c);
        c = (char) integ;
        System.out.printf("char = int : c = (char)%d ->> c = %c\n", integ, c);
        c = (char) L;
        System.out.printf("char = long : c = (chat)%d ->> c = %c\n", L, c);
        c = (char) fl;
        System.out.printf("char = float : c = (char)%f ->> c = %c\n", fl, c);
        c = (char) d;
        System.out.printf("char = double : c = (char)%f ->> c = %c\n", d, c);
        //c = (char)bool;
        System.out.printf("char = boolean : c = (char)%b ->> Compile Error\n", bool);

        // c = (char)str1;
        System.out.printf("char = String : c = (char)%s ->> Compile Error\n", str1);
        //c = (char)str2;
        System.out.printf("char = String : c = (char)%s ->> Compile Error\n", str2);

        //c = (char)student;
        System.out.printf("char = Student : c = " + student.toString() + " ->> Compile Error\n");


    }

    public static void testString() {
        System.out.println("\n ************** TEST FOR STRING****************\n");
        String a = new String("Java");
        String b = new String("WEB");
        String c;

        System.out.println("===========================");
        System.out.println("| Arithmetical operators |");
        System.out.println("===========================");

        //addition
        c = a + b;
        System.out.printf("%s + %s = %s\n", a, b, c);
        //subtraction
        // c =  (a - b);
        //multiplication
        //c =  (a * b);
        //division
        //   c =  (a / b);
        //modulus
        //  c =  (a % b);
        //unary minus
//        c =  -a;
//
//        //unary plus
//        c = +a;
//
//        //prefix increment
//        ++a ;
//
//        //postfix increment
//        a ++;
//        //prefix decrement
//        --a;
//        //postfix decrement
//        a--;
//
        System.out.println("======================");
        System.out.println("| Bitwise operators |");
        System.out.println("======================");

        System.out.println("There is no any bitwise operators for String");


        System.out.println("========================");
        System.out.println("| Assignment operators |");
        System.out.println("========================");

        c = "Java-Web Development";

        System.out.printf("%s += %s --> c = %s\n", c, a, c += a);
//

        System.out.println("========================");
        System.out.println("| Relational operators |");
        System.out.println("========================");


        //equals to
        System.out.printf("%s == %s --> %b\n", a, b, a == b);
        //not equal to
        System.out.printf("%s!= %s --> %b\n", a, b, a != b);

        System.out.println("=====================");
        System.out.println("| Logical operators |");
        System.out.println("=====================");

        System.out.println("there is no any logical operators for String");

        System.out.println("=====================");
        System.out.println("| Another operators |");
        System.out.println("=====================");

        System.out.println("Ternany operator :");
        //ternary operator
        System.out.printf("%s == %s ? %s : %s  -->  %s\n\n", a, b, a, b, (a == b ? a : b));

        System.out.println("Type cast operator :");

        char ch = '\u0002';
        byte bt = 1;
        short sh = -129;
        int integ = 45345;
        long L = 1000000L;
        float fl = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        String str1 = "123";
        String str2 = "string";
        Student student = new Student("Vladislav", 9);

//       c = (String)ch;
//       c = (String)bt;
//       c = (String)sh;
//       c = (String)integ;
//       c = (String)L;
//       c = (String)fl;
//       c = (String)d;
//       c = (String)bool;
        //c = (String)student;


        System.out.println("========================");
        System.out.println("| Instanceof operators |");
        System.out.println("========================");

        String str = "Java is the BEST!";
        System.out.printf("%s instanceof String ==> %b", str, str instanceof String);
    }

    public static void testStudent() {
        System.out.println("\n ************** TEST FOR STUDENT****************\n");

        Student s1 = new Student("Ivan", 10);
        Student s2 = new Student("Dimitry", 8);
        Student s3;

        System.out.println("========================");
        System.out.println("| Arithmetical operators |");
        System.out.println("========================");

        System.out.println("There is no arithmetical operators for Student");
//        s3 = s1 + s2;
//        s3 = s1 - s2;
//        s3 = s1 * s2;
//        s3 = s1 / s2;
//        s3 = s1 % s2;
//        s3 = s1++;
//        s3 = s1--;
//        s3 = ++s1;
//        s3 = --s1;
//        s3 = -s1;
//        s3 = +s1;

        System.out.println("========================");
        System.out.println("| Bitwise operators |");
        System.out.println("========================");

        System.out.println("There is no bitwise operators for Student");
//        s3 = s1 & s2;
//        s3 = s1 | s2;
//        s3 = s1 ^ s2;
//        s3 = s1 >> 1;
//        s3 = s2 << 2;
//        s3 = ~s2;
//        s3 = s1>>>3;
//

        System.out.println("========================");
        System.out.println("| Assignment operators |");
        System.out.println("========================");

//        System.out.println("There is no assignment operators for Student");
//        s3+=s1;
//        s3-=s2;
//        s3*=s1;
//        s3/=s2;
//        s3%=s1;
//        s3|=s2;
//        s3&=s1;
//        s3^=s2;
//        s3>>=s1;
//        s3<<=s2;
//        s3>>>=s1;

        System.out.println("========================");
        System.out.println("| Relational operators |");
        System.out.println("========================");

//        s1>s2;
//        s1<s2;
//        s1>=s2;
//        s1<=s2;

        System.out.printf("%s == %s ? %s : %s \n\n", s1, s2,s1,s2, (s1 == s2 ? s1 : s2));

        System.out.println("Type cast operators :");

//        char ch = '\u0002';
//        byte bt = 1;
//        short sh = -129;
//        int integ = 45345;
//        long L = 1000000L;
//        float fl = 1.9f;
//        double d = 123456789.625;
//        boolean bool = true;
//        String str1 = "123";
//

//        s3 = (Student) ch;
//        s3 = (Student) bt;
//        s3 = (Student) sh;
//        s3 = (Student) integ;
//        s3 = (Student) L;
//        s3 = (Student) fl;
//        s3 = (Student) d;
//        s3 = (Student) bool;
//        s3 = (Student) str1;


        System.out.println("========================");
        System.out.println("| Instanceof operator |");
        System.out.println("========================");

        System.out.printf("%s instanceof Object ==> %b\n",s1,s1 instanceof Object);
        System.out.printf("%s instanceof Student==> %b\n",s1,s1 instanceof Student);
    }

}

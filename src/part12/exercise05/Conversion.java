package part12.exercise05;

import java.math.*;
import java.util.*;

/**
 * Exercise 5:   (5) For each of the basic conversion types in the above table, 
 * write the most complex formatting expression possible. That is, use all the 
 * possible format specifiers available for that conversion type. 
 * @author kopan.dmytro
 *
 */
public class Conversion {
  public static void main(String[] args) {
    Formatter f = new Formatter(System.out);

    char u = 'a';
    System.out.println("u = 'a'");
    f.format("s: %1$1s\n", u);
    // f.format("d: %d\n", u);
    f.format("c: %1$5c\n", u);
    f.format("b: %1$10b\n", u);
    // f.format("f: %f\n", u);
    // f.format("e: %e\n", u);
    // f.format("x: %x\n", u);
    f.format("h: %1$5h\n", u);

    int v = 121;
    System.out.println("v = 121");
    f.format("d: %1$5d\n", v);
    f.format("c: %1$5c\n", v);
    f.format("b: %1$5b\n", v);
    f.format("s: %1$5s\n", v);
    // f.format("f: %f\n", v);
    // f.format("e: %e\n", v);
    f.format("x: %x\n", v);
    f.format("h: %h\n", v);

    BigInteger w = new BigInteger("50000000000000");
    System.out.println(
      "w = new BigInteger(\"50000000000000\")");
    f.format("d: %1$5d\n", w);
    // f.format("c: %c\n", w);
    f.format("b: %1$5b\n", w);
    f.format("s: %1$5s\n", w);
    // f.format("f: %f\n", w);
    // f.format("e: %e\n", w);
    f.format("x: %1$5x\n", w);
    f.format("h: %1$5h\n", w);

    double x = 179.543;
    System.out.println("x = 179.543");
    // f.format("d: %d\n", x);
    // f.format("c: %c\n", x);
    f.format("b: %1$5.2b\n", x);
    f.format("s: %1$5.2s\n", x);
    f.format("f: %1$5.2f\n", x);
    f.format("e: %1$5.2e\n", x);
    // f.format("x: %x\n", x);
    f.format("h: %1$5.2h\n", x);

    Conversion y = new Conversion();
    System.out.println("y = new Conversion()");
    // f.format("d: %d\n", y);
    // f.format("c: %c\n", y);
    f.format("b: %1$5b\n", y);
    f.format("s: %1$5s\n", y);
    // f.format("f: %f\n", y);
    // f.format("e: %e\n", y);
    // f.format("x: %x\n", y);
    f.format("h: %1$5h\n", y);

    boolean z = false;
    System.out.println("z = false");
    // f.format("d: %d\n", z);
    // f.format("c: %c\n", z);
    f.format("b: %b\n", z);
    f.format("s: %s\n", z);
    // f.format("f: %f\n", z);
    // f.format("e: %e\n", z);
    // f.format("x: %x\n", z);
    f.format("h: %h\n", z);
  }
} /* Output: (Sample)
u = 'a'
s: a
c: a
b: true
h: 61
v = 121
d: 121
c: y
b: true
s: 121
x: 79
h: 79
w = new BigInteger("50000000000000")
d: 50000000000000
b: true
s: 50000000000000
x: 2d79883d2000
h: 8842a1a7
x = 179.543
b: true
s: 179.543
f: 179.543000
e: 1.795430e+02
h: 1ef462c
y = new Conversion()
b: true
s: Conversion@9cab16
h: 9cab16
z = false
b: false
s: false
h: 4d5
*///:~

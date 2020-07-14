package part08;

/**
 * Exercise 13:   (2) Create an interface, and inherit two new interfaces from 
 * that interface. Multiply inherit a third interface from the second two.
 * @author kopan.dmytro
 *
 */
public interface Exercise13 {

}

interface NewInterface1 extends Exercise13{}

interface NewInterface2 extends Exercise13{}

interface NewInterface3 extends NewInterface1,NewInterface2{}

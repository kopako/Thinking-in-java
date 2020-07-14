package  part10.exercise05;

/**
 * Exercise 5:   (3) Modify ListFeatures.java so that it uses Integers 
 * (remember autoboxing!) instead of Pets, and explain any difference in results.
 */
import java.util.*;

import typeinfo.pets.*;

import static net.mindview.util.Print.*;

public class ListFeatures05 {
  public static void main(String[] args) {
    Random rand = new Random(47);
    List<Integer> pets = new ArrayList<>();
    Collections.addAll(pets,7,6,5,4,3,2,1);
    print("1: " + pets);
    Integer h = 8;
    pets.add(h); // Automatically resizes
    print("2: " + pets);
    print("3: " + pets.contains(h));
    pets.remove(h); // Remove by object
    Integer p = pets.get(2);
    print("4: " +  p + " " + pets.indexOf(p));
    Integer cymric = 9;
    print("5: " + pets.indexOf(cymric));
    print("6: " + pets.remove(cymric));
    // Must be the exact object:
    print("7: " + pets.remove(p));
    print("8: " + pets);
    pets.add(3, 10); // Insert at an index
    print("9: " + pets);
    List<Integer> sub = pets.subList(1, 4);
    print("subList: " + sub);
    print("10: " + pets.containsAll(sub));
    Collections.sort(sub); // In-place sort
    print("sorted subList: " + sub);
    // Order is not important in containsAll():
    print("11: " + pets.containsAll(sub));
    Collections.shuffle(sub, rand); // Mix it up
    print("shuffled subList: " + sub);
    print("12: " + pets.containsAll(sub));
    List<Integer> copy = new ArrayList<Integer>(pets);
    sub = Arrays.asList(pets.get(1), pets.get(4));
    print("sub: " + sub);
    copy.retainAll(sub);
    print("13: " + copy);
    copy = new ArrayList<Integer>(pets); // Get a fresh copy
    copy.remove(2); // Remove by index
    print("14: " + copy);
    copy.removeAll(sub); // Only removes exact objects
    print("15: " + copy);
    copy.set(1, 11); // Replace an element
    print("16: " + copy);
    copy.addAll(2, sub); // Insert a list in the middle
    print("17: " + copy);
    print("18: " + pets.isEmpty());
    pets.clear(); // Remove all elements
    print("19: " + pets);
    print("20: " + pets.isEmpty());
    pets.addAll(Arrays.asList(24,23,22,21));
    print("21: " + pets);
    Object[] o = pets.toArray();
    print("22: " + o[3]);
    Integer[] pa = pets.toArray(new Integer[0]);
//    print("23: " + pa[3].id());
    print("23: " + pa[3]);
  }
} /* Output:
1: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug]                1: [7, 6, 5, 4, 3, 2, 1]
2: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Hamster]       2: [7, 6, 5, 4, 3, 2, 1, 8]
3: true                                                       3: true
4: Cymric 2                                                   4: 5 2
5: -1                                                         5: -1
6: false                                                      6: false
7: true                                                       7: true
8: [Rat, Manx, Mutt, Pug, Cymric, Pug]                        8: [7, 6, 4, 3, 2, 1]
9: [Rat, Manx, Mutt, Mouse, Pug, Cymric, Pug]                 9: [7, 6, 4, 10, 3, 2, 1]
subList: [Manx, Mutt, Mouse]                                  subList: [6, 4, 10]
10: true                                                      10: true
sorted subList: [Manx, Mouse, Mutt]                           sorted subList: [4, 6, 10] 
11: true                                                      11: true
shuffled subList: [Mouse, Manx, Mutt]                         shuffled subList: [6, 4, 10]
12: true                                                      12: true
sub: [Mouse, Pug]                                             sub: [6, 3]
13: [Mouse, Pug]                                              13: [6, 3]
14: [Rat, Mouse, Mutt, Pug, Cymric, Pug]                      14: [7, 6, 10, 3, 2, 1]
15: [Rat, Mutt, Cymric, Pug]                                  15: [7, 10, 2, 1]
16: [Rat, Mouse, Cymric, Pug]                                 16: [7, 11, 2, 1]
17: [Rat, Mouse, Mouse, Pug, Cymric, Pug]                     17: [7, 11, 6, 3, 2, 1]
18: false                                                     18: false
19: []                                                        19: []
20: true                                                      20: true
21: [Manx, Cymric, Rat, EgyptianMau]                          21: [24, 23, 22, 21]
22: EgyptianMau                                               22: 21
23: 14                                                        23: 21 //there is no id in Integer
*///:~

// Basically everything works same if you use not primitive.

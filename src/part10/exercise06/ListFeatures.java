package  part10.exercise06;

/**
 * Exercise 6:   (2) Modify ListFeatures.java so that it uses Strings instead 
 * of Pets, and explain any difference in results.
 */
import java.util.*;

import typeinfo.pets.*;

import static net.mindview.util.Print.*;

class ListFeatures {
  public static void main(String[] args) {
    Random rand = new Random(47);
    List<String> pets = new ArrayList<>();
    Collections.addAll(pets,"Rat","Manx","Cymric","Mutt","Pug","Cymric","Pug");
    print("1: " + pets);
    String h = "Hamster";
    pets.add(h); // Automatically resizes
    print("2: " + pets);
    print("3: " + pets.contains(h));
    pets.remove(h); // Remove by object
    String p = pets.get(2);
    print("4: " +  p + " " + pets.indexOf(p));
    String cymric = "Cym" + "ric";
    print("5: " + pets.indexOf(cymric));
    print("6: " + pets.remove(cymric));
    // Must be the exact object:
    print("7: " + pets.remove(p));
    print("8: " + pets);
    pets.add(3, "Mouse"); // Insert at an index
    print("9: " + pets);
    List<String> sub = pets.subList(1, 4);
    print("subList: " + sub);
    print("10: " + pets.containsAll(sub));
    Collections.sort(sub); // In-place sort
    print("sorted subList: " + sub);
    // Order is not important in containsAll():
    print("11: " + pets.containsAll(sub));
    Collections.shuffle(sub, rand); // Mix it up
    print("shuffled subList: " + sub);
    print("12: " + pets.containsAll(sub));
    List<String> copy = new ArrayList<String>(pets);
    sub = Arrays.asList(pets.get(1), pets.get(4));
    print("sub: " + sub);
    copy.retainAll(sub);
    print("13: " + copy);
    copy = new ArrayList<String>(pets); // Get a fresh copy
    copy.remove(2); // Remove by index
    print("14: " + copy);
    copy.removeAll(sub); // Only removes exact objects
    print("15: " + copy);
    copy.set(1, "Mouse"); // Replace an element
    print("16: " + copy);
    copy.addAll(2, sub); // Insert a list in the middle
    print("17: " + copy);
    print("18: " + pets.isEmpty());
    pets.clear(); // Remove all elements
    print("19: " + pets);
    print("20: " + pets.isEmpty());
    pets.addAll(Arrays.asList("Manx", "Cymric", "Rat", "EgyptianMau"));
    print("21: " + pets);
    Object[] o = pets.toArray();
    print("22: " + o[3]);
    String[] pa = pets.toArray(new String[0]);
    print("23: " + pa[3]);
  }
} /* Output:
1: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug]             1: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug]
2: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Hamster]    2: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Hamster]
3: true                                                    3: true
4: Cymric 2                                                4: Cymric 2
5: -1                                                      5: 2   // reference to the same object as pets.get(2) and pets.get(5)
6: false                                                   6: true // first occurence of Cymric
7: true                                                    7: true // second occurence of Cymric
8: [Rat, Manx, Mutt, Pug, Cymric, Pug]                     8: [Rat, Manx, Mutt, Pug, Pug]
9: [Rat, Manx, Mutt, Mouse, Pug, Cymric, Pug]              9: [Rat, Manx, Mutt, Mouse, Pug, Pug]
subList: [Manx, Mutt, Mouse]                               subList: [Manx, Mutt, Mouse]
10: true                                                   10: true
sorted subList: [Manx, Mouse, Mutt]                        sorted subList: [Manx, Mouse, Mutt]
11: true                                                   11: true
shuffled subList: [Mouse, Manx, Mutt]                      shuffled subList: [Mouse, Manx, Mutt]
12: true                                                   12: true
sub: [Mouse, Pug]                                          sub: [Mouse, Pug]
13: [Mouse, Pug]                                           13: [Mouse, Pug, Pug]
14: [Rat, Mouse, Mutt, Pug, Cymric, Pug]                   14: [Rat, Mouse, Mutt, Pug, Pug]
15: [Rat, Mutt, Cymric, Pug]                               15: [Rat, Mutt] // after removeAll(sub)
16: [Rat, Mouse, Cymric, Pug]                              16: [Rat, Mouse]
17: [Rat, Mouse, Mouse, Pug, Cymric, Pug]                  17: [Rat, Mouse, Mouse, Pug]
18: false                                                  18: false
19: []                                                     19: []
20: true                                                   20: true
21: [Manx, Cymric, Rat, EgyptianMau]                       21: [Manx, Cymric, Rat, EgyptianMau]
22: EgyptianMau                                            22: EgyptianMau
23: 14                                                     23: EgyptianMau
*///:~

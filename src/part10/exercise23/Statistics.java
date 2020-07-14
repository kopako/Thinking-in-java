package part10.exercise23;

import java.util.*;
/**
 * Exercise 23:   (4) Starting with Statistics.java, create a program that runs 
 * the test repeatedly and looks to see if any one number tends to appear more 
 * than the others in the results. 
 * 
 * The demands is not clear. Need to be defined what does mean "more than the others".
 * Eventually quantity of appearing is not the same but not far from each others.
 * Percentage of appearance is somewhat around 100% / quantity of numbers(20) ~ 5 %
 * 
 * @author kopan.dmytro
 *
 */
public class Statistics {
  public static void main(String[] args) {
    Random rand = new Random(47);
    Map<Integer,Integer> m =
      new HashMap<Integer,Integer>();
    for(int i = 0; true; i++) {
      // Produce a number between 0 and 20:
      int r = rand.nextInt(20);
      Integer freq = m.get(r);
      m.put(r, freq == null ? 1 : freq + 1);
      Integer summ = m.values().stream().reduce(0, Integer::sum);
      for (Integer k : m.keySet()) {
		System.out.printf("%d: %f %%  \t", k, 100 * m.get(k)/(double)summ);
      }
      System.out.println();
    }
//    System.out.println(m);
  }
} /* Output:
{0=107351681, 1=107384703, 2=107390358, 3=107376212, 4=107383773, 5=107362612, 6=107367146, 7=107391336, 8=107376122, 9=107384263, 10=107381929, 11=107370452, 12=107366218, 13=107361635, 14=107353907, 15=107369900, 16=107393116, 17=107377700, 18=107377573, 19=107363011}

*///:~

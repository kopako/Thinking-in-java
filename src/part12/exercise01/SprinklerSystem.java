package part12.exercise01;

/**
 * Exercise 1: (2) Analyze SprinklerSystem.toString( ) in
 * reusing/SprinklerSystem.java to discover whether writing the toString( ) with an
 * explicit StringBuilder will save any StringBuilder creations.
 * 
 *  Answer: it will not.
 * @author kopan.dmytro
 *
 */
class WaterSource {
  private String s;
  WaterSource() {
    System.out.println("WaterSource()");
    s = "Constructed";
  }
  public String toString() { return s; }
}	

public class SprinklerSystem {
  private String valve1, valve2, valve3, valve4;
  private WaterSource source = new WaterSource();
  private int i;
  private float f;
  public String toString() {
    return new StringBuilder()
      .append("valve1 = ").append(valve1).append(" ")
      .append("valve2 = ").append(valve2).append(" ") 
      .append("valve3 = ").append(valve3).append(" ")
      .append("valve2 = ").append(valve2).append("\n")
      .append("i = ").append(i).append(" ").append("f = ").append(f).append(" ")
      .append("source = ").append(source).toString();
  }	
  public static void main(String[] args) {
    SprinklerSystem sprinklers = new SprinklerSystem();
    System.out.println(sprinklers);
  }
} 
/*
Compiled from "SprinklerSystem.java" 
public class part12.exercise01.SprinklerSystem {
  public part12.exercise01.SprinklerSystem();
    Code:
       0: aload_0
       1: invokespecial #19                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #21                 // class part12/exercise01/WaterSource
       8: dup
       9: invokespecial #23                 // Method part12/exercise01/WaterSource."<init>":()V
      12: putfield      #24                 // Field source:Lpart12/exercise01/WaterSource;
      15: return

  public java.lang.String toString();
  without StringBuilder				with StringBuilder
    Code:                          Code:
       0: new           #32              0: new           #32          // class java/lang/StringBuilder
       3: dup                            3: dup
       4: ldc           #34              4: invokespecial #34          // String valve1 =
       6: invokespecial #36              7: ldc           #35          // Method java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
       9: aload_0                        9: invokevirtual #37
      10: getfield      #39             12: aload_0          		   // Field valve1:Ljava/lang/String;
      13: invokevirtual #41             13: getfield      #41          // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      16: ldc           #45             16: invokevirtual #37          // String
      18: invokevirtual #41             19: ldc           #43          // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      21: ldc           #47             21: invokevirtual #37          // String valve2 =
      23: invokevirtual #41             24: ldc           #45          // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      26: aload_0                       26: invokevirtual #37
      27: getfield      #49             29: aload_0                    // Field valve2:Ljava/lang/String;
      30: invokevirtual #41             30: getfield      #47          // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      33: ldc           #45             33: invokevirtual #37          // String
      35: invokevirtual #41             36: ldc           #43          // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      38: ldc           #51             38: invokevirtual #37          // String valve3 =
      40: invokevirtual #41             41: ldc           #49          // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      43: aload_0                       43: invokevirtual #37
      44: getfield      #53             46: aload_0                    // Field valve3:Ljava/lang/String;
      47: invokevirtual #41             47: getfield      #51          // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      50: ldc           #45             50: invokevirtual #37          // String
      52: invokevirtual #41             53: ldc           #43          // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      55: ldc           #55             55: invokevirtual #37          // String valve4 =
      57: invokevirtual #41             58: ldc           #45          // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      60: aload_0                       60: invokevirtual #37
      61: getfield      #57             63: aload_0                    // Field valve4:Ljava/lang/String;
      64: invokevirtual #41             64: getfield      #47          // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      67: ldc           #59             67: invokevirtual #37          // String \n
      69: invokevirtual #41             70: ldc           #53          // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      72: ldc           #61             72: invokevirtual #37          // String i =
      74: invokevirtual #41             75: ldc           #55          // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      77: aload_0                       77: invokevirtual #37
      78: getfield      #63             80: aload_0                    // Field i:I
      81: invokevirtual #65             81: getfield      #57          // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      84: ldc           #45             84: invokevirtual #59          // String
      86: invokevirtual #41             87: ldc           #43          // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      89: ldc           #68             89: invokevirtual #37          // String f =
      91: invokevirtual #41             92: ldc           #62          // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      94: aload_0                       94: invokevirtual #37
      95: getfield      #70             97: aload_0                    // Field f:F
      98: invokevirtual #72             98: getfield      #64          // Method java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
     101: ldc           #45            101: invokevirtual #66          // String
     103: invokevirtual #41            104: ldc           #43          // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     106: ldc           #75            106: invokevirtual #37          // String source =
     108: invokevirtual #41            109: ldc           #69          // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     111: aload_0                      111: invokevirtual #37
     112: getfield      #24            114: aload_0                    // Field source:Lpart12/exercise01/WaterSource;
     115: invokevirtual #77            115: getfield      #24          // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     118: invokevirtual #80            118: invokevirtual #71          // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     121: areturn                      121: invokevirtual #74
                                       124: areturn




  public static void main(java.lang.String[]);
    Code:
       0: new           #1                  // class part12/exercise01/SprinklerSystem
       3: dup
       4: invokespecial #84                 // Method "<init>":()V
       7: astore_1
       8: getstatic     #85                 // Field java/lang/System.out:Ljava/io/PrintStream;
      11: aload_1
      12: invokevirtual #91                 // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
      15: return
}
*/
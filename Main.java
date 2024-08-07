import java.util.ArrayList; 

public class Main {

  public static void main(String[] args) {

 String[][] string1 = {{"Hello,", "world", "!"}, {"It's", "me", "Genevieve"}} ; 

    System.out.println(Algorithm.numTarget(string1,"e"));
    System.out.println(Algorithm.numTarget(string1,"o"));
    System.out.println(Algorithm.numTarget(string1,"G"));

    int[][] int1 = {{1,2}, {3,4}}; 
     System.out.println(Algorithm.targetInt(int1,5));
     System.out.println(Algorithm.targetInt(int1,3));
     System.out.println(Algorithm.targetInt(int1,4));

    int[] result = Algorithm.findElement(int1,3);
     System.out.println(result[0] + " " + result[1]);
  
     int[] result1 = Algorithm.findElement(int1,4);
      System.out.println(result1[0] + " " + result1[1]);

    int[] result2 = Algorithm.findElement(int1,5);
     System.out.println(result2[0] + " " + result2[1]);

    int[] result3 = Algorithm.extractDiagonal(int1);
     System.out.println(result3[0] + " " + result3[1]);

     int[] result4 = Algorithm.extractDiagonal(int1);
      System.out.println(result4[0] + " " + result4[1]);

    int[] result5 = Algorithm.extractDiagonal(int1);
     System.out.println(result5[0] + " " + result5[1]);

     String[][] string2 = {{"Hello,", "world", "!"}, {"It's", "me", "Margaret"}};


    System.out.println(Algorithm.concatString(string2, 1));
    System.out.println(Algorithm.concatString(string2, 0));
     System.out.println(Algorithm.concatString(string1, 1));

   int[][] int2 = {{3, 2, 1}, {4, 5, 6}}; 
    int[][] int3 = {{3, 2, 1}, {4, 5, 7}}; 
    int[][] int4 = {{3, 2, 1}, {4, 5, 8}}; 
    System.out.println(Algorithm.maxValue(int2));
    System.out.println(Algorithm.maxValue(int3));
    System.out.println(Algorithm.maxValue(int4));

    System.out.println(Algorithm.minValue(int2));
    System.out.println(Algorithm.minValue(int3));
    System.out.println(Algorithm.minValue(int4));


    System.out.println(Algorithm.shortestString(string2));
    String[][] string3 = {{"he,", "world", "rjkfd"}, {"It's", "mer", "Margaret"}};
    System.out.println(Algorithm.shortestString(string3));
    String[][] string4 = {{"h,", "world", "rjkfd"}, {"It's", "mer", "Margaret"}};
    System.out.println(Algorithm.shortestString(string4));

    
    System.out.println(Algorithm.longestString(string2));
   
    System.out.println(Algorithm.longestString(string3));

    System.out.println(Algorithm.longestString(string4));

    int[][] int5 = {{2, 3, 4}, {-1, -2, -3}}; 
    int[][] int6 = {{1, 2, 3}, {4, 5, 6}};
    int[][] int22 = {{1, 3, 5}, {2, 8, 1}};
    
    System.out.println(Algorithm.largestABSdiff(int5, int6));
    System.out.println(Algorithm.largestABSdiff(int6, int5));
    System.out.println(Algorithm.largestABSdiff(int22, int5));
    
    
  double[][] double1 =   {{1.6, 3.2, 5.4}, {6.3, 4.1, 2.5}}; 
    System.out.println(Algorithm.meanAvg(double1));
     double[][] double2 =   {{1.7, 3.4, 5.7}, {6.2, 4.0, 2.8}}; 
    System.out.println(Algorithm.meanAvg(double2));
    double[][] double3 =   {{1.4, 3.2, 5.4}, {6.1, 4.7, 2.4}}; 
    System.out.println(Algorithm.meanAvg(double3));
    
    int[][] int7 = {{1, 2}, {3, 2}}; 
    System.out.println(Algorithm.checkDuplicates(int7));
    int[][] int8 = {{1, 2}, {2, 1}};
    System.out.println(Algorithm.checkDuplicates(int8));
    int[][] int9 = {{1, 0}, {2, 1}};
     System.out.println(Algorithm.checkDuplicates(int9));
    
    String[][] string5 = {{"bravo", "charlie"}, {"zebra", "alpha"}}; 
    System.out.println(Algorithm.lastAlphebtically(string5));
    String[][] string6 = {{"bravo", "charlie"}, {"yoyo", "alpha"}}; 
    System.out.println(Algorithm.lastAlphebtically(string6));

    String[][] string7 = {{"bravo", "charlie"}, {"wack", "alpha"}};
    System.out.println(Algorithm.lastAlphebtically(string7));

    

    
  }
}
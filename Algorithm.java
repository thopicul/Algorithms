import java.util.ArrayList;

public class Algorithm {

  public static int oneDigits(int i) {
    return i % 10;
  }

  public static int numDigits(int num) {
    int count = 0;
    while (Math.abs(num) > 0) {
      num = (int) (num * .1);
      count = count + 1;
    }
    return (count);
  }

  public static boolean OnebyTwo(int one, int two) {
    if ((one % two) == 0) {
      return (true);
    } else {
      return (false);
    }
  }

  public static int sumOdd(int first, int second) {
    int sum = 0;
    while (first <= second) {
      if ((first % 2) == 1) {
        sum = sum + first;
      }
      first = first + 1;
    }
    return (sum);
  }

  public static int sumOfTen(int first, int second) {
    int sum = 0;
    while (first <= second) {
      if ((first % 10) == 0) {
        sum = sum + first;
      }
      first = first + 1;
    }
    return (sum);
  }

  public static int sumDigits(int first) {
    int sum = 0;
    int multiply = 10;
    int place = 0;
    int count = 0;
    int num = first;
    while (Math.abs(num) > 0) {
      num = (int) (num * .1);
      count = count + 1;
    }
    while (place < count) {
      sum = sum + (int) (first % multiply);
      first = (int) (first / 10);
      place = place + 1;
    }
    return (sum);
  }

  public static int largePower(int first) {
    int power = 0;
    while ((Math.pow(2, power)) <= first) {
      power = power + 1;
    }
    return ((int) Math.pow(2, (power - 1)));
  }

  public static boolean SecondStringINFirst(String first, String second) {
    int e = 0;
    int L = 0;
    for (int i = 0; i < first.length(); i++) {
      if (first.substring(i, i + 1).equals(second.substring(e, e + 1))) {
        e = e + 1;
        L = L + 1;
      }
      if (L == second.length()) {
        return (true);
      }
    }
    return (false);
  }
  public static String reverseLetters(String first) {
    String reverse = "";
    for (int i = (first.length() - 1); i >= 0; i--) {
      reverse = reverse + first.substring(i, i + 1);
    }
    return (reverse);
  }
  public static boolean palindrome(String first) {
    int L = 0;
    int e = 0;
    for (int j = first.length() - 1; j >= 0; j--) {
      if (first.substring(j, j + 1).equals(first.substring(e, e + 1))) {
        L = L + 1;
      }
      e = e + 1;
    }
    if (L == first.length()) {
      return (true);
    } else {
      return (false);
    }
  }
  public static int numOfsecondInFirst (String first, String second) {
    int  j = second.length() ;
    int count = 0;
    
      for (int i =0; i < first.length(); i++) {
        int k = (i+j); 
        if (k>first.length()) {
          k = k-1;
        }
      if (first.substring(i,k).equals(second.substring(0))) {
        count = count +1;
      }

      }
    return(count);
  }


  public static void  printArray(int[] ints) {
      for (int i : ints) {
          System.out.print(i + " ");
      }
      System.out.println();
  }
  public static void swapElements(int[] ints, int a, int b) {
    int temp = ints[a];
    ints[a] = ints[b];
    ints[b] = temp;

    for (int i : ints) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static void maxArray(int[] ints) {
     int test = Integer.MIN_VALUE; 
    for (int i : ints ) {
      if (i > test) {
        test = i;
      }
    }
    System.out.println(test);
    
  }
  public static void minArray(int[] ints) {
     int test = Integer.MAX_VALUE; 
    for (int i : ints ) {
      if (i < test) {
        test = i;
      }
    }
    System.out.println(test);

  }
  public static String shortestString(String[] strings) {
    String first = strings[0];
    for (String str : strings) {

      if (str.length() < first.length() ) {
        first = str; 
      }
    }
    return(first);
  }
  public static String LongestString(String[] strings) {
    String first = strings[0]; 
    for (String str : strings) {
      if (str.length()>first.length()) {
        first = str ;
      }
    }
    return(first);
  }
  public static int largestABSdiff(int[] ints, int[] ints2) {
      int maxDiff = 0; 
      for (int i = 0; i < ints.length; i++) {
          int diff = Math.abs(ints[i] - ints2[i]);
          if (diff > maxDiff) {
              maxDiff = diff;
          }
      }
      return maxDiff;
  }

  public static double meanAverage (double[] doubles) {
    double sum = 0;
    int length = 0; 
    for (double num : doubles) {
      sum = sum + num;   
      length = length + 1;
    }
    return(sum/length);
    
    
  }
  public static void reverseOrder ( int[] ints) {
    int[] newList = new int[ints.length]; 
    
    int first = 0; 
     for (int i = ints.length -1 ; i >=0 ; i--) {
       
      newList[first] = ints[i];
      first++; 
      }
    for ( int p : newList) {
      System.out.print(p + " ");
  }
    System.out.println();
}


  public static boolean twoConsecutive(int[] ints) {
      for (int i = 0; i < ints.length - 1; i++) {
          if (ints[i] == ints[i + 1]) {
              return true;
          }
      }
      return false;
  }


  public static int indexofNegative ( int[] ints ) { 
    
    for (int i = 0; i < ints.length ; i++) {
      if ( ints[i] < 0 ) {
        return(i);
      } 
    }
    return(0);
  }

public static boolean checkEquivalence (int[] ints) {
  for (int i: ints) {
    for (int p: ints) {
      if (i == p) {
        return(true); 
      }
    }
  }
  return(false);
  
}
  public static int numOfSame(int[] ints , int a ) {
int num = 0; 
    int L = 0; 
    for (int i = 0; i < ints.length; i++) {
       if (ints[i] == a ) {
         num = num +1; 
     
        if (num > L ) {
        L = num; 
        } 
       }
      else {
        num = 0; 
      }  
     }
    return(L); 
  }
public static String alphabeticalllyOrdered (String[] strings) {
 String first = strings[0]; 

  for ( int i= 0; i < strings.length; i++ ) {
    String now = strings[i]; 
    if (now.compareTo(first) > 0) {
      first = now; 
    }
  }
  return(first); 
}

  public static boolean identical(int[] ints, int[] ints2) {

    for ( int i = 0; i<ints.length; i++ ) {
      for ( int l = 0; l <ints2.length; l ++ ) {
         if (ints[i] == ints2[l]) {
           return(true); 
         }
      }
    }
    return(false); 
  }


public static void  removeDuplicates (ArrayList<Integer> ints) {


  for ( int i = 0 ; i < ints.size()-1; i++ ){
 
        if ( ints.get(i).equals(ints.get(i+1) ) ) {
          ints.remove(i+1); 
        }
  }
}

  public static void removeInt (ArrayList<Integer> ints, int x) {

    for (int i = 0; i<ints.size(); i++) {
      if (ints.get(i) == (x)) {
        ints.remove(i); 
        i--; 
      }
    }
  }

  public static void addInt (ArrayList<Integer> ints, int e ) {
    int i; 
    for ( i = 0; i<ints.size(); i++) {
      if (ints.get(i) >= e) {
        ints.add(i,e);
        break;
      }
    }
    if (i == ints.size()) {
        ints.add(e);
    }
    
    
  }
   public static boolean reverseOrder (ArrayList<Integer> ints, ArrayList<Integer> ints2 ) {
  int l = ints.size() - 1;
  int p = 0; 
  for (int i = 0; i < ints.size(); i++) {
      if (ints2.get(l).equals(ints.get(i))) {
          p++;
      }
      l--;
  }
  return  ( p == ints.size() ) ;  
  }


  public static int returnMax(ArrayList<Integer> ints ) {
      int j = 0 ; 

    for ( int i= 0 ; i < ints.size(); i++ ) {
      if (ints.get(i) > j ) {
        j = ints.get(i); 
      }
    }
    return(j); 
    
  }
  public static int returnMin(ArrayList<Integer> ints ) {
      int j = 99999 ; 

    for ( int i= 0 ; i < ints.size(); i++ ) {
      if (ints.get(i) < j ) {
        j = ints.get(i); 
      }
    }
    return(j); 

  }

  public static String  shortestString (ArrayList<String> string1) {

    String shortest = string1.get(0); 
    for (String str : string1) {
        if (str.length() < shortest.length()) {
            shortest = str; 
        }
    }
    return (shortest);
  }
  public static String  longestString (ArrayList<String> string1) {

    String longest = string1.get(0); 
    for (String str : string1) {
        if (str.length() > longest.length()) {
            longest = str; 
        }
    }
    return (longest);
  }

  public static int largestABSdiff( ArrayList<Integer> ints, ArrayList<Integer> ints2 ) {

      int maxDiff = 0; 
      for (int i = 0; i < ints.size(); i++) {
          int diff = Math.abs(ints.get(i) - ints2.get(i));
          if (diff > maxDiff) {
              maxDiff = diff;
          }
      }
      return maxDiff;
  }

  public static double meanAverage ( ArrayList<Double> doubles) {
      double sum = 0.0 ; 

    for ( int i = 0 ; i < doubles.size(); i++) {
      sum = sum + doubles.get(i); 
    }

    return(sum/doubles.size());

    
  }

  public static void reverseOrder ( ArrayList<Integer> ints) {

     ArrayList<Integer> ints2 = new ArrayList<>();

    for ( int i = ints.size()-1; i >= 0; i--) {
      ints2.add(ints.get(i)); 
    }
      System.out.println(ints2);
    }
  


  public static boolean twoConsecutive(ArrayList<Integer> ints) {

    for ( int i = 0 ; i < ints.size()-1; i++ ) {
      if ( ints.get(i) == ints.get(i+1) ) {
        return(true);
      }
    }
    return(false); 
  }

  public static int firstNegative(ArrayList<Integer> ints) {
     for ( int i = 0 ; i < ints.size(); i++ ) {
          if ( ints.get(i) < 0 ) {
            return(i);
          }
     }
    return(0);
     
    
  }
  public static boolean checkEquivalence (ArrayList<Integer> ints) {

    for ( int i = 0 ; i < ints.size(); i ++ ) {
      for ( int p = 0 ; p < ints.size(); p ++ ) {
        if ( ints.get(i) == ints.get(p) ) {
          return(true);
        }
      }
    }
    return(false); 
  }
  
public static int numNegative (ArrayList<Integer> ints) {
  int count = 0; 
  for ( int i = 0; i < ints.size(); i ++ ) {
    if ( ints.get(i) < 0) {
      count= count + 1; 
    }
  }
  return(count); 
}

  public static boolean targetString (ArrayList<String> strings, String target) {
    for ( int i = 0 ; i < strings.size(); i++ ) {

      if ( strings.get(i).equals(target) ) {
        return(true); 
      }
    }
    return(false);

    
    
  }
  public static boolean sameValue (ArrayList<Integer> ints, ArrayList<Integer> ints2) {
   
    for ( int i = 0; i  < ints.size(); i ++ ) {
      for ( int p = 0; p < ints2.size(); p ++ ) {
        if ( ints.get(i) == ints2.get(p) ) {
          return(true); 
        }
      }
    }
    return(false); 
  }

  public static int targetNum (ArrayList<Integer> ints, int target) {
    for ( int i = 0; i < ints.size(); i ++) {
      if (ints.get(i)==target) {
        return(i);
      }
    } 
    return(-1); 
    
  }
  
   public static int targetNum ( int[] ints, int target) {
     for ( int i = 0; i < ints.length; i ++) {
       if (ints[i] == target) {
         return(i);
       }
     }
   return(-1); 
   
   }
  /** Returns the index of the minimum value in an int array
    * beginning at a specified index
    * @param index the starting index to search
    * @param arr the array to search
    * @return the index of the minimum value */
  public static int findMinIndex(int index, int[] arr)
  {
    int minUpdate = 0;
    int min = arr[index];
    for(int i = index; i < arr.length; i++)
    {
      if(arr[i] < min)
      {
        min = arr[i];
        index = i;
        minUpdate++;
      }
    }
    System.out.println("Minimum Updates: " + minUpdate);
    return index;
  }
  /**Swaps the elements of two indices of an array
    * @param arr the array in which to swap
    * @param i the index of the first element
    * @param j the index of the second element */
  public static void swap(int[] arr, int i, int j)
  {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  /** Sorts an int array in ascending order with selection sort
    * @param arr the int array to be sorted */
  public static void selectionSort(int[] arr)
  {
    int swaps = 0;
    for(int i = 0; i < arr.length; i++)
    {
      int minIndex = findMinIndex(i, arr);
      if(minIndex != i)
      {
        swap(arr, i, minIndex);
        swaps++;
      }
      System.out.println(arr);
    }
    System.out.println("Swaps: " + swaps);
  }
  public static void insertionSort(int[] arr)
  {
    int swaps = 0;
    for(int i = 1; i < arr.length; i++)
    {
      int temp = arr[i];
      int index = i;
      while(index > 0 && temp < arr[index - 1])
      {
        swap(arr, index, index - 1);
        swaps++;
        index--;
      }
      System.out.println(arr);      
    }
    System.out.println("Swaps: " + swaps);
  }

  
 
    
public static void swap ( String[] string1, int i, int j){

String temp = string1[i];
string1[i] = string1[j];
string1[j] = temp; 
  
}
  public static void selectionSort(String[] string1) {
    int swaps = 0; 
    for (int i = 0; i < string1.length - 1; i++) {
    int minIndex = i;
    for (int j = i + 1; j < string1.length; j++) {
        if (string1[j].compareTo(string1[minIndex]) < 0) {
            minIndex = j;
        }
    }
    if (minIndex != i) {
        swap(string1, i, minIndex);
        swaps++;
    }

  }
 
    System.out.println();
      
  }
  public static void insertionSort(String[] string1) {

    int swaps = 0; 
    for ( int i = 1 ; i < string1.length; i++) {

      String temp = string1[i];
      int index = i; 
      while ( index > 0 && temp.compareTo(string1[index - 1]) < 0) {
        swap (string1, index, index -1); 
        swaps ++; 
        index--; 
      }
    }
      for ( String l : string1) {
    System.out.println(l + ", ");
      }
  }


  public static void swap ( ArrayList<String> string1, int i, int j ){

  String temp = string1.get(i);
  string1.set(i,string1.get(j)) ;
  string1.set(j,temp); 

  }
  public static void selectionSort(ArrayList<String> string1) {
    int swaps = 0; 
    for (int i = 0; i < string1.size() - 1; i++) {
    int minIndex = i;
    for (int j = i + 1; j < string1.size(); j++) {
        if (string1.get(j).compareTo(string1.get(minIndex)) < 0) {
            minIndex = j;
        }
    }
    if (minIndex != i) {
        swap(string1, i, minIndex);
        swaps++;
    }

    

    }
  }

  public static void insertionSort(ArrayList<String> string1) {

    int swaps = 0; 
    for ( int i = 1 ; i < string1.size(); i++) {

      String temp = string1.get(i);
      int index = i; 
      while ( index > 0 && temp.compareTo(string1.get(index - 1)) < 0) {
        swap (string1, index, index -1); 
        swaps ++; 
        index--; 
      }
    }

  }
  public static int findMinIndex(int index, ArrayList<Integer> int1)
  {
    int minUpdate = 0;
    int min = int1.get(index);
    for(int i = index; i < int1.size(); i++)
    {
      if(int1.get(i) < min)
      {
       min = int1.get(i); 
        index = i;
        minUpdate++;
      }
    }
    
    return index;
  }
    public static void swapInt(ArrayList<Integer> int1, int i, int j)
    {
      int temp = int1.get(i);
      int1.set(i,int1.get(j));
      int1.set(j,temp);
    }

    public static void selectionSortInt(ArrayList<Integer> int1)
    {
      int swaps = 0;
      for(int i = 0; i < int1.size(); i++)
      {
        int minIndex = findMinIndex(i, int1);
        if(minIndex != i)
        {
          swapInt(int1, i, minIndex);
          swaps++;
        }
     
      }
    
    }
    public static void insertionSortInt(ArrayList<Integer> int1)
    {
      int swaps = 0;
      for(int i = 1; i < int1.size(); i++)
      {
        int temp = int1.get(i);
        int index = i;
        while(index > 0 && temp < int1.get(index - 1))
        {
          swapInt(int1, index, index - 1);
          swaps++;
          index--;
        }
         
      }
    
    }

public static int numTarget (String[][] string1, String target) {

  int count = 0; 
  for ( int i = 0 ; i < string1.length; i++) {
    for ( int p = 0 ; p < string1[0].length; p++) {
        if (string1[i][p].contains(target)) {
            count++;
        }
    
  }
  }
  return(count); 
}
  public static boolean targetInt (int[][] int1, int target) {
    for ( int i = 0 ; i < int1.length; i++) {
      for ( int p = 0 ; p < int1[0].length; p++) {
        if ( int1[i][p] == (target) ) {
          return(true); 
        }
      }
    }
    return(false);
    
  }
  public static int[] findElement(int[][] int1, int target) {
      int[] result = {-1, -1};

      for (int i = 0; i < int1.length; i++) {
          for (int j = 0; j < int1[i].length; j++) {
              if (int1[i][j] == target) {
                  result[0] = i;
                  result[1] = j;
                  return result;
              }
          }
      }

      return result;
  }
  public static int[] extractDiagonal(int[][] int1) {
      int size = Math.min(int1.length, int1[0].length);
      int[] cross = new int[size];

      for (int i = 0; i < size; i++) {
          cross[i] = int1[i][i];
      }

      return (cross);
  }
  public static String concatString (String[] [] string1, int int1) {
    String result = "";
    for ( int i = 0 ; i < string1.length; i++)
    for (int j = 0; j < string1.length; j++) {
    if (j == int1) {
      result += string1[i][j] + " ";
            }
  }
    return result;

  }
  
public static int maxValue (int[][] int1) {
  int max = Integer.MIN_VALUE;
  for (int i = 0; i < int1.length; i++){
    for (int j = 0; j < int1[i].length; j++) {
      if (int1[i][j] > max) {
        max = int1[i][j];
      }
    }
  }
  return(max); 
}
  public static int minValue (int[][] int1) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < int1.length; i++){
      for (int j = 0; j < int1[i].length; j++) {
      if (int1[i][j] < min) {
         min = int1[i][j];
        }
      }
    }
    return(min);
  }
  public static String shortestString (String[][] string1) {
        String shortest = string1[0][0];
    for (int i = 0; i < string1.length; i++) {
      for (int j = 0; j < string1[i].length; j++) {
        if (string1[i][j].length() < shortest.length()) {
           shortest = string1[i][j];
            }
        }
    }
    return(shortest); 
    
  }
  public static String longestString (String[][] string1) {
    String longest = string1[0][0];
    for (int i = 0; i < string1.length; i++) {
        for (int j = 0; j < string1[i].length; j++) {
          if (string1[i][j].length() > longest.length()) {
            longest = string1[i][j];
            }
        }
    }
    return(longest); 
  }
  public static int largestABSdiff (int[][] int1, int[][] int2) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < int1.length; i++) {
        for (int j = 0; j < int1[i].length; j++) {
          int diff = Math.abs(int1[i][j] - int2[i][j]);
          if (diff > max) {
              max = diff;
            }
        }
    }
    return(max);
  }
  public static double meanAvg (double[][] double1) {
    double sum = 0.0;
    for (int i = 0; i < double1.length; i++) {
        for (int j = 0; j < double1[i].length; j++) {
          sum += double1[i][j];
        }
    }
    return(sum / (double1.length * double1[0].length));
  }

  public static boolean checkDuplicates (int[][] int1) {
    for (int i = 0; i < int1.length; i++) {
        for (int j = 0; j < int1[i].length; j++) {
        for (int k = i + 1; k < int1.length; k++) {
          for (int l = 0; l < int1[k].length; l++) {
          if (int1[i][j] == int1[k][l]) {
             return(true);
              }
            }
          }
        }
    }
    return(false);
  }
  
  public static String lastAlphebtically (String[][] string1) {
    String last = string1[0][0]; 
    for (int i = 0; i < string1.length; i++) {
      for (int j = 0; j < string1[i].length; j++) {
          if (string1[i][j].compareTo(last) > 0) {
              last = string1[i][j]; 
          }
      }
    }
    return( last);
  }
}
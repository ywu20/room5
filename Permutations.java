import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

public class Permutations{
  public static ArrayList<String> Permutations(int s){
    ArrayList<String> paths = new ArrayList<String>();
    ArrayList<Integer> digits = new ArrayList<Integer>();

   for(int i = 0; i < s; i++){
     digits.add(i);
   } //Get List of Indexes

    int factorial = 1;
    for(int i = 1; i < s + 1; i++){
      factorial = factorial * i;
    } //Method to get factorial

    Object[] add = new Object[s];
    String numbas = "";

    for(int j = 0; j < factorial * 10; j++){
      Collections.shuffle(digits);
      add = digits.toArray();
      numbas = Arrays.toString(add);
      //Collections.shuffle(digits) randomizes order of digits

      if(paths.indexOf(numbas) < 0){
        paths.add(numbas);
      }
    }
    return paths;
  }
}

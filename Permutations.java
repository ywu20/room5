import java.util.Collections;

public class Permutations{
  public static ArrayList<int> Permutations(int s){
    ArrayList<int[]> paths = new ArrayList<int[]>();
    ArrayList<Integer> digits = new ArrayList<Integer>(s);

   for(int i = 0; i < digits.size(); i++){
     digits.add(i);
   } //Get List of Indexes

    int factorial = 1;
    for(int i = 1; i < s + 1; i++){
      factorial = factorial * i;
    } //Method to get factorial

    int[] add = new int[];

    for(int j = 0; j < factorial * 10; j++){
      Collections.shuffle(digits); //randomizes order of digits
      

      if(paths.indexOf())
    }

  }
}

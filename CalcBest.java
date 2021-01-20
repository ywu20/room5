import java.util.*;

public class CalcBest {
    private String[] best;
    private ArrayList<String> perms;

    private ArrayList<String> CalcPerms(int s) {
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

    public static void removeDuplicates(ArrayList<String> s){  
        for (int i = s.size() - 1; i < s.size() && i >= 0; i--) {
          if (s.indexOf(s.get(i)) != i) {
            s.remove(i);
          }
        }
    }

    public CalcBest(int[][] distances) {
        calc(distances);
    }

    public void calc(int[][] distances) {
        perms = CalcPerms(distances.length);
        removeDuplicates(perms);
        best = new String[2];

        int bestDistance = 2147483647;
        String bestPath = "";

        for (int i = 0; i < perms.size(); i++) {
            int tempDistance = 0;
            String path = perms.get(i);
            for (int j = 0; j < path.length() - 1; j++) {
                tempDistance += distances[j][j+1];
            }
            if (tempDistance < bestDistance) {
                bestPath = path;
                bestDistance = tempDistance;
            }
        } 

        best[0] = bestPath;
        best[1] = Integer.toString(bestDistance);
    }

    public String[] getBest() {
        return best;
    }
}
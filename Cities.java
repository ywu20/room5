import java.util.*;
public class Cities{
  public static void main (String[] args){
    ArrayList<String> city= new ArrayList<String>();
    ArrayList<String[]> path= new ArrayList<String[]>();
    Scanner file = new Scanner(System.in);
    for(int j=0;file.hasNextLine();j++){
      String line = file.nextLine();
      Scanner word = new Scanner(line);
      String[] a= new String[3];
      for(int i=0;word.hasNext();i++){
        String c=word.next();
          if(i==0 || i==2) {
          if(city.indexOf(c) == -1){
            city.add(c);
          }
          a[i]=c;
        }

        if(i==4){
          a[1]=c;
        }
      }
      path.add(a);
    }


  int[][] distanceTable = new int[city.size()][city.size()];
  for(int i=0;i<path.size();i++){
    int c1=city.indexOf(path.get(i)[0]);
    int c2=city.indexOf(path.get(i)[2]);
    int d=Integer.parseInt(path.get(i)[1]);
          distanceTable[c1][c2]=d;
          distanceTable[c2][c1]=d; //if you guys don't need to be able to check in both directions delete this line.
    }

    System.out.println(Arrays.deepToString(distanceTable));

}
}

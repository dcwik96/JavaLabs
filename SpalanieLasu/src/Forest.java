import java.util.Random;

public class Forest {
  private static int size;

  public static void setSize(int x) {
    size = x;
  }

  public static void printForest(int[][] f) {
    System.out.println();
    for (int i = 0; i < f.length; i++) {
      System.out.println();
      for (int j = 0; j < f[i].length; j++) {
        System.out.print(f[i][j]);
      }
    }
  }

  public static int[][] createForest(int[][] f) {
    Random r = new Random();
    for (int i = 0; i < f.length; i++) {
      for (int j = 0; j < f[i].length; j++) {
        f[i][j] = r.nextInt(2);
      }
    }
    return f;
  }

  public static int[][] shootLightning(int[][] f,Lightning l) {
    if(f[l.x][l.y] == 1){
      f[l.x][l.y] = 2;
    }
    else System.out.println("There was no tree so fire is down");
    return f;
  }
  
  public static int[][] burnForest(int[][] f){
    
    return f;
  }

  private static int checkHowManyTree(int[][] f) {
    int t=0;
    for (int i = 0; i < f.length; i++) {
      for (int j = 0; j < f[i].length; j++) {
        if (f[i][j] == 1) t++;
      }
    }
    return t;
  }

  private static double analiseForest(int[][] f,int t){
    double result=0.00;
    retrun result;
  }
  public static void main(String[] args) {
    if (args.length == 1)
      setSize(Integer.parseInt(args[0]));
    else
      setSize(5);
    
    int[][] forest = new int[size][size];
    Lightning l = new Lightning(1,2);
    forest = createForest(forest);
    printForest(forest);
    shootLightning(forest,l);
    printForest(forest);
    analiseForest(forest,checkHowManyTree(forest));
  }

}

import java.util.Date;
import java.util.Scanner;

import static java.lang.System.exit;

/**
 * Created by dcwik on 25.01.17.
 *
 * Stwórz klasę, która obsługuje punkt w przestrzeni 3-wymiarowej. W klasie powinny być pola takie jak x, y, z lub tablica z trzema elementami typu double.
 * Elementy te, to współrzędne w przestrzeni, i mogą reprezentować położenie jakiegoś punktu, lub współrzędne wektora.
 * Klasa tego typu powinna umożliwiać przesuwanie wektora, mnożenie wektorów skalarne i wektorowe, oraz różne przydatne operacje, np. konwersję na system biegunowy, transformacje takie jak obrót lub rzutowanie, itp.
 * Od Twojej pomysłowości i zaangażowania zależy co zaimplementujesz.
 * Taką klasę będzie potem można wykorzystać do stworzenia małego programu animującego na ekranie obiekty trójwymiarowe.
 *
 */
public class Wektor {
  private static double x;
  private static double y;
  private static double z;

  private Wektor(double x,double y,double z){
    this.x=x;
    this.y=y;
    this.z=z;
  }
  private Wektor(double x,double y){
    this.x=x;
    this.y=y;
    this.z=0;
  }
  private Wektor(double x){
    this.x=x;
    this.y=0;
    z=0;
  }
  private Wektor(){
    this.x=0;
    this.y=0;
    this.z=0;
  }

  private static void makeManu(Wektor w1){
    Scanner in = new Scanner(System.in);
    System.out.println("Witaj w programie dotyczacym wektorów.");
    System.out.println("Twoj wektor który podałeś do ćwiczeń ma parametry:");
    System.out.println("x = "+ w1.x +"  y = "+ w1.y +"  z = "+ w1.z);
    System.out.println("Co chciałbyś zrobić ze swoim wektorem");
    System.out.println("(1) Przesuń wektor");
    int num = in.nextInt();
    switch (num){
      case 1:
        System.out.println("Elo");
    }
  }

  public static void main(String[] args){
    if (args.length > 0){
      if (args.length == 1){
        Wektor w1 = new Wektor(Double.parseDouble(args[0]));
        makeManu(w1);
      }
      if (args.length == 2){
        Wektor w1 = new Wektor(Double.parseDouble(args[0]),Double.parseDouble(args[1]));
        makeManu(w1);
      }
      if (args.length == 3){
        Wektor w1 = new Wektor(Double.parseDouble(args[0]),Double.parseDouble(args[1]),Double.parseDouble(args[2]));
        makeManu(w1);
      }
    }
    if (args.length > 3) exit(0);
    else {
      Wektor w1 = new Wektor();
      makeManu(w1);
    }

  }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String[] bombo1 = new String[5];
        String[] bombo2 = new String[5];

        System.out.println("BOMBO 1");
        for (int i = 0; i < bombo1.length; i++) {
            System.out.println("Ingresa el equipo " + (i+1));
            bombo1[i] = scr.nextLine();
        }

        System.out.println("BOMBO 2");
        for (int i = 0; i < bombo2.length; i++) {
            System.out.println("Ingresa el equipo " + (i+1));
            bombo2[i] = scr.nextLine();
        }

        ArrayList<Integer> usados1 = new ArrayList<>();
        ArrayList<Integer> usados2 = new ArrayList<>();
        for (int i = 0; i < bombo1.length; i++) {
            int num1, num2;

            do{
                num1 = (int) (Math.random()*5);
            } while (usados1.contains(num1));
            usados1.add(num1);

            do{
                num2 = (int) (Math.random()*5);
            } while (usados2.contains(num2));
            usados2.add(num2);

            System.out.println(bombo1[num1] + " vs " + bombo2[num2]);
        }

    }
}

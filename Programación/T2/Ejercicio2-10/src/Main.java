import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        float salario, salarioNorm, salarioExt,salarioTotal;
        String rpt;
        int horasTrab, horasExtra;
        boolean extra = true;

        Scanner scr = new Scanner(System.in);

        System.out.println("Introduce el salario por hora");
        salario = scr.nextFloat();
        System.out.println("Introduce las horas trabajadas");
        horasTrab = scr.nextInt();

        if (horasTrab<40){
            extra = false;
            salarioTotal = horasTrab * salario;
            System.out.println("¿Hiciste horas extra?: " + extra);
            System.out.println("Salario total: "+salarioTotal);
        } else if (horasTrab>40) {
            extra = true;
            horasExtra = horasTrab - 40;
            salarioNorm = 40 * salario;
            salarioExt = horasExtra * salario * 2;
            salarioTotal = salarioNorm + salarioExt;

            System.out.println("Horas normales: 40");
            System.out.println("¿Hiciste horas extra?: " + extra);
            System.out.println("Horas extra: " + horasExtra);
            System.out.println("Tu salario por horas normales: " + salarioNorm);
            System.out.println("Tu salario por horas extras: " + salarioExt);
            System.out.println("Tu salario total: " + salarioTotal);
        }

    }
}

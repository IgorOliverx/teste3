package EstruturaIfElse;

import java.util.Scanner;

public class IfElse {

    Scanner sc = new Scanner (System.in);

    public void exercicio1() {

        System.out.println("Olá! Por favor, insira o seu salário bruto para que o reajuste possa ser feito!");
        int salario = sc.nextInt();
        double salarioNovo1 = salario + (salario * 20/100);
        double salarioNovo2 = salario + (salario * 15/100);
        double salarioNovo3 = salario + (salario * 10/100);
        double salarioNovo4 = salario + (salario * 5/100);

        if (salario<=1280) {

          

            System.out.println("O seu salário antes do reajuste era de R$"+ salario);
            System.out.println("O percentual de aumento foi de 20% sobre o valor antigo");
            System.out.println("O valor do aumento foi de R$"+ salario*0.20);
            System.out.println("O seu salário após o reajuste é de R$"+salarioNovo1);


        } if  ((salario>1280) && (salario<1700)) {

            System.out.println("O seu salário antes do reajuste era de R$"+ salario);
            System.out.println("O percentual de aumento foi de 15% sobre o valor antigo");
            System.out.println("O valor do aumento foi de R$"+ salario*0.15);
            System.out.println("O seu salário após o reajuste é de R$"+salarioNovo2);
        } 
        if  ((salario>1700) && (salario<2500)) {

            System.out.println("O seu salário antes do reajuste era de R$"+ salario);
            System.out.println("O percentual de aumento foi de 10% sobre o valor antigo");
            System.out.println("O valor do aumento foi de R$"+ salario*0.10);
            System.out.println("O seu salário após o reajuste é de R$"+salarioNovo3); } 

            if  (salario>2500) {

                System.out.println("O seu salário antes do reajuste era de R$"+ salario);
                System.out.println("O percentual de aumento foi de 5% sobre o valor antigo");
                System.out.println("O valor do aumento foi de R$"+ salario*0.05);
                System.out.println("O seu salário após o reajuste é de R$"+salarioNovo4); } 
    











    }










    }


    



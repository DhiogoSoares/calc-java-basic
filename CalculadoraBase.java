
import java.util.*;

public class CalculadoraBase {

    public static void main (String[] args){

        double num1, num2, res=0;
        char opt;

        Scanner readNum = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
            num1 = readNum.nextDouble();

        System.out.print("Insira o segundo valor: ");
            num2 = readNum.nextDouble();

        System.out.println("\nSelecione o tipo de operação: " +
                            "\nSoma: +" +
                            "\nSubtração: -" +
                            "\nMultiplicação: *" +
                            "\nDivisão: /" +
                            "\n");
        opt = readNum.next().charAt(0);

        switch (opt){
            case '+' :
                System.out.println("Soma selecionada.");
                res= num1+num2;
                System.out.println("\nValor 1: " + num1 + "\nValor 2: " + num2 + "\n\nResultado de sua operação: " + res + "");
            break;

            case '-' :
                System.out.println("Subtração selecionada.");
                res= num1-num2;
                System.out.println("\nValor 1: " + num1 + "\nValor 2: " + num2 + "\n\nResultado de sua operação: " + res + "");
            break;

            case '*' :
                System.out.println("Multiplicação selecionada.");
                res= num1*num2;
                System.out.println("\nValor 1: " + num1 + "\nValor 2: " + num2 + "\n\nResultado de sua operação: " + res + "");
            break;

            case '/' :
                System.out.println("Divisão selecionada.");
                res= num1/num2;
                System.out.println("\nValor 1: " + num1 + "\nValor 2: " + num2 + "\n\nResultado de sua operação: " + res + "");
            break;

            default:
                System.out.println("Operação inexistente.");
        }//Fecha switch

    }//Fecha main
}//Fecha CalculadoraBase

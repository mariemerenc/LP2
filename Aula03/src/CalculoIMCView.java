import java.util.Scanner;

public class CalculoIMCView{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        System.out.print("Digite o peso (em kg): ");
        double peso = scanner.nextDouble();
        pessoa.setPeso(peso);

        System.out.print("Digite a alutra (em m): ");
        double altura = scanner.nextDouble();
        pessoa.setAltura(altura);

        double imc = pessoa.calcularIMC();
        String classf = pessoa.informarIMC(imc);

        System.out.println("IMC calculado: " + imc);
        System.out.println("Classificação: " + classf);

        scanner.close();
    }
}
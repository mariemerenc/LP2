public class Pessoa{
    private double peso;
    private double altura; 

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularIMC(){
        return peso / (altura * altura);
    }

    public String informarIMC(double imc){
        if (imc < 16) {
            return "Magreza grave";
        } else if (imc >= 16 && imc < 17) {
            return "Magreza moderada";
        } else if (imc >= 17 && imc < 18.5) {
            return "Magreza leve";
        } else if (imc >= 18.5 && imc < 25) {
            return "Saudável";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            return "Obesidade Grau I";
        } else if (imc >= 35 && imc < 40) {
            return "Obesidade Grau II (severa)";
        } else {
            return "Obesidade Grau III (mórbida)";
        }
    }
}



    

import java.util.ArrayList;

class Prova{
    double nota1;
    double nota2;

    public Prova(double n1, double n2){
        nota1 = n1;
        nota2 = n2;
    }

    public double calcularNotaFinal(){
        return nota1 + nota2;
    }

}

class Turma{
    ArrayList<Aluno> alunos;

    public Turma(){
        alunos = new ArrayList<Aluno>();
    }

    public double calcularMediaTurma(){
        double media = 0;
        short cont = 1;

        for(Aluno i : alunos){
            System.out.print("Aluno " + cont);
            media += i.calcularMedia();
            cont++;
        }

        return media / alunos.size();
    }
}

class Aluno{
    Prova prova1;
    Prova prova2;

    ArrayList<Prova> provas;

    public Aluno(double[] notas){
        prova1 = new Prova(notas[0], notas[1]);
        prova2 = new Prova(notas[2], notas[3]);

        provas = new ArrayList<Prova>();

        provas.add(prova1);
        provas.add(prova2);
    }

    public double calcularMedia(){
        double media = 0;

        for(Prova i : provas){
            media = i.calcularNotaFinal();
        }

        System.out.println(" --> média: " + media/2);

        return media/2;
    }
}

public class SistemaEscolar {
    
    public static void main(String[] args){
        Turma a = new Turma();

        double[] notasAluno1 = {3.5, 5.0, 4.0, 4.5};
        double[] notasAluno2 = {4.5, 1.0, 1.5, 2.0};
        double[] notasAluno3 = {2.0, 5.0, 5.0, 5.0};

        Aluno aluno1 = new Aluno(notasAluno1);
        a.alunos.add(aluno1);

        Aluno aluno2 = new Aluno(notasAluno2);
        a.alunos.add(aluno2);

        Aluno aluno3 = new Aluno(notasAluno3);
        a.alunos.add(aluno3);

        double mediaTotal = a.calcularMediaTurma();

        System.out.println("----------------------------------");
        System.out.println("Média da Turma: " + mediaTotal);
        System.out.println("----------------------------------");
    }
}

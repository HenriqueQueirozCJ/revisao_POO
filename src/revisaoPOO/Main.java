
package revisaoPOO;
import java.util.Scanner;
public class Main {
    static int opcao;
    static void entrada(){
        System.out.println("Informe o nome do Aluno: ");
    }
    static void entradaNota(){
        System.out.println("Informe as notas do Aluno: ");
    }
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        Aluno a1 = new Aluno();
        AlunoTec at = new AlunoTec();
        AlunoFac af = new AlunoFac();
        System.out.println("Informe a opcão de aluno que deseja consultar: [1] Aluno || [2] Aluno Técnicop || [3] Aluno Faculdade");
        opcao = en.nextInt();
        switch(opcao){
            case 1:
                entrada();
                a1.nome = en.next();
                entradaNota();
                a1.n1 = en.nextDouble();
                a1.n2 = en.nextDouble();
                a1.calcMedia();
            break;
            case 2:
                entrada();
                at.nome = en.next();
                entradaNota();
                at.n1 = en.nextDouble();
                at.n2 = en.nextDouble();
                at.n3 = en.nextDouble();
                at.calcMedia();
            break;
            case 3:
                entrada();
                af.nome = en.next();
                entradaNota();
                af.n1 = en.nextDouble();
                af.n2 = en.nextDouble();
                af.n3 = en.nextDouble();
                af.n4 = en.nextDouble();
                af.calcMedia();
        }
    }
}

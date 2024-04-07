package revisaoPOO;

public class AlunoTec extends Aluno{
    double n3;
    void calcMedia() {
        media = (n1+n2+n3)/3;
        if(media>=6 && media<=10){
            status = "Aluno Tec aprovado";
            System.out.printf(" " + status);
        }else if (media>=4 && media<=5.9){
            status = "Aluno Tec reprovado ou em recuperação";
            System.out.printf(" " + status);
        }
    }
}


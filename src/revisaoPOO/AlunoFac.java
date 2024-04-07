package revisaoPOO;

public class AlunoFac extends AlunoTec{
    double n4;
    void calcMedia() {
        media = (n1+n2+n3+n4)/4;
        if(media>6 && media<=10){
            status = "Aluno fac aprovado";
            System.out.printf(" " + status);
        }else if (media>=4 && media<=5.9){
            status = "Aluno fac ou em recuperação";
            System.out.printf(" " + status);
        }
    }
}

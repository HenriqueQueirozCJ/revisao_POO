package revisaoPOO;

public class Aluno {
    String nome;
    String status;
    double n1;
    double n2;
    double media;
    void calcMedia(){
        media = (n1+n2)/2;
        if(media>=6 && media<=10){
            status = "Aluno aprovado";
            System.out.printf(" " + status);
        }else if (media>=4 && media<=5.9){
            status = "Aluno  reprovado ou em recuperação";
            System.out.printf(" " + status);
        }

    }

}


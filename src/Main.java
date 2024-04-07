public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Henrique","Mauazinho","Av abreu",3000,"2038936201");
        PessoaJuridica pj = new PessoaJuridica("08.145.730/0001-92","Pablo","Adrianopolis","Av Mario Ypiranga",50000);

        System.out.printf("Pessoa física: %s \n Bairro: %s \n Endereço: %s \n Renda: %f CPF: %s \n Imposto: ",p1.nome,p1.bairro,p1.endereco,p1.renda,p1.cpf);
        p1.calcImp();
        System.out.printf("Pessoa Jurídica: %s \n Nome: %s \n, Bairro: %s \n, Endereco: %s \n, Renda: %f",pj.cnpj,pj.nome,pj.bairro,pj.endereco,pj.renda);
        pj.calcImp();
    }
}
class Pessoa{
    String cpf;
    String nome;
    String endereco;
    float renda;
    float imposto;
    String bairro;

    public Pessoa(String nome,String bairro, String endereco, float renda,String cpf){
        this.nome = nome;
        this.bairro=bairro;
        this.endereco=endereco;
        this.renda=renda;
        this.cpf=cpf;
    }
    void calcImp(){
        if(renda<=3000){
            System.out.println("Isento de imposto");
        }else if(renda>=3000 && renda<=4000){
            this.imposto = (float)(renda * 0.01);
            System.out.println(imposto);
        }else if(renda>=4000 && renda<=6000){
            this.imposto = (float)(renda * 0.02);
            System.out.println(imposto);
        }else{
            imposto = (float)(renda * 0.03);
            System.out.println(imposto);
        }

    }
}
class PessoaJuridica extends Pessoa{
    String cnpj;
    public PessoaJuridica(String cnpj,String nome, String bairro, String endereco, float renda){
        super(nome,bairro,endereco,renda,cnpj);
        this.cnpj=cnpj;

    }

    void calcImp() {
        super.calcImp();
        if(renda<=5000){
            this.imposto = (float)(renda * 0.05);
            System.out.println(imposto);
        }else if(renda>=5000 && renda<=25000){
            this.imposto = (float)(renda * 0.12);
            System.out.println(imposto);
        }else if(renda>=25000 && renda<=50000){
            this.imposto = (float)(renda * 0.17);
            System.out.println(imposto);
        }else{
            this.imposto = (float)(renda * 0.20);
            System.out.println(imposto);
        }
    }
}

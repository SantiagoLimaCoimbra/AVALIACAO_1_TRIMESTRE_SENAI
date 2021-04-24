package sample;

import sample.model.Endereco;
import sample.model.PessoaFisica;
import sample.model.PessoaJuridica;

public class Main {

    public static void main(String[] args){

        PessoaFisica pessoaFisica1 = new PessoaFisica("Jubileu");
        pessoaFisica1.setEndereco("Servidão Rau Januario", 678, "Rio Tavares", "88047-021");
        pessoaFisica1.setCpf("45254853235");
        pessoaFisica1.setRg("45345345325");

        System.out.println(pessoaFisica1);

        System.out.println("<< - - - - >>");

        PessoaJuridica pessoaJuridica1 = new PessoaJuridica("Sant LTDA");
        pessoaJuridica1.setEndereco("Rod. Virgílio Várzea", 1300, "Monte Verde", "88032-005");
        pessoaJuridica1.setCnpj("545314324");
        pessoaJuridica1.setIe(" * Não sei o que é isso ;--; * ");

        System.out.println(pessoaJuridica1);

        System.out.println("\n //////////////////////////// \n");

        PessoaFisica pessoaFisica2 = new PessoaFisica("Joan");
        pessoaFisica2.setEndereco("rua de baixo", 343, "liberdade", "4565656");
        pessoaFisica2.setCpf("56546745757");
        pessoaFisica2.setRg("345634656");
        System.out.println(pessoaFisica2);

        Endereco enderecoPJ2 = new Endereco();
        enderecoPJ2.setRua("Rua teste");
        enderecoPJ2.setNumero(4556);
        enderecoPJ2.setBairro("testebairro");
        enderecoPJ2.setCep("testecep");

        PessoaJuridica pessoaJuridica2 = new PessoaJuridica("Cleiton", enderecoPJ2);
        pessoaJuridica2.setCnpj("88888888888");
        pessoaJuridica2.setIe("4444444444");
        System.out.println(pessoaJuridica2);
    }
}

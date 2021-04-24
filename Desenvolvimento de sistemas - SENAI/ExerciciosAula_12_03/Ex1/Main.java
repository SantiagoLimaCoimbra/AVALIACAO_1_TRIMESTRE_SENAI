package sample;

import sample.model.Endereco;
import sample.model.Pessoa;

public class Main {

    public static void main(String[] args){
	
	//Objeto endereco
        Endereco endereco = new Endereco();
        endereco.setRua("Caminho das dunas");
        endereco.setBairro("Rio Vermelho");
        endereco.setNumero(213);
        endereco.setCidade("Florianópolis");

        //System.out.println(endereco);

	//Objeto pessoa
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joan");
        pessoa.setDataNascimento("30/09/2000");

        pessoa.setEndereco(endereco);

        System.out.println(pessoa);

    }
}

package sample.model;

public abstract class Veiculo {
    //Atributos
    private String nome;
    private Marca marca;
    private String descricao;

    //Construtor da classe veículo
    public Veiculo(String nome){
        this.nome = nome;
    }

    public Veiculo(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }

    //Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(String nome, String descricao) {
        Marca marca = new Marca();
        marca.setNome(nome);
        marca.setDescricao(descricao);
        this.marca = marca;
    }

    public void setMarca(Marca marca){
        this.marca = marca;
    }

    //To String
    @Override
    public String toString() {
        return "\nVeiculo = " +
                "Nome: " + nome +
                "; " + marca;
    }
}

public class Servico {

    private String nome;
    private double dias;
    private double valor;
    private String categoria;

    public Servico(String nome, double dias, double valor, String categoria){
        this.nome = nome;
        this.dias = dias;
        this.valor = valor;
        this.categoria = categoria;
    }

    public double getValor(){
        return valor;
    }

}
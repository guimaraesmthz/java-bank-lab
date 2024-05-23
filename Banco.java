import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    void Banco(String nomeDoBanco){
        this.nome = nomeDoBanco;
    };

    void adicionarConta(Conta conta){
        this.contas.add(conta);
    };

}

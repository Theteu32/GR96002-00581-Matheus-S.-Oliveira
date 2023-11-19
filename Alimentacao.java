public class Alimentacao extends Loja {
    private Data dataAlvara;


public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
                    Endereco endereco, Data dataFundacao, Data dataAlvara, int capacidadeEstoque) {
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);
    this.dataAlvara = dataAlvara;
}

public Data getDataAlvara() {
    return dataAlvara;
}

public void setDataAlvara(Data dataAlvara){
    this.dataAlvara = dataAlvara;
}



public String toString() {
    return super.toString() +
                ", Data alvará: " + dataAlvara + ")";
}
}
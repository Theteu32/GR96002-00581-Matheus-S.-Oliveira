public class Data {
    private int dia;
    private int mes;
    private int ano;

public Data (int dia, int mes, int ano){
    if(validarData(dia, mes, ano)){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    else{
        System.out.println("Data inválida. ultilizaremos a data padão: 1/1/2000");
        this.dia = 1;
        this.mes = 1;
        this.ano = 2000;
    }
}

public int getDia(){
    return dia;
}

public void setDia (int dia){
    if (validarData(dia, this.mes, this.ano)){
        this.dia = dia;
    }
    else{
        System.out.println("dia inválido.");
    }
}
public int getMes(){
    return mes;
}

public void setMes (int mes){
    if (validarData(this.dia, mes, this.ano)){
        this.mes = mes;
    }
    else {
        System.out.println("Mês inválido.");
    }
}

public int getAno(){
    return ano;
}

public void setAno (int ano){
    if (validarData(this.dia, this.mes, ano)){
        this.ano = ano;
    }
    else {
        System.out.println("Ano inválido.");
    }
}

public String toString(){
    return "(Dia: "+ ano + "Mês : " + mes + "Ano" + ano + ")";
}

public boolean verificaAnoBissexto() {
    return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
}

private boolean validarData(int dia, int mes, int ano) {
    if (mes < 1 || mes > 12 || dia < 1) {
        return false;
    }

    int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    if (mes == 2 && verificaAnoBissexto()) {
        diasPorMes[2] = 29;
    }

    return dia <= diasPorMes[mes];
}
}
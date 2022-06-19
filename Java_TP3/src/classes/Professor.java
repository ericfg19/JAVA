package classes;

import exception.NomeIncompletoException;

import java.text.Format;

public class Professor extends Pessoa{
    private String disciplina;
    private int cargaHoraria;
    private float valorHora;

    public Professor(){
        super();
    }

    public Professor(String nome, int idade, String email, String disciplina, int cargaHoraria, float valorHora) throws NomeIncompletoException {
        super(nome,idade, email);
        this.disciplina = disciplina;
        this.cargaHoraria = cargaHoraria;
        this.valorHora = valorHora;
    }

    @Override
    public void imprimir() {

        StringBuilder linha = new StringBuilder();

        linha.append("Id           : " + getId() + "\n");
        linha.append("Nome         : " + getNome() + "\n");
        linha.append("Idade        : " + getIdade() + "\n");
        linha.append("Email        : " + getEmail() + "\n");
        linha.append("Disciplina   : " + this.disciplina + "\n");
        linha.append(String.format("Carga horária: %d \n", this.cargaHoraria ));
        linha.append(String.format("Valor hora   : R$ %.2f \n", this.valorHora));

        System.out.println(linha);
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }


}

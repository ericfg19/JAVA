package classes;

import exception.NomeIncompletoException;

import java.util.Locale;

public class Aluno extends Pessoa {
    private String curso;
    private boolean matriculado;
    private float valorMensalidade;

    public Aluno() {
        super();
    }

    public Aluno(String nome, int idade, String email, String curso, boolean matriculado, float valorMensalidade) throws NomeIncompletoException {
        super(nome, idade, email);
        this.curso = curso;
        this.matriculado = matriculado;
        this.valorMensalidade = valorMensalidade;
    }

    @Override
    public void setNome(String nome) throws NomeIncompletoException {
        if (nome == null || nome.indexOf(" ") <= 0){
            throw new NomeIncompletoException("É obrigatório ter nome e sobrenome.");
        }
        String[] arrayNome = nome.split(" ");
        String nomeInteiro = "";

        for (String obj: arrayNome ) {
            nomeInteiro = nomeInteiro + obj + " ";
        }

        super.setNome(nomeInteiro.trim());
    }

    @Override
    public void imprimir() {

        StringBuilder linha = new StringBuilder();

        linha.append("Id               : " + getId() + "\n");
        linha.append("Nome             : " + getNome() + "\n");
        linha.append("Idade            : " + getIdade() + "\n");
        linha.append("Email            : " + getEmail() + "\n");
        linha.append("Curso            : " + this.curso + "\n");
        linha.append("Matriculado      : " + (this.matriculado ? "Sim" : "Não") + "\n");
        linha.append(String.format("Valor mensalidade: R$ %.2f \n", this.valorMensalidade));

        System.out.println(linha);

    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    public float getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(float valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }
}

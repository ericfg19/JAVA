package classes;

import exception.EmailInvalidoException;
import exception.NomeIncompletoException;

import java.util.Locale;

public abstract class Pessoa {
    private int id;
    private String nome;
    private String nomeMeio;
    private String sobreNome;
    private int idade;
    private String email;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String email) throws NomeIncompletoException {
        this.setNome(nome);
        this.idade = idade;
        this.email = email;
    }

    public StringBuilder getNome() {
        StringBuilder nomeCompleto = new StringBuilder();
        nomeCompleto.append(this.nome.toUpperCase(Locale.ROOT));
        nomeCompleto.append(" ");
        nomeCompleto.append(this.nomeMeio.toUpperCase(Locale.ROOT));
        nomeCompleto.append(" ");
        nomeCompleto.append(this.sobreNome.toUpperCase(Locale.ROOT));
        nomeCompleto.append(" ");
        return nomeCompleto;
    }

    public void setNome(String nome) throws NomeIncompletoException {
        if (nome == null || nome.indexOf(" ") <= 0){
            throw new NomeIncompletoException("É obrigatório ter nome e sobrenome.");
        }
        this.nome = nome.substring(0, nome.indexOf(" "));
        this.nomeMeio = nome.substring(nome.indexOf(" "), nome.lastIndexOf(" ")).trim();
        this.sobreNome = nome.substring(nome.lastIndexOf(" ")).trim();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws EmailInvalidoException {
        this.email = email.toLowerCase();
        validarEmail();
    }

    public void validarEmail() throws EmailInvalidoException {
        String mensagem = null;
        String usuario;
        String dominio;
        int arroba = this.email.indexOf("@");
        if (arroba < 0) {
            mensagem = "Email inválido. Campo de e-mail deve possuir '@' em sua estrutura.";
        } else {
            usuario = this.email.substring(0, this.email.indexOf("@"));
            if (usuario.length() <= 0) {
                mensagem = "Email inválido. Antes do '@' deve haver um nome.";
            } else {
                dominio = this.email.substring(arroba + 1);
                if (dominio.length() <= 0) {
                    mensagem = "Email inválido. Depois do '@' deve haver um domínio.";
                } else {
                    if (usuario.contains(" ") || dominio.contains(" ")) {
                        mensagem = "Email inválido. Não pode haver 'espaços' no endereço de email.";
                    } else {
                        if (!dominio.contains(".")) {
                            mensagem = "Email inválido. No domínio deve haver pelo menos um separador '.'.";
                        }
                    }
                }
            }
        }

        if (mensagem != null) {
            throw new EmailInvalidoException(mensagem);
        }
    }

    public abstract void imprimir();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}

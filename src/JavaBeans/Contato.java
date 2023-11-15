
package JavaBeans;

import Exceptions.LimiteCharException;
import Exceptions.NomeVazioException;

public class Contato {
    private String nome, telefone, celular, endereco, email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws NomeVazioException, LimiteCharException {
        if (!nome.equals("")) {
            if (nome.length() <= 150) this.nome = nome;
            else throw new LimiteCharException(1);
        }
        else throw new NomeVazioException();
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) throws LimiteCharException{
        if (telefone.length() <= 15) this.telefone = telefone; 
        else throw new LimiteCharException(2);
        }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) throws LimiteCharException{
        if (celular.length() <= 15) this.celular = celular;
        else throw new LimiteCharException(3);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) throws LimiteCharException{
        if (endereco.length() <= 150) this.endereco = endereco;
        else throw new LimiteCharException(4);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws LimiteCharException{
        if (email.length() <= 150) this.email = email;
        else throw new LimiteCharException(5);
    }
}

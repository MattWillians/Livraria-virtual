package livraria;

public class Autor {
    //--- CONSTRUÇÃO DOS OBJETOS ---//
    private String nome;
    private String email;
    private String nacionalidade;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Autor(String nome, String email, String nacionalidade) {
        this.nome = nome;
        this.email = email;
        this.nacionalidade = nacionalidade;
    }
    
    //---------------------------------//
 
    //-- CORPO DO PROGRAMA --//
    public void info(){
        System.out.println("Nome do autor: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Nacionalidade: " + nacionalidade);
    }

}

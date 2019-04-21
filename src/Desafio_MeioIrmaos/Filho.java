package Desafio_MeioIrmaos;

public class Filho {

    private String nome;
    private String mae;
    private String pai;

    public Filho() {
    }

    public Filho(String nome, String mae, String pai) {
        this.nome = nome;
        this.mae = mae;
        this.pai = pai;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public boolean mesmaMae (Filho filho)
    {
        return this.mae == filho.mae;
    }
    public boolean mesmoPai (Filho filho)
    {
        return this.pai == filho.pai;
    }
    public void saoMeioIrmaos (Filho filho)
    {
        if (mesmaMae(filho) == false && mesmoPai(filho) == false)
        {
            System.out.println(this.getNome() + " e " + filho.getNome() + " não são irmaos");
        }
        if (mesmaMae(filho) == false && mesmoPai(filho) == true || mesmaMae(filho) == true && mesmoPai(filho) == false )
        {
            System.out.println(this.getNome() + " e " + filho.getNome() + " são meio irmaos");
        }
        if (mesmaMae(filho) == true && mesmoPai(filho) == true)
        {
            System.out.println(this.getNome() + " e " + filho.getNome() + " são irmaos");
        }
    }
}

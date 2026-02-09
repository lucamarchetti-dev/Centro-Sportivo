package CentroSportivo;

public abstract class Corso {

    protected final String id;
    protected String nome;
    protected int postiDisponibili;
    protected boolean attivo;

    public Corso(String id, String nome, int postiDisponibili, boolean attivo) {
        this.id = id;
        this.nome = nome;
        this.postiDisponibili = postiDisponibili;
        this.attivo = attivo;
    }

    public String getId() { return id; }

    public String getNome() { return nome; }

    public int getPostiDisponibili() { return postiDisponibili; }

    public boolean isAttivo() { return attivo; }

    // metodo astratto
    public abstract String getTipo();

    // stampa tipo, id, nome, posti, attivo
    public void scheda() {
        System.out.println("Tipo: " + getTipo() + ", ID: " + id + ", Nome: " + nome + ", Posti: " + postiDisponibili + ", Attivo: " + attivo);
    }

    // decrementa posti se possibile
    public boolean iscrivi() {
        if (postiDisponibili > 0 && attivo) {
            postiDisponibili--;
            return true;
        }
        return false;
    }

    // incrementa posti
    public void disiscrivi() {
        postiDisponibili++;
    }
}
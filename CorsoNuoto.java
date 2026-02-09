package CentroSportivo;

public class CorsoNuoto extends Corso {

    private String livello;

    public CorsoNuoto(String id, String nome, int postiDisponibili, boolean attivo, String livello) {
        super(id, nome, postiDisponibili, attivo);
        this.livello = livello;
    }

    @Override
    public String getTipo() {
        return "Nuoto";
    }

    @Override
    public void scheda() {
        super.scheda();
        System.out.println("Livello: " + livello);
    }
}

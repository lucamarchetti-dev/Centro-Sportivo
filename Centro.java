package CentroSportivo;
import java.util.ArrayList;
import java.util.List;

public abstract class Centro {
    protected List<Corso> corsi;
    protected List<Iscritto> iscritti;
    protected static int iscrizioniTot = 0; 

    public Centro(){
        this.corsi = new ArrayList<>();
        this.iscritti = new ArrayList<>();
    }

    void aggiungiCorso(Corso c) {
        corsi.add(c);
    }
    void aggiungiIscritto(){
        iscritti.add(i);
    }
}

public class Equipo {

    private String nombreDeEquipo;
    private int numeroDeJugadores;
    private String nombreDelDT;

    public Equipo(String nombreDeEquipo, int numeroDeJugadores, String nombreDelDT) {
        this.nombreDeEquipo = nombreDeEquipo;
        this.numeroDeJugadores = numeroDeJugadores;
        this.nombreDelDT = nombreDelDT;
    }


    public String getNombreDeEquipo() {
        return nombreDeEquipo;
    }

    public void setNombreDeEquipo(String nombreDeEquipo) {
        this.nombreDeEquipo = nombreDeEquipo;
    }

    public int getNumeroDeJugadores() {
        return numeroDeJugadores;
    }

    public void setNumeroDeJugadores(int numeroDeJugadores) {
        this.numeroDeJugadores = numeroDeJugadores;
    }

    public String getNombreDelDT() {
        return nombreDelDT;
    }

    public void setNombreDelDT(String nombreDelDT) {
        this.nombreDelDT = nombreDelDT;
    }
}

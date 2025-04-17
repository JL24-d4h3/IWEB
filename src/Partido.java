import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Partido {

    private String idPartido;
    private String marcadorFinal;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;

    public Partido(String idPartido, String marcadorFinal, Equipo equipoLocal, Equipo equipoVisitante) {
        this.idPartido = idPartido;
        this.marcadorFinal = marcadorFinal;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    public String getNombre() {
        return idPartido;
    }

    public void setNombre(String nombre) {
        this.idPartido = nombre;
    }

    public String getMarcadorFinal() {
        return marcadorFinal;
    }

    public void setMarcadorFinal(String marcadorFinal) {
        this.marcadorFinal = marcadorFinal;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }
}

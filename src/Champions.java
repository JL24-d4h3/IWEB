import java.util.ArrayList;

public class Champions {

    ArrayList<Partido> listaDePartidosOctavos = new ArrayList<>();
    ArrayList<Partido> listaDePartidosCuartos = new ArrayList<>();
    ArrayList<Partido> getListaDePartidosSemifinales = new ArrayList<>();



    public ArrayList<Partido> getListaDePartidosOctavos() {
        return listaDePartidosOctavos;
    }

    public void setListaDePartidosOctavos(ArrayList<Partido> listaDePartidosOctavos) {
        this.listaDePartidosOctavos = listaDePartidosOctavos;
    }

    public ArrayList<Partido> getListaDePartidosCuartos() {
        return listaDePartidosCuartos;
    }

    public void setListaDePartidosCuartos(ArrayList<Partido> listaDePartidosCuartos) {
        this.listaDePartidosCuartos = listaDePartidosCuartos;
    }

    public ArrayList<Partido> getGetListaDePartidosSemifinales() {
        return getListaDePartidosSemifinales;
    }

    public void setGetListaDePartidosSemifinales(ArrayList<Partido> getListaDePartidosSemifinales) {
        this.getListaDePartidosSemifinales = getListaDePartidosSemifinales;
    }
}

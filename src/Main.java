import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("1.Registro de equipos");
        System.out.println("2.Sorteo de llaves");
        System.out.println("3.Colocar Resultados");
        System.out.println("4.Imprimir Resultados");
        System.out.println("5.Salir");

        String nombreDeEquipoString;
        int numeroDeJugadoresInt;
        String nombreDelDTString;

        do {
            System.out.println("Ingrese el nombre del equipo: ");
            Scanner nombreDeEquipo = new Scanner(System.in);
            nombreDeEquipoString = nombreDeEquipo.nextLine();
            System.out.println("Ingrese el número de jugadores del equipo: ");
            Scanner numeroDeJugadores = new Scanner(System.in);
            String numeroDeJugadoresString = numeroDeJugadores.nextLine();
            numeroDeJugadoresInt = Integer.parseInt(numeroDeJugadoresString);
            System.out.println("Ingrese el nombre del DT del equipo: ");
            Scanner nombreDelDT = new Scanner(System.in);
            nombreDelDTString = nombreDelDT.nextLine();


            Scanner opcion = new Scanner(System.in);
            String opcionString = opcion.nextLine();
            int opcionInt = Integer.parseInt(opcionString);

            switch (opcionInt) {
                case 5:
                    System.out.println("Ingrese el nombre del equipo: ");
                    break;
                default:
                    if (opcionInt > 5) {
                        break;
                    }
            }

            Equipo equipo = new Equipo(nombreDeEquipoString, numeroDeJugadoresInt, nombreDelDTString);
            ArrayList<Equipo> listaDeEquipos = new ArrayList<>();
            listaDeEquipos.add(equipo);

            String listaDeEquiposString = listaDeEquipos.toString();
            if (listaDeEquipos.size() > 16) {
                break;
            }

        } while (true);

        ArrayList<String> names = new ArrayList<>(Arrays.asList(listaDeEquiposString));
        Random rand = new Random();
        for (int i = 0; i < Math.min(2, names.size()); i++) {
            int randInt = rand.nextInt(names.size()); names.remove(randInt);
        }

        System.out.println("Resultados");
        System.out.println("1. Octavos");
        System.out.println("2. Cuartos");
        System.out.println("3. Semifinales");
        System.out.println("4. Final");
    }
}
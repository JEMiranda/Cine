import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author JonatanM
 */
public class Funcion {

    private int diaDeSemana;
    private Calendar horaDeInicio;
    private int Duracion;
    private int Numero;
    private Pelicula pelicula;
    private Sala sala;
    private List<Entrada> entradas;



    public Funcion(){entradas= new  ArrayList<Entrada>();
    }




    public Funcion(int diaDeSemana,Calendar horaDeInicio,int numero,int duracion,Pelicula pelicula,Sala sala){
        this.diaDeSemana=diaDeSemana;
        this.horaDeInicio=horaDeInicio;
        this.Duracion=duracion;
        this.Numero=numero;
        this.pelicula=pelicula;
        this.sala=sala;
    }






























}

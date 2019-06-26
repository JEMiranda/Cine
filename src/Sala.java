/**
 *
 * @author JonatanM
 */
public class Sala {

    private int capacidad;
    private int Numero;

// constructor por defecto

    public Sala(){}

//asignacion de atributos

    public Sala(int capacidad,int numero){
        this.capacidad=capacidad;
        this.Numero=numero;
    }

//seteo de metedos


    public int getCapacidad() {
        return capacidad;
    }

    public int getNumero() {
        return Numero;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }
}

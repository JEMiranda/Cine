import java.math.BigDecimal;
import java.util.Calendar;

/**
 *
 * @author JonatanM
 */
public class Entrada {

    private Calendar fechaHoraFuncion;
    private Calendar fechaHoraVanta;
    private BigDecimal precioCobrado;
    private int ticketNro;
    private Funcion funcion;

   /*
   Constructor por defecto
    */

    public Entrada() {
    }

    /**
     * Este constructor incluye todos los atributos de la clase Entrada
     *
     * @param fechaHoraFuncion
     * @param fechaHoraVanta
     * @param funcion
     * @param precioCobrado
     * @param ticketNro
     */


    public Entrada(Calendar fechaHoraFuncion,Calendar fechaHoraVanta, Funcion funcion, BigDecimal precioCobrado, int ticketNro) {
        this.fechaHoraFuncion=fechaHoraFuncion;
        this.fechaHoraVanta=fechaHoraVanta;
        this.funcion=funcion;
        this.precioCobrado=precioCobrado;
        this.ticketNro=ticketNro;
    }

    // A continuación se listan todos los métodos de seteo
    // de cada atributo de la clase


    public Calendar getFechaHoraFuncion() {
        return fechaHoraFuncion;
    }

    public void setFechaHoraFuncion(Calendar fechaHoraFuncion) {
        this.fechaHoraFuncion = fechaHoraFuncion;
    }

    public void setFechaHoraVanta(Calendar fechaHoraVanta) {
        this.fechaHoraVanta = fechaHoraVanta;
    }

    public Calendar getFechaHoraVanta() {
        return fechaHoraVanta;
    }

    public BigDecimal getPrecioCobrado() {
        return precioCobrado;
    }

    public void setPrecioCobrado(BigDecimal precioCobrado) {
        this.precioCobrado = precioCobrado;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public int getTicketNro() {
        return ticketNro;
    }

    public void setTicketNro(int ticketNro) {
        this.ticketNro = ticketNro;
    }
}
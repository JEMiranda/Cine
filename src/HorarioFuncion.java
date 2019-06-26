import java.util.Calendar;
/**
 *
 * @author JonatanM
 */
public class HorarioFuncion {

    private int diaDeSemana;
    private int duracionIntervalo;
    private int duracionPublicidad;
    private boolean esTrasnoche;
    private Calendar horaPrimeraFuncion;
    private Calendar horaUltimaFuncion;

    /**
     * Constructor por Defecto
     */

    public HorarioFuncion() {
    }

    /**
     * Este constructor incluye todos los atributos de la clase HorarioFuncion
     *
     * @param diaDeSemana
     * @param duracionIntervalo
     * @param duracionPublicidad
     * @param esTrasnoche
     * @param horaPrimeraFuncion
     * @param horaUltimaFuncion
     */

    public HorarioFuncion(int diaDeSemana, int duracionIntervalo, int duracionPublicidad, boolean esTrasnoche, Calendar horaPrimeraFuncion, Calendar horaUltimaFuncion) {
        this.diaDeSemana = diaDeSemana;
        this.duracionIntervalo = duracionIntervalo;
        this.duracionPublicidad = duracionPublicidad;
        this.esTrasnoche = esTrasnoche;
        this.horaPrimeraFuncion = horaPrimeraFuncion;
        this.horaUltimaFuncion = horaUltimaFuncion;
    }

    /**
     * Método que devuelve el nombre del día correspondiente al int del mismo.
     *
     * @return String
     */

    private String obtenerDescripcionDia() {

        String dia;
        switch (this.diaDeSemana) {
            //Domingo=1
            case Calendar.SUNDAY:
                dia = "Domingo";
                break;
            //Lunes=2
            case Calendar.MONDAY:
                dia = "Lunes";
                break;
            //Martes=3
            case Calendar.TUESDAY:
                dia = "Martes";
                break;
            //Miercoles=4
            case Calendar.WEDNESDAY:
                dia = "Miercoles";
                break;
            //Jueves=5
            case Calendar.THURSDAY:
                dia = "Jueves";
                break;
            //Viernes=6
            case Calendar.FRIDAY:
                dia = "Viernes";
                break;
            //Sabado=7
            case Calendar.SATURDAY:
                dia = "Sabado";
                break;
            //Menos de 1 o mas de 7=Default
            default:
                dia = "No es un Dia";
        }
        return dia;
    }

// A continuación se listan todos los métodos de seteo
    // de cada atributo de la clase


    public int getDiaDeSemana() {
        return diaDeSemana;
    }

    public void setDiaDeSemana(int diaDeSemana) {
        this.diaDeSemana = diaDeSemana;
    }

    public int getDuracionIntervalo() {
        return duracionIntervalo;
    }

    public void setDuracionIntervalo(int duracionIntervalo) {
        this.duracionIntervalo = duracionIntervalo;
    }

    public int getDuracionPublicidad() {
        return duracionPublicidad;
    }

    public void setDuracionPublicidad(int duracionPublicidad) {
        this.duracionPublicidad = duracionPublicidad;
    }

    public Calendar getHoraPrimeraFuncion() {
        return horaPrimeraFuncion;
    }

    public void setHoraPrimeraFuncion(Calendar horaPrimeraFuncion) {
        this.horaPrimeraFuncion = horaPrimeraFuncion;
    }

    public Calendar getHoraUltimaFuncion() {
        return horaUltimaFuncion;
    }

    public void setHoraUltimaFuncion(Calendar horaUltimaFuncion) {
        this.horaUltimaFuncion = horaUltimaFuncion;
    }

    public boolean setestranoche() {
        return esTrasnoche;
    }

    public void setEsTrasnoche(boolean esTrasnoche) {
        this.esTrasnoche = esTrasnoche;
    }

    /**
     * Devolvemos una cadena de texto indicando los horarios de las funciones
     *
     * @return String
     */
    @Override
    public String toString() {
        // TODO implementar
        StringBuilder sb = new StringBuilder();
        sb.append("Los horarios para el día: ").append(obtenerDescripcionDia()).append("son: ");
        sb.append("Duración del Intervalo: ").append(duracionIntervalo).append("\n");
        sb.append("Duración de la Publicidad: ").append(duracionPublicidad).append("\n");
        sb.append("Acepta Trasnoche: ").append(esTrasnoche).append("\n");
        sb.append("Horario Primera Función: ").append(horaPrimeraFuncion).append("\n");
        sb.append("Horario Última Función: ").append(horaUltimaFuncion).append("\n");
        return sb.toString();
    }
}

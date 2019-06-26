import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Cine {

    private String Direcion;
    private Calendar FechaDeInaguracion;
    private String Nombre;
    private BigDecimal PrecioEntrada;
    private List<HorarioFuncion> horarioFuncions;
    private List<Programacio> programacios;
    private List<Sala> sala;


    public Cine (){
        horarioFuncions=new ArrayList<>();
        programacios=new ArrayList<>();
        sala=new ArrayList<>();
    }
    /**
     * Este constructor incluye todos los atributos de la clase Cine
     *
     * @param direcion
     * @param fechaDeInaguracion
     * @param nombre
     * @param salas
     * @param horarioFuncions
     * @param programacios
     */

    public Cine (String direcion,Calendar fechaDeInaguracion,String nombre,List<HorarioFuncion> horarioFuncions,List<Programacio> programacios,List<Sala> salas){
        this.Direcion=direcion;
        this.FechaDeInaguracion=fechaDeInaguracion;
        this.horarioFuncions=horarioFuncions;
        this.programacios=programacios;
        this.sala=salas;
    }
    /**
     * Este constructor no incluye los atributos referenciales de la clase Cine
     *
     * @param direcion
     * @param fechaDeInaguracion
     * @param nombre
     * @param precioEntrada
     */

    public Cine(String direcion,Calendar fechaDeInaguracion,String nombre,BigDecimal precioEntrada){
        this.Direcion=direcion;
        this.FechaDeInaguracion=fechaDeInaguracion;
        this.Nombre=nombre;
        this.PrecioEntrada=precioEntrada;

        // inicializamos las colecciones vacias

        this.horarioFuncions=new ArrayList<>();
        this.programacios=new ArrayList<>();
        this.sala=new ArrayList<>();

    }

    public String getDirecion() {
        return Direcion;
    }

    public void setDirecion(String direcion) {
        Direcion = direcion;
    }

    public Calendar getFechaDeInaguracion() {
        return FechaDeInaguracion;
    }

    public void setFechaDeInaguracion(Calendar fechaDeInaguracion) {
        FechaDeInaguracion = fechaDeInaguracion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public BigDecimal getPrecioEntrada() {
        return PrecioEntrada;
    }

    public void setPrecioEntrada(BigDecimal precioEntrada) {
        PrecioEntrada = precioEntrada;
    }

    public List<HorarioFuncion> getHorarioFuncions() {
        return horarioFuncions;
    }

    public void setHorarioFuncions(List<HorarioFuncion> horarioFuncions) {
        this.horarioFuncions = horarioFuncions;
    }

    public List<Programacio> getProgramacios() {
        return programacios;
    }

    public void setProgramacios(List<Programacio> programacios) {
        this.programacios = programacios;
    }

    public List<Sala> getSalas() {
        return sala;
    }

    public void setSalas(List<Sala> salas) {
        this.sala = salas;
    }







}

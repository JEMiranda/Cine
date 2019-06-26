/*
 *
 * @author JonatanM
 */

import java.math.BigDecimal;

public class Precio {

    private BigDecimal CostoEntrada;

//Contructor por defecto

    public Precio(){}

//Asignacion de atributos

    public Precio(BigDecimal costoEntrada){
        this.CostoEntrada=costoEntrada;
    }

//seteo de metodos


    public BigDecimal getCostoEntrada() {
        return CostoEntrada;
    }

    public void setCostoEntrada(BigDecimal costoEntrada) {
        CostoEntrada = costoEntrada;
    }
}

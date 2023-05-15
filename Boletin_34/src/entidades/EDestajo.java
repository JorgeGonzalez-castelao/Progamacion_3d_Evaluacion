package entidades;

import java.util.GregorianCalendar;

/**
 *
 * @author Jorge_Gonzalez
 */
public class EDestajo extends Empregado{
    
    private final int numeroClientesCaptados;
    private final float complementoClienteCaptado;
    
    public EDestajo(String DNI, String nome, String apelidos, GregorianCalendar e, int clientesCaptados, float complemento) {
        super(DNI, nome, apelidos, e);
        this.numeroClientesCaptados = clientesCaptados;
        this.complementoClienteCaptado = complemento;
    }
    
    public float sueldo(){
        float sueldo;
        sueldo = numeroClientesCaptados*(complementoClienteCaptado/100);
        return sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + numeroClientesCaptados + ", " + complementoClienteCaptado;
    }
    
    
}

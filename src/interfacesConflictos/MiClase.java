/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesConflictos;

/**
 *
 * @author jvega
 */
// Quiero usar por defecto el saludar() de A
public class MiClase implements A, B {

    @Override
    public void saludar() {
        // Aquí resuelves el conflicto eligiendo la implementación de A
        A.super.saludar();
        // Si quisieras la de B, usarías: B.super.saludar();
    }


}

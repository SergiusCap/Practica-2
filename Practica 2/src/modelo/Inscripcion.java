/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 2DAM
 */
public class Inscripcion {
  
    protected int id;
    protected int equipoId;
    protected int torneoId;
    protected int posicion;

    public Inscripcion(int id, int equipoId, int torneoId, int posicion) {
        this.id = id;
        this.equipoId = equipoId;
        this.torneoId = torneoId;
        this.posicion = posicion;
    }

    public Inscripcion(int equipoId, int torneoId, int posicion) {
        this.equipoId = equipoId;
        this.torneoId = torneoId;
        this.posicion = posicion;
    }

    public Inscripcion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEquipoId() {
        return equipoId;
    }

    public void setEquipoId(int equipoId) {
        this.equipoId = equipoId;
    }

    public int getTorneoId() {
        return torneoId;
    }

    public void setTorneoId(int torneoId) {
        this.torneoId = torneoId;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "id=" + id + ", equipoId=" + equipoId + ", torneoId=" + torneoId + ", posicion=" + posicion + '}';
    }
    
    
    
    
}

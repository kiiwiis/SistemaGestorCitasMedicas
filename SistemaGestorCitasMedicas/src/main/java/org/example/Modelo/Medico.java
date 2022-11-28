package org.example.Modelo;

public class Medico extends Persona {
  private Integer idMedico;
  private String especialidad;
  private double costoConsulta;

  public Medico(
      Integer idPersona,
      String nombre,
      String apellido,
      String fechaNacimiento,
      String lugarNacimiento,
      String direccion,
      String telefono,
      String correoElectronico,
      Integer idMedico,
      String especialidad,
      double costoConsulta) {
    super(
        idPersona,
        nombre,
        apellido,
        fechaNacimiento,
        lugarNacimiento,
        direccion,
        telefono,
        correoElectronico);
    this.idMedico = idMedico;
    this.especialidad = especialidad;
    this.costoConsulta = costoConsulta;
  }

  public Integer getIdMedico() {
    return idMedico;
  }

  public void setIdMedico(Integer idMedico) {
    this.idMedico = idMedico;
  }

  public String getEspecialidad() {
    return especialidad;
  }

  public void setEspecialidad(String especialidad) {
    this.especialidad = especialidad;
  }

  public double getCostoConsulta() {
    return costoConsulta;
  }

  public void setCostoConsulta(double costoConsulta) {
    this.costoConsulta = costoConsulta;
  }
}

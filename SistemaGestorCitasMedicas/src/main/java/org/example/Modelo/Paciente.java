package org.example.Modelo;

public class Paciente extends Persona {
  private Integer idPaciente;

  public Paciente(
      Integer idPersona,
      String nombre,
      String apellido,
      String fechaNacimiento,
      String lugarNacimiento,
      String direccion,
      String telefono,
      String correoElectronico,
      Integer idPaciente) {
    super(
        idPersona,
        nombre,
        apellido,
        fechaNacimiento,
        lugarNacimiento,
        direccion,
        telefono,
        correoElectronico);
    this.idPaciente = idPaciente;
  }

  public Integer getIdPaciente() {
    return idPaciente;
  }

  public void setIdPaciente(Integer idPaciente) {
    this.idPaciente = idPaciente;
  }
}

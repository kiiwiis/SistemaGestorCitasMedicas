package org.example.Modelo;

import java.util.Date;

public class Cita extends Medico {
  private Integer idCita;
  private Integer idPaciente;
  private Integer idMedico;
  private Integer idHorario;
  private Date fechaCita;
  private Integer costoCita;
  private String estadoCita;

  public void listarCita() {}

  public Cita(
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
      double costoConsulta,
      Integer idCita,
      Integer idPaciente,
      Integer idMedico1,
      Integer idHorario,
      Date fechaCita,
      Integer costoCita,
      String estadoCita) {
    super(
        idPersona,
        nombre,
        apellido,
        fechaNacimiento,
        lugarNacimiento,
        direccion,
        telefono,
        correoElectronico,
        idMedico,
        especialidad,
        costoConsulta);
    this.idCita = idCita;
    this.idPaciente = idPaciente;
    this.idMedico = idMedico1;
    this.idHorario = idHorario;
    this.fechaCita = fechaCita;
    this.costoCita = costoCita;
    this.estadoCita = estadoCita;
  }

  public Integer getIdCita() {
    return idCita;
  }

  public void setIdCita(Integer idCita) {
    this.idCita = idCita;
  }

  public Integer getIdPaciente() {
    return idPaciente;
  }

  public void setIdPaciente(Integer idPaciente) {
    this.idPaciente = idPaciente;
  }

  @Override
  public Integer getIdMedico() {
    return idMedico;
  }

  @Override
  public void setIdMedico(Integer idMedico) {
    this.idMedico = idMedico;
  }

  public Integer getIdHorario() {
    return idHorario;
  }

  public void setIdHorario(Integer idHorario) {
    this.idHorario = idHorario;
  }

  public Date getFechaCita() {
    return fechaCita;
  }

  public void setFechaCita(Date fechaCita) {
    this.fechaCita = fechaCita;
  }

  public Integer getCostoCita() {
    return costoCita;
  }

  public void setCostoCita(Integer costoCita) {
    this.costoCita = costoCita;
  }

  public String getEstadoCita() {
    return estadoCita;
  }

  public void setEstadoCita(String estadoCita) {
    this.estadoCita = estadoCita;
  }
}

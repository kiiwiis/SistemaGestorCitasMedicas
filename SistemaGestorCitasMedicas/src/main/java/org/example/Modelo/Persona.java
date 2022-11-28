package org.example.Modelo;

public class Persona {
  private Integer idPersona;
  private String nombre;
  private String apellido;
  private String fechaNacimiento;
  private String lugarNacimiento;
  private String direccion;
  private String telefono;
  private String correoElectronico;

  public Persona(
      Integer idPersona,
      String nombre,
      String apellido,
      String fechaNacimiento,
      String lugarNacimiento,
      String direccion,
      String telefono,
      String correoElectronico) {
    this.idPersona = idPersona;
    this.nombre = nombre;
    this.apellido = apellido;
    this.fechaNacimiento = fechaNacimiento;
    this.lugarNacimiento = lugarNacimiento;
    this.direccion = direccion;
    this.telefono = telefono;
    this.correoElectronico = correoElectronico;
  }

  public Integer getIdPersona() {
    return idPersona;
  }

  public void setIdPersona(Integer idPersona) {
    this.idPersona = idPersona;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public String getLugarNacimiento() {
    return lugarNacimiento;
  }

  public void setLugarNacimiento(String lugarNacimiento) {
    this.lugarNacimiento = lugarNacimiento;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getCorreoElectronico() {
    return correoElectronico;
  }

  public void setCorreoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
  }
}

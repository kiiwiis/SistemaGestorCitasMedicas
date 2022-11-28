package org.example.Modelo;

public class Email {
  private String direccionCorreo;
  private String asunto;
  private String mensaje;

  public void enviarMensaje() {
    System.out.println("Enviar el mensaje con " + direccionCorreo + " " + asunto + " " + mensaje);
  }
}

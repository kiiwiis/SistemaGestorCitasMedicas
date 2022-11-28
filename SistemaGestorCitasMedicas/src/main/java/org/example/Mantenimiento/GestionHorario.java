package org.example.Mantenimiento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.Interface.IGestion;
import org.example.Modelo.Horario;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class GestionHorario implements IGestion<Horario> {

  Horario hora = new Horario();

  @Override
  public Horario consultar(Integer id) {
    return null;
  }

  @Override
  public void generar(Horario obj) {}
}

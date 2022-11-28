package org.example.Mantenimiento;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.example.Modelo.Medico;

public class GestionMedico {
  private static List<Medico> listMedico = new ArrayList<>();

  public Medico consultar(Integer id) {
    Optional<Medico> elemento =
        listMedico.stream().filter(x -> x.getIdPersona().equals(id)).findFirst();
    return elemento != null ? elemento.get() : null;
  }

  public void agregarLista(List<Medico> lista) {
    listMedico = lista;
  }
}

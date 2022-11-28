package org.example.Mantenimiento;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.example.Interface.IGestion;
import org.example.Modelo.Factura;

public class GestionFactura implements IGestion<Factura> {
  List<Factura> listaFacturas = new ArrayList<>();

  @Override
  public Factura consultar(Integer id) {
    Optional<Factura> elemento =
        listaFacturas.stream().filter(x -> x.getIdCita() == id).findFirst();
    return elemento != null ? elemento.get() : null;
  }

  public void generar(Factura obj) {}

  public void agregarLista(List<Factura> lista) {
    listaFacturas = lista;
  }
}

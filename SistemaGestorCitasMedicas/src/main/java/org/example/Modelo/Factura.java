package org.example.Modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Factura {
  Integer idFactura;
  Integer idCita;
  String descripcion;
  Double impuesto;
  Double total;
}

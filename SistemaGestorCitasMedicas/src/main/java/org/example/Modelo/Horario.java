package org.example.Modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Horario {
  //Hola esto nada mas es para probar lo que voy programando
  private Integer idHora=4;
  ArrayList<String> horaCita = new ArrayList<String>();
  //HORARIOS PARA EL DIA LUNES
    horaCita.add("lUNES 7:00-8:00");
    horaCita.add("lUNES 8:00-9:00");
    horaCita.add("lUNES 9:00-10:00");
    horaCita.add("lUNES 10:00-11:00");
    horaCita.add("lUNES 11:00-12:00");
    horaCita.add("lUNES 12:00-13:00");
    horaCita.add("lUNES 13:00-14:00");
  //HORARIOS PARA EL DIA MARTES
    horaCita.add("MARTES 7:00-8:00");
    horaCita.add("MARTES 8:00-9:00");
    horaCita.add("MARTES 9:00-10:00");
    horaCita.add("MARTES 10:00-11:00");
    horaCita.add("MARTES 11:00-12:00");
    horaCita.add("MARTES 12:00-13:00");
    horaCita.add("MARTES 13:00-14:00");
  //HORARIOS PARA EL DIA MIERCOLES
    horaCita.add("MIERCOLES 7:00-8:00");
    horaCita.add("MIERCOLES 8:00-9:00");
    horaCita.add("MIERCOLES 9:00-10:00");
    horaCita.add("MIERCOLES 10:00-11:00");
    horaCita.add("MIERCOLES 11:00-12:00");
    horaCita.add("MIERCOLES 12:00-13:00");
    horaCita.add("MIERCOLES 13:00-14:00");
  //HORARIOS PARA EL DIA JUEVES
    horaCita.add("JUEVES 7:00-8:00");
    horaCita.add("JUEVES 8:00-9:00");
    horaCita.add("JUEVES 9:00-10:00");
    horaCita.add("JUEVES 10:00-11:00");
    horaCita.add("JUEVES 11:00-12:00");
    horaCita.add("JUEVES 12:00-13:00");
    horaCita.add("JUEVES 13:00-14:00");
  //HORARIOS PARA EL DIA VIERNES
    horaCita.add("VIERNES 7:00-8:00");
    horaCita.add("VIERNES 8:00-9:00");
    horaCita.add("VIERNES 9:00-10:00");
    horaCita.add("VIERNES 10:00-11:00");
    horaCita.add("VIERNES 11:00-12:00");
    horaCita.add("VIERNES 12:00-13:00");
    horaCita.add("VIERNES 13:00-14:00");

    for(int i = 0; i <= horaCita.size()) {

    System.out.println(cars.get(i));
    i++;

  }

}

package org.example.Interface;

public interface IGestion<T> {

  T consultar(Integer id);

  void generar(T obj);
}

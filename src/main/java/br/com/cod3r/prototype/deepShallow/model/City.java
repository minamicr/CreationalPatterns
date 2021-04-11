package br.com.cod3r.prototype.deepShallow.model;

public class City implements Cloneable{
  public String city;
  public UF uf;

  public City(String city, UF uf) {
    this.city = city;
    this.uf = uf;
  }

  @Override
  public String toString(){
    return "[city=" + city + ", UF=" + uf + "]";
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

}

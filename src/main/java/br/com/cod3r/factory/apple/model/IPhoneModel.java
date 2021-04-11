package br.com.cod3r.factory.apple.model;

import java.util.Arrays;
import java.util.Optional;


public enum IPhoneModel {
  IPHONE11("IPhone11", "", IPhone11.class),
  IPHONE11PRO("IPhone11", "Pro", IPhone11Pro.class),
  IPHONEX("IPhoneX", "", IPhoneX.class),
  IPHONEXSMAX("IPhoneXS", "Max", IPhoneXSMax.class);

  private final String name;
  private final String type;
  private final Class<? extends IPhone> iPhoneClass;

  IPhoneModel(String name, String type, Class<? extends IPhone> iPhoneClass){

    this.name = name;
    this.type = type;
    this.iPhoneClass = iPhoneClass;

  };

  public String getName() {
    return this.name;
  }

  public String getType() {
    return this.type;
  }


  public IPhone createIPhone(){
    try {

      return this.iPhoneClass.newInstance();

    } catch(Exception e){
      e.printStackTrace();
      return null;
    }
  }

  public static Optional<IPhoneModel> getIPhoneModel(String name, String type){
    return Arrays.stream(IPhoneModel.values())
        .filter(phone -> phone.getName().equalsIgnoreCase(name) &&
            phone.getType().equalsIgnoreCase(type))
        .findAny();

  }

}

package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhoneModel;
import java.util.Arrays;
import java.util.Optional;

public class IPhoneFactory {

  public IPhoneFactory() {
  }

  public IPhone orderPhone(String model, String type){
    IPhone iPhone = null;

    Optional<IPhoneModel> iPhoneModel = IPhoneModel.getIPhoneModel(model, type);

    if(iPhoneModel.isPresent()){
      iPhone = iPhoneModel.get().createIPhone();
      iPhone.assemble();
      iPhone.certificates();
      iPhone.getHardware();
      iPhone.pack();
    } else {
      System.out.println("Modelo / tipo não encontrado");
    }

    return iPhone;
  }



}

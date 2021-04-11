package br.com.cod3r.abstractfactory.apple.model.certificate;

public class BrazilianCertificate implements Certificate {

	@Override
	public String applyCertification() {
		return "\t- Calibrating Brasilian rules\n\t- Applying Anatel's Stamp";
	}

}

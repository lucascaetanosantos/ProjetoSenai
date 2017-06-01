package br.com.senai.model;

public enum Estado {
	
	AC("Acre", "AC"),
	AL("Alagoas", "AL"),
	AP("Amapa", "AP"),
	AM("Amazonas", "AM"),
	BA("Bahia", "BA"),
	CE("Cear�", "CE"),
	DF("Distrito Federal", "DF"),
	ES("Esp�rito Santo", "ES"),
	GO("Goi�s", "GO"),
	MA("Maranh�o", "MA"),
	MT("Mato Grosso", "MT"),
	MS("Mato Grosso do Sul", "MS"),
	MG("Minas Gerais", "MG"),
	PA("Par�", "PA"),
	PB("Para�ba", "PB"),
	PR("Paran�", "PR"),
	PE("Pernanbuco", "PE"),
	PI("Piau�", "PI"),
	RR("Roraima", "RR"),
	RO("Rond�nia", "RO"),
	RJ("Rio de Janeiro", "RJ"),
	RN("Rio Grande do Norte", "RN"),
	RS("Riog Grande do Sul", "RS"),
	SC("Santa Catarina", "SC"),
	SP("S�o Paulo", "SP"),
	SE("Sergipe", "SE"),
	TO("Tocantins", "TO");
	
	private String label;
	private String sigla;
	
	private Estado(String label, String sigla) {
		this.label = label;
		this.sigla = sigla;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
}

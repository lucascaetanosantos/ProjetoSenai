package br.com.senai.model;

public enum Estado {
	
	ACRE("Acre", "AC"),
	ALAGOAS("Alagoas", "AL"),
	AMAPA("Amapa", "AP"),
	AMAZONAS("Amazonas", "AM"),
	BAHIA("Bahia", "BA"),
	CEARA("Cear�", "CE"),
	DISTRITO_FEDERAL("Distrito Federal", "DF"),
	ESPIRITO_SANTO("Esp�rito Santo", "ES"),
	GOIAS("Goi�s", "GO"),
	MARANHAO("Maranh�o", "MA"),
	MATO_GROSSO("Mato Grosso", "MT"),
	MATO_GROSSO_DO_SUL("Mato Grosso do Sul", "MS"),
	MINAS_GERAIS("Minas Gerais", "MG"),
	PARA("Par�", "PA"),
	PARAIBA("Para�ba", "PB"),
	PARANA("Paran�", "PR"),
	PERNANBUCO("Pernanbuco", "PE"),
	PIAUI("Piau�", "PI"),
	RORAIMA("Roraima", "RR"),
	RONDONIA("Rond�nia", "RO"),
	RIO_DE_JANEIRO("Rio de Janeiro", "RJ"),
	RIO_GRANDE_DO_NORTE("Rio Grande do Norte", "RN"),
	RIO_GRANDE_DO_SUL("Riog Grande do Sul", "RS"),
	SANTA_CATARINA("Santa Catarina", "SC"),
	SAO_PAULO("S�o Paulo", "SP"),
	SERGIPE("Sergipe", "SE"),
	TOCANTINS("Tocantins", "TO");
	
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

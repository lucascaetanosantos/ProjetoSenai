package br.com.senai.model;

import java.io.Serializable;
import java.util.Date;

public class Fornecedor implements Serializable {

	private static final long serialVersionUID = 4218573019122278677L;

	private Long id;
	private Date cadastroFornecedor = new Date();
	private Date fundacaoFornecedor;
	private String fantasiaFornecedor;
	private String razaoFornecedor;
	private String cnpjFornecedor;
	private String ieFornecedor;
	private String imFornecedor;
	private String emailFornecedor;
	private String urlFornecedor;
	private String foneaFornecedor;
	private String fonebFornecedor;
	private String proximFornecedor;
	private String enderecoFornecedor;
	private Integer numeroFornecedor;
	private String complementoFornecedor;
	private String bairroFornecedor;
	private String cepFornecedor;
	private String cidadeFornecedor;
	private String obsFornecedor;
	private boolean active = true;
	private Date lastUpdate = new Date();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCadastroFornecedor() {
		return cadastroFornecedor;
	}

	public void setCadastroFornecedor(Date cadastroFornecedor) {
		this.cadastroFornecedor = cadastroFornecedor;
	}

	public Date getFundacaoFornecedor() {
		return fundacaoFornecedor;
	}

	public void setFundacaoFornecedor(Date fundacaoFornecedor) {
		this.fundacaoFornecedor = fundacaoFornecedor;
	}

	public String getFantasiaFornecedor() {
		return fantasiaFornecedor;
	}

	public void setFantasiaFornecedor(String fantasiaFornecedor) {
		this.fantasiaFornecedor = fantasiaFornecedor;
	}

	public String getRazaoFornecedor() {
		return razaoFornecedor;
	}

	public void setRazaoFornecedor(String razaoFornecedor) {
		this.razaoFornecedor = razaoFornecedor;
	}

	public String getCnpjFornecedor() {
		return cnpjFornecedor;
	}

	public void setCnpjFornecedor(String cnpjFornecedor) {
		this.cnpjFornecedor = cnpjFornecedor;
	}

	public String getIeFornecedor() {
		return ieFornecedor;
	}

	public void setIeFornecedor(String ieFornecedor) {
		this.ieFornecedor = ieFornecedor;
	}

	public String getImFornecedor() {
		return imFornecedor;
	}

	public void setImFornecedor(String imFornecedor) {
		this.imFornecedor = imFornecedor;
	}

	public String getEmailFornecedor() {
		return emailFornecedor;
	}

	public void setEmailFornecedor(String emailFornecedor) {
		this.emailFornecedor = emailFornecedor;
	}

	public String getUrlFornecedor() {
		return urlFornecedor;
	}

	public void setUrlFornecedor(String urlFornecedor) {
		this.urlFornecedor = urlFornecedor;
	}

	public String getFoneaFornecedor() {
		return foneaFornecedor;
	}

	public void setFoneaFornecedor(String foneaFornecedor) {
		this.foneaFornecedor = foneaFornecedor;
	}

	public String getFonebFornecedor() {
		return fonebFornecedor;
	}

	public void setFonebFornecedor(String fonebFornecedor) {
		this.fonebFornecedor = fonebFornecedor;
	}

	public String getProximFornecedor() {
		return proximFornecedor;
	}

	public void setProximFornecedor(String proximFornecedor) {
		this.proximFornecedor = proximFornecedor;
	}

	public String getEnderecoFornecedor() {
		return enderecoFornecedor;
	}

	public void setEnderecoFornecedor(String enderecoFornecedor) {
		this.enderecoFornecedor = enderecoFornecedor;
	}

	public Integer getNumeroFornecedor() {
		return numeroFornecedor;
	}

	public void setNumeroFornecedor(Integer numeroFornecedor) {
		this.numeroFornecedor = numeroFornecedor;
	}

	public String getComplementoFornecedor() {
		return complementoFornecedor;
	}

	public void setComplementoFornecedor(String complementoFornecedor) {
		this.complementoFornecedor = complementoFornecedor;
	}

	public String getBairroFornecedor() {
		return bairroFornecedor;
	}

	public void setBairroFornecedor(String bairroFornecedor) {
		this.bairroFornecedor = bairroFornecedor;
	}

	public String getCepFornecedor() {
		return cepFornecedor;
	}

	public void setCepFornecedor(String cepFornecedor) {
		this.cepFornecedor = cepFornecedor;
	}

	public String getCidadeFornecedor() {
		return cidadeFornecedor;
	}

	public void setCidadeFornecedor(String cidadeFornecedor) {
		this.cidadeFornecedor = cidadeFornecedor;
	}

	public String getObsFornecedor() {
		return obsFornecedor;
	}

	public void setObsFornecedor(String obsFornecedor) {
		this.obsFornecedor = obsFornecedor;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fornecedor other = (Fornecedor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fornecedor [id=" + id + ", cadastroFornecedor=" + cadastroFornecedor + ", fundacaoFornecedor="
				+ fundacaoFornecedor + ", fantasiaFornecedor=" + fantasiaFornecedor + ", razaoFornecedor="
				+ razaoFornecedor + ", cnpjFornecedor=" + cnpjFornecedor + ", ieFornecedor=" + ieFornecedor
				+ ", imFornecedor=" + imFornecedor + ", emailFornecedor=" + emailFornecedor + ", urlFornecedor="
				+ urlFornecedor + ", foneaFornecedor=" + foneaFornecedor + ", fonebFornecedor=" + fonebFornecedor
				+ ", proximFornecedor=" + proximFornecedor + ", enderecoFornecedor=" + enderecoFornecedor
				+ ", numeroFornecedor=" + numeroFornecedor + ", complementoFornecedor=" + complementoFornecedor
				+ ", bairroFornecedor=" + bairroFornecedor + ", cepFornecedor=" + cepFornecedor + ", cidadeFornecedor="
				+ cidadeFornecedor + ", obsFornecedor=" + obsFornecedor + ", active=" + active + ", lastUpdate="
				+ lastUpdate + "]";
	}

}
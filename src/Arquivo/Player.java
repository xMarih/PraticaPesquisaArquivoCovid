package Arquivo;
public class Player implements java.io.Serializable{
	
	private String regiao;
	private String estado;
	private String municipio;
	private String coduf;
	
	private String codmun;
	private String codRegiaoSaude;
	private String nomeRegiaoSaude;
	private String data;
	
	private String semanaEpi;
	private String populacaoTCU2019;
	private String casosAcumulado;
	private String casosNovos;
	
	private String obitosAcumulado;
	private String obitosNovos;
	private String Recuperadosnovos;
	private String emAcompanhamentoNovos;
	
	private String interior_metropolitana;
	public int length;
	

	public Player(String regiao, String estado, String municipio, String coduf, 
			String codmun, String codRegiaoSaude, String nomeRegiaoSaude, String data, 
			String semanaEpi, String populacaoTCU2019, String casosAcumulado, String casosNovos, 
			String obitosAcumulado, String obitosNovos, String Recuperadosnovos, String emAcompanhamentoNovos,
			String interior_metropolitana){
		
		
		this.setRegiao(regiao);
		this.setEstado(estado);
		this.setMunicipio(municipio); 
		this.setCoduf(coduf);
		
		this.setCodmun(codmun);
		this.setCodRegiaoSaude(codRegiaoSaude);
		this.setNomeRegiaoSaude(nomeRegiaoSaude);	
		this.setData(data);
		
		this.setSemanaEpi(semanaEpi);
		this.setPopulacaoTCU2019(populacaoTCU2019);
		this.setCasosAcumulado(casosAcumulado);
		this.setCasosNovos(casosNovos);
		
		this.setObitosAcumulado(obitosAcumulado);
		this.setObitosNovos(obitosNovos);
		this.setRecuperadosnovos(Recuperadosnovos);
		this.setEmAcompanhamentoNovos(emAcompanhamentoNovos);
		
		this.setInterior_metropolitana(interior_metropolitana);
		
	}
	


	public String toString(){
		return regiao + ";" + estado + ";" + municipio + ";" + coduf + ";" 
			+ codmun + ";" + codRegiaoSaude + ";" + nomeRegiaoSaude + ";" + data + ";" 
			+ semanaEpi + ";" + populacaoTCU2019 + ";" + casosAcumulado + ";" + casosNovos + ";" 
			+ obitosAcumulado + ";" + obitosNovos + ";" + Recuperadosnovos + ";" + emAcompanhamentoNovos + ";" 
			+ interior_metropolitana; 
	}

	public String showInfo(){
		return  regiao + " | " + estado + " | " + municipio + " | " + coduf + " | " 
				+ codmun + " | " + codRegiaoSaude + " | " + nomeRegiaoSaude + " | " + data + " | " 
				+ semanaEpi + " | " + populacaoTCU2019 + " | " + casosAcumulado + " | " + casosNovos + " | " 
				+ obitosAcumulado + " | " + obitosNovos + " | " + Recuperadosnovos + " | " + emAcompanhamentoNovos + " | "
				+ interior_metropolitana ; 
	}
	
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public String getPopulacaoTCU2019() {
		return populacaoTCU2019;
	}
	public void setPopulacaoTCU2019(String populacaoTCU2019) {
		this.populacaoTCU2019 = populacaoTCU2019;
	}


	
	public String getCasosAcumulado() {
		return casosAcumulado;
	}


	public void setCasosAcumulado(String casosAcumulado) {
		this.casosAcumulado = casosAcumulado;
	}


	
	public String getCasosNovos() {
		return casosNovos;
	}


	public void setCasosNovos(String casosNovos) {
		this.casosNovos = casosNovos;
	}


	
	public String getObitosAcumulado() {
		return obitosAcumulado;
	}


	public void setObitosAcumulado(String obitosAcumulado) {
		this.obitosAcumulado = obitosAcumulado;
	}

	public String getObitosNovos() {
		return obitosNovos;
	}
	public void setObitosNovos(String obitosNovos) {
		this.obitosNovos = obitosNovos;
	}



	
	public String getCoduf() {
		return coduf;
	}
	public void setCoduf(String coduf) {
		this.coduf = coduf;
	}

	public String getCodmun() {
		return codmun;
	}
	public void setCodmun(String codmun) {
		this.codmun = codmun;
	}
	

	public String getCodRegiaoSaude() {
		return codRegiaoSaude;
	}
	public void setCodRegiaoSaude(String codRegiaoSaude) {
		this.codRegiaoSaude = codRegiaoSaude;
	}

	public String getNomeRegiaoSaude() {
		return nomeRegiaoSaude;
	}
	public void setNomeRegiaoSaude(String nomeRegiaoSaude) {
		this.nomeRegiaoSaude = nomeRegiaoSaude;
	}
	
	public String getSemanaEpi() {
		return semanaEpi;
	}
	public void setSemanaEpi(String semanaEpi) {
		this.semanaEpi = semanaEpi;
	}

	public String getRecuperadosnovos() {
		return Recuperadosnovos;
	}
	public void setRecuperadosnovos(String recuperadosnovos) {
		Recuperadosnovos = recuperadosnovos;
	}
	
	public String getEmAcompanhamentoNovos() {
		return emAcompanhamentoNovos;
	}
	public void setEmAcompanhamentoNovos(String emAcompanhamentoNovos) {
		this.emAcompanhamentoNovos = emAcompanhamentoNovos;
	}

	public String getInterior_metropolitana() {
		return interior_metropolitana;
	}
	public void setInterior_metropolitana(String interior_metropolitana) {
		this.interior_metropolitana = interior_metropolitana;
	}



	public String getMunicipio() {
		return municipio;
	}



	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
}
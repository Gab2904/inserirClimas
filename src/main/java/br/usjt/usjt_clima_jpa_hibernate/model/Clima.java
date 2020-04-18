package br.usjt.usjt_clima_jpa_hibernate.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_clima")
public class Clima {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false,length=200)
	private String tempMin;
	@Column(nullable=false,length=200)
	private String tempMax;
	@Column(nullable=false,length=200)
	private String umidaRelativa;
	@Column(nullable=false,length=200)
	private String descricao;
	@Column(nullable=false,length=200)
	private String dataHora;
	
	@OneToOne(optional=false)
	@JoinColumn(name="id_do_dia_da_semana")
	private Semana semana;
	
	@ManyToOne(optional=false,cascade = CascadeType.ALL)
	private Cidade cidade;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTempMin() {
		return tempMin;
	}
	public void setTempMin(String tempMin) {
		this.tempMin = tempMin;
	}
	public String getTempMax() {
		return tempMax;
	}
	public void setTempMax(String tempMax) {
		this.tempMax = tempMax;
	}
	public String getUmidaRelativa() {
		return umidaRelativa;
	}
	public void setUmidaRelativa(String umidaRelativa) {
		this.umidaRelativa = umidaRelativa;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDataHora() {
		return dataHora;
	}
	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}
	public Semana getDiaDaSemana() {
		return semana;
	}
	public void setDiaDaSemana(Semana semana) {
		this.semana = semana;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataHora == null) ? 0 : dataHora.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((tempMax == null) ? 0 : tempMax.hashCode());
		result = prime * result + ((tempMin == null) ? 0 : tempMin.hashCode());
		result = prime * result + ((umidaRelativa == null) ? 0 : umidaRelativa.hashCode());
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
		Clima other = (Clima) obj;
		if (dataHora == null) {
			if (other.dataHora != null)
				return false;
		} else if (!dataHora.equals(other.dataHora))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (tempMax == null) {
			if (other.tempMax != null)
				return false;
		} else if (!tempMax.equals(other.tempMax))
			return false;
		if (tempMin == null) {
			if (other.tempMin != null)
				return false;
		} else if (!tempMin.equals(other.tempMin))
			return false;
		if (umidaRelativa == null) {
			if (other.umidaRelativa != null)
				return false;
		} else if (!umidaRelativa.equals(other.umidaRelativa))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Clima [id=" + id + ", tempMin=" + tempMin + ", tempMax=" + tempMax + ", umidaRelativa="
				+ umidaRelativa + ", descricao=" + descricao + ", dataHora=" + dataHora + ", diaDaSemana=" + semana
				+ ", cidade=" + cidade + "]";
	}
}

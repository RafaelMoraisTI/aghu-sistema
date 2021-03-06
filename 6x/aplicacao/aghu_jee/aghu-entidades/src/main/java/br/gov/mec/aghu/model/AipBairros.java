package br.gov.mec.aghu.model;

// Generated 24/09/2009 17:21:40 by Hibernate Tools 3.2.5.Beta

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntityCodigo;

/**
 * AipBairros generated by hbm2java
 */
@Entity
@Table(name = "AIP_BAIRROS", schema = "AGH")
@SequenceGenerator(name="aipBairroSq1", sequenceName="AGH.AIP_BAI_SQ1", allocationSize = 1)

public class AipBairros extends BaseEntityCodigo<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -430291393867345739L;
	private Integer codigo;
	private String descricao;
	private Integer codigoBaseCorreio;
	private Integer version;
	private Set<AipBairrosCepLogradouro> aipBairrosCepLogradouros = new HashSet<AipBairrosCepLogradouro>(
			0);

	private DominioSituacao indSituacao;
	
	public AipBairros() {
	}

	public AipBairros(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public AipBairros(Integer codigo, String descricao,
			Set<AipBairrosCepLogradouro> aipBairrosCepLogradouros, Integer codigoBaseCorreio) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.aipBairrosCepLogradouros = aipBairrosCepLogradouros;
		this.codigoBaseCorreio = codigoBaseCorreio;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aipBairroSq1")
	@Column(name = "CODIGO", nullable = false, precision = 5, scale = 0)
	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setCodigoBaseCorreio(Integer codigoBaseCorreio) {
		this.codigoBaseCorreio = codigoBaseCorreio;
	}
	
	@Column(name = "CODIGO_BASE_CORREIO", nullable = true)
	public Integer getCodigoBaseCorreio() {
		return this.codigoBaseCorreio;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "aipBairro")
	public Set<AipBairrosCepLogradouro> getAipBairrosCepLogradouros() {
		return this.aipBairrosCepLogradouros;
	}

	public void setAipBairrosCepLogradouros(
			Set<AipBairrosCepLogradouro> aipBairrosCepLogradouros) {
		this.aipBairrosCepLogradouros = aipBairrosCepLogradouros;
	}

	public enum Fields {
		CODIGO("codigo"),DESCRICAO("descricao"),CODIGO_BASE_CORREIO("codigoBaseCorreio"),
		BAI_CODIGO("aipBairrosCepLogradouros"),
		IND_SITUACAO("indSituacao");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof AipBairros)) {
			return false;
		}
		AipBairros other = (AipBairros) obj;
		if (getCodigo() == null) {
			if (other.getCodigo() != null) {
				return false;
			}
		} else if (!getCodigo().equals(other.getCodigo())) {
			return false;
		}
		return true;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}
	
}
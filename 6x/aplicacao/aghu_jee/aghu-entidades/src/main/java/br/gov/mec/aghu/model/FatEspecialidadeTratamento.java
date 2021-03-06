package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * FatEspecialidadeTratamentos generated by hbm2java
 */
@Entity
@Table(name = "FAT_ESPECIALIDADE_TRATAMENTOS", schema = "AGH")
public class FatEspecialidadeTratamento extends BaseEntityId<FatEspecialidadeTratamentoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6652512761010489410L;
	private FatEspecialidadeTratamentoId id;
	private Boolean indValidaApac;
	private String indPreTratamento;
	private String indPosTratamento;
	private String indListaCandidato;
	
	private FatTipoTratamentos fatTipoTratamentos;
	private AghEspecialidades aghEspecialidades; 

	public FatEspecialidadeTratamento() {
	}

	public FatEspecialidadeTratamento(FatEspecialidadeTratamentoId id,
			Boolean indValidaApac) {
		this.id = id;
		this.indValidaApac = indValidaApac;
	}

	public FatEspecialidadeTratamento(FatEspecialidadeTratamentoId id,
			Boolean indValidaApac, String indPreTratamento,
			String indPosTratamento, String indListaCandidato) {
		this.id = id;
		this.indValidaApac = indValidaApac;
		this.indPreTratamento = indPreTratamento;
		this.indPosTratamento = indPosTratamento;
		this.indListaCandidato = indListaCandidato;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "tptSeq", column = @Column(name = "TPT_SEQ", nullable = false, precision = 6, scale = 0)),
			@AttributeOverride(name = "espSeq", column = @Column(name = "ESP_SEQ", nullable = false, precision = 4, scale = 0)) })
	public FatEspecialidadeTratamentoId getId() {
		return this.id;
	}

	public void setId(FatEspecialidadeTratamentoId id) {
		this.id = id;
	}

	@Column(name = "IND_VALIDA_APAC", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndValidaApac() {
		return this.indValidaApac;
	}

	public void setIndValidaApac(Boolean indValidaApac) {
		this.indValidaApac = indValidaApac;
	}

	@Column(name = "IND_PRE_TRATAMENTO", length = 1)
	@Length(max = 1)
	public String getIndPreTratamento() {
		return this.indPreTratamento;
	}

	public void setIndPreTratamento(String indPreTratamento) {
		this.indPreTratamento = indPreTratamento;
	}

	@Column(name = "IND_POS_TRATAMENTO", length = 1)
	@Length(max = 1)
	public String getIndPosTratamento() {
		return this.indPosTratamento;
	}

	public void setIndPosTratamento(String indPosTratamento) {
		this.indPosTratamento = indPosTratamento;
	}

	@Column(name = "IND_LISTA_CANDIDATO", length = 1)
	@Length(max = 1)
	public String getIndListaCandidato() {
		return this.indListaCandidato;
	}

	public void setIndListaCandidato(String indListaCandidato) {
		this.indListaCandidato = indListaCandidato;
	}

	public void setFatTipoTratamentos(FatTipoTratamentos fatTipoTratamentos) {
		this.fatTipoTratamentos = fatTipoTratamentos;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TPT_SEQ", nullable = false, insertable=false, updatable=false)
	public FatTipoTratamentos getFatTipoTratamentos() {
		return fatTipoTratamentos;
	}

	public void setAghEspecialidades(AghEspecialidades aghEspecialidades) {
		this.aghEspecialidades = aghEspecialidades;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ESP_SEQ", nullable = false, insertable=false, updatable=false)
	public AghEspecialidades getAghEspecialidades() {
		return aghEspecialidades;
	}

	
	public enum Fields {
		ESP_SEQ("aghEspecialidades.seq"),
		TPT_SEQ("id.tptSeq"),
		ESPECIALIDADE("aghEspecialidades"),
		IND_VALIDA_APAC("indValidaApac"),
		COD_TIPO_TRATAMENTO("fatTipoTratamentos.codigo"),
		TIPO_TRATAMENTO("fatTipoTratamentos"),
		IND_LISTA_CANDIDATO("indListaCandidato")
		;

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}

	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof FatEspecialidadeTratamento)) {
			return false;
		}
		FatEspecialidadeTratamento other = (FatEspecialidadeTratamento) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}

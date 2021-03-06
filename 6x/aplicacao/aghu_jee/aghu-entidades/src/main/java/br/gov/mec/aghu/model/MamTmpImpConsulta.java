package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MamTmpImpConsulta generated by hbm2java
 */
@Entity
@Table(name = "MAM_TMP_IMP_CONSULTAS", schema = "AGH")
public class MamTmpImpConsulta extends BaseEntityId<MamTmpImpConsultaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4339301177351485204L;
	private MamTmpImpConsultaId id;
	private Integer version;
	private Integer conNumero;
	private Integer pacCodigo;
	private Long anaSeq;
	private Long evoSeq;

	public MamTmpImpConsulta() {
	}

	public MamTmpImpConsulta(MamTmpImpConsultaId id, Integer conNumero, Integer pacCodigo) {
		this.id = id;
		this.conNumero = conNumero;
		this.pacCodigo = pacCodigo;
	}

	public MamTmpImpConsulta(MamTmpImpConsultaId id, Integer conNumero, Integer pacCodigo, Long anaSeq, Long evoSeq) {
		this.id = id;
		this.conNumero = conNumero;
		this.pacCodigo = pacCodigo;
		this.anaSeq = anaSeq;
		this.evoSeq = evoSeq;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "nroSessao", column = @Column(name = "NRO_SESSAO", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public MamTmpImpConsultaId getId() {
		return this.id;
	}

	public void setId(MamTmpImpConsultaId id) {
		this.id = id;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name = "CON_NUMERO", nullable = false)
	public Integer getConNumero() {
		return this.conNumero;
	}

	public void setConNumero(Integer conNumero) {
		this.conNumero = conNumero;
	}

	@Column(name = "PAC_CODIGO", nullable = false)
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "ANA_SEQ")
	public Long getAnaSeq() {
		return this.anaSeq;
	}

	public void setAnaSeq(Long anaSeq) {
		this.anaSeq = anaSeq;
	}

	@Column(name = "EVO_SEQ")
	public Long getEvoSeq() {
		return this.evoSeq;
	}

	public void setEvoSeq(Long evoSeq) {
		this.evoSeq = evoSeq;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		CON_NUMERO("conNumero"),
		PAC_CODIGO("pacCodigo"),
		ANA_SEQ("anaSeq"),
		EVO_SEQ("evoSeq");

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
		if (!(obj instanceof MamTmpImpConsulta)) {
			return false;
		}
		MamTmpImpConsulta other = (MamTmpImpConsulta) obj;
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

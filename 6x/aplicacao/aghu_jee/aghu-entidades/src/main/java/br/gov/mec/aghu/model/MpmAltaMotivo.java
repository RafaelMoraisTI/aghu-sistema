package br.gov.mec.aghu.model;

// Generated 14/05/2010 17:36:35 by Hibernate Tools 3.2.5.Beta

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MpmAltaMotivos generated by hbm2java
 */
@Entity
@Table(name = "MPM_ALTA_MOTIVOS", schema = "AGH")

public class MpmAltaMotivo extends BaseEntityId<MpmAltaSumarioId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8046058009286368756L;
	/**
	 * Mapeamento oneToOne para ser bidirecional o id deve ser o mesmo, inclusive o tipo.
	 */
	private MpmAltaSumarioId id;
	private String descMotivo;
	private String complMotivo;
	private MpmMotivoAltaMedica motivoAltaMedicas;
	private MpmAltaSumario altaSumario;

	public MpmAltaMotivo() {
	}

	public MpmAltaMotivo(MpmAltaSumarioId id, String descMotivo, MpmMotivoAltaMedica motivoAltaMedicas) {
		this.id = id;
		this.descMotivo = descMotivo;
		this.motivoAltaMedicas = motivoAltaMedicas;
	}

	public MpmAltaMotivo(MpmAltaSumarioId id, String descMotivo,
			String complMotivo, MpmMotivoAltaMedica motivoAltaMedicas) {
		this.id = id;
		this.descMotivo = descMotivo;
		this.complMotivo = complMotivo;
		this.motivoAltaMedicas = motivoAltaMedicas;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "apaAtdSeq", column = @Column(name = "ASU_APA_ATD_SEQ", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "apaSeq", column = @Column(name = "ASU_APA_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "ASU_SEQP", nullable = false, precision = 3, scale = 0)) })
	public MpmAltaSumarioId getId() {
		return this.id;
	}

	public void setId(MpmAltaSumarioId id) {
		this.id = id;
	}

	@Column(name = "DESC_MOTIVO", nullable = false, length = 240)
	@Length(max = 240)
	public String getDescMotivo() {
		return this.descMotivo;
	}

	public void setDescMotivo(String descMotivo) {
		this.descMotivo = descMotivo;
	}

	@Column(name = "COMPL_MOTIVO", length = 500)
	@Length(max = 500)
	public String getComplMotivo() {
		return this.complMotivo;
	}

	public void setComplMotivo(String complMotivo) {
		this.complMotivo = complMotivo;
	}


	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "MAM_SEQ", nullable=false)
	public MpmMotivoAltaMedica getMotivoAltaMedicas() {
		return this.motivoAltaMedicas;
	}

	public void setMotivoAltaMedicas(MpmMotivoAltaMedica motivoAltaMedicas) {
		this.motivoAltaMedicas = motivoAltaMedicas;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "altaMotivos")
	public MpmAltaSumario getAltaSumario() {
		return altaSumario;
	}

	public void setAltaSumario(MpmAltaSumario altaSumario) {
		this.altaSumario = altaSumario;
	}

	public enum Fields {
		DESC_MOTIVO("descMotivo"),
		COMPL_MOTIVO("complMotivo"),
		MOTIVO_ALTA_MEDICAS("motivoAltaMedicas"),
		ALTA_SUMARIO("altaSumario"),
		ALTA_SUMARIO_ID("altaSumario.id"),
		APA_ATD_SEQ("id.apaAtdSeq"),
		APA_SEQ("id.apaSeq"),
		SEQP("id.seqp"),
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
		if (!(obj instanceof MpmAltaMotivo)) {
			return false;
		}
		MpmAltaMotivo other = (MpmAltaMotivo) obj;
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

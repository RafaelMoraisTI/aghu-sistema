package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MamEmgServEspecialidadeId generated by hbm2java
 */
@Embeddable
public class MamEmgServEspecialidadeId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7533072550614570594L;
	private Integer eseSeq;
	private Short eepEspSeq;

	public MamEmgServEspecialidadeId() {
	}

	public MamEmgServEspecialidadeId(Integer eseSeq, Short eepEspSeq) {
		this.eseSeq = eseSeq;
		this.eepEspSeq = eepEspSeq;
	}

	@Column(name = "ESE_SEQ", nullable = false)
	public Integer getEseSeq() {
		return this.eseSeq;
	}

	public void setEseSeq(Integer eseSeq) {
		this.eseSeq = eseSeq;
	}

	@Column(name = "EEP_ESP_SEQ", nullable = false)
	public Short getEepEspSeq() {
		return this.eepEspSeq;
	}

	public void setEepEspSeq(Short eepEspSeq) {
		this.eepEspSeq = eepEspSeq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getEepEspSeq());
		umHashCodeBuilder.append(this.getEseSeq());
		return umHashCodeBuilder.toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof MamEmgServEspecialidadeId)) {
			return false;
		}
		MamEmgServEspecialidadeId other = (MamEmgServEspecialidadeId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getEepEspSeq(), other.getEepEspSeq());
		umEqualsBuilder.append(this.getEseSeq(), other.getEseSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}

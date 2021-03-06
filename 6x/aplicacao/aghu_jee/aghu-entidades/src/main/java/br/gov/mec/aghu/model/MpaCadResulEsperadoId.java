package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MpaCadResulEsperadoId generated by hbm2java
 */
@Embeddable
public class MpaCadResulEsperadoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2598406179810556627L;
	private Short citVpaPtaSeq;
	private Short citVpaSeqp;
	private Short citSeqp;
	private Short seqp;

	public MpaCadResulEsperadoId() {
	}

	public MpaCadResulEsperadoId(Short citVpaPtaSeq, Short citVpaSeqp, Short citSeqp, Short seqp) {
		this.citVpaPtaSeq = citVpaPtaSeq;
		this.citVpaSeqp = citVpaSeqp;
		this.citSeqp = citSeqp;
		this.seqp = seqp;
	}

	@Column(name = "CIT_VPA_PTA_SEQ", nullable = false)
	public Short getCitVpaPtaSeq() {
		return this.citVpaPtaSeq;
	}

	public void setCitVpaPtaSeq(Short citVpaPtaSeq) {
		this.citVpaPtaSeq = citVpaPtaSeq;
	}

	@Column(name = "CIT_VPA_SEQP", nullable = false)
	public Short getCitVpaSeqp() {
		return this.citVpaSeqp;
	}

	public void setCitVpaSeqp(Short citVpaSeqp) {
		this.citVpaSeqp = citVpaSeqp;
	}

	@Column(name = "CIT_SEQP", nullable = false)
	public Short getCitSeqp() {
		return this.citSeqp;
	}

	public void setCitSeqp(Short citSeqp) {
		this.citSeqp = citSeqp;
	}

	@Column(name = "SEQP", nullable = false)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getCitVpaPtaSeq());
		umHashCodeBuilder.append(this.getCitVpaSeqp());
		umHashCodeBuilder.append(this.getCitSeqp());
		umHashCodeBuilder.append(this.getSeqp());
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
		if (!(obj instanceof MpaCadResulEsperadoId)) {
			return false;
		}
		MpaCadResulEsperadoId other = (MpaCadResulEsperadoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getCitVpaPtaSeq(), other.getCitVpaPtaSeq());
		umEqualsBuilder.append(this.getCitVpaSeqp(), other.getCitVpaSeqp());
		umEqualsBuilder.append(this.getCitSeqp(), other.getCitSeqp());
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}

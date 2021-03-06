package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * CtbNivel2Id generated by hbm2java
 */
@Embeddable
public class CtbNivel2Id implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4500927646039399818L;
	private Short seqp;
	private Short nv1Seq;

	public CtbNivel2Id() {
	}

	public CtbNivel2Id(Short seqp, Short nv1Seq) {
		this.seqp = seqp;
		this.nv1Seq = nv1Seq;
	}

	@Column(name = "SEQP", nullable = false)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}

	@Column(name = "NV1_SEQ", nullable = false)
	public Short getNv1Seq() {
		return this.nv1Seq;
	}

	public void setNv1Seq(Short nv1Seq) {
		this.nv1Seq = nv1Seq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getSeqp());
		umHashCodeBuilder.append(this.getNv1Seq());
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
		if (!(obj instanceof CtbNivel2Id)) {
			return false;
		}
		CtbNivel2Id other = (CtbNivel2Id) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getNv1Seq(), other.getNv1Seq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}

package br.gov.mec.aghu.model;

// Generated 19/04/2012 16:57:27 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MbcDescricaoTecnicasId generated by hbm2java
 */
@Embeddable
public class MbcDescricaoTecnicasId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -450640541805199334L;
	private Integer dcgCrgSeq;
	private Short dcgSeqp;

	public MbcDescricaoTecnicasId() {
	}

	public MbcDescricaoTecnicasId(Integer dcgCrgSeq, Short dcgSeqp) {
		this.dcgCrgSeq = dcgCrgSeq;
		this.dcgSeqp = dcgSeqp;
	}

	@Column(name = "DCG_CRG_SEQ", nullable = false)
	public Integer getDcgCrgSeq() {
		return this.dcgCrgSeq;
	}

	public void setDcgCrgSeq(Integer dcgCrgSeq) {
		this.dcgCrgSeq = dcgCrgSeq;
	}

	@Column(name = "DCG_SEQP", nullable = false)
	public Short getDcgSeqp() {
		return this.dcgSeqp;
	}

	public void setDcgSeqp(Short dcgSeqp) {
		this.dcgSeqp = dcgSeqp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dcgCrgSeq == null) ? 0 : dcgCrgSeq.hashCode());
		result = prime * result + ((dcgSeqp == null) ? 0 : dcgSeqp.hashCode());
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		MbcDescricaoTecnicasId other = (MbcDescricaoTecnicasId) obj;
		if (dcgCrgSeq == null) {
			if (other.dcgCrgSeq != null) {
				return false;
			}
		} else if (!dcgCrgSeq.equals(other.dcgCrgSeq)) {
			return false;
		}
		if (dcgSeqp == null) {
			if (other.dcgSeqp != null) {
				return false;
			}
		} else if (!dcgSeqp.equals(other.dcgSeqp)) {
			return false;
		}
		return true;
	}
}

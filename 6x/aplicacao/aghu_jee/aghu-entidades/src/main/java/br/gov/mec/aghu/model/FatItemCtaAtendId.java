package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * FatItemCtaAtendsId generated by hbm2java
 */
@Embeddable
public class FatItemCtaAtendId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6862673904944435872L;
	private Integer canSeq;
	private Integer seqp;

	public FatItemCtaAtendId() {
	}

	public FatItemCtaAtendId(Integer canSeq, Integer seqp) {
		this.canSeq = canSeq;
		this.seqp = seqp;
	}

	@Column(name = "CAN_SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getCanSeq() {
		return this.canSeq;
	}

	public void setCanSeq(Integer canSeq) {
		this.canSeq = canSeq;
	}

	@Column(name = "SEQP", nullable = false, precision = 8, scale = 0)
	public Integer getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Integer seqp) {
		this.seqp = seqp;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof FatItemCtaAtendId)) {
			return false;
		}
		FatItemCtaAtendId castOther = (FatItemCtaAtendId) other;

		return (this.getCanSeq() == castOther.getCanSeq())
				&& (this.getSeqp() == castOther.getSeqp());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCanSeq();
		result = 37 * result + this.getSeqp();
		return result;
	}

}
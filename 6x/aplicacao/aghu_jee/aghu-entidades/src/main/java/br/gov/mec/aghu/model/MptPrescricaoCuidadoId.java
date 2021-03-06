package br.gov.mec.aghu.model;

// Generated 01/12/2010 16:25:16 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MptPrescricaoCuidadosId generated by hbm2java
 */


@Embeddable
public class MptPrescricaoCuidadoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8696383586819748060L;
	private Integer pteAtdSeq;
	private Integer pteSeq;
	private Integer seq;

	public MptPrescricaoCuidadoId() {
	}

	public MptPrescricaoCuidadoId(Integer pteAtdSeq, Integer pteSeq, Integer seq) {
		this.pteAtdSeq = pteAtdSeq;
		this.pteSeq = pteSeq;
		this.seq = seq;
	}

	@Column(name = "PTE_ATD_SEQ", nullable = false, precision = 7, scale = 0)
	public Integer getPteAtdSeq() {
		return this.pteAtdSeq;
	}

	public void setPteAtdSeq(Integer pteAtdSeq) {
		this.pteAtdSeq = pteAtdSeq;
	}

	@Column(name = "PTE_SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getPteSeq() {
		return this.pteSeq;
	}

	public void setPteSeq(Integer pteSeq) {
		this.pteSeq = pteSeq;
	}

	@Column(name = "SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof MptPrescricaoCuidadoId)) {
			return false;
		}
		MptPrescricaoCuidadoId castOther = (MptPrescricaoCuidadoId) other;

		return (this.getPteAtdSeq().equals(castOther.getPteAtdSeq()))
				&& (this.getPteSeq().equals(castOther.getPteSeq()))
				&& (this.getSeq().equals(castOther.getSeq()));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPteAtdSeq();
		result = 37 * result + this.getPteSeq();
		result = 37 * result + this.getSeq();
		return result;
	}

}

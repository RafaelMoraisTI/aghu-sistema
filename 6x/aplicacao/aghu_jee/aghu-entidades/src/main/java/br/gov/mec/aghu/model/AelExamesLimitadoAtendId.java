package br.gov.mec.aghu.model;

// Generated 18/03/2011 10:47:15 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelExamesLimitadoAtendId generated by hbm2java
 */
@Embeddable
public class AelExamesLimitadoAtendId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8349474225108372953L;
	private Integer atdSeq;
	private String emaExaSigla;
	private Integer emaManSeq;

	public AelExamesLimitadoAtendId() {
	}

	public AelExamesLimitadoAtendId(Integer atdSeq, String emaExaSigla,
			Integer emaManSeq) {
		this.atdSeq = atdSeq;
		this.emaExaSigla = emaExaSigla;
		this.emaManSeq = emaManSeq;
	}

	@Column(name = "ATD_SEQ", nullable = false)
	public Integer getAtdSeq() {
		return this.atdSeq;
	}

	public void setAtdSeq(Integer atdSeq) {
		this.atdSeq = atdSeq;
	}

	@Column(name = "EMA_EXA_SIGLA", nullable = false, length = 5)
	@Length(max = 5)
	public String getEmaExaSigla() {
		return this.emaExaSigla;
	}

	public void setEmaExaSigla(String emaExaSigla) {
		this.emaExaSigla = emaExaSigla;
	}

	@Column(name = "EMA_MAN_SEQ", nullable = false)
	public Integer getEmaManSeq() {
		return this.emaManSeq;
	}

	public void setEmaManSeq(Integer emaManSeq) {
		this.emaManSeq = emaManSeq;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AelExamesLimitadoAtendId)) {
			return false;
		}
		AelExamesLimitadoAtendId castOther = (AelExamesLimitadoAtendId) other;

		return (this.getAtdSeq().equals(castOther.getAtdSeq()))
				&& ((this.getEmaExaSigla().equals(castOther.getEmaExaSigla())) || (this
						.getEmaExaSigla() != null
						&& castOther.getEmaExaSigla() != null && this
						.getEmaExaSigla().equals(castOther.getEmaExaSigla())))
				&& (this.getEmaManSeq().equals(castOther.getEmaManSeq()));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getAtdSeq();
		result = 37
				* result
				+ (getEmaExaSigla() == null ? 0 : this.getEmaExaSigla()
						.hashCode());
		result = 37 * result + this.getEmaManSeq();
		return result;
	}

}
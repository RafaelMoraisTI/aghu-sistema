package br.gov.mec.aghu.model;

// Generated 18/04/2011 19:20:02 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelEtapasExameId generated by hbm2java
 */
@Embeddable
public class AelEtapaExameId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5726127258378940531L;
	private String exaSigla;
	private Short seqp;

	public AelEtapaExameId() {
	}

	public AelEtapaExameId(String exaSigla, Short seqp) {
		this.exaSigla = exaSigla;
		this.seqp = seqp;
	}

	@Column(name = "EXA_SIGLA", nullable = false, length = 5)
	@Length(max = 5)
	public String getExaSigla() {
		return this.exaSigla;
	}

	public void setExaSigla(String exaSigla) {
		this.exaSigla = exaSigla;
	}

	@Column(name = "SEQP", nullable = false)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
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
		if (!(other instanceof AelEtapaExameId)) {
			return false;
		}
		AelEtapaExameId castOther = (AelEtapaExameId) other;

		return ((this.getExaSigla() == castOther.getExaSigla()) || (this
				.getExaSigla() != null && castOther.getExaSigla() != null && this
				.getExaSigla().equals(castOther.getExaSigla())))
				&& (this.getSeqp() == castOther.getSeqp());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getExaSigla() == null ? 0 : this.getExaSigla().hashCode());
		result = 37 * result + this.getSeqp();
		return result;
	}

}

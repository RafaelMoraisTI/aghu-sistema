package br.gov.mec.aghu.model;

// Generated 29/11/2010 13:46:11 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelUnfExecutaExamesId generated by hbm2java
 */
@Embeddable
public class AelUnfExecutaExamesId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -357266493501502060L;
	private String emaExaSigla;
	private Integer emaManSeq;
	private AghUnidadesFuncionais unfSeq;

	public AelUnfExecutaExamesId() {
	}

	public AelUnfExecutaExamesId(String emaExaSigla, Integer emaManSeq, AghUnidadesFuncionais unfSeq) {
		this.emaExaSigla = emaExaSigla;
		this.emaManSeq = emaManSeq;
		this.unfSeq = unfSeq;
	}

	@Column(name = "EMA_EXA_SIGLA", nullable = false, length = 5)
	@Length(max = 5)
	public String getEmaExaSigla() {
		return this.emaExaSigla;
	}

	public void setEmaExaSigla(String emaExaSigla) {
		this.emaExaSigla = emaExaSigla;
	}

	@Column(name = "EMA_MAN_SEQ", nullable = false, precision = 5, scale = 0)
	public Integer getEmaManSeq() {
		return this.emaManSeq;
	}

	public void setEmaManSeq(Integer emaManSeq) {
		this.emaManSeq = emaManSeq;
	}

	@ManyToOne
	@JoinColumn(name = "UNF_SEQ")
	public AghUnidadesFuncionais getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(AghUnidadesFuncionais unfSeq) {
		this.unfSeq = unfSeq;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((emaExaSigla == null) ? 0 : emaExaSigla.hashCode());
		result = prime * result
				+ ((emaManSeq == null) ? 0 : emaManSeq.hashCode());
		result = prime * result + ((unfSeq == null) ? 0 : unfSeq.hashCode());
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
		if (!(obj instanceof AelUnfExecutaExamesId)) {
			return false;
		}
		AelUnfExecutaExamesId other = (AelUnfExecutaExamesId) obj;
		if (emaExaSigla == null) {
			if (other.emaExaSigla != null) {
				return false;
			}
		} else if (!emaExaSigla.equals(other.emaExaSigla)) {
			return false;
		}
		if (emaManSeq == null) {
			if (other.emaManSeq != null) {
				return false;
			}
		} else if (!emaManSeq.equals(other.emaManSeq)) {
			return false;
		}
		if (unfSeq == null) {
			if (other.unfSeq != null) {
				return false;
			}
		} else if (!unfSeq.equals(other.unfSeq)) {
			return false;
		}
		return true;
	}

	

}

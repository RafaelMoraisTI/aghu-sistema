package br.gov.mec.aghu.model;

// Generated 18/03/2011 10:47:15 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelExameForaAghsId generated by hbm2java
 */
@Embeddable
public class AelExameForaAghId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2920425174926243121L;
	private String emaExaSigla;
	private Integer emaManSeq;
	private Short unfSeq;
	private String indOrigem;
	private Date dtCompetencia;

	public AelExameForaAghId() {
	}

	public AelExameForaAghId(String emaExaSigla, Integer emaManSeq, Short unfSeq,
			String indOrigem, Date dtCompetencia) {
		this.emaExaSigla = emaExaSigla;
		this.emaManSeq = emaManSeq;
		this.unfSeq = unfSeq;
		this.indOrigem = indOrigem;
		this.dtCompetencia = dtCompetencia;
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

	@Column(name = "UNF_SEQ", nullable = false)
	public Short getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}

	@Column(name = "IND_ORIGEM", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndOrigem() {
		return this.indOrigem;
	}

	public void setIndOrigem(String indOrigem) {
		this.indOrigem = indOrigem;
	}

	@Column(name = "DT_COMPETENCIA", nullable = false, length = 29)
	public Date getDtCompetencia() {
		return this.dtCompetencia;
	}

	public void setDtCompetencia(Date dtCompetencia) {
		this.dtCompetencia = dtCompetencia;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AelExameForaAghId)) {
			return false;
		}
		AelExameForaAghId castOther = (AelExameForaAghId) other;

		return ((this.getEmaExaSigla() == castOther.getEmaExaSigla()) || (this
				.getEmaExaSigla() != null
				&& castOther.getEmaExaSigla() != null && this.getEmaExaSigla()
				.equals(castOther.getEmaExaSigla())))
				&& (this.getEmaManSeq() == castOther.getEmaManSeq())
				&& (this.getUnfSeq() == castOther.getUnfSeq())
				&& ((this.getIndOrigem() == castOther.getIndOrigem()) || (this
						.getIndOrigem() != null
						&& castOther.getIndOrigem() != null && this
						.getIndOrigem().equals(castOther.getIndOrigem())))
				&& ((this.getDtCompetencia() == castOther.getDtCompetencia()) || (this
						.getDtCompetencia() != null
						&& castOther.getDtCompetencia() != null && this
						.getDtCompetencia()
						.equals(castOther.getDtCompetencia())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getEmaExaSigla() == null ? 0 : this.getEmaExaSigla()
						.hashCode());
		result = 37 * result + this.getEmaManSeq();
		result = 37 * result + this.getUnfSeq();
		result = 37 * result
				+ (getIndOrigem() == null ? 0 : this.getIndOrigem().hashCode());
		result = 37
				* result
				+ (getDtCompetencia() == null ? 0 : this.getDtCompetencia()
						.hashCode());
		return result;
	}

}

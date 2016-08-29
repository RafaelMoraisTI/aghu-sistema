package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AbsExameMetodoConfirmId generated by hbm2java
 */
@Embeddable
public class AbsExameMetodoConfirmId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3500999321094096936L;
	private Short emmMetSeq;
	private String emmUfeEmaExaSigla;
	private Integer emmUfeEmaManSeq;
	private Short emmUfeUnfSeq;
	private Short emmMetSeqFilho;
	private String emmUfeEmaExaSiglaFilho;
	private Integer emmUfeEmaManSeqFilho;
	private Short emmUfeUnfSeqFilho;

	public AbsExameMetodoConfirmId() {
	}

	public AbsExameMetodoConfirmId(Short emmMetSeq, String emmUfeEmaExaSigla, Integer emmUfeEmaManSeq, Short emmUfeUnfSeq,
			Short emmMetSeqFilho, String emmUfeEmaExaSiglaFilho, Integer emmUfeEmaManSeqFilho, Short emmUfeUnfSeqFilho) {
		this.emmMetSeq = emmMetSeq;
		this.emmUfeEmaExaSigla = emmUfeEmaExaSigla;
		this.emmUfeEmaManSeq = emmUfeEmaManSeq;
		this.emmUfeUnfSeq = emmUfeUnfSeq;
		this.emmMetSeqFilho = emmMetSeqFilho;
		this.emmUfeEmaExaSiglaFilho = emmUfeEmaExaSiglaFilho;
		this.emmUfeEmaManSeqFilho = emmUfeEmaManSeqFilho;
		this.emmUfeUnfSeqFilho = emmUfeUnfSeqFilho;
	}

	@Column(name = "EMM_MET_SEQ", nullable = false)
	public Short getEmmMetSeq() {
		return this.emmMetSeq;
	}

	public void setEmmMetSeq(Short emmMetSeq) {
		this.emmMetSeq = emmMetSeq;
	}

	@Column(name = "EMM_UFE_EMA_EXA_SIGLA", nullable = false, length = 5)
	@Length(max = 5)
	public String getEmmUfeEmaExaSigla() {
		return this.emmUfeEmaExaSigla;
	}

	public void setEmmUfeEmaExaSigla(String emmUfeEmaExaSigla) {
		this.emmUfeEmaExaSigla = emmUfeEmaExaSigla;
	}

	@Column(name = "EMM_UFE_EMA_MAN_SEQ", nullable = false)
	public Integer getEmmUfeEmaManSeq() {
		return this.emmUfeEmaManSeq;
	}

	public void setEmmUfeEmaManSeq(Integer emmUfeEmaManSeq) {
		this.emmUfeEmaManSeq = emmUfeEmaManSeq;
	}

	@Column(name = "EMM_UFE_UNF_SEQ", nullable = false)
	public Short getEmmUfeUnfSeq() {
		return this.emmUfeUnfSeq;
	}

	public void setEmmUfeUnfSeq(Short emmUfeUnfSeq) {
		this.emmUfeUnfSeq = emmUfeUnfSeq;
	}

	@Column(name = "EMM_MET_SEQ_FILHO", nullable = false)
	public Short getEmmMetSeqFilho() {
		return this.emmMetSeqFilho;
	}

	public void setEmmMetSeqFilho(Short emmMetSeqFilho) {
		this.emmMetSeqFilho = emmMetSeqFilho;
	}

	@Column(name = "EMM_UFE_EMA_EXA_SIGLA_FILHO", nullable = false, length = 5)
	@Length(max = 5)
	public String getEmmUfeEmaExaSiglaFilho() {
		return this.emmUfeEmaExaSiglaFilho;
	}

	public void setEmmUfeEmaExaSiglaFilho(String emmUfeEmaExaSiglaFilho) {
		this.emmUfeEmaExaSiglaFilho = emmUfeEmaExaSiglaFilho;
	}

	@Column(name = "EMM_UFE_EMA_MAN_SEQ_FILHO", nullable = false)
	public Integer getEmmUfeEmaManSeqFilho() {
		return this.emmUfeEmaManSeqFilho;
	}

	public void setEmmUfeEmaManSeqFilho(Integer emmUfeEmaManSeqFilho) {
		this.emmUfeEmaManSeqFilho = emmUfeEmaManSeqFilho;
	}

	@Column(name = "EMM_UFE_UNF_SEQ_FILHO", nullable = false)
	public Short getEmmUfeUnfSeqFilho() {
		return this.emmUfeUnfSeqFilho;
	}

	public void setEmmUfeUnfSeqFilho(Short emmUfeUnfSeqFilho) {
		this.emmUfeUnfSeqFilho = emmUfeUnfSeqFilho;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getEmmMetSeq());
		umHashCodeBuilder.append(this.getEmmUfeEmaExaSigla());
		umHashCodeBuilder.append(this.getEmmUfeEmaManSeq());
		umHashCodeBuilder.append(this.getEmmUfeUnfSeq());
		umHashCodeBuilder.append(this.getEmmMetSeqFilho());
		umHashCodeBuilder.append(this.getEmmUfeEmaExaSiglaFilho());
		umHashCodeBuilder.append(this.getEmmUfeEmaManSeqFilho());
		umHashCodeBuilder.append(this.getEmmUfeUnfSeqFilho());
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
		if (!(obj instanceof AbsExameMetodoConfirmId)) {
			return false;
		}
		AbsExameMetodoConfirmId other = (AbsExameMetodoConfirmId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getEmmMetSeq(), other.getEmmMetSeq());
		umEqualsBuilder.append(this.getEmmUfeEmaExaSigla(), other.getEmmUfeEmaExaSigla());
		umEqualsBuilder.append(this.getEmmUfeEmaManSeq(), other.getEmmUfeEmaManSeq());
		umEqualsBuilder.append(this.getEmmUfeUnfSeq(), other.getEmmUfeUnfSeq());
		umEqualsBuilder.append(this.getEmmMetSeqFilho(), other.getEmmMetSeqFilho());
		umEqualsBuilder.append(this.getEmmUfeEmaExaSiglaFilho(), other.getEmmUfeEmaExaSiglaFilho());
		umEqualsBuilder.append(this.getEmmUfeEmaManSeqFilho(), other.getEmmUfeEmaManSeqFilho());
		umEqualsBuilder.append(this.getEmmUfeUnfSeqFilho(), other.getEmmUfeUnfSeqFilho());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
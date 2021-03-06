package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MbcPerfilCancelamentoId generated by hbm2java
 */
@Embeddable
public class MbcPerfilCancelamentoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3583556740064978725L;
	private Short mtcSeq;
	private String perNome;

	public MbcPerfilCancelamentoId() {
	}

	public MbcPerfilCancelamentoId(Short mtcSeq, String perNome) {
		this.mtcSeq = mtcSeq;
		this.perNome = perNome;
	}

	@Column(name = "MTC_SEQ", nullable = false)
	public Short getMtcSeq() {
		return this.mtcSeq;
	}

	public void setMtcSeq(Short mtcSeq) {
		this.mtcSeq = mtcSeq;
	}

	@Column(name = "PER_NOME", nullable = false, length = 30)
	@Length(max = 30)
	public String getPerNome() {
		return this.perNome;
	}

	public void setPerNome(String perNome) {
		this.perNome = perNome;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getPerNome());
		umHashCodeBuilder.append(this.getMtcSeq());
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
		if (!(obj instanceof MbcPerfilCancelamentoId)) {
			return false;
		}
		MbcPerfilCancelamentoId other = (MbcPerfilCancelamentoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getPerNome(), other.getPerNome());
		umEqualsBuilder.append(this.getMtcSeq(), other.getMtcSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}

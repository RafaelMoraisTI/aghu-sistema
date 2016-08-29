package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AesModificacaoEscEncerradaId generated by hbm2java
 */
@Embeddable
public class AesModificacaoEscEncerradaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3285760243123236788L;
	private Integer regSerMatricula;
	private Short regSerVinCodigo;
	private Integer regSeq;
	private Integer seq;

	public AesModificacaoEscEncerradaId() {
	}

	public AesModificacaoEscEncerradaId(Integer regSerMatricula, Short regSerVinCodigo, Integer regSeq, Integer seq) {
		this.regSerMatricula = regSerMatricula;
		this.regSerVinCodigo = regSerVinCodigo;
		this.regSeq = regSeq;
		this.seq = seq;
	}

	@Column(name = "REG_SER_MATRICULA", nullable = false)
	public Integer getRegSerMatricula() {
		return this.regSerMatricula;
	}

	public void setRegSerMatricula(Integer regSerMatricula) {
		this.regSerMatricula = regSerMatricula;
	}

	@Column(name = "REG_SER_VIN_CODIGO", nullable = false)
	public Short getRegSerVinCodigo() {
		return this.regSerVinCodigo;
	}

	public void setRegSerVinCodigo(Short regSerVinCodigo) {
		this.regSerVinCodigo = regSerVinCodigo;
	}

	@Column(name = "REG_SEQ", nullable = false)
	public Integer getRegSeq() {
		return this.regSeq;
	}

	public void setRegSeq(Integer regSeq) {
		this.regSeq = regSeq;
	}

	@Column(name = "SEQ", nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getSeq());
		umHashCodeBuilder.append(this.getRegSerMatricula());
		umHashCodeBuilder.append(this.getRegSerVinCodigo());
		umHashCodeBuilder.append(this.getRegSeq());
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
		if (!(obj instanceof AesModificacaoEscEncerradaId)) {
			return false;
		}
		AesModificacaoEscEncerradaId other = (AesModificacaoEscEncerradaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeq(), other.getSeq());
		umEqualsBuilder.append(this.getRegSerMatricula(), other.getRegSerMatricula());
		umEqualsBuilder.append(this.getRegSerVinCodigo(), other.getRegSerVinCodigo());
		umEqualsBuilder.append(this.getRegSeq(), other.getRegSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
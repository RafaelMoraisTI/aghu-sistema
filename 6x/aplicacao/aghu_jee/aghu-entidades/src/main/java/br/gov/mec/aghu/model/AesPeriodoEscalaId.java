package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AesPeriodoEscalaId generated by hbm2java
 */
@Embeddable
public class AesPeriodoEscalaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8729324284974037017L;
	private Integer areCodigo;
	private Short sequencia;

	public AesPeriodoEscalaId() {
	}

	public AesPeriodoEscalaId(Integer areCodigo, Short sequencia) {
		this.areCodigo = areCodigo;
		this.sequencia = sequencia;
	}

	@Column(name = "ARE_CODIGO", nullable = false)
	public Integer getAreCodigo() {
		return this.areCodigo;
	}

	public void setAreCodigo(Integer areCodigo) {
		this.areCodigo = areCodigo;
	}

	@Column(name = "SEQUENCIA", nullable = false)
	public Short getSequencia() {
		return this.sequencia;
	}

	public void setSequencia(Short sequencia) {
		this.sequencia = sequencia;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getSequencia());
		umHashCodeBuilder.append(this.getAreCodigo());
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
		if (!(obj instanceof AesPeriodoEscalaId)) {
			return false;
		}
		AesPeriodoEscalaId other = (AesPeriodoEscalaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSequencia(), other.getSequencia());
		umEqualsBuilder.append(this.getAreCodigo(), other.getAreCodigo());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * SceLoteProblemaId generated by hbm2java
 */
@Embeddable
public class SceLoteProblemaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4425684286799912233L;
	private Integer matCodigo;
	private Short numero;

	public SceLoteProblemaId() {
	}

	public SceLoteProblemaId(Integer matCodigo, Short numero) {
		this.matCodigo = matCodigo;
		this.numero = numero;
	}

	@Column(name = "MAT_CODIGO", nullable = false)
	public Integer getMatCodigo() {
		return this.matCodigo;
	}

	public void setMatCodigo(Integer matCodigo) {
		this.matCodigo = matCodigo;
	}

	@Column(name = "NUMERO", nullable = false)
	public Short getNumero() {
		return this.numero;
	}

	public void setNumero(Short numero) {
		this.numero = numero;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getNumero());
		umHashCodeBuilder.append(this.getMatCodigo());
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
		if (!(obj instanceof SceLoteProblemaId)) {
			return false;
		}
		SceLoteProblemaId other = (SceLoteProblemaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getNumero(), other.getNumero());
		umEqualsBuilder.append(this.getMatCodigo(), other.getMatCodigo());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}

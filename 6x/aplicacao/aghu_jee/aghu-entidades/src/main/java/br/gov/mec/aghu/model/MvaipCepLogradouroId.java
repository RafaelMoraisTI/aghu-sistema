package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MvaipCepLogradouroId generated by hbm2java
 */
@Embeddable
public class MvaipCepLogradouroId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8472318839361037638L;
	private Integer lgrCodigo;
	private Integer cep;

	public MvaipCepLogradouroId() {
	}

	public MvaipCepLogradouroId(Integer lgrCodigo, Integer cep) {
		this.lgrCodigo = lgrCodigo;
		this.cep = cep;
	}

	@Column(name = "LGR_CODIGO", nullable = false)
	public Integer getLgrCodigo() {
		return this.lgrCodigo;
	}

	public void setLgrCodigo(Integer lgrCodigo) {
		this.lgrCodigo = lgrCodigo;
	}

	@Column(name = "CEP", nullable = false)
	public Integer getCep() {
		return this.cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getCep());
		umHashCodeBuilder.append(this.getLgrCodigo());
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
		if (!(obj instanceof MvaipCepLogradouroId)) {
			return false;
		}
		MvaipCepLogradouroId other = (MvaipCepLogradouroId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getCep(), other.getCep());
		umEqualsBuilder.append(this.getLgrCodigo(), other.getLgrCodigo());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}

package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * CtbSubNaturezaPlanoId generated by hbm2java
 */
@Embeddable
public class CtbSubNaturezaPlanoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -343056976727893900L;
	private Long ntpGnpTabCodigo;
	private Long ntpGnpCodigo;
	private Short ntpCodigo;
	private Short codigo;

	public CtbSubNaturezaPlanoId() {
	}

	public CtbSubNaturezaPlanoId(Long ntpGnpTabCodigo, Long ntpGnpCodigo, Short ntpCodigo, Short codigo) {
		this.ntpGnpTabCodigo = ntpGnpTabCodigo;
		this.ntpGnpCodigo = ntpGnpCodigo;
		this.ntpCodigo = ntpCodigo;
		this.codigo = codigo;
	}

	@Column(name = "NTP_GNP_TAB_CODIGO", nullable = false)
	public Long getNtpGnpTabCodigo() {
		return this.ntpGnpTabCodigo;
	}

	public void setNtpGnpTabCodigo(Long ntpGnpTabCodigo) {
		this.ntpGnpTabCodigo = ntpGnpTabCodigo;
	}

	@Column(name = "NTP_GNP_CODIGO", nullable = false)
	public Long getNtpGnpCodigo() {
		return this.ntpGnpCodigo;
	}

	public void setNtpGnpCodigo(Long ntpGnpCodigo) {
		this.ntpGnpCodigo = ntpGnpCodigo;
	}

	@Column(name = "NTP_CODIGO", nullable = false)
	public Short getNtpCodigo() {
		return this.ntpCodigo;
	}

	public void setNtpCodigo(Short ntpCodigo) {
		this.ntpCodigo = ntpCodigo;
	}

	@Column(name = "CODIGO", nullable = false)
	public Short getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Short codigo) {
		this.codigo = codigo;
	}






	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getNtpGnpTabCodigo());
		umHashCodeBuilder.append(this.getNtpGnpCodigo());
		umHashCodeBuilder.append(this.getNtpCodigo());
		umHashCodeBuilder.append(this.getCodigo());
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
		if (!(obj instanceof CtbSubNaturezaPlanoId)) {
			return false;
		}
		CtbSubNaturezaPlanoId other = (CtbSubNaturezaPlanoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getNtpGnpTabCodigo(), other.getNtpGnpTabCodigo());
		umEqualsBuilder.append(this.getNtpGnpCodigo(), other.getNtpGnpCodigo());
		umEqualsBuilder.append(this.getNtpCodigo(), other.getNtpCodigo());
		umEqualsBuilder.append(this.getCodigo(), other.getCodigo());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}

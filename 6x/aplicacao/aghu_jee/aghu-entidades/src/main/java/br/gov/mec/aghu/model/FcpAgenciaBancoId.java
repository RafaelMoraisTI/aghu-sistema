package br.gov.mec.aghu.model;

// Generated 10/08/2010 17:33:16 by Hibernate Tools 3.3.0.GA

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * FcpAgenciaBancosId generated by hbm2java
 */

@Embeddable
public class FcpAgenciaBancoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5011032626662994314L;
	private Short bcoCodigo;
	private Integer codigo;

	public FcpAgenciaBancoId() {
	}

	public FcpAgenciaBancoId(Short bcoCodigo, Integer codigo) {
		this.bcoCodigo = bcoCodigo;
		this.codigo = codigo;
	}

	@Column(name = "BCO_CODIGO", nullable = false, precision = 4, scale = 0)
	public Short getBcoCodigo() {
		return this.bcoCodigo;
	}

	public void setBcoCodigo(Short bcoCodigo) {
		this.bcoCodigo = bcoCodigo;
	}

	@Column(name = "CODIGO", nullable = false, precision = 5, scale = 0)
	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof FcpAgenciaBancoId)) {
			return false;
		}
		FcpAgenciaBancoId castOther = (FcpAgenciaBancoId) other;

		return (this.getBcoCodigo() == castOther.getBcoCodigo())
				&& (this.getCodigo() == castOther.getCodigo());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getBcoCodigo();
		result = 37 * result + this.getCodigo();
		return result;
	}

}

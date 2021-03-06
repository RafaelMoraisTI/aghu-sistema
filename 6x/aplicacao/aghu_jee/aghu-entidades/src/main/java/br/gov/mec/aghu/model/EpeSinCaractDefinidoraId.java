package br.gov.mec.aghu.model;

// Generated 17/10/2011 14:21:24 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * EpeSinCaractDefinidorasId generated by hbm2java
 */
@Embeddable
public class EpeSinCaractDefinidoraId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 928451268573145689L;
	private Integer cdeCodigo;
	private Integer cdeCodigoPossui;

	public EpeSinCaractDefinidoraId() {
	}

	public EpeSinCaractDefinidoraId(Integer cdeCodigo, Integer cdeCodigoPossui) {
		this.cdeCodigo = cdeCodigo;
		this.cdeCodigoPossui = cdeCodigoPossui;
	}

	@Column(name = "CDE_CODIGO", nullable = false, precision = 6, scale = 0)
	public Integer getCdeCodigo() {
		return this.cdeCodigo;
	}

	public void setCdeCodigo(Integer cdeCodigo) {
		this.cdeCodigo = cdeCodigo;
	}

	@Column(name = "CDE_CODIGO_POSSUI", nullable = false, precision = 6, scale = 0)
	public Integer getCdeCodigoPossui() {
		return this.cdeCodigoPossui;
	}

	public void setCdeCodigoPossui(Integer cdeCodigoPossui) {
		this.cdeCodigoPossui = cdeCodigoPossui;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cdeCodigo == null) ? 0 : cdeCodigo.hashCode());
		result = prime * result
				+ ((cdeCodigoPossui == null) ? 0 : cdeCodigoPossui.hashCode());
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		EpeSinCaractDefinidoraId other = (EpeSinCaractDefinidoraId) obj;
		if (cdeCodigo == null) {
			if (other.cdeCodigo != null) {
				return false;
			}
		} else if (!cdeCodigo.equals(other.cdeCodigo)) {
			return false;
		}
		if (cdeCodigoPossui == null) {
			if (other.cdeCodigoPossui != null) {
				return false;
			}
		} else if (!cdeCodigoPossui.equals(other.cdeCodigoPossui)) {
			return false;
		}
		return true;
	}

}

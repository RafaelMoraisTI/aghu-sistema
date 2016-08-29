package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MpmPrincFarmSumarioAltaId generated by hbm2java
 */
@Embeddable
public class MpmPrincFarmSumarioAltaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1019862794329071342L;
	private Integer salAtdSeq;
	private Integer medMatCodigo;

	public MpmPrincFarmSumarioAltaId() {
	}

	public MpmPrincFarmSumarioAltaId(Integer salAtdSeq, Integer medMatCodigo) {
		this.salAtdSeq = salAtdSeq;
		this.medMatCodigo = medMatCodigo;
	}

	@Column(name = "SAL_ATD_SEQ", nullable = false, precision = 7, scale = 0)
	public Integer getSalAtdSeq() {
		return this.salAtdSeq;
	}

	public void setSalAtdSeq(Integer salAtdSeq) {
		this.salAtdSeq = salAtdSeq;
	}

	@Column(name = "MED_MAT_CODIGO", nullable = false, precision = 6, scale = 0)
	public Integer getMedMatCodigo() {
		return this.medMatCodigo;
	}

	public void setMedMatCodigo(Integer medMatCodigo) {
		this.medMatCodigo = medMatCodigo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((medMatCodigo == null) ? 0 : medMatCodigo.hashCode());
		result = prime * result
				+ ((salAtdSeq == null) ? 0 : salAtdSeq.hashCode());
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
		MpmPrincFarmSumarioAltaId other = (MpmPrincFarmSumarioAltaId) obj;
		if (medMatCodigo == null) {
			if (other.medMatCodigo != null) {
				return false;
			}
		} else if (!medMatCodigo.equals(other.medMatCodigo)) {
			return false;
		}
		if (salAtdSeq == null) {
			if (other.salAtdSeq != null) {
				return false;
			}
		} else if (!salAtdSeq.equals(other.salAtdSeq)) {
			return false;
		}
		return true;
	}

}
package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;


import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MpmCidUnidFuncionalId generated by hbm2java
 */

@Embeddable
public class MpmCidUnidFuncionalId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2956491506444476731L;
	private Short unfSeq;
	private Integer cidSeq;

	public MpmCidUnidFuncionalId() {
	}

	public MpmCidUnidFuncionalId(Short unfSeq, Integer cidSeq) {
		this.unfSeq = unfSeq;
		this.cidSeq = cidSeq;
	}

	@Column(name = "UNF_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}

	@Column(name = "CID_SEQ", nullable = false, precision = 5, scale = 0)
	public Integer getCidSeq() {
		return this.cidSeq;
	}

	public void setCidSeq(Integer cidSeq) {
		this.cidSeq = cidSeq;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof MpmCidUnidFuncionalId)) {
			return false;
		}
		MpmCidUnidFuncionalId castOther = (MpmCidUnidFuncionalId) other;

		return (this.getUnfSeq() == castOther.getUnfSeq())
				&& (this.getCidSeq() == castOther.getCidSeq());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getUnfSeq();
		result = 37 * result + this.getCidSeq();
		return result;
	}

}
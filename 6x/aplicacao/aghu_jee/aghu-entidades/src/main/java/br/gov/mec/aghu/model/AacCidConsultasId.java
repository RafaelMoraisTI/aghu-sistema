package br.gov.mec.aghu.model;

// Generated 18/05/2011 13:44:58 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AacCidConsultasId generated by hbm2java
 */
@Embeddable
public class AacCidConsultasId implements EntityCompositeId {

	private static final long serialVersionUID = -8012133375628337197L;
	private Integer conNumero;
	private Integer cidSeq;

	public AacCidConsultasId() {
	}

	public AacCidConsultasId(Integer conNumero, Integer cidSeq) {
		this.conNumero = conNumero;
		this.cidSeq = cidSeq;
	}

	@Column(name = "CON_NUMERO", nullable = false, precision = 8, scale = 0)
	public Integer getConNumero() {
		return this.conNumero;
	}

	public void setConNumero(Integer conNumero) {
		this.conNumero = conNumero;
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
		if (!(other instanceof AacCidConsultasId)) {
			return false;
		}
		AacCidConsultasId castOther = (AacCidConsultasId) other;

		return (this.getConNumero() == castOther.getConNumero())
				&& (this.getCidSeq() == castOther.getCidSeq());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getConNumero();
		result = 37 * result + this.getCidSeq();
		return result;
	}

}

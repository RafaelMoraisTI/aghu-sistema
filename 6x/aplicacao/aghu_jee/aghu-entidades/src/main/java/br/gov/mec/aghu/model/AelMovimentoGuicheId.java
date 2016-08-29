package br.gov.mec.aghu.model;

// Generated 21/06/2010 20:55:38 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AinMovimentosAtendUrgenciaId generated by hbm2java
 */
@Embeddable
public class AelMovimentoGuicheId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1429857305519236106L;
	/**
	 * 
	 */
	private Short cguSeq;
	private Date dthrMovimento;

	public AelMovimentoGuicheId() {
	}

	public AelMovimentoGuicheId(final Short cguSeq, final Date criadoEm) {
		this.cguSeq = cguSeq;
		this.dthrMovimento = criadoEm;
	}

	@Column(name = "CGU_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getSeqAtendimentoUrgencia() {
		return cguSeq;
	}

	public void setSeqAtendimentoUrgencia(final Short cguSeq) {
		this.cguSeq = cguSeq;
	}

	@Column(name = "DTHR_MOVIMENTO", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.dthrMovimento;
	}

	public void setCriadoEm(final Date criadoEm) {
		this.dthrMovimento = criadoEm;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dthrMovimento == null) ? 0 : dthrMovimento.hashCode());
		result = prime * result + ((cguSeq == null) ? 0 : cguSeq.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final AelMovimentoGuicheId other = (AelMovimentoGuicheId) obj;
		if (dthrMovimento == null) {
			if (other.dthrMovimento != null) {
				return false;
			}
		} else if (!dthrMovimento.equals(other.dthrMovimento)) {
			return false;
		}
		if (cguSeq == null) {
			if (other.cguSeq != null) {
				return false;
			}
		} else if (!cguSeq.equals(other.cguSeq)) {
			return false;
		}
		return true;
	}
}
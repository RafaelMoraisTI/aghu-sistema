package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AelItemCobrancaProjeto generated by hbm2java
 */
@Entity
@SequenceGenerator(name="aelIcbSq1", sequenceName="AGH.AEL_ICB_SQ1", allocationSize = 1)
@Table(name = "AEL_ITEM_COBRANCA_PROJETOS", schema = "AGH")
public class AelItemCobrancaProjeto extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7247943586250008888L;
	private Integer seq;
	private Integer version;
	private AelProjetoPesquisas aelProjetoPesquisas;
	private Integer iseSoeSeq;
	private Short iseSeqp;
	private String indSituacao;

	public AelItemCobrancaProjeto() {
	}

	public AelItemCobrancaProjeto(Integer seq, AelProjetoPesquisas aelProjetoPesquisas, Integer iseSoeSeq, Short iseSeqp, String indSituacao) {
		this.seq = seq;
		this.aelProjetoPesquisas = aelProjetoPesquisas;
		this.iseSoeSeq = iseSoeSeq;
		this.iseSeqp = iseSeqp;
		this.indSituacao = indSituacao;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelIcbSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PJQ_SEQ", nullable = false)
	public AelProjetoPesquisas getAelProjetoPesquisas() {
		return this.aelProjetoPesquisas;
	}

	public void setAelProjetoPesquisas(AelProjetoPesquisas aelProjetoPesquisas) {
		this.aelProjetoPesquisas = aelProjetoPesquisas;
	}

	@Column(name = "ISE_SOE_SEQ", nullable = false)
	public Integer getIseSoeSeq() {
		return this.iseSoeSeq;
	}

	public void setIseSoeSeq(Integer iseSoeSeq) {
		this.iseSoeSeq = iseSoeSeq;
	}

	@Column(name = "ISE_SEQP", nullable = false)
	public Short getIseSeqp() {
		return this.iseSeqp;
	}

	public void setIseSeqp(Short iseSeqp) {
		this.iseSeqp = iseSeqp;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		AEL_PROJETO_PESQUISAS("aelProjetoPesquisas"),
		ISE_SOE_SEQ("iseSoeSeq"),
		ISE_SEQP("iseSeqp"),
		IND_SITUACAO("indSituacao");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
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
		if (!(obj instanceof AelItemCobrancaProjeto)) {
			return false;
		}
		AelItemCobrancaProjeto other = (AelItemCobrancaProjeto) obj;
		if (getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
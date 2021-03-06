package br.gov.mec.aghu.model;

// Generated 17/03/2011 17:54:10 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AelSismamaHistoRes generated by hbm2java
 */
@Entity
@SequenceGenerator(name="aelS02Sq1", sequenceName="AGH.AEL_S02_SQ1", allocationSize = 1)
@Table(name = "AEL_SISMAMA_HISTO_RES", schema = "AGH")
public class AelSismamaHistoRes extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3670656313931005818L;
	private Integer seq;
	private Integer version;
	private AelSismamaHistoCad sismamaHistoCad;
	private String resposta;
	private AelItemSolicitacaoExames itemSolicitacaoExame;
	private Date criadoEm;
	private RapServidores servidor;

	public AelSismamaHistoRes() {
	}

	public AelSismamaHistoRes(Integer seq, AelSismamaHistoCad sismamaHistoCad,
			AelItemSolicitacaoExames itemSolicitacaoExame, RapServidores servidor) {
		this.seq = seq;
		this.sismamaHistoCad = sismamaHistoCad;
		this.itemSolicitacaoExame = itemSolicitacaoExame;
		this.servidor = servidor; 
	}

	public AelSismamaHistoRes(Integer seq, AelSismamaHistoCad sismamaHistoCad,
			String resposta, AelItemSolicitacaoExames itemSolicitacaoExame, Date criadoEm,
			RapServidores servidor) {
		this.seq = seq;
		this.sismamaHistoCad = sismamaHistoCad;
		this.resposta = resposta;
		this.itemSolicitacaoExame = itemSolicitacaoExame;
		this.criadoEm = criadoEm;
		this.servidor = servidor; 
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelS02Sq1")
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
	@JoinColumn(name = "S01_CODIGO", nullable = false)
	public AelSismamaHistoCad getSismamaHistoCad() {
		return this.sismamaHistoCad;
	}

	public void setSismamaHistoCad(AelSismamaHistoCad sismamaHistoCad) {
		this.sismamaHistoCad = sismamaHistoCad;
	}

	@Column(name = "RESPOSTA", length = 1000)
	@Length(max = 1000)
	public String getResposta() {
		return this.resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "ISE_SOE_SEQ", referencedColumnName = "SOE_SEQ", nullable = false),
			@JoinColumn(name = "ISE_SEQP", referencedColumnName = "SEQP", nullable = false)})
	public AelItemSolicitacaoExames getItemSolicitacaoExame() {
		return itemSolicitacaoExame;
	}

	public void setItemSolicitacaoExame(
			AelItemSolicitacaoExames itemSolicitacaoExame) {
		this.itemSolicitacaoExame = itemSolicitacaoExame;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	public enum Fields {

		SEQ("seq"),
		SISMAMA_HISTO_CAD("sismamaHistoCad"),
		RESPOSTA("resposta"),
		ITEM_SOLICITACAO_EXAME("itemSolicitacaoExame"),
		CRIADO_EM("criadoEm"),
		SERVIDOR("servidor");

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
		if (!(obj instanceof AelSismamaHistoRes)) {
			return false;
		}
		AelSismamaHistoRes other = (AelSismamaHistoRes) obj;
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

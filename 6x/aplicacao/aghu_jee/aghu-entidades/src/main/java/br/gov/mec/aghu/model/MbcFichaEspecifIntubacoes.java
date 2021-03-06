package br.gov.mec.aghu.model;

// Generated 28/03/2012 15:17:44 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MbcFichaEspecifIntubacoes generated by hbm2java
 */
@Entity
@Table(name = "MBC_FICHA_ESPECIF_INTUBACOES", schema = "AGH")
public class MbcFichaEspecifIntubacoes extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2804487598341543247L;
	private Integer seq;
	private Integer version;
	private MbcFichaAnestesias mbcFichaAnestesias;
	private MbcEspecificacaoIntubacoes mbcEspecificacaoIntubacoes;
	private Date criadoEm;
	private RapServidores rapServidores;

	public MbcFichaEspecifIntubacoes() {
	}

	public MbcFichaEspecifIntubacoes(Integer seq,
			MbcFichaAnestesias mbcFichaAnestesias,
			MbcEspecificacaoIntubacoes mbcEspecificacaoIntubacoes,
			Date criadoEm, RapServidores rapServidores) {
		this.seq = seq;
		this.mbcFichaAnestesias = mbcFichaAnestesias;
		this.mbcEspecificacaoIntubacoes = mbcEspecificacaoIntubacoes;
		this.criadoEm = criadoEm;
		this.rapServidores = rapServidores;
	}

	@Id
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
	@JoinColumn(name = "FIC_SEQ", nullable = false)
	public MbcFichaAnestesias getMbcFichaAnestesias() {
		return this.mbcFichaAnestesias;
	}

	public void setMbcFichaAnestesias(MbcFichaAnestesias mbcFichaAnestesias) {
		this.mbcFichaAnestesias = mbcFichaAnestesias;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EIT_SEQ", nullable = false)
	public MbcEspecificacaoIntubacoes getMbcEspecificacaoIntubacoes() {
		return this.mbcEspecificacaoIntubacoes;
	}

	public void setMbcEspecificacaoIntubacoes(
			MbcEspecificacaoIntubacoes mbcEspecificacaoIntubacoes) {
		this.mbcEspecificacaoIntubacoes = mbcEspecificacaoIntubacoes;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	public enum Fields {

		SEQ("seq"),
		MBC_FICHA_ANESTESIAS("mbcFichaAnestesias"),
		MBC_ESPECIFICACAO_INTUBACOES("mbcEspecificacaoIntubacoes"),
		CRIADO_EM("criadoEm"),
		RAP_SERVIDORES("rapServidores"),;

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
		if (!(obj instanceof MbcFichaEspecifIntubacoes)) {
			return false;
		}
		MbcFichaEspecifIntubacoes other = (MbcFichaEspecifIntubacoes) obj;
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

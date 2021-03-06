package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MptAgendaSessao generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mptAgeSq1", sequenceName="AGH.MPT_AGE_SQ1", allocationSize = 1)
@Table(name = "MPT_AGENDA_SESSOES", schema = "AGH")
public class MptAgendaSessao extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2442223544630180019L;
	private Integer seq;
	private Integer version;
	private RapServidores rapServidoresByMptAgeSerFk2;
	private MptItemPrcrModalidade mptItemPrcrModalidade;
	private RapServidores rapServidoresByMptAgeSerFk1;
	private MptHorarioGradeSessao mptHorarioGradeSessao;
	private Date dtInicio;
	private Date dtFim;
	private String observacao;
	private String indSituacao;
	private Date criadoEm;
	private Date alteradoEm;
	private String indReagenda;
	private Set<MptControleFreqSessao> mptControleFreqSessaoes = new HashSet<MptControleFreqSessao>(0);
	private Set<MptExtratoHrGradeSessao> mptExtratoHrGradeSessaoes = new HashSet<MptExtratoHrGradeSessao>(0);

	public MptAgendaSessao() {
	}

	public MptAgendaSessao(Integer seq, MptItemPrcrModalidade mptItemPrcrModalidade, RapServidores rapServidoresByMptAgeSerFk1,
			MptHorarioGradeSessao mptHorarioGradeSessao, Date dtInicio, String indSituacao, Date criadoEm) {
		this.seq = seq;
		this.mptItemPrcrModalidade = mptItemPrcrModalidade;
		this.rapServidoresByMptAgeSerFk1 = rapServidoresByMptAgeSerFk1;
		this.mptHorarioGradeSessao = mptHorarioGradeSessao;
		this.dtInicio = dtInicio;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
	}

	public MptAgendaSessao(Integer seq, RapServidores rapServidoresByMptAgeSerFk2, MptItemPrcrModalidade mptItemPrcrModalidade,
			RapServidores rapServidoresByMptAgeSerFk1, MptHorarioGradeSessao mptHorarioGradeSessao, Date dtInicio, Date dtFim,
			String observacao, String indSituacao, Date criadoEm, Date alteradoEm, String indReagenda,
			Set<MptControleFreqSessao> mptControleFreqSessaoes, Set<MptExtratoHrGradeSessao> mptExtratoHrGradeSessaoes) {
		this.seq = seq;
		this.rapServidoresByMptAgeSerFk2 = rapServidoresByMptAgeSerFk2;
		this.mptItemPrcrModalidade = mptItemPrcrModalidade;
		this.rapServidoresByMptAgeSerFk1 = rapServidoresByMptAgeSerFk1;
		this.mptHorarioGradeSessao = mptHorarioGradeSessao;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.observacao = observacao;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
		this.indReagenda = indReagenda;
		this.mptControleFreqSessaoes = mptControleFreqSessaoes;
		this.mptExtratoHrGradeSessaoes = mptExtratoHrGradeSessaoes;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mptAgeSq1")
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_ENCERRADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ENCERRADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByMptAgeSerFk2() {
		return this.rapServidoresByMptAgeSerFk2;
	}

	public void setRapServidoresByMptAgeSerFk2(RapServidores rapServidoresByMptAgeSerFk2) {
		this.rapServidoresByMptAgeSerFk2 = rapServidoresByMptAgeSerFk2;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "ITM_PTE_ATD_SEQ", referencedColumnName = "PTE_ATD_SEQ", nullable = false),
			@JoinColumn(name = "ITM_PTE_SEQ", referencedColumnName = "PTE_SEQ", nullable = false),
			@JoinColumn(name = "ITM_SEQP", referencedColumnName = "SEQP", nullable = false) })
	public MptItemPrcrModalidade getMptItemPrcrModalidade() {
		return this.mptItemPrcrModalidade;
	}

	public void setMptItemPrcrModalidade(MptItemPrcrModalidade mptItemPrcrModalidade) {
		this.mptItemPrcrModalidade = mptItemPrcrModalidade;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidoresByMptAgeSerFk1() {
		return this.rapServidoresByMptAgeSerFk1;
	}

	public void setRapServidoresByMptAgeSerFk1(RapServidores rapServidoresByMptAgeSerFk1) {
		this.rapServidoresByMptAgeSerFk1 = rapServidoresByMptAgeSerFk1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "HGS_GSE_SEQ", referencedColumnName = "GSE_SEQ", nullable = false),
			@JoinColumn(name = "HGS_SEQP", referencedColumnName = "SEQP", nullable = false) })
	public MptHorarioGradeSessao getMptHorarioGradeSessao() {
		return this.mptHorarioGradeSessao;
	}

	public void setMptHorarioGradeSessao(MptHorarioGradeSessao mptHorarioGradeSessao) {
		this.mptHorarioGradeSessao = mptHorarioGradeSessao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_INICIO", nullable = false, length = 29)
	public Date getDtInicio() {
		return this.dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FIM", length = 29)
	public Date getDtFim() {
		return this.dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}

	@Column(name = "OBSERVACAO", length = 500)
	@Length(max = 500)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@Column(name = "IND_REAGENDA", length = 1)
	@Length(max = 1)
	public String getIndReagenda() {
		return this.indReagenda;
	}

	public void setIndReagenda(String indReagenda) {
		this.indReagenda = indReagenda;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mptAgendaSessao")
	public Set<MptControleFreqSessao> getMptControleFreqSessaoes() {
		return this.mptControleFreqSessaoes;
	}

	public void setMptControleFreqSessaoes(Set<MptControleFreqSessao> mptControleFreqSessaoes) {
		this.mptControleFreqSessaoes = mptControleFreqSessaoes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mptAgendaSessao")
	public Set<MptExtratoHrGradeSessao> getMptExtratoHrGradeSessaoes() {
		return this.mptExtratoHrGradeSessaoes;
	}

	public void setMptExtratoHrGradeSessaoes(Set<MptExtratoHrGradeSessao> mptExtratoHrGradeSessaoes) {
		this.mptExtratoHrGradeSessaoes = mptExtratoHrGradeSessaoes;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_SERVIDORES_BY_MPT_AGE_SER_FK2("rapServidoresByMptAgeSerFk2"),
		MPT_ITEM_PRCR_MODALIDADES("mptItemPrcrModalidade"),
		RAP_SERVIDORES_BY_MPT_AGE_SER_FK1("rapServidoresByMptAgeSerFk1"),
		MPT_HORARIO_GRADE_SESSOES("mptHorarioGradeSessao"),
		DT_INICIO("dtInicio"),
		DT_FIM("dtFim"),
		OBSERVACAO("observacao"),
		IND_SITUACAO("indSituacao"),
		CRIADO_EM("criadoEm"),
		ALTERADO_EM("alteradoEm"),
		IND_REAGENDA("indReagenda"),
		MPT_CONTROLE_FREQ_SESSAOES("mptControleFreqSessaoes"),
		MPT_EXTRATO_HR_GRADE_SESSAOES("mptExtratoHrGradeSessaoes"),
		ITEM_PRCR_MODALIDADE_ID_PTE_ATD_SEQ("mptItemPrcrModalidade.id.pteAtdSeq"),
		ITEM_PRCR_MODALIDADE_ID_PTE_SEQ("mptItemPrcrModalidade.id.pteSeq"),
		ITEM_PRCR_MODALIDADE_ID_SEQP("mptItemPrcrModalidade.id.seqp");

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
		if (!(obj instanceof MptAgendaSessao)) {
			return false;
		}
		MptAgendaSessao other = (MptAgendaSessao) obj;
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

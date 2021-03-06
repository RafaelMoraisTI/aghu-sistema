package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MpaCicloProtocolo generated by hbm2java
 */
@Entity
@Table(name = "MPA_CICLO_PROTOCOLOS", schema = "AGH")
public class MpaCicloProtocolo extends BaseEntityId<MpaCicloProtocoloId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3927172786164916492L;
	private MpaCicloProtocoloId id;
	private Integer version;
	private RapServidores rapServidores;
	private MpaVersaoProtAssistencial mpaVersaoProtAssistencial;
	private Date criadoEm;
	private String indSituacao;
	private String observacao;
	private String complementoCiclo;
	private Set<MpaCadIntervaloTempo> mpaCadIntervaloTempoes = new HashSet<MpaCadIntervaloTempo>(0);
	private Set<MptJustifPrescricao> mptJustifPrescricaoes = new HashSet<MptJustifPrescricao>(0);

	public MpaCicloProtocolo() {
	}

	public MpaCicloProtocolo(MpaCicloProtocoloId id, RapServidores rapServidores,
			MpaVersaoProtAssistencial mpaVersaoProtAssistencial, Date criadoEm, String indSituacao) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.mpaVersaoProtAssistencial = mpaVersaoProtAssistencial;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
	}

	public MpaCicloProtocolo(MpaCicloProtocoloId id, RapServidores rapServidores,
			MpaVersaoProtAssistencial mpaVersaoProtAssistencial, Date criadoEm, String indSituacao, String observacao,
			String complementoCiclo, Set<MpaCadIntervaloTempo> mpaCadIntervaloTempoes,
			Set<MptJustifPrescricao> mptJustifPrescricaoes) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.mpaVersaoProtAssistencial = mpaVersaoProtAssistencial;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
		this.observacao = observacao;
		this.complementoCiclo = complementoCiclo;
		this.mpaCadIntervaloTempoes = mpaCadIntervaloTempoes;
		this.mptJustifPrescricaoes = mptJustifPrescricaoes;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "vpaPtaSeq", column = @Column(name = "VPA_PTA_SEQ", nullable = false)),
			@AttributeOverride(name = "vpaSeqp", column = @Column(name = "VPA_SEQP", nullable = false)),
			@AttributeOverride(name = "numCiclo", column = @Column(name = "NUM_CICLO", nullable = false)) })
	public MpaCicloProtocoloId getId() {
		return this.id;
	}

	public void setId(MpaCicloProtocoloId id) {
		this.id = id;
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "VPA_PTA_SEQ", referencedColumnName = "PTA_SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "VPA_SEQP", referencedColumnName = "SEQP", nullable = false, insertable = false, updatable = false) })
	public MpaVersaoProtAssistencial getMpaVersaoProtAssistencial() {
		return this.mpaVersaoProtAssistencial;
	}

	public void setMpaVersaoProtAssistencial(MpaVersaoProtAssistencial mpaVersaoProtAssistencial) {
		this.mpaVersaoProtAssistencial = mpaVersaoProtAssistencial;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "OBSERVACAO", length = 2000)
	@Length(max = 2000)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Column(name = "COMPLEMENTO_CICLO", length = 60)
	@Length(max = 60)
	public String getComplementoCiclo() {
		return this.complementoCiclo;
	}

	public void setComplementoCiclo(String complementoCiclo) {
		this.complementoCiclo = complementoCiclo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mpaCicloProtocolo")
	public Set<MpaCadIntervaloTempo> getMpaCadIntervaloTempoes() {
		return this.mpaCadIntervaloTempoes;
	}

	public void setMpaCadIntervaloTempoes(Set<MpaCadIntervaloTempo> mpaCadIntervaloTempoes) {
		this.mpaCadIntervaloTempoes = mpaCadIntervaloTempoes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mpaCicloProtocolo")
	public Set<MptJustifPrescricao> getMptJustifPrescricaoes() {
		return this.mptJustifPrescricaoes;
	}

	public void setMptJustifPrescricaoes(Set<MptJustifPrescricao> mptJustifPrescricaoes) {
		this.mptJustifPrescricaoes = mptJustifPrescricaoes;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		MPA_VERSAO_PROT_ASSISTENCIAIS("mpaVersaoProtAssistencial"),
		CRIADO_EM("criadoEm"),
		IND_SITUACAO("indSituacao"),
		OBSERVACAO("observacao"),
		COMPLEMENTO_CICLO("complementoCiclo"),
		MPA_CAD_INTERVALO_TEMPOES("mpaCadIntervaloTempoes"),
		MPT_JUSTIF_PRESCRICAOES("mptJustifPrescricaoes");

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
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
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
		if (!(obj instanceof MpaCicloProtocolo)) {
			return false;
		}
		MpaCicloProtocolo other = (MpaCicloProtocolo) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}

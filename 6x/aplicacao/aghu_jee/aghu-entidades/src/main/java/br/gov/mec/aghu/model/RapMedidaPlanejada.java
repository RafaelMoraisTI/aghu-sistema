package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * RapMedidaPlanejada generated by hbm2java
 */
@Entity
@Table(name = "RAP_MEDIDAS_PLANEJADAS", schema = "AGH")
public class RapMedidaPlanejada extends BaseEntityId<RapMedidaPlanejadaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2431560887270663966L;
	private RapMedidaPlanejadaId id;
	private Integer version;
	private RapServidores rapServidoresByRapMpjSerFk2;
	private RapItemAvaliacaoServ rapItemAvaliacaoServ;
	private RapServidores rapServidoresByRapMpjSerFk1;
	private RapForma rapForma;
	private String descricao;
	private Date prazo;
	private Date criadoEm;
	private Date alteradoEm;
	private String situacao;
	private Date dtFinalizacao;
	private String observacao;

	public RapMedidaPlanejada() {
	}

	public RapMedidaPlanejada(RapMedidaPlanejadaId id, RapItemAvaliacaoServ rapItemAvaliacaoServ,
			RapServidores rapServidoresByRapMpjSerFk1, String descricao, Date criadoEm) {
		this.id = id;
		this.rapItemAvaliacaoServ = rapItemAvaliacaoServ;
		this.rapServidoresByRapMpjSerFk1 = rapServidoresByRapMpjSerFk1;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
	}

	public RapMedidaPlanejada(RapMedidaPlanejadaId id, RapServidores rapServidoresByRapMpjSerFk2,
			RapItemAvaliacaoServ rapItemAvaliacaoServ, RapServidores rapServidoresByRapMpjSerFk1, RapForma rapForma,
			String descricao, Date prazo, Date criadoEm, Date alteradoEm, String situacao, Date dtFinalizacao, String observacao) {
		this.id = id;
		this.rapServidoresByRapMpjSerFk2 = rapServidoresByRapMpjSerFk2;
		this.rapItemAvaliacaoServ = rapItemAvaliacaoServ;
		this.rapServidoresByRapMpjSerFk1 = rapServidoresByRapMpjSerFk1;
		this.rapForma = rapForma;
		this.descricao = descricao;
		this.prazo = prazo;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
		this.situacao = situacao;
		this.dtFinalizacao = dtFinalizacao;
		this.observacao = observacao;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "iasAvsSeq", column = @Column(name = "IAS_AVS_SEQ", nullable = false)),
			@AttributeOverride(name = "iasSeqp", column = @Column(name = "IAS_SEQP", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public RapMedidaPlanejadaId getId() {
		return this.id;
	}

	public void setId(RapMedidaPlanejadaId id) {
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_ALTERADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ALTERADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByRapMpjSerFk2() {
		return this.rapServidoresByRapMpjSerFk2;
	}

	public void setRapServidoresByRapMpjSerFk2(RapServidores rapServidoresByRapMpjSerFk2) {
		this.rapServidoresByRapMpjSerFk2 = rapServidoresByRapMpjSerFk2;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "IAS_AVS_SEQ", referencedColumnName = "AVS_SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "IAS_SEQP", referencedColumnName = "SEQP", nullable = false, insertable = false, updatable = false) })
	public RapItemAvaliacaoServ getRapItemAvaliacaoServ() {
		return this.rapItemAvaliacaoServ;
	}

	public void setRapItemAvaliacaoServ(RapItemAvaliacaoServ rapItemAvaliacaoServ) {
		this.rapItemAvaliacaoServ = rapItemAvaliacaoServ;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_CRIADO", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO_CRIADO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidoresByRapMpjSerFk1() {
		return this.rapServidoresByRapMpjSerFk1;
	}

	public void setRapServidoresByRapMpjSerFk1(RapServidores rapServidoresByRapMpjSerFk1) {
		this.rapServidoresByRapMpjSerFk1 = rapServidoresByRapMpjSerFk1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FRM_SEQ")
	public RapForma getRapForma() {
		return this.rapForma;
	}

	public void setRapForma(RapForma rapForma) {
		this.rapForma = rapForma;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 200)
	@Length(max = 200)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PRAZO", length = 29)
	public Date getPrazo() {
		return this.prazo;
	}

	public void setPrazo(Date prazo) {
		this.prazo = prazo;
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

	@Column(name = "SITUACAO", length = 2)
	@Length(max = 2)
	public String getSituacao() {
		return this.situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FINALIZACAO", length = 29)
	public Date getDtFinalizacao() {
		return this.dtFinalizacao;
	}

	public void setDtFinalizacao(Date dtFinalizacao) {
		this.dtFinalizacao = dtFinalizacao;
	}

	@Column(name = "OBSERVACAO", length = 240)
	@Length(max = 240)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		RAP_SERVIDORES_BY_RAP_MPJ_SER_FK2("rapServidoresByRapMpjSerFk2"),
		RAP_ITENS_AVALIACAO_SERV("rapItemAvaliacaoServ"),
		RAP_SERVIDORES_BY_RAP_MPJ_SER_FK1("rapServidoresByRapMpjSerFk1"),
		RAP_FORMAS("rapForma"),
		DESCRICAO("descricao"),
		PRAZO("prazo"),
		CRIADO_EM("criadoEm"),
		ALTERADO_EM("alteradoEm"),
		SITUACAO("situacao"),
		DT_FINALIZACAO("dtFinalizacao"),
		OBSERVACAO("observacao");

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
		if (!(obj instanceof RapMedidaPlanejada)) {
			return false;
		}
		RapMedidaPlanejada other = (RapMedidaPlanejada) obj;
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

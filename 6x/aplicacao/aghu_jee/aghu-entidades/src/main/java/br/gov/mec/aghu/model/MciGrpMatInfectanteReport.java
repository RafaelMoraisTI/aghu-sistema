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
 * MciGrpMatInfectanteReport generated by hbm2java
 */
@Entity
@Table(name = "MCI_GRP_MAT_INFECTANTE_REPORTS", schema = "AGH")
public class MciGrpMatInfectanteReport extends BaseEntityId<MciGrpMatInfectanteReportId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -962458100455149799L;
	private MciGrpMatInfectanteReportId id;
	private Integer version;
	private MciGrupoMatInfectante mciGrupoMatInfectante;
	private MciParamReportCci mciParamReportCci;
	private RapServidores rapServidores;
	private Short ordem;
	private Date criadoEm;
	private String indSituacao;

	public MciGrpMatInfectanteReport() {
	}

	public MciGrpMatInfectanteReport(MciGrpMatInfectanteReportId id, MciGrupoMatInfectante mciGrupoMatInfectante,
			MciParamReportCci mciParamReportCci, RapServidores rapServidores, Short ordem, Date criadoEm, String indSituacao) {
		this.id = id;
		this.mciGrupoMatInfectante = mciGrupoMatInfectante;
		this.mciParamReportCci = mciParamReportCci;
		this.rapServidores = rapServidores;
		this.ordem = ordem;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "pmcAplicacaoCodigo", column = @Column(name = "PMC_APLICACAO_CODIGO", nullable = false, length = 20)),
			@AttributeOverride(name = "gmiSeq", column = @Column(name = "GMI_SEQ", nullable = false)) })
	public MciGrpMatInfectanteReportId getId() {
		return this.id;
	}

	public void setId(MciGrpMatInfectanteReportId id) {
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
	@JoinColumn(name = "GMI_SEQ", nullable = false, insertable = false, updatable = false)
	public MciGrupoMatInfectante getMciGrupoMatInfectante() {
		return this.mciGrupoMatInfectante;
	}

	public void setMciGrupoMatInfectante(MciGrupoMatInfectante mciGrupoMatInfectante) {
		this.mciGrupoMatInfectante = mciGrupoMatInfectante;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PMC_APLICACAO_CODIGO", nullable = false, insertable = false, updatable = false)
	public MciParamReportCci getMciParamReportCci() {
		return this.mciParamReportCci;
	}

	public void setMciParamReportCci(MciParamReportCci mciParamReportCci) {
		this.mciParamReportCci = mciParamReportCci;
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

	@Column(name = "ORDEM", nullable = false)
	public Short getOrdem() {
		return this.ordem;
	}

	public void setOrdem(Short ordem) {
		this.ordem = ordem;
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

	public enum Fields {

		ID("id"),
		VERSION("version"),
		MCI_GRUPO_MAT_INFECTANTES("mciGrupoMatInfectante"),
		MCI_PARAM_REPORT_CCIS("mciParamReportCci"),
		RAP_SERVIDORES("rapServidores"),
		ORDEM("ordem"),
		CRIADO_EM("criadoEm"),
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
		if (!(obj instanceof MciGrpMatInfectanteReport)) {
			return false;
		}
		MciGrpMatInfectanteReport other = (MciGrpMatInfectanteReport) obj;
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

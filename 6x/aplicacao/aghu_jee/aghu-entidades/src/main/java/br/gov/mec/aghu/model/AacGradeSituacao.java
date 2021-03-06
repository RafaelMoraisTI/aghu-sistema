package br.gov.mec.aghu.model;

// Generated 11/03/2011 15:06:24 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AacGradeSituacoes generated by hbm2java
 */
 @Entity
@Table(name = "AAC_GRADE_SITUACOES", schema = "AGH")
public class AacGradeSituacao extends BaseEntityId<AacGradeSituacaoId> implements java.io.Serializable {

	private static final long serialVersionUID = -3309618844301047782L;
	private AacGradeSituacaoId id;
	private Date dtFimSituacao;
	private DominioSituacao situacao;
	private Date criadoEm;
	private Date alteradoEm;
	private RapServidores servidor;
	private RapServidores servidorAlterado;
	private Integer version;
	
	private AacGradeAgendamenConsultas gradeAgendamentoConsulta;

	public AacGradeSituacao() {
	}

	public AacGradeSituacao(AacGradeSituacaoId id, Date dtFimSituacao,
			DominioSituacao situacao, Date criadoEm, Date alteradoEm,
			RapServidores servidor, RapServidores servidorAlterado) {
		super();
		this.id = id;
		this.dtFimSituacao = dtFimSituacao;
		this.situacao = situacao;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
		this.servidor = servidor;
		this.servidorAlterado = servidorAlterado;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "grdSeq", column = @Column(name = "GRD_SEQ", nullable = false, precision = 5, scale = 0)),
			@AttributeOverride(name = "dtInicioSituacao", column = @Column(name = "DT_INICIO_SITUACAO", nullable = false, length = 7)) })
	public AacGradeSituacaoId getId() {
		return this.id;
	}

	public void setId(AacGradeSituacaoId id) {
		this.id = id;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FIM_SITUACAO", length = 7)
	public Date getDtFimSituacao() {
		return this.dtFimSituacao;
	}

	public void setDtFimSituacao(Date dtFimSituacao) {
		this.dtFimSituacao = dtFimSituacao;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 7)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
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
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA_ALTERADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ALTERADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorAlterado() {
		return this.servidorAlterado;
	}

	public void setServidorAlterado(RapServidores servidorAlterado) {
		this.servidorAlterado = servidorAlterado;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="GRD_SEQ", insertable=false, updatable=false)
	public AacGradeAgendamenConsultas getGradeAgendamentoConsulta() {
		return gradeAgendamentoConsulta;
	}

	public void setGradeAgendamentoConsulta(AacGradeAgendamenConsultas gradeAgendamentoConsulta) {
		this.gradeAgendamentoConsulta = gradeAgendamentoConsulta;
	}
	
	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	public enum Fields {
		ID("id"),
		GRD_SEQ("id.grdSeq"), 
		DT_INICIO_SITUACAO("id.dtInicioSituacao"),
		DT_FIM_SITUACAO("dtFimSituacao"),
		IND_SITUACAO("situacao"),
		GRADE_AGENDAMENTO_CONSULTA("gradeAgendamentoConsulta");
		
		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
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
		if (!(obj instanceof AacGradeSituacao)) {
			return false;
		}
		AacGradeSituacao other = (AacGradeSituacao) obj;
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

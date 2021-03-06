package br.gov.mec.aghu.model;

// Generated 08/02/2010 17:25:25 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MciMvtoFatorPredisponentes generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mciMfpSq1", sequenceName="AGH.MCI_MFP_SQ1", allocationSize = 1)
@Table(name = "MCI_MVTO_FATOR_PREDISPONENTES", schema = "AGH")

public class MciMvtoFatorPredisponentes extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1579851436470164714L;
	private Integer seq;
	private AghAtendimentos atendimento;
	private AipPacientes paciente;
	private MciFatorPredisponentes fatorPredisponente;
	private Date criadoEm;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Date dataInicio;
	private Short unfSeq;
	private Short unfSeqNotificado;
	private Short qrtNumero;
	private Short qrtNumeroNotificado;
	private String ltoLtoId;
	private String ltoLtoIdNotificado;
	private Date dataFim;
	private Integer serMatriculaEncerrado;
	private Short serVinCodigoEncerrado;
	private String indGmr;
	private Boolean isolamento;
	private Integer cifSeq;
	private Integer version;

	public MciMvtoFatorPredisponentes() {
	}

	public MciMvtoFatorPredisponentes(Integer seq, AipPacientes paciente, Date criadoEm,
			Integer serMatricula, Short serVinCodigo, Date dataInicio, Short unfSeq,
			Short unfSeqNotificado) {
		this.seq = seq;
		this.paciente = paciente;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.dataInicio = dataInicio;
		this.unfSeq = unfSeq;
		this.unfSeqNotificado = unfSeqNotificado;
	}

	public MciMvtoFatorPredisponentes(Integer seq, AghAtendimentos atendimento, AipPacientes paciente,
			Short fpdSeq, Date criadoEm, Integer serMatricula, Short serVinCodigo,
			Date dataInicio, Short unfSeq, Short unfSeqNotificado,
			Short qrtNumero, Short qrtNumeroNotificado, String ltoLtoId,
			String ltoLtoIdNotificado, Date dataFim,
			Integer serMatriculaEncerrado, Short serVinCodigoEncerrado,
			String indGmr, Boolean isolamento, Integer cifSeq) {
		this.seq = seq;
		this.atendimento = atendimento;
		this.paciente = paciente;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.dataInicio = dataInicio;
		this.unfSeq = unfSeq;
		this.unfSeqNotificado = unfSeqNotificado;
		this.qrtNumero = qrtNumero;
		this.qrtNumeroNotificado = qrtNumeroNotificado;
		this.ltoLtoId = ltoLtoId;
		this.ltoLtoIdNotificado = ltoLtoIdNotificado;
		this.dataFim = dataFim;
		this.serMatriculaEncerrado = serMatriculaEncerrado;
		this.serVinCodigoEncerrado = serVinCodigoEncerrado;
		this.indGmr = indGmr;
		this.isolamento = isolamento;
		this.cifSeq = cifSeq;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mciMfpSq1")
	@Column(name = "SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATD_SEQ")
	public AghAtendimentos getAtendimento() {
		return this.atendimento;
	}

	public void setAtendimento(AghAtendimentos atendimento) {
		this.atendimento = atendimento;
	}

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "PAC_CODIGO", nullable = false, referencedColumnName = "CODIGO")
	public AipPacientes getPaciente() {
		return paciente;
	}

	public void setPaciente(AipPacientes paciente) {
		this.paciente = paciente;
	}


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FPD_SEQ")
	public MciFatorPredisponentes getFatorPredisponente() {
		return this.fatorPredisponente;
	}

	public void setFatorPredisponente(MciFatorPredisponentes fatorPredisponente) {
		this.fatorPredisponente = fatorPredisponente;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	

	/**
	 * FIXME Alterar mapeamento para objeto RapServidores 
	 */

	@Column(name = "SER_MATRICULA", nullable = false, precision = 7, scale = 0)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	/**
	 * FIXME Alterar mapeamento para objeto RapServidores 
	 */

	@Column(name = "SER_VIN_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_INICIO", nullable = false)
	public Date getDataInicio() {
		return this.dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	/**
	 * FIXME Alterar mapeamento para objeto AghUnidadesFuncionais 
	 */

	@Column(name = "UNF_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}

	/**
	 * FIXME Alterar mapeamento para objeto AghUnidadesFuncionais 
	 */

	@Column(name = "UNF_SEQ_NOTIFICADO", nullable = false, precision = 4, scale = 0)
	public Short getUnfSeqNotificado() {
		return this.unfSeqNotificado;
	}

	public void setUnfSeqNotificado(Short unfSeqNotificado) {
		this.unfSeqNotificado = unfSeqNotificado;
	}

	/**
	 * FIXME Alterar mapeamento para objeto AinQuartos 
	 */

	@Column(name = "QRT_NUMERO", precision = 4, scale = 0)
	public Short getQrtNumero() {
		return this.qrtNumero;
	}

	public void setQrtNumero(Short qrtNumero) {
		this.qrtNumero = qrtNumero;
	}

	/**
	 * FIXME Alterar mapeamento para objeto AinQuartos 
	 */

	@Column(name = "QRT_NUMERO_NOTIFICADO", precision = 4, scale = 0)
	public Short getQrtNumeroNotificado() {
		return this.qrtNumeroNotificado;
	}

	public void setQrtNumeroNotificado(Short qrtNumeroNotificado) {
		this.qrtNumeroNotificado = qrtNumeroNotificado;
	}

	/**
	 * FIXME Alterar mapeamento para objeto AinLeitos 
	 */

	@Column(name = "LTO_LTO_ID", length = 14)
	@Length(max = 14)
	public String getLtoLtoId() {
		return this.ltoLtoId;
	}

	public void setLtoLtoId(String ltoLtoId) {
		this.ltoLtoId = ltoLtoId;
	}

	/**
	 * FIXME Alterar mapeamento para objeto AinLeitos 
	 */

	@Column(name = "LTO_LTO_ID_NOTIFICADO", length = 14)
	@Length(max = 15)
	public String getLtoLtoIdNotificado() {
		return this.ltoLtoIdNotificado;
	}

	public void setLtoLtoIdNotificado(String ltoLtoIdNotificado) {
		this.ltoLtoIdNotificado = ltoLtoIdNotificado;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FIM")
	public Date getDataFim() {
		return this.dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	/**
	 * FIXME Alterar mapeamento para objeto RapServidores 
	 */

	@Column(name = "SER_MATRICULA_ENCERRADO", precision = 7, scale = 0)
	public Integer getSerMatriculaEncerrado() {
		return this.serMatriculaEncerrado;
	}

	public void setSerMatriculaEncerrado(Integer serMatriculaEncerrado) {
		this.serMatriculaEncerrado = serMatriculaEncerrado;
	}

	/**
	 * FIXME Alterar mapeamento para objeto RapServidores 
	 */

	@Column(name = "SER_VIN_CODIGO_ENCERRADO", precision = 3, scale = 0)
	public Short getSerVinCodigoEncerrado() {
		return this.serVinCodigoEncerrado;
	}

	public void setSerVinCodigoEncerrado(Short serVinCodigoEncerrado) {
		this.serVinCodigoEncerrado = serVinCodigoEncerrado;
	}

	/**
	 * FIXME Alterar mapeamento para Boolean
	 */

	@Column(name = "IND_GMR", length = 1)
	@Length(max = 1)
	public String getIndGmr() {
		return this.indGmr;
	}

	public void setIndGmr(String indGmr) {
		this.indGmr = indGmr;
	}

	@Column(name = "IND_ISOLAMENTO", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIsolamento() {
		return this.isolamento;
	}

	public void setIsolamento(Boolean isolamento) {
		this.isolamento = isolamento;
	}

	/**
	 * FIXME Alterar mapeamento para objeto relacionado 
	 */

	@Column(name = "CIF_SEQ", precision = 5, scale = 0)
	public Integer getCifSeq() {
		return this.cifSeq;
	}

	public void setCifSeq(Integer cifSeq) {
		this.cifSeq = cifSeq;
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
		SEQ("seq"),
		COD_PACIENTE("paciente.codigo"), 
		DATA_FIM("dataFim"), 
		ISOLAMENTO("isolamento"), 
		ATENDIMENTO("atendimento"), 
		FATOR_PREDISPONENTE("fatorPredisponente"),
		ATENDIMENTO_SEQ("atendimento.seq"),
		FATOR_PREDISPONENTE_SEQ("fatorPredisponente.seq"),
		SERVIDOR_VIN_CODIGO("serVinCodigo"),
		SERVIDOR_MATRICULA("serMatricula"),
		SERVIDOR_VIN_CODIGO_ENCERRADO("serVinCodigoEncerrado"),
		SERVIDOR_MATRICULA_ENCERRADO("serMatriculaEncerrado"),
		CRIADO_EM("criadoEm"),
		DATA_INICIO("dataInicio"),
		UNF_SEQ("unfSeq"),
		QRT_NUMERO("qrtNumero"),
		LTO_LTO_ID("ltoLtoId"),
		UNF_SEQ_NOTIFICADO("unfSeqNotificado"),
		QRT_NUMERO_NOTIFICADO("qrtNumeroNotificado"),
		LTO_LTO_ID_NOTIFICADO("ltoLtoIdNotificado");

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
		if (!(obj instanceof MciMvtoFatorPredisponentes)) {
			return false;
		}
		MciMvtoFatorPredisponentes other = (MciMvtoFatorPredisponentes) obj;
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

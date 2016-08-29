package br.gov.mec.aghu.model;

// Generated 27/12/2010 20:08:36 by Hibernate Tools 3.3.0.GA

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioPacAtendimento;
import br.gov.mec.aghu.dominio.DominioTipoLaminaLaringo;
import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AghAtendimentosJn generated by hbm2java
 */
@Entity
@Table(name = "AGH_ATENDIMENTOS_JN", schema = "AGH")
@SequenceGenerator(name = "aghAtdSeqJn", sequenceName = "AGH.AGH_ATD_JN_SEQ", allocationSize = 1)

@Immutable
public class AghAtendimentoJn extends BaseJournal implements
		java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8738060709157874625L;
	private Integer seq;		
	private Integer pacCodigo;
	private Date dthrInicio;
	private Boolean indPacPediatrico;
	private Boolean indPacPrematuro;
	private DominioPacAtendimento indPacAtendimento;
	private Integer hodSeq;
	private Integer intSeq;
	private Integer atuSeq;
	private Date dthrFim;
	private Date dthrUltImprSumrPrescr;
	private DominioTipoLaminaLaringo tipoLaminaLaringo;
	private Integer serMatriculaMovimento;
	private Short serVinCodigoMovimento;
	private Date dthrIngressoUnidade;
	private Integer conNumero;
	private Integer preSerMatricula;
	private Short preSerVinCodigo;
	private Short preEspSeq;
	private Integer gsoPacCodigo;
	private Short gsoSeqp;
	private Integer atdSeqMae;
	private String indAcessoVascular;

	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aghAtdSeqJn")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}

	@Column(name = "SEQ", nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "PAC_CODIGO", precision = 8, scale = 0)
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "DTHR_INICIO", length = 7)
	public Date getDthrInicio() {
		return this.dthrInicio;
	}

	public void setDthrInicio(Date dthrInicio) {
		this.dthrInicio = dthrInicio;
	}

	@Column(name = "IND_PAC_PEDIATRICO", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndPacPediatrico() {
		return this.indPacPediatrico;
	}

	public void setIndPacPediatrico(Boolean indPacPediatrico) {
		this.indPacPediatrico = indPacPediatrico;
	}

	@Column(name = "IND_PAC_PREMATURO", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndPacPrematuro() {
		return this.indPacPrematuro;
	}

	public void setIndPacPrematuro(Boolean indPacPrematuro) {
		this.indPacPrematuro = indPacPrematuro;
	}

	@Column(name = "IND_PAC_ATENDIMENTO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioPacAtendimento getIndPacAtendimento() {
		return this.indPacAtendimento;
	}

	public void setIndPacAtendimento(DominioPacAtendimento indPacAtendimento) {
		this.indPacAtendimento = indPacAtendimento;
	}

	@Column(name = "HOD_SEQ", precision = 8, scale = 0)
	public Integer getHodSeq() {
		return this.hodSeq;
	}

	public void setHodSeq(Integer hodSeq) {
		this.hodSeq = hodSeq;
	}

	@Column(name = "INT_SEQ", precision = 8, scale = 0)
	public Integer getIntSeq() {
		return this.intSeq;
	}

	public void setIntSeq(Integer intSeq) {
		this.intSeq = intSeq;
	}

	@Column(name = "ATU_SEQ", precision = 8, scale = 0)
	public Integer getAtuSeq() {
		return this.atuSeq;
	}

	public void setAtuSeq(Integer atuSeq) {
		this.atuSeq = atuSeq;
	}

	@Column(name = "DTHR_FIM", length = 7)
	public Date getDthrFim() {
		return this.dthrFim;
	}

	public void setDthrFim(Date dthrFim) {
		this.dthrFim = dthrFim;
	}

	@Column(name = "DTHR_ULT_IMPR_SUMR_PRESCR", length = 7)
	public Date getDthrUltImprSumrPrescr() {
		return this.dthrUltImprSumrPrescr;
	}

	public void setDthrUltImprSumrPrescr(Date dthrUltImprSumrPrescr) {
		this.dthrUltImprSumrPrescr = dthrUltImprSumrPrescr;
	}

	@Column(name = "TIPO_LAMINA_LARINGO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioTipoLaminaLaringo getTipoLaminaLaringo() {
		return this.tipoLaminaLaringo;
	}

	public void setTipoLaminaLaringo(DominioTipoLaminaLaringo tipoLaminaLaringo) {
		this.tipoLaminaLaringo = tipoLaminaLaringo;
	}

	@Column(name = "SER_MATRICULA_MOVIMENTO", precision = 7, scale = 0)
	public Integer getSerMatriculaMovimento() {
		return this.serMatriculaMovimento;
	}

	public void setSerMatriculaMovimento(Integer serMatriculaMovimento) {
		this.serMatriculaMovimento = serMatriculaMovimento;
	}

	@Column(name = "SER_VIN_CODIGO_MOVIMENTO", precision = 3, scale = 0)
	public Short getSerVinCodigoMovimento() {
		return this.serVinCodigoMovimento;
	}

	public void setSerVinCodigoMovimento(Short serVinCodigoMovimento) {
		this.serVinCodigoMovimento = serVinCodigoMovimento;
	}

	@Column(name = "DTHR_INGRESSO_UNIDADE", length = 7)
	public Date getDthrIngressoUnidade() {
		return this.dthrIngressoUnidade;
	}

	public void setDthrIngressoUnidade(Date dthrIngressoUnidade) {
		this.dthrIngressoUnidade = dthrIngressoUnidade;
	}

	@Column(name = "CON_NUMERO", precision = 8, scale = 0)
	public Integer getConNumero() {
		return this.conNumero;
	}

	public void setConNumero(Integer conNumero) {
		this.conNumero = conNumero;
	}

	@Column(name = "PRE_SER_MATRICULA", precision = 7, scale = 0)
	public Integer getPreSerMatricula() {
		return this.preSerMatricula;
	}

	public void setPreSerMatricula(Integer preSerMatricula) {
		this.preSerMatricula = preSerMatricula;
	}

	@Column(name = "PRE_SER_VIN_CODIGO", precision = 3, scale = 0)
	public Short getPreSerVinCodigo() {
		return this.preSerVinCodigo;
	}

	public void setPreSerVinCodigo(Short preSerVinCodigo) {
		this.preSerVinCodigo = preSerVinCodigo;
	}

	@Column(name = "PRE_ESP_SEQ", precision = 4, scale = 0)
	public Short getPreEspSeq() {
		return this.preEspSeq;
	}

	public void setPreEspSeq(Short preEspSeq) {
		this.preEspSeq = preEspSeq;
	}

	@Column(name = "GSO_PAC_CODIGO", precision = 8, scale = 0)
	public Integer getGsoPacCodigo() {
		return this.gsoPacCodigo;
	}

	public void setGsoPacCodigo(Integer gsoPacCodigo) {
		this.gsoPacCodigo = gsoPacCodigo;
	}

	@Column(name = "GSO_SEQP", precision = 3, scale = 0)
	public Short getGsoSeqp() {
		return this.gsoSeqp;
	}

	public void setGsoSeqp(Short gsoSeqp) {
		this.gsoSeqp = gsoSeqp;
	}

	@Column(name = "ATD_SEQ_MAE", precision = 7, scale = 0)
	public Integer getAtdSeqMae() {
		return this.atdSeqMae;
	}

	public void setAtdSeqMae(Integer atdSeqMae) {
		this.atdSeqMae = atdSeqMae;
	}

	@Column(name = "IND_ACESSO_VASCULAR", length = 1)
	@Length(max = 1)
	public String getIndAcessoVascular() {
		return this.indAcessoVascular;
	}

	public void setIndAcessoVascular(String indAcessoVascular) {
		this.indAcessoVascular = indAcessoVascular;
	}

	public enum Fields {

		SEQ("seq"),
		PAC_CODIGO("pacCodigo"),
		DTHR_INICIO("dthrInicio"),
		IND_PAC_PEDIATRICO("indPacPediatrico"),
		IND_PAC_PREMATURO("indPacPrematuro"),
		IND_PAC_ATENDIMENTO("indPacAtendimento"),
		HOD_SEQ("hodSeq"),
		INT_SEQ("intSeq"),
		ATU_SEQ("atuSeq"),
		DTHR_FIM("dthrFim"),
		DTHR_ULT_IMPR_SUMR_PRESCR("dthrUltImprSumrPrescr"),
		TIPO_LAMINA_LARINGO("tipoLaminaLaringo"),
		SER_MATRICULA_MOVIMENTO("serMatriculaMovimento"),
		SER_VIN_CODIGO_MOVIMENTO("serVinCodigoMovimento"),
		DTHR_INGRESSO_UNIDADE("dthrIngressoUnidade"),
		CON_NUMERO("conNumero"),
		PRE_SER_MATRICULA("preSerMatricula"),
		PRE_SER_VIN_CODIGO("preSerVinCodigo"),
		PRE_ESP_SEQ("preEspSeq"),
		GSO_PAC_CODIGO("gsoPacCodigo"),
		GSO_SEQP("gsoSeqp"),
		ATD_SEQ_MAE("atdSeqMae"),
		IND_ACESSO_VASCULAR("indAcessoVascular");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}

}
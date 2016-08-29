package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AesTipoRegimeJn generated by hbm2java
 */
@Entity
@Table(name = "AES_TIPOS_REGIME_JN", schema = "AGH")
@Immutable
public class AesTipoRegimeJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = 6884564665770976975L;
	/* ATUALIZADOR JOURNALS - PROPERTIES	private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	private String codigo;
	private Integer areCodigo;
	private String tsiCodigo;
	private String tsiCodigoFolga;
	private String ctaCodigo;
	private String descricao;
	private Date dtInicio;
	private Date dtFim;
	private String indCalculo;
	private String indDomCalculo;
	private String indFerCalculo;
	private String indSabCalculo;
	private Short intvDiasCalculo;
	private String prdoUltGrpoTrabCalculo;
	private String indPreDefinido;
	private String indDomPreDef;
	private String indFerPreDef;
	private String indSabPreDef;
	private Short intvDiasPreDef;
	private String prdoUltGrpoTrabPreDef;

	public AesTipoRegimeJn() {
	}

	public AesTipoRegimeJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, String codigo, String tsiCodigoFolga,
			String ctaCodigo) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.codigo = codigo;
		this.tsiCodigoFolga = tsiCodigoFolga;
		this.ctaCodigo = ctaCodigo;
	}

	public AesTipoRegimeJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, String codigo, Integer areCodigo,
			String tsiCodigo, String tsiCodigoFolga, String ctaCodigo, String descricao, Date dtInicio, Date dtFim, String indCalculo,
			String indDomCalculo, String indFerCalculo, String indSabCalculo, Short intvDiasCalculo, String prdoUltGrpoTrabCalculo,
			String indPreDefinido, String indDomPreDef, String indFerPreDef, String indSabPreDef, Short intvDiasPreDef,
			String prdoUltGrpoTrabPreDef) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.codigo = codigo;
		this.areCodigo = areCodigo;
		this.tsiCodigo = tsiCodigo;
		this.tsiCodigoFolga = tsiCodigoFolga;
		this.ctaCodigo = ctaCodigo;
		this.descricao = descricao;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.indCalculo = indCalculo;
		this.indDomCalculo = indDomCalculo;
		this.indFerCalculo = indFerCalculo;
		this.indSabCalculo = indSabCalculo;
		this.intvDiasCalculo = intvDiasCalculo;
		this.prdoUltGrpoTrabCalculo = prdoUltGrpoTrabCalculo;
		this.indPreDefinido = indPreDefinido;
		this.indDomPreDef = indDomPreDef;
		this.indFerPreDef = indFerPreDef;
		this.indSabPreDef = indSabPreDef;
		this.intvDiasPreDef = intvDiasPreDef;
		this.prdoUltGrpoTrabPreDef = prdoUltGrpoTrabPreDef;
	}

	// ATUALIZADOR JOURNALS - ID
	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	//@GeneratedValue(strategy = GenerationType.AUTO, generator = "")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}
	// ATUALIZADOR JOURNALS - ID
	
/* ATUALIZADOR JOURNALS - Get / Set	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	public Long getSeqJn() {
		return this.seqJn;
	}

	public void setSeqJn(Long seqJn) {
		this.seqJn = seqJn;
	}

	@Column(name = "JN_USER", nullable = false, length = 30)
	@Length(max = 30)
	public String getJnUser() {
		return this.jnUser;
	}

	public void setJnUser(String jnUser) {
		this.jnUser = jnUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "JN_DATE_TIME", nullable = false, length = 29)
	public Date getJnDateTime() {
		return this.jnDateTime;
	}

	public void setJnDateTime(Date jnDateTime) {
		this.jnDateTime = jnDateTime;
	}

	@Column(name = "JN_OPERATION", nullable = false, length = 3)
	@Length(max = 3)
	public String getJnOperation() {
		return this.jnOperation;
	}

	public void setJnOperation(String jnOperation) {
		this.jnOperation = jnOperation;
	}*/

	@Column(name = "CODIGO", nullable = false, length = 3)
	@Length(max = 3)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "ARE_CODIGO")
	public Integer getAreCodigo() {
		return this.areCodigo;
	}

	public void setAreCodigo(Integer areCodigo) {
		this.areCodigo = areCodigo;
	}

	@Column(name = "TSI_CODIGO", length = 3)
	@Length(max = 3)
	public String getTsiCodigo() {
		return this.tsiCodigo;
	}

	public void setTsiCodigo(String tsiCodigo) {
		this.tsiCodigo = tsiCodigo;
	}

	@Column(name = "TSI_CODIGO_FOLGA", nullable = false, length = 3)
	@Length(max = 3)
	public String getTsiCodigoFolga() {
		return this.tsiCodigoFolga;
	}

	public void setTsiCodigoFolga(String tsiCodigoFolga) {
		this.tsiCodigoFolga = tsiCodigoFolga;
	}

	@Column(name = "CTA_CODIGO", nullable = false, length = 2)
	@Length(max = 2)
	public String getCtaCodigo() {
		return this.ctaCodigo;
	}

	public void setCtaCodigo(String ctaCodigo) {
		this.ctaCodigo = ctaCodigo;
	}

	@Column(name = "DESCRICAO", length = 40)
	@Length(max = 40)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_INICIO", length = 29)
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

	@Column(name = "IND_CALCULO", length = 20)
	@Length(max = 20)
	public String getIndCalculo() {
		return this.indCalculo;
	}

	public void setIndCalculo(String indCalculo) {
		this.indCalculo = indCalculo;
	}

	@Column(name = "IND_DOM_CALCULO", length = 1)
	@Length(max = 1)
	public String getIndDomCalculo() {
		return this.indDomCalculo;
	}

	public void setIndDomCalculo(String indDomCalculo) {
		this.indDomCalculo = indDomCalculo;
	}

	@Column(name = "IND_FER_CALCULO", length = 1)
	@Length(max = 1)
	public String getIndFerCalculo() {
		return this.indFerCalculo;
	}

	public void setIndFerCalculo(String indFerCalculo) {
		this.indFerCalculo = indFerCalculo;
	}

	@Column(name = "IND_SAB_CALCULO", length = 1)
	@Length(max = 1)
	public String getIndSabCalculo() {
		return this.indSabCalculo;
	}

	public void setIndSabCalculo(String indSabCalculo) {
		this.indSabCalculo = indSabCalculo;
	}

	@Column(name = "INTV_DIAS_CALCULO")
	public Short getIntvDiasCalculo() {
		return this.intvDiasCalculo;
	}

	public void setIntvDiasCalculo(Short intvDiasCalculo) {
		this.intvDiasCalculo = intvDiasCalculo;
	}

	@Column(name = "PRDO_ULT_GRPO_TRAB_CALCULO", length = 10)
	@Length(max = 10)
	public String getPrdoUltGrpoTrabCalculo() {
		return this.prdoUltGrpoTrabCalculo;
	}

	public void setPrdoUltGrpoTrabCalculo(String prdoUltGrpoTrabCalculo) {
		this.prdoUltGrpoTrabCalculo = prdoUltGrpoTrabCalculo;
	}

	@Column(name = "IND_PRE_DEFINIDO", length = 20)
	@Length(max = 20)
	public String getIndPreDefinido() {
		return this.indPreDefinido;
	}

	public void setIndPreDefinido(String indPreDefinido) {
		this.indPreDefinido = indPreDefinido;
	}

	@Column(name = "IND_DOM_PRE_DEF", length = 1)
	@Length(max = 1)
	public String getIndDomPreDef() {
		return this.indDomPreDef;
	}

	public void setIndDomPreDef(String indDomPreDef) {
		this.indDomPreDef = indDomPreDef;
	}

	@Column(name = "IND_FER_PRE_DEF", length = 1)
	@Length(max = 1)
	public String getIndFerPreDef() {
		return this.indFerPreDef;
	}

	public void setIndFerPreDef(String indFerPreDef) {
		this.indFerPreDef = indFerPreDef;
	}

	@Column(name = "IND_SAB_PRE_DEF", length = 1)
	@Length(max = 1)
	public String getIndSabPreDef() {
		return this.indSabPreDef;
	}

	public void setIndSabPreDef(String indSabPreDef) {
		this.indSabPreDef = indSabPreDef;
	}

	@Column(name = "INTV_DIAS_PRE_DEF")
	public Short getIntvDiasPreDef() {
		return this.intvDiasPreDef;
	}

	public void setIntvDiasPreDef(Short intvDiasPreDef) {
		this.intvDiasPreDef = intvDiasPreDef;
	}

	@Column(name = "PRDO_ULT_GRPO_TRAB_PRE_DEF", length = 10)
	@Length(max = 10)
	public String getPrdoUltGrpoTrabPreDef() {
		return this.prdoUltGrpoTrabPreDef;
	}

	public void setPrdoUltGrpoTrabPreDef(String prdoUltGrpoTrabPreDef) {
		this.prdoUltGrpoTrabPreDef = prdoUltGrpoTrabPreDef;
	}

	public enum Fields {

	/* ATUALIZADOR JOURNALS - Fields	SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		CODIGO("codigo"),
		ARE_CODIGO("areCodigo"),
		TSI_CODIGO("tsiCodigo"),
		TSI_CODIGO_FOLGA("tsiCodigoFolga"),
		CTA_CODIGO("ctaCodigo"),
		DESCRICAO("descricao"),
		DT_INICIO("dtInicio"),
		DT_FIM("dtFim"),
		IND_CALCULO("indCalculo"),
		IND_DOM_CALCULO("indDomCalculo"),
		IND_FER_CALCULO("indFerCalculo"),
		IND_SAB_CALCULO("indSabCalculo"),
		INTV_DIAS_CALCULO("intvDiasCalculo"),
		PRDO_ULT_GRPO_TRAB_CALCULO("prdoUltGrpoTrabCalculo"),
		IND_PRE_DEFINIDO("indPreDefinido"),
		IND_DOM_PRE_DEF("indDomPreDef"),
		IND_FER_PRE_DEF("indFerPreDef"),
		IND_SAB_PRE_DEF("indSabPreDef"),
		INTV_DIAS_PRE_DEF("intvDiasPreDef"),
		PRDO_ULT_GRPO_TRAB_PRE_DEF("prdoUltGrpoTrabPreDef");

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
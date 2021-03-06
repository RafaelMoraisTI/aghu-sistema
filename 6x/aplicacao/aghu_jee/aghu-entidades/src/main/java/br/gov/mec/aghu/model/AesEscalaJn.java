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
 * AesEscalaJn generated by hbm2java
 */
@Entity
@Table(name = "AES_ESCALAS_JN", schema = "AGH")
@Immutable
public class AesEscalaJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = -3291494649240436599L;
	/* ATUALIZADOR JOURNALS - PROPERTIES	private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	private Integer regSerMatricula;
	private Short regSerVinCodigo;
	private Integer regSeq;
	private Long seq;
	private Date data;
	private Integer sesSeq;
	private Integer strGtrAreCodigo;
	private Integer strGtrCctCodigo;
	private String strGtrTgtCodigo;
	private Short strCodigo;
	private Date criadoEm;
	private Date alteradoEm;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Integer escRegSerMatricula;
	private Short escRegSerVinCodigo;
	private Integer escRegSeq;
	private Long escSeq;
	private Integer serMatriculaEAlterado;
	private Short serVinCodigoEAlterado;

	public AesEscalaJn() {
	}

	public AesEscalaJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer regSerMatricula, Short regSerVinCodigo,
			Integer regSeq, Long seq) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.regSerMatricula = regSerMatricula;
		this.regSerVinCodigo = regSerVinCodigo;
		this.regSeq = regSeq;
		this.seq = seq;
	}

	public AesEscalaJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer regSerMatricula, Short regSerVinCodigo,
			Integer regSeq, Long seq, Date data, Integer sesSeq, Integer strGtrAreCodigo, Integer strGtrCctCodigo, String strGtrTgtCodigo,
			Short strCodigo, Date criadoEm, Date alteradoEm, Integer serMatricula, Short serVinCodigo, Integer escRegSerMatricula,
			Short escRegSerVinCodigo, Integer escRegSeq, Long escSeq, Integer serMatriculaEAlterado, Short serVinCodigoEAlterado) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.regSerMatricula = regSerMatricula;
		this.regSerVinCodigo = regSerVinCodigo;
		this.regSeq = regSeq;
		this.seq = seq;
		this.data = data;
		this.sesSeq = sesSeq;
		this.strGtrAreCodigo = strGtrAreCodigo;
		this.strGtrCctCodigo = strGtrCctCodigo;
		this.strGtrTgtCodigo = strGtrTgtCodigo;
		this.strCodigo = strCodigo;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.escRegSerMatricula = escRegSerMatricula;
		this.escRegSerVinCodigo = escRegSerVinCodigo;
		this.escRegSeq = escRegSeq;
		this.escSeq = escSeq;
		this.serMatriculaEAlterado = serMatriculaEAlterado;
		this.serVinCodigoEAlterado = serVinCodigoEAlterado;
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

	@Column(name = "REG_SER_MATRICULA", nullable = false)
	public Integer getRegSerMatricula() {
		return this.regSerMatricula;
	}

	public void setRegSerMatricula(Integer regSerMatricula) {
		this.regSerMatricula = regSerMatricula;
	}

	@Column(name = "REG_SER_VIN_CODIGO", nullable = false)
	public Short getRegSerVinCodigo() {
		return this.regSerVinCodigo;
	}

	public void setRegSerVinCodigo(Short regSerVinCodigo) {
		this.regSerVinCodigo = regSerVinCodigo;
	}

	@Column(name = "REG_SEQ", nullable = false)
	public Integer getRegSeq() {
		return this.regSeq;
	}

	public void setRegSeq(Integer regSeq) {
		this.regSeq = regSeq;
	}

	@Column(name = "SEQ", nullable = false)
	public Long getSeq() {
		return this.seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA", length = 29)
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Column(name = "SES_SEQ")
	public Integer getSesSeq() {
		return this.sesSeq;
	}

	public void setSesSeq(Integer sesSeq) {
		this.sesSeq = sesSeq;
	}

	@Column(name = "STR_GTR_ARE_CODIGO")
	public Integer getStrGtrAreCodigo() {
		return this.strGtrAreCodigo;
	}

	public void setStrGtrAreCodigo(Integer strGtrAreCodigo) {
		this.strGtrAreCodigo = strGtrAreCodigo;
	}

	@Column(name = "STR_GTR_CCT_CODIGO")
	public Integer getStrGtrCctCodigo() {
		return this.strGtrCctCodigo;
	}

	public void setStrGtrCctCodigo(Integer strGtrCctCodigo) {
		this.strGtrCctCodigo = strGtrCctCodigo;
	}

	@Column(name = "STR_GTR_TGT_CODIGO", length = 5)
	@Length(max = 5)
	public String getStrGtrTgtCodigo() {
		return this.strGtrTgtCodigo;
	}

	public void setStrGtrTgtCodigo(String strGtrTgtCodigo) {
		this.strGtrTgtCodigo = strGtrTgtCodigo;
	}

	@Column(name = "STR_CODIGO")
	public Short getStrCodigo() {
		return this.strCodigo;
	}

	public void setStrCodigo(Short strCodigo) {
		this.strCodigo = strCodigo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
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

	@Column(name = "SER_MATRICULA")
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO")
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "ESC_REG_SER_MATRICULA")
	public Integer getEscRegSerMatricula() {
		return this.escRegSerMatricula;
	}

	public void setEscRegSerMatricula(Integer escRegSerMatricula) {
		this.escRegSerMatricula = escRegSerMatricula;
	}

	@Column(name = "ESC_REG_SER_VIN_CODIGO")
	public Short getEscRegSerVinCodigo() {
		return this.escRegSerVinCodigo;
	}

	public void setEscRegSerVinCodigo(Short escRegSerVinCodigo) {
		this.escRegSerVinCodigo = escRegSerVinCodigo;
	}

	@Column(name = "ESC_REG_SEQ")
	public Integer getEscRegSeq() {
		return this.escRegSeq;
	}

	public void setEscRegSeq(Integer escRegSeq) {
		this.escRegSeq = escRegSeq;
	}

	@Column(name = "ESC_SEQ")
	public Long getEscSeq() {
		return this.escSeq;
	}

	public void setEscSeq(Long escSeq) {
		this.escSeq = escSeq;
	}

	@Column(name = "SER_MATRICULA_E_ALTERADO")
	public Integer getSerMatriculaEAlterado() {
		return this.serMatriculaEAlterado;
	}

	public void setSerMatriculaEAlterado(Integer serMatriculaEAlterado) {
		this.serMatriculaEAlterado = serMatriculaEAlterado;
	}

	@Column(name = "SER_VIN_CODIGO_E_ALTERADO")
	public Short getSerVinCodigoEAlterado() {
		return this.serVinCodigoEAlterado;
	}

	public void setSerVinCodigoEAlterado(Short serVinCodigoEAlterado) {
		this.serVinCodigoEAlterado = serVinCodigoEAlterado;
	}

	public enum Fields {

	/* ATUALIZADOR JOURNALS - Fields	SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		REG_SER_MATRICULA("regSerMatricula"),
		REG_SER_VIN_CODIGO("regSerVinCodigo"),
		REG_SEQ("regSeq"),
		SEQ("seq"),
		DATA("data"),
		SES_SEQ("sesSeq"),
		STR_GTR_ARE_CODIGO("strGtrAreCodigo"),
		STR_GTR_CCT_CODIGO("strGtrCctCodigo"),
		STR_GTR_TGT_CODIGO("strGtrTgtCodigo"),
		STR_CODIGO("strCodigo"),
		CRIADO_EM("criadoEm"),
		ALTERADO_EM("alteradoEm"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		ESC_REG_SER_MATRICULA("escRegSerMatricula"),
		ESC_REG_SER_VIN_CODIGO("escRegSerVinCodigo"),
		ESC_REG_SEQ("escRegSeq"),
		ESC_SEQ("escSeq"),
		SER_MATRICULA_E_ALTERADO("serMatriculaEAlterado"),
		SER_VIN_CODIGO_E_ALTERADO("serVinCodigoEAlterado");

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

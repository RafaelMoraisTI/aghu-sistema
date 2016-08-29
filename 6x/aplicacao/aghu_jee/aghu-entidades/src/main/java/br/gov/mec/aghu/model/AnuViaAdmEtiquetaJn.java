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
 * AnuViaAdmEtiquetaJn generated by hbm2java
 */
@Entity
@Table(name = "ANU_VIA_ADM_ETIQUETAS_JN", schema = "AGH")
@Immutable
public class AnuViaAdmEtiquetaJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = -7838440726661858328L;
	/* ATUALIZADOR JOURNALS - PROPERTIES	private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	private String viaAdm;
	private String tipoPac;
	private Date criadoEm;
	private String indSituacao;
	private String descricao;
	private Integer serMatricula;
	private Short serVinCodigo;

	public AnuViaAdmEtiquetaJn() {
	}

	public AnuViaAdmEtiquetaJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, String viaAdm, String tipoPac) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.viaAdm = viaAdm;
		this.tipoPac = tipoPac;
	}

	public AnuViaAdmEtiquetaJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, String viaAdm, String tipoPac,
			Date criadoEm, String indSituacao, String descricao, Integer serMatricula, Short serVinCodigo) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.viaAdm = viaAdm;
		this.tipoPac = tipoPac;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
		this.descricao = descricao;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
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

	@Column(name = "VIA_ADM", nullable = false, length = 15)
	@Length(max = 15)
	public String getViaAdm() {
		return this.viaAdm;
	}

	public void setViaAdm(String viaAdm) {
		this.viaAdm = viaAdm;
	}

	@Column(name = "TIPO_PAC", nullable = false, length = 15)
	@Length(max = 15)
	public String getTipoPac() {
		return this.tipoPac;
	}

	public void setTipoPac(String tipoPac) {
		this.tipoPac = tipoPac;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "DESCRICAO", length = 500)
	@Length(max = 500)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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

	public enum Fields {

	/* ATUALIZADOR JOURNALS - Fields	SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		VIA_ADM("viaAdm"),
		TIPO_PAC("tipoPac"),
		CRIADO_EM("criadoEm"),
		IND_SITUACAO("indSituacao"),
		DESCRICAO("descricao"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo");

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
package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AelInformacaoMdtoColetaJn generated by hbm2java
 */
@Entity
@Table(name = "AEL_INFORMACAO_MDTO_COLETAS_JN", schema = "AGH")
@SequenceGenerator(name = "aelMdlJnSeq", sequenceName = "AGH.AEL_MDL_JN_SEQ", allocationSize = 1)
@Immutable
public class AelInformacaoMdtoColetaJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = -6908270899996138903L;
	/* ATUALIZADOR JOURNALS - PROPERTIES	private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	private Integer seqp;
	private Date dthrIngeriu;
	private String medicamento;
	private Integer iclSoeSeq;
	private Short iclSeqp;
	private Date criadoEm;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Date dthrColetou;

	public AelInformacaoMdtoColetaJn() {
	}

	public AelInformacaoMdtoColetaJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer seqp) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.seqp = seqp;
	}

	public AelInformacaoMdtoColetaJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer seqp, Date dthrIngeriu,
			String medicamento, Integer iclSoeSeq, Short iclSeqp, Date criadoEm, Integer serMatricula, Short serVinCodigo,
			Date dthrColetou) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.seqp = seqp;
		this.dthrIngeriu = dthrIngeriu;
		this.medicamento = medicamento;
		this.iclSoeSeq = iclSoeSeq;
		this.iclSeqp = iclSeqp;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.dthrColetou = dthrColetou;
	}

	// ATUALIZADOR JOURNALS - ID
	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelMdlJnSeq")
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

	@Column(name = "SEQP", nullable = false)
	public Integer getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Integer seqp) {
		this.seqp = seqp;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_INGERIU", length = 29)
	public Date getDthrIngeriu() {
		return this.dthrIngeriu;
	}

	public void setDthrIngeriu(Date dthrIngeriu) {
		this.dthrIngeriu = dthrIngeriu;
	}

	@Column(name = "MEDICAMENTO", length = 60)
	@Length(max = 60)
	public String getMedicamento() {
		return this.medicamento;
	}

	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}

	@Column(name = "ICL_SOE_SEQ")
	public Integer getIclSoeSeq() {
		return this.iclSoeSeq;
	}

	public void setIclSoeSeq(Integer iclSoeSeq) {
		this.iclSoeSeq = iclSoeSeq;
	}

	@Column(name = "ICL_SEQP")
	public Short getIclSeqp() {
		return this.iclSeqp;
	}

	public void setIclSeqp(Short iclSeqp) {
		this.iclSeqp = iclSeqp;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_COLETOU", length = 29)
	public Date getDthrColetou() {
		return this.dthrColetou;
	}

	public void setDthrColetou(Date dthrColetou) {
		this.dthrColetou = dthrColetou;
	}

	public enum Fields {

	/* ATUALIZADOR JOURNALS - Fields	SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		SEQP("seqp"),
		DTHR_INGERIU("dthrIngeriu"),
		MEDICAMENTO("medicamento"),
		ICL_SOE_SEQ("iclSoeSeq"),
		ICL_SEQP("iclSeqp"),
		CRIADO_EM("criadoEm"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		DTHR_COLETOU("dthrColetou");

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

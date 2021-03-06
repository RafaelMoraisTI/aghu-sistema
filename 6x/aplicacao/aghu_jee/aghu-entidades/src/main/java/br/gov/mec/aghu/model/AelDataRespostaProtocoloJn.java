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
 * AelDataRespostaProtocoloJn generated by hbm2java
 */
@Entity
@Table(name = "AEL_DATA_RESPOSTA_PROTOCOLO_JN", schema = "AGH")
@Immutable
public class AelDataRespostaProtocoloJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = 3107417505952334832L;
	/* ATUALIZADOR JOURNALS - PROPERTIES	private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	private Integer ppoPjqSeq;
	private Short ppoSeqp;
	private Integer ppjPjqSeq;
	private Integer ppjPacCodigo;
	private Integer seqp;
	private Date dthrResposta;
	private Integer serMatricula;
	private Short serVinCodigo;
	private String indSituacao;
	private String justificativa;

	public AelDataRespostaProtocoloJn() {
	}

	public AelDataRespostaProtocoloJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer ppoPjqSeq, Short ppoSeqp,
			Integer ppjPjqSeq, Integer ppjPacCodigo, Integer seqp) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.ppoPjqSeq = ppoPjqSeq;
		this.ppoSeqp = ppoSeqp;
		this.ppjPjqSeq = ppjPjqSeq;
		this.ppjPacCodigo = ppjPacCodigo;
		this.seqp = seqp;
	}

	public AelDataRespostaProtocoloJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer ppoPjqSeq, Short ppoSeqp,
			Integer ppjPjqSeq, Integer ppjPacCodigo, Integer seqp, Date dthrResposta, Integer serMatricula, Short serVinCodigo,
			String indSituacao, String justificativa) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.ppoPjqSeq = ppoPjqSeq;
		this.ppoSeqp = ppoSeqp;
		this.ppjPjqSeq = ppjPjqSeq;
		this.ppjPacCodigo = ppjPacCodigo;
		this.seqp = seqp;
		this.dthrResposta = dthrResposta;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.indSituacao = indSituacao;
		this.justificativa = justificativa;
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

	@Column(name = "PPO_PJQ_SEQ", nullable = false)
	public Integer getPpoPjqSeq() {
		return this.ppoPjqSeq;
	}

	public void setPpoPjqSeq(Integer ppoPjqSeq) {
		this.ppoPjqSeq = ppoPjqSeq;
	}

	@Column(name = "PPO_SEQP", nullable = false)
	public Short getPpoSeqp() {
		return this.ppoSeqp;
	}

	public void setPpoSeqp(Short ppoSeqp) {
		this.ppoSeqp = ppoSeqp;
	}

	@Column(name = "PPJ_PJQ_SEQ", nullable = false)
	public Integer getPpjPjqSeq() {
		return this.ppjPjqSeq;
	}

	public void setPpjPjqSeq(Integer ppjPjqSeq) {
		this.ppjPjqSeq = ppjPjqSeq;
	}

	@Column(name = "PPJ_PAC_CODIGO", nullable = false)
	public Integer getPpjPacCodigo() {
		return this.ppjPacCodigo;
	}

	public void setPpjPacCodigo(Integer ppjPacCodigo) {
		this.ppjPacCodigo = ppjPacCodigo;
	}

	@Column(name = "SEQP", nullable = false)
	public Integer getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Integer seqp) {
		this.seqp = seqp;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_RESPOSTA", length = 29)
	public Date getDthrResposta() {
		return this.dthrResposta;
	}

	public void setDthrResposta(Date dthrResposta) {
		this.dthrResposta = dthrResposta;
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

	@Column(name = "IND_SITUACAO", length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "JUSTIFICATIVA", length = 500)
	@Length(max = 500)
	public String getJustificativa() {
		return this.justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	public enum Fields {

	/* ATUALIZADOR JOURNALS - Fields	SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		PPO_PJQ_SEQ("ppoPjqSeq"),
		PPO_SEQP("ppoSeqp"),
		PPJ_PJQ_SEQ("ppjPjqSeq"),
		PPJ_PAC_CODIGO("ppjPacCodigo"),
		SEQP("seqp"),
		DTHR_RESPOSTA("dthrResposta"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		IND_SITUACAO("indSituacao"),
		JUSTIFICATIVA("justificativa");

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

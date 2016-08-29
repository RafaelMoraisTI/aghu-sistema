package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioCumpriuJejumColeta;
import br.gov.mec.aghu.dominio.DominioLocalColetaAmostra;
import br.gov.mec.aghu.dominio.DominioTipoAcessoColeta;
import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AelInformacaoColetaJn generated by hbm2java
 */
@Entity
@Table(name = "AEL_INFORMACAO_COLETAS_JN", schema = "AGH")
@SequenceGenerator(name = "aelIclJnSeq", sequenceName = "AGH.AEL_ICL_JN_SEQ", allocationSize = 1)
@Immutable
public class AelInformacaoColetaJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = -9199978141175207563L;
	/* ATUALIZADOR JOURNALS - PROPERTIES	private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	private Integer soeSeq;
	private Short seqp;
	private DominioCumpriuJejumColeta cumpriuJejum;
	private String jejumRealizado;
	private Boolean documento;
	private DominioLocalColetaAmostra localColeta;
	private DominioTipoAcessoColeta tipoAcesso;
	private Boolean infMenstruacao;
	private Date dtUltMenstruacao;
	private String informacoesAdicionais;
	private Boolean infMedicacao;
	private Date criadoEm;
	private Integer serMatricula;
	private Short serVinCodigo;

	public AelInformacaoColetaJn() {
	}

	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelIclJnSeq")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}	
	
/* ATUALIZADOR JOURNALS - Get / Set	@Id

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

	@Column(name = "SOE_SEQ", nullable = false)
	public Integer getSoeSeq() {
		return this.soeSeq;
	}

	public void setSoeSeq(Integer soeSeq) {
		this.soeSeq = soeSeq;
	}

	@Column(name = "SEQP", nullable = false)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}

	@Column(name = "IND_CUMPRIU_JEJUM", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioCumpriuJejumColeta getCumpriuJejum() {
		return cumpriuJejum;
	}
	
	public void setCumpriuJejum(DominioCumpriuJejumColeta cumpriuJejum) {
		this.cumpriuJejum = cumpriuJejum;
	}

	@Column(name = "JEJUM_REALIZADO", length = 60)
	@Length(max = 60)
	public String getJejumRealizado() {
		return this.jejumRealizado;
	}

	public void setJejumRealizado(String jejumRealizado) {
		this.jejumRealizado = jejumRealizado;
	}

	@Column(name = "IND_DOCUMENTO", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getDocumento() {
		return this.documento;
	}

	public void setDocumento(Boolean documento) {
		this.documento = documento;
	}

	@Column(name = "LOCAL_COLETA", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioLocalColetaAmostra getLocalColeta() {
		return this.localColeta;
	}

	public void setLocalColeta(DominioLocalColetaAmostra localColeta) {
		this.localColeta = localColeta;
	}

	@Column(name = "TIPO_ACESSO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioTipoAcessoColeta getTipoAcesso() {
		return this.tipoAcesso;
	}

	public void setTipoAcesso(DominioTipoAcessoColeta tipoAcesso) {
		this.tipoAcesso = tipoAcesso;
	}

	@Column(name = "IND_INF_MENSTRUACAO", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getInfMenstruacao() {
		return this.infMenstruacao;
	}

	public void setInfMenstruacao(Boolean infMenstruacao) {
		this.infMenstruacao = infMenstruacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_ULT_MENSTRUACAO", length = 29)
	public Date getDtUltMenstruacao() {
		return this.dtUltMenstruacao;
	}

	public void setDtUltMenstruacao(Date dtUltMenstruacao) {
		this.dtUltMenstruacao = dtUltMenstruacao;
	}

	@Column(name = "INFORMACOES_ADICIONAIS", length = 2000)
	@Length(max = 2000)
	public String getInformacoesAdicionais() {
		return this.informacoesAdicionais;
	}

	public void setInformacoesAdicionais(String informacoesAdicionais) {
		this.informacoesAdicionais = informacoesAdicionais;
	}

	@Column(name = "IND_INF_MEDICACAO", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getInfMedicacao() {
		return this.infMedicacao;
	}

	public void setInfMedicacao(Boolean infMedicacao) {
		this.infMedicacao = infMedicacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
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

	public enum Fields {

	/* ATUALIZADOR JOURNALS - Fields	SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		SOE_SEQ("soeSeq"),
		SEQP("seqp"),
		CUMPRIU_JEJUM("cumpriuJejum"),
		JEJUM_REALIZADO("jejumRealizado"),
		DOCUMENTO("documento"),
		LOCAL_COLETA("localColeta"),
		TIPO_ACESSO("tipoAcesso"),
		INF_MENSTRUACAO("infMenstruacao"),
		DT_ULT_MENSTRUACAO("dtUltMenstruacao"),
		INFORMACOES_ADICIONAIS("informacoesAdicionais"),
		INF_MEDICACAO("infMedicacao"),
		CRIADO_EM("criadoEm"),
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
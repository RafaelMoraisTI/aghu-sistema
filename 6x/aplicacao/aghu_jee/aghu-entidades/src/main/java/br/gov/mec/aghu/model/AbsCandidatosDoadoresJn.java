package br.gov.mec.aghu.model;

// Generated 18/04/2011 13:15:07 by Hibernate Tools 3.2.5.Beta

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
 * AbsCandidatosDoadoresJn generated by hbm2java
 */
@Entity
@SequenceGenerator(name="absCadJnSeq", sequenceName="AGH.ABS_CAD_JN_SEQ", allocationSize = 1)
@Table(name = "ABS_CANDIDATOS_DOADORES_JN", schema = "AGH")
@Immutable
public class AbsCandidatosDoadoresJn extends BaseJournal {

	/**
	 * 
	 */
	private static final long serialVersionUID = 991688457110360219L;
/* ATUALIZADOR JOURNALS - PROPERTIES	private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	private Integer seq;
	private String nome;
	private Date dtNascimento;
	private Date criadoEm;
	private String sexo;
	private String raca;
	private Short oriSeq;
	private Integer ocpCodigo;
	private Short nacCodigo;
	private Integer serMatricula;
	private Short serVinCodigo;
	private String estadoCivil;
	private Short grauInstrucao;
	private String naturalidade;
	private String nomeMae;
	private String nomePai;
	private String doctoIdentidade;
	private String orgExpIdentidade;
	private String logradouro;
	private Integer nroLogradouro;
	private String complLogradouro;
	private String bairro;
	private Integer cep;
	private Short dddFoneResidencial;
	private Integer foneResidencial;
	private Short ramalFoneResidencial;
	private String localTrabalho;
	private Short dddFoneProfissional;
	private Integer foneProfissional;
	private Short ramalFoneProfissional;
	private String associacaoVoluntarios;
	private Integer bclBaiCodigo;
	private Integer bclCloCep;
	private Integer bclCloLgrCodigo;
	private Integer cddCodigo;
	private Integer serMatriculaE;
	private Short serVinCodigoE;
	private Integer cadSeq;

	public AbsCandidatosDoadoresJn() {
	}

	public AbsCandidatosDoadoresJn(Long seqJn, String jnUser, Date jnDateTime,
			String jnOperation, Integer seq) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.seq = seq;
	}

	@SuppressWarnings({"PMD.ExcessiveParameterList"})
	public AbsCandidatosDoadoresJn(Long seqJn, String jnUser, Date jnDateTime,
			String jnOperation, Integer seq, String nome, Date dtNascimento,
			Date criadoEm, String sexo, String raca, Short oriSeq,
			Integer ocpCodigo, Short nacCodigo, Integer serMatricula,
			Short serVinCodigo, String estadoCivil, Short grauInstrucao,
			String naturalidade, String nomeMae, String nomePai,
			String doctoIdentidade, String orgExpIdentidade, String logradouro,
			Integer nroLogradouro, String complLogradouro, String bairro,
			Integer cep, Short dddFoneResidencial, Integer foneResidencial,
			Short ramalFoneResidencial, String localTrabalho,
			Short dddFoneProfissional, Integer foneProfissional,
			Short ramalFoneProfissional, String associacaoVoluntarios,
			Integer bclBaiCodigo, Integer bclCloCep, Integer bclCloLgrCodigo,
			Integer cddCodigo, Integer serMatriculaE, Short serVinCodigoE,
			Integer cadSeq) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.seq = seq;
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.criadoEm = criadoEm;
		this.sexo = sexo;
		this.raca = raca;
		this.oriSeq = oriSeq;
		this.ocpCodigo = ocpCodigo;
		this.nacCodigo = nacCodigo;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.estadoCivil = estadoCivil;
		this.grauInstrucao = grauInstrucao;
		this.naturalidade = naturalidade;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
		this.doctoIdentidade = doctoIdentidade;
		this.orgExpIdentidade = orgExpIdentidade;
		this.logradouro = logradouro;
		this.nroLogradouro = nroLogradouro;
		this.complLogradouro = complLogradouro;
		this.bairro = bairro;
		this.cep = cep;
		this.dddFoneResidencial = dddFoneResidencial;
		this.foneResidencial = foneResidencial;
		this.ramalFoneResidencial = ramalFoneResidencial;
		this.localTrabalho = localTrabalho;
		this.dddFoneProfissional = dddFoneProfissional;
		this.foneProfissional = foneProfissional;
		this.ramalFoneProfissional = ramalFoneProfissional;
		this.associacaoVoluntarios = associacaoVoluntarios;
		this.bclBaiCodigo = bclBaiCodigo;
		this.bclCloCep = bclCloCep;
		this.bclCloLgrCodigo = bclCloLgrCodigo;
		this.cddCodigo = cddCodigo;
		this.serMatriculaE = serMatriculaE;
		this.serVinCodigoE = serVinCodigoE;
		this.cadSeq = cadSeq;
	}

	// ATUALIZADOR JOURNALS - ID
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "absCadJnSeq")
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

	@Column(name = "SEQ", nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "NOME", length = 29)
	@Length(max = 29)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_NASCIMENTO", length = 29)
	public Date getDtNascimento() {
		return this.dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "SEXO", length = 1)
	@Length(max = 1)
	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Column(name = "RACA", length = 1)
	@Length(max = 1)
	public String getRaca() {
		return this.raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Column(name = "ORI_SEQ")
	public Short getOriSeq() {
		return this.oriSeq;
	}

	public void setOriSeq(Short oriSeq) {
		this.oriSeq = oriSeq;
	}

	@Column(name = "OCP_CODIGO")
	public Integer getOcpCodigo() {
		return this.ocpCodigo;
	}

	public void setOcpCodigo(Integer ocpCodigo) {
		this.ocpCodigo = ocpCodigo;
	}

	@Column(name = "NAC_CODIGO")
	public Short getNacCodigo() {
		return this.nacCodigo;
	}

	public void setNacCodigo(Short nacCodigo) {
		this.nacCodigo = nacCodigo;
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

	@Column(name = "ESTADO_CIVIL", length = 1)
	@Length(max = 1)
	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Column(name = "GRAU_INSTRUCAO")
	public Short getGrauInstrucao() {
		return this.grauInstrucao;
	}

	public void setGrauInstrucao(Short grauInstrucao) {
		this.grauInstrucao = grauInstrucao;
	}

	@Column(name = "NATURALIDADE", length = 25)
	@Length(max = 25)
	public String getNaturalidade() {
		return this.naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	@Column(name = "NOME_MAE", length = 45)
	@Length(max = 45)
	public String getNomeMae() {
		return this.nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	@Column(name = "NOME_PAI", length = 45)
	@Length(max = 45)
	public String getNomePai() {
		return this.nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	@Column(name = "DOCTO_IDENTIDADE", length = 20)
	@Length(max = 20)
	public String getDoctoIdentidade() {
		return this.doctoIdentidade;
	}

	public void setDoctoIdentidade(String doctoIdentidade) {
		this.doctoIdentidade = doctoIdentidade;
	}

	@Column(name = "ORG_EXP_IDENTIDADE", length = 10)
	@Length(max = 10)
	public String getOrgExpIdentidade() {
		return this.orgExpIdentidade;
	}

	public void setOrgExpIdentidade(String orgExpIdentidade) {
		this.orgExpIdentidade = orgExpIdentidade;
	}

	@Column(name = "LOGRADOURO", length = 50)
	@Length(max = 50)
	public String getLogradouro() {
		return this.logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	@Column(name = "NRO_LOGRADOURO")
	public Integer getNroLogradouro() {
		return this.nroLogradouro;
	}

	public void setNroLogradouro(Integer nroLogradouro) {
		this.nroLogradouro = nroLogradouro;
	}

	@Column(name = "COMPL_LOGRADOURO", length = 15)
	@Length(max = 15)
	public String getComplLogradouro() {
		return this.complLogradouro;
	}

	public void setComplLogradouro(String complLogradouro) {
		this.complLogradouro = complLogradouro;
	}

	@Column(name = "BAIRRO", length = 25)
	@Length(max = 25)
	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Column(name = "CEP")
	public Integer getCep() {
		return this.cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	@Column(name = "DDD_FONE_RESIDENCIAL")
	public Short getDddFoneResidencial() {
		return this.dddFoneResidencial;
	}

	public void setDddFoneResidencial(Short dddFoneResidencial) {
		this.dddFoneResidencial = dddFoneResidencial;
	}

	@Column(name = "FONE_RESIDENCIAL")
	public Integer getFoneResidencial() {
		return this.foneResidencial;
	}

	public void setFoneResidencial(Integer foneResidencial) {
		this.foneResidencial = foneResidencial;
	}

	@Column(name = "RAMAL_FONE_RESIDENCIAL")
	public Short getRamalFoneResidencial() {
		return this.ramalFoneResidencial;
	}

	public void setRamalFoneResidencial(Short ramalFoneResidencial) {
		this.ramalFoneResidencial = ramalFoneResidencial;
	}

	@Column(name = "LOCAL_TRABALHO", length = 45)
	@Length(max = 45)
	public String getLocalTrabalho() {
		return this.localTrabalho;
	}

	public void setLocalTrabalho(String localTrabalho) {
		this.localTrabalho = localTrabalho;
	}

	@Column(name = "DDD_FONE_PROFISSIONAL")
	public Short getDddFoneProfissional() {
		return this.dddFoneProfissional;
	}

	public void setDddFoneProfissional(Short dddFoneProfissional) {
		this.dddFoneProfissional = dddFoneProfissional;
	}

	@Column(name = "FONE_PROFISSIONAL")
	public Integer getFoneProfissional() {
		return this.foneProfissional;
	}

	public void setFoneProfissional(Integer foneProfissional) {
		this.foneProfissional = foneProfissional;
	}

	@Column(name = "RAMAL_FONE_PROFISSIONAL")
	public Short getRamalFoneProfissional() {
		return this.ramalFoneProfissional;
	}

	public void setRamalFoneProfissional(Short ramalFoneProfissional) {
		this.ramalFoneProfissional = ramalFoneProfissional;
	}

	@Column(name = "ASSOCIACAO_VOLUNTARIOS", length = 1)
	@Length(max = 1)
	public String getAssociacaoVoluntarios() {
		return this.associacaoVoluntarios;
	}

	public void setAssociacaoVoluntarios(String associacaoVoluntarios) {
		this.associacaoVoluntarios = associacaoVoluntarios;
	}

	@Column(name = "BCL_BAI_CODIGO")
	public Integer getBclBaiCodigo() {
		return this.bclBaiCodigo;
	}

	public void setBclBaiCodigo(Integer bclBaiCodigo) {
		this.bclBaiCodigo = bclBaiCodigo;
	}

	@Column(name = "BCL_CLO_CEP")
	public Integer getBclCloCep() {
		return this.bclCloCep;
	}

	public void setBclCloCep(Integer bclCloCep) {
		this.bclCloCep = bclCloCep;
	}

	@Column(name = "BCL_CLO_LGR_CODIGO")
	public Integer getBclCloLgrCodigo() {
		return this.bclCloLgrCodigo;
	}

	public void setBclCloLgrCodigo(Integer bclCloLgrCodigo) {
		this.bclCloLgrCodigo = bclCloLgrCodigo;
	}

	@Column(name = "CDD_CODIGO")
	public Integer getCddCodigo() {
		return this.cddCodigo;
	}

	public void setCddCodigo(Integer cddCodigo) {
		this.cddCodigo = cddCodigo;
	}

	@Column(name = "SER_MATRICULA_E")
	public Integer getSerMatriculaE() {
		return this.serMatriculaE;
	}

	public void setSerMatriculaE(Integer serMatriculaE) {
		this.serMatriculaE = serMatriculaE;
	}

	@Column(name = "SER_VIN_CODIGO_E")
	public Short getSerVinCodigoE() {
		return this.serVinCodigoE;
	}

	public void setSerVinCodigoE(Short serVinCodigoE) {
		this.serVinCodigoE = serVinCodigoE;
	}

	@Column(name = "CAD_SEQ")
	public Integer getCadSeq() {
		return this.cadSeq;
	}

	public void setCadSeq(Integer cadSeq) {
		this.cadSeq = cadSeq;
	}

	public enum Fields {

	/* ATUALIZADOR JOURNALS - Fields	SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		SEQ("seq"),
		NOME("nome"),
		DT_NASCIMENTO("dtNascimento"),
		CRIADO_EM("criadoEm"),
		SEXO("sexo"),
		RACA("raca"),
		ORI_SEQ("oriSeq"),
		OCP_CODIGO("ocpCodigo"),
		NAC_CODIGO("nacCodigo"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		ESTADO_CIVIL("estadoCivil"),
		GRAU_INSTRUCAO("grauInstrucao"),
		NATURALIDADE("naturalidade"),
		NOME_MAE("nomeMae"),
		NOME_PAI("nomePai"),
		DOCTO_IDENTIDADE("doctoIdentidade"),
		ORG_EXP_IDENTIDADE("orgExpIdentidade"),
		LOGRADOURO("logradouro"),
		NRO_LOGRADOURO("nroLogradouro"),
		COMPL_LOGRADOURO("complLogradouro"),
		BAIRRO("bairro"),
		CEP("cep"),
		DDD_FONE_RESIDENCIAL("dddFoneResidencial"),
		FONE_RESIDENCIAL("foneResidencial"),
		RAMAL_FONE_RESIDENCIAL("ramalFoneResidencial"),
		LOCAL_TRABALHO("localTrabalho"),
		DDD_FONE_PROFISSIONAL("dddFoneProfissional"),
		FONE_PROFISSIONAL("foneProfissional"),
		RAMAL_FONE_PROFISSIONAL("ramalFoneProfissional"),
		ASSOCIACAO_VOLUNTARIOS("associacaoVoluntarios"),
		BCL_BAI_CODIGO("bclBaiCodigo"),
		BCL_CLO_CEP("bclCloCep"),
		BCL_CLO_LGR_CODIGO("bclCloLgrCodigo"),
		CDD_CODIGO("cddCodigo"),
		SER_MATRICULA_E("serMatriculaE"),
		SER_VIN_CODIGO_E("serVinCodigoE"),
		CAD_SEQ("cadSeq");

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

package br.gov.mec.aghu.model;

// Generated 24/09/2009 17:21:40 by Hibernate Tools 3.2.5.Beta

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.annotations.Parameter;
import org.hibernate.validator.constraints.Email;

import br.gov.mec.aghu.dominio.DominioEstadoCivil;
import br.gov.mec.aghu.dominio.DominioGrauInstrucaoRap;
import br.gov.mec.aghu.dominio.DominioSexo;
import br.gov.mec.aghu.core.exception.BaseRuntimeException;
import br.gov.mec.aghu.core.exception.BusinessExceptionCode;
import br.gov.mec.aghu.core.persistence.BaseEntityCodigo;
import br.gov.mec.aghu.core.utils.StringUtil;
import br.gov.mec.aghu.core.validation.CPF;

/**
 * RapPessoasFisicas generated by hbm2java
 */

@Entity
@SequenceGenerator(name="rapPesSq1", sequenceName="AGH.RAP_PES_SQ1", allocationSize = 1)
@Table(name = "RAP_PESSOAS_FISICAS", schema = "AGH")
@org.hibernate.annotations.Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.TRANSACTIONAL)
public class RapPessoasFisicas extends BaseEntityCodigo<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1610643871745682838L;
	private Integer codigo;
	private AipNacionalidades aipNacionalidades;
	private RapServidores rapServidores;
	private AipUfs aipUfs;
	private AipBairrosCepLogradouro aipBairrosCepLogradouro;
	private AipCidades aipCidades;
	private AipPacientes aipPacientes;
	private Long cpf;
	private String nome;
	private String nomeMae;
	private Integer pacProntuario;
	private String nomePai;
	private Date dtNascimento;
	private DominioSexo sexo;
	private String nomeUsual;
	private DominioGrauInstrucaoRap grauInstrucao;
	private DominioEstadoCivil estadoCivil;
	private String logradouro;
	private String complLogradouro;
	private Integer nroLogradouro;
	private Integer cep;
	private String bairro;
	private String cidadeNascimento;
	private String nroIdentidade;
	private Integer nroCartProfissional;
	private String serieCartProfissional;
	private Long pisPasep;
	private Long nroTitEleitor;
	private Short zonaTitEleitor;
	private Short secaoTitEleitor;
	private Short dddFoneResidencial;
	private Long foneResidencial;
	private Integer ramalFoneResidencial;
	private Short dddFoneCelular;
	private Long foneCelular;
	private Short dddFonePagerBip;
	private Long fonePagerBip;
	private String nroPagerBip;
	private String emailParticular;
	private Date criadoEm;
	private Set<RapServidores> rapServidoreses = new HashSet<RapServidores>(0);
	private Set<RapQualificacao> qualificacoes = new HashSet<RapQualificacao>(0);
	private List<RapPessoaTipoInformacoes> tipoInformacao;
	private Integer version;
	
	//variável transient
	private Integer numeroDependentes;
	private boolean permiteDependentes;

	public RapPessoasFisicas() {
	}

	public RapPessoasFisicas(Integer codigo) {
		this.codigo = codigo;
	}

	public RapPessoasFisicas(Integer codigo, AipNacionalidades aipNacionalidades,
			String nome, String nomeMae, Date dtNascimento, DominioSexo sexo) {
		this.codigo = codigo;
		this.aipNacionalidades = aipNacionalidades;
		this.nome = nome;
		this.nomeMae = nomeMae;
		this.dtNascimento = dtNascimento;
		this.sexo = sexo;
	}

	@SuppressWarnings({"PMD.ExcessiveParameterList"})
	public RapPessoasFisicas(Integer codigo, AipNacionalidades aipNacionalidades,
			RapServidores rapServidores, AipUfs c,
			AipBairrosCepLogradouro aipBairrosCepLogradouro,
			AipCidades aipCidades, AipPacientes aipPacientes, Long cpf,
			String nome, String nomeMae, Integer pacProntuario, String nomePai,
			Date dtNascimento, DominioSexo sexo, String nomeUsual,
			DominioGrauInstrucaoRap grauInstrucao,
			DominioEstadoCivil estadoCivil, String logradouro,
			String complLogradouro, Integer nroLogradouro, Integer cep,
			String bairro, String cidadeNascimento, String nroIdentidade,
			Integer nroCartProfissional, String serieCartProfissional,
			Long pisPasep, Long nroTitEleitor, Short zonaTitEleitor,
			Short secaoTitEleitor, Short dddFoneResidencial,
			Long foneResidencial, Integer ramalFoneResidencial,
			Short dddFoneCelular, Long foneCelular, Short dddFonePagerBip,
			Long fonePagerBip, String nroPagerBip, String emailParticular,
			Date criadoEm, Set<RapServidores> rapServidoreses,
			Set<RapQualificacao> qualificacoes) {
		this.codigo = codigo;
		this.aipNacionalidades = aipNacionalidades;
		this.rapServidores = rapServidores;
		this.aipUfs = aipUfs;
		this.aipBairrosCepLogradouro = aipBairrosCepLogradouro;
		this.aipCidades = aipCidades;
		this.aipPacientes = aipPacientes;
		this.cpf = cpf;
		this.nome = nome;
		this.nomeMae = nomeMae;
		this.pacProntuario = pacProntuario;
		this.nomePai = nomePai;
		this.dtNascimento = dtNascimento;
		this.sexo = sexo;
		this.nomeUsual = nomeUsual;
		this.grauInstrucao = grauInstrucao;
		this.estadoCivil = estadoCivil;
		this.logradouro = logradouro;
		this.complLogradouro = complLogradouro;
		this.nroLogradouro = nroLogradouro;
		this.cep = cep;
		this.bairro = bairro;
		this.cidadeNascimento = cidadeNascimento;
		this.nroIdentidade = nroIdentidade;
		this.nroCartProfissional = nroCartProfissional;
		this.serieCartProfissional = serieCartProfissional;
		this.pisPasep = pisPasep;
		this.nroTitEleitor = nroTitEleitor;
		this.zonaTitEleitor = zonaTitEleitor;
		this.secaoTitEleitor = secaoTitEleitor;
		this.dddFoneResidencial = dddFoneResidencial;
		this.foneResidencial = foneResidencial;
		this.ramalFoneResidencial = ramalFoneResidencial;
		this.dddFoneCelular = dddFoneCelular;
		this.foneCelular = foneCelular;
		this.dddFonePagerBip = dddFonePagerBip;
		this.fonePagerBip = fonePagerBip;
		this.nroPagerBip = nroPagerBip;
		this.emailParticular = emailParticular;
		this.criadoEm = criadoEm;
		this.rapServidoreses = rapServidoreses;
		this.qualificacoes = qualificacoes;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "rapPesSq1")
	@Column(name = "CODIGO", nullable = false, precision = 9, scale = 0)
	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NAC_CODIGO", nullable = false)
	public AipNacionalidades getAipNacionalidades() {
		return this.aipNacionalidades;
	}

	public void setAipNacionalidades(AipNacionalidades aipNacionalidades) {
		this.aipNacionalidades = aipNacionalidades;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UF_SIGLA")
	public AipUfs getAipUfs() {
		return this.aipUfs;
	}

	public void setAipUfs(AipUfs aipUfs) {
		this.aipUfs = aipUfs;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "BCL_CLO_LGR_CODIGO", referencedColumnName = "CLO_LGR_CODIGO"),
			@JoinColumn(name = "BCL_CLO_CEP", referencedColumnName = "CLO_CEP"),
			@JoinColumn(name = "BCL_BAI_CODIGO", referencedColumnName = "BAI_CODIGO") })
	public AipBairrosCepLogradouro getAipBairrosCepLogradouro() {
		return this.aipBairrosCepLogradouro;
	}

	public void setAipBairrosCepLogradouro(
			AipBairrosCepLogradouro aipBairrosCepLogradouro) {
		this.aipBairrosCepLogradouro = aipBairrosCepLogradouro;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CDD_CODIGO")
	public AipCidades getAipCidades() {
		return this.aipCidades;
	}

	public void setAipCidades(AipCidades aipCidades) {
		this.aipCidades = aipCidades;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PAC_CODIGO", unique = true)
	public AipPacientes getAipPacientes() {
		return this.aipPacientes;
	}

	public void setAipPacientes(AipPacientes aipPacientes) {
		this.aipPacientes = aipPacientes;
	}

	@Column(name = "CPF", unique = true, precision = 12, scale = 0)
	@CPF
	public Long getCpf() {
		return this.cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	@Column(name = "NOME", nullable = false, length = 50)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		if(nome != null && StringUtils.isNotBlank(nome)){
			this.nome = nome.toUpperCase();
		}
		else {
			this.nome = null;
		}
	}

	@Column(name = "NOME_MAE", nullable = false, length = 45)
	public String getNomeMae() {
		return this.nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		if (nomeMae != null) {
			this.nomeMae = nomeMae.toUpperCase();
		}
		else {
			this.nomeMae = null;
		}
	}

	@Column(name = "PAC_PRONTUARIO", precision = 8, scale = 0)
	public Integer getPacProntuario() {
		return this.pacProntuario;
	}

	public void setPacProntuario(Integer pacProntuario) {
		this.pacProntuario = pacProntuario;
	}

	@Column(name = "NOME_PAI", length = 45)
	public String getNomePai() {
		return this.nomePai;
	}

	public void setNomePai(String nomePai) {
		if (nomePai != null) {
			this.nomePai = nomePai.toUpperCase();
		} else {
			this.nomePai = null;
		}
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_NASCIMENTO", nullable = false)
	
	public Date getDtNascimento() {
		return this.dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	@Column(name = "SEXO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSexo getSexo() {
		return this.sexo;
	}

	public void setSexo(DominioSexo sexo) {
		this.sexo = sexo;
	}

	@Column(name = "NOME_USUAL", length = 15)
	public String getNomeUsual() {
		return this.nomeUsual;
	}

	public void setNomeUsual(String nomeUsual) {
		if (nomeUsual != null) {
			this.nomeUsual = nomeUsual.toUpperCase();
		} else {
			this.nomeUsual = null;
		}

	}

	@Column(name = "GRAU_INSTRUCAO", precision = 2, scale = 0)
	@org.hibernate.annotations.Type(parameters = { @Parameter(name = "enumClassName", value = "br.gov.mec.aghu.dominio.DominioGrauInstrucaoRap") }, type = "br.gov.mec.aghu.core.model.jpa.DominioUserType")
	public DominioGrauInstrucaoRap getGrauInstrucao() {
		return this.grauInstrucao;
	}

	public void setGrauInstrucao(DominioGrauInstrucaoRap grauInstrucao) {
		this.grauInstrucao = grauInstrucao;
	}

	@Column(name = "ESTADO_CIVIL", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioEstadoCivil getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(DominioEstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Column(name = "LOGRADOURO", length = 60)
	public String getLogradouro() {
		return this.logradouro;
	}

	public void setLogradouro(String logradouro) {

		if (logradouro != null) {
			this.logradouro = logradouro.toUpperCase();
		} else {
			this.logradouro = null;
		}

	}

	@Column(name = "COMPL_LOGRADOURO", length = 15)
	public String getComplLogradouro() {
		return this.complLogradouro;
	}

	public void setComplLogradouro(String complLogradouro) {
		if (complLogradouro != null) {
			this.complLogradouro = complLogradouro.toUpperCase();
		} else {
			this.complLogradouro = null;
		}

	}

	@Column(name = "NRO_LOGRADOURO", precision = 5, scale = 0)
	public Integer getNroLogradouro() {
		return this.nroLogradouro;
	}

	public void setNroLogradouro(Integer nroLogradouro) {
		this.nroLogradouro = nroLogradouro;
	}

	@Column(name = "CEP", precision = 8, scale = 0)
	public Integer getCep() {
		return this.cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	@Column(name = "BAIRRO", length = 60)
	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		if (bairro != null) {
			this.bairro = bairro.toUpperCase();
		} else {
			this.bairro = null;
		}

	}

	@Column(name = "CIDADE_NASCIMENTO", length = 40)
	public String getCidadeNascimento() {
		return this.cidadeNascimento;
	}

	public void setCidadeNascimento(String cidadeNascimento) {
		if (cidadeNascimento != null) {
			this.cidadeNascimento = cidadeNascimento.toUpperCase();
		} else {
			this.cidadeNascimento = null;
		}

	}

	@Column(name = "NRO_IDENTIDADE", length = 14)
	public String getNroIdentidade() {
		return this.nroIdentidade;
	}

	public void setNroIdentidade(String nroIdentidade) {
		this.nroIdentidade = nroIdentidade;
	}

	@Column(name = "NRO_CART_PROFISSIONAL", precision = 9, scale = 0)
	public Integer getNroCartProfissional() {
		return this.nroCartProfissional;
	}

	public void setNroCartProfissional(Integer nroCartProfissional) {
		this.nroCartProfissional = nroCartProfissional;
	}

	@Column(name = "SERIE_CART_PROFISSIONAL", length = 5)
	public String getSerieCartProfissional() {
		return this.serieCartProfissional;
	}

	public void setSerieCartProfissional(String serieCartProfissional) {
		this.serieCartProfissional = serieCartProfissional;
	}

	@Column(name = "PIS_PASEP", precision = 12, scale = 0)
	public Long getPisPasep() {
		return this.pisPasep;
	}

	public void setPisPasep(Long pisPasep) {
		this.pisPasep = pisPasep;
	}

	@Column(name = "NRO_TIT_ELEITOR", precision = 12, scale = 0)
	public Long getNroTitEleitor() {
		return this.nroTitEleitor;
	}

	public void setNroTitEleitor(Long nroTitEleitor) {
		this.nroTitEleitor = nroTitEleitor;
	}

	@Column(name = "ZONA_TIT_ELEITOR", precision = 3, scale = 0)
	public Short getZonaTitEleitor() {
		return this.zonaTitEleitor;
	}

	public void setZonaTitEleitor(Short zonaTitEleitor) {
		this.zonaTitEleitor = zonaTitEleitor;
	}

	@Column(name = "SECAO_TIT_ELEITOR", precision = 3, scale = 0)
	public Short getSecaoTitEleitor() {
		return this.secaoTitEleitor;
	}

	public void setSecaoTitEleitor(Short secaoTitEleitor) {
		this.secaoTitEleitor = secaoTitEleitor;
	}

	@Column(name = "DDD_FONE_RESIDENCIAL", precision = 4, scale = 0)
	public Short getDddFoneResidencial() {
		return this.dddFoneResidencial;
	}

	public void setDddFoneResidencial(Short dddFoneResidencial) {
		this.dddFoneResidencial = dddFoneResidencial;
	}

	@Column(name = "FONE_RESIDENCIAL", precision = 10, scale = 0)
	public Long getFoneResidencial() {
		return this.foneResidencial;
	}

	public void setFoneResidencial(Long foneResidencial) {
		this.foneResidencial = foneResidencial;
	}

	@Column(name = "RAMAL_FONE_RESIDENCIAL", precision = 6, scale = 0)
	public Integer getRamalFoneResidencial() {
		return this.ramalFoneResidencial;
	}

	public void setRamalFoneResidencial(Integer ramalFoneResidencial) {
		this.ramalFoneResidencial = ramalFoneResidencial;
	}

	@Column(name = "DDD_FONE_CELULAR", precision = 4, scale = 0)
	public Short getDddFoneCelular() {
		return this.dddFoneCelular;
	}

	public void setDddFoneCelular(Short dddFoneCelular) {
		this.dddFoneCelular = dddFoneCelular;
	}

	@Column(name = "FONE_CELULAR", precision = 10, scale = 0)
	public Long getFoneCelular() {
		return this.foneCelular;
	}

	public void setFoneCelular(Long foneCelular) {
		this.foneCelular = foneCelular;
	}

	@Column(name = "DDD_FONE_PAGER_BIP", precision = 4, scale = 0)
	public Short getDddFonePagerBip() {
		return this.dddFonePagerBip;
	}

	public void setDddFonePagerBip(Short dddFonePagerBip) {
		this.dddFonePagerBip = dddFonePagerBip;
	}

	@Column(name = "FONE_PAGER_BIP", precision = 10, scale = 0)
	public Long getFonePagerBip() {
		return this.fonePagerBip;
	}

	public void setFonePagerBip(Long fonePagerBip) {
		this.fonePagerBip = fonePagerBip;
	}

	@Column(name = "NRO_PAGER_BIP", length = 15)
	public String getNroPagerBip() {
		return this.nroPagerBip;
	}

	public void setNroPagerBip(String nroPagerBip) {
		this.nroPagerBip = nroPagerBip;
	}

	@Email
	@Column(name = "EMAIL_PARTICULAR", length = 45)
	// @Length(max = 45)
	public String getEmailParticular() {
		return this.emailParticular;
	}

	public void setEmailParticular(String emailParticular) {
		this.emailParticular = emailParticular;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM")
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pessoaFisica")
	public Set<RapServidores> getRapServidoreses() {
		return this.rapServidoreses;
	}

	public void setRapServidoreses(Set<RapServidores> rapServidoreses) {
		this.rapServidoreses = rapServidoreses;
	}

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "PES_CODIGO", referencedColumnName = "CODIGO")
	public Set<RapQualificacao> getQualificacoes() {
		return this.qualificacoes;
	}

	public void setQualificacoes(Set<RapQualificacao> qualificacoes) {
		this.qualificacoes = qualificacoes;
	}

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "PES_CODIGO", referencedColumnName = "CODIGO")
	public List<RapPessoaTipoInformacoes> getTipoInformacao() {
	return tipoInformacao;
	}

	public void setTipoInformacao(List<RapPessoaTipoInformacoes> tipoInformacao) {
		this.tipoInformacao = tipoInformacao;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.codigo).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (!(other instanceof RapPessoasFisicas)) {
			return false;
		}
		RapPessoasFisicas castOther = (RapPessoasFisicas) other;
		return new EqualsBuilder().append(this.codigo, castOther.getCodigo())
				.isEquals();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("codigo", this.codigo)
				.toString();
	}

	public enum Fields {

		NOME("nome")
		, CODIGO("codigo")
		, PAC_CODIGO("aipPacientes.codigo")
		, PACIENTE("aipPacientes")
		, NOME_USUAL("nomeUsual")
		, QUALIFICACOES("qualificacoes")
		, CPF("cpf")
		, CDD_CODIGO("aipCidades.codigo"),
		MATRICULAS("rapServidoreses")
		, SEXO("sexo")
		, SER_MATRICULA("rapServidores.id.matricula")
		,SER_VIN_CODIGO("rapServidores.id.vinCodigo")
		, RAP_SERVIDORESES("rapServidoreses")
		, SERVIDOR("rapServidores")
		,TIPO_INFORMACAO("tipoInformacao")
		,PRONTUARIO("pacProntuario")
		,CIDADE("aipCidades")
		, BAIRRO_CEP_LOGRADOURO("aipBairrosCepLogradouro")
		,NACIONALIDADE("aipNacionalidades")
		,UF_SIGLA("aipUfs")
		,NR_IDENTIDADE("nroIdentidade");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}

	public void setNumeroDependentes(Integer numeroDependentes) {
		this.numeroDependentes = numeroDependentes;
	}

	@Transient
	public Integer getNumeroDependentes() {
		return numeroDependentes;
	}
	
	@Transient
	public boolean temDependentes() {
		return numeroDependentes > 0;
	}
	
	public void setPermiteDependentes(boolean permiteDependentes) {
		this.permiteDependentes = permiteDependentes;
	}

	@Transient
	public boolean isPermiteDependentes() {
		return permiteDependentes;
	}
	
	/**
	 * ORADB Function RAPC_BUSC_NOME_USUAL
	 * Corresponde à função buscarNomeUsual da Classe PesquisaInternacaoRN
	 */
	@Transient
	public String getNomeUsualOuNome() {		
		return StringUtils.isBlank(getNomeUsual()) ? getNome() : getNomeUsual();		
	}

	@Transient
	public String getNomeTrunc(Long size){
		return StringUtil.trunc(this.getNome(), Boolean.TRUE, size);
	}
	
	@PrePersist
	@PreUpdate
	@SuppressWarnings("unused")
	private void validacoes() {
		if (this.ramalFoneResidencial != null &&  this.foneResidencial == null) {
			throw new BaseRuntimeException(
					RapPessoasFisicasExceptionCode.RAP_PES_CK4);
		}
		if (this.dddFoneResidencial != null &&  this.foneResidencial == null) {
			throw new BaseRuntimeException(
					RapPessoasFisicasExceptionCode.RAP_PES_CK5);
		}
		if (this.dddFoneCelular != null &&  this.foneCelular == null) {
			throw new BaseRuntimeException(
					RapPessoasFisicasExceptionCode.RAP_PES_CK6);
		}
		if (this.dddFonePagerBip != null &&  this.fonePagerBip == null) {
			throw new BaseRuntimeException(
					RapPessoasFisicasExceptionCode.RAP_PES_CK7);
		}
	}
	
	private enum RapPessoasFisicasExceptionCode implements BusinessExceptionCode {
		RAP_PES_CK4, RAP_PES_CK5, RAP_PES_CK6, RAP_PES_CK7
	}
}
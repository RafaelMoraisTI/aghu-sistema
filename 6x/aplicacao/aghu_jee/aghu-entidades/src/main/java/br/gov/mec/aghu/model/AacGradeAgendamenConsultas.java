package br.gov.mec.aghu.model;

// Generated 16/12/2009 16:08:27 by Hibernate Tools 3.2.5.Beta

import java.util.Date;
import java.util.HashSet;
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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AacGradeAgendamenConsultas generated by hbm2java
 */
@Entity
@SequenceGenerator(name="aacGrdSq1", sequenceName="AGH.AAC_GRD_SQ1", allocationSize = 1)
@Table(name = "AAC_GRADE_AGENDAMEN_CONSULTAS", schema = "AGH")
@org.hibernate.annotations.Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.TRANSACTIONAL)
public class AacGradeAgendamenConsultas extends BaseEntitySeq<Integer> implements java.io.Serializable {

	private static final long serialVersionUID = 8417772815960851524L;
	private Integer seq;
	private Integer version;
	private AacUnidFuncionalSalas aacUnidFuncionalSala;
	private VAacSiglaUnfSala siglaUnfSala;
	private Date criadoEm;
	private Boolean programada;
	private Integer convenioSus;
	private Boolean enviaSamis;
	private Boolean emiteTicket;
	private Boolean emiteBa;
	private Boolean procedimento;
	private AghEquipes equipe;
	private AghEspecialidades especialidade;
	private RapServidores servidor;
	private RapServidores servidorAlterado;
	private AghProfEspecialidades profEspecialidade;
	private RapServidores profServidor;
	private Date alteradoEm;
	private Date dtUltimaGeracao;
	private Boolean exigeProntuario;
	private Boolean indAvisaConsultaTurno;
	private Integer tempoAtendAnterior;
	private AelProjetoPesquisas projetoPesquisa;
	private String indRefCompleta;
	private AacCondicaoAtendimento condicaoAtendimento;
	private AacTipoAgendamento tipoAgendamento;
	private AacPagador pagador;
	private AacFormaAgendamento formaAgendamento;
	private Set<AacConsultas> aacConsultas = new HashSet<AacConsultas>(0);
	private Set<AacHorarioGradeConsulta> horarioGradeConsulta = new HashSet<AacHorarioGradeConsulta>(0);
	private Set<AacGradeSituacao> gradeSituacao = new HashSet<AacGradeSituacao>();
	private Set<AacGradeProcedHospitalar> gradeProcedimentosHospitalar = new HashSet<AacGradeProcedHospitalar>();
	private Set<AacCaracteristicaGrade> caracteristicaGrade = new HashSet<AacCaracteristicaGrade>();
	
	private AghUnidadesFuncionais unidadeFuncional;
	
	private Set<MamEmgEspecialidades> emgEspecialidades = new HashSet<MamEmgEspecialidades>();
	
	private Short uslSala;

	private Integer preSerMatricula;
	private Short preSerVinCodigo;
	
	private VRapPessoaServidor pessoaServidor;
	
	private DominioSituacao indSituacao;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gradeAgendamentoConsulta")
	//@JoinColumn(referencedColumnName="ESP_SEQ", name = "ESP_SEQ", nullable = false, insertable = false, updatable= false)
	public Set<MamEmgEspecialidades> getEmgEspecialidades() {
		return emgEspecialidades;
	}
	
	public void setEmgEspecialidades(Set<MamEmgEspecialidades> emgEspecialidades) {
		this.emgEspecialidades = emgEspecialidades;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USL_UNF_SEQ", referencedColumnName = "SEQ", nullable = false, insertable = false, updatable = false)
	public AghUnidadesFuncionais getUnidadeFuncional() {
		return unidadeFuncional;
	}
	
	public void setUnidadeFuncional(AghUnidadesFuncionais unidadeFuncional) {
		this.unidadeFuncional = unidadeFuncional;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aacGrdSq1")
	@Column(name = "SEQ", nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "USL_UNF_SEQ", referencedColumnName = "UNF_SEQ", nullable = false),
			@JoinColumn(name = "USL_SALA", referencedColumnName = "SALA", nullable = false) })
	public AacUnidFuncionalSalas getAacUnidFuncionalSala() {
		return this.aacUnidFuncionalSala;
	}

	public void setAacUnidFuncionalSala(
			AacUnidFuncionalSalas aacUnidFuncionalSala) {
		this.aacUnidFuncionalSala = aacUnidFuncionalSala;
	}



	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_PROGRAMADA", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getProgramada() {
		return this.programada;
	}

	public void setProgramada(Boolean programada) {
		this.programada = programada;
	}

	@Column(name = "IND_CONVENIO_SUS")
	public Integer getConvenioSus() {
		return this.convenioSus;
	}

	public void setConvenioSus(Integer convenioSus) {
		this.convenioSus = convenioSus;
	}

	@Column(name = "IND_ENVIA_SAMIS", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getEnviaSamis() {
		return this.enviaSamis;
	}

	public void setEnviaSamis(Boolean enviaSamis) {
		this.enviaSamis = enviaSamis;
	}

	@Column(name = "IND_EMITE_TICKET", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getEmiteTicket() {
		return this.emiteTicket;
	}

	public void setEmiteTicket(Boolean emiteTicket) {
		this.emiteTicket = emiteTicket;
	}

	@Column(name = "IND_EMITE_BA", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getEmiteBa() {
		return this.emiteBa;
	}

	public void setEmiteBa(Boolean emiteBa) {
		this.emiteBa = emiteBa;
	}

	@Column(name = "IND_PROCEDIMENTO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getProcedimento() {
		return this.procedimento;
	}

	public void setProcedimento(Boolean procedimento) {
		this.procedimento = procedimento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EQP_SEQ", nullable = false)
	public AghEquipes getEquipe() {
		return this.equipe;
	}

	public void setEquipe(AghEquipes equipe) {
		this.equipe = equipe;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ESP_SEQ", nullable = false)
	public AghEspecialidades getEspecialidade() {
		return this.especialidade;
	}

	public void setEspecialidade(AghEspecialidades especialidade) {
		this.especialidade = especialidade;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_ULTIMA_GERACAO", length = 7)
	public Date getDtUltimaGeracao() {
		return this.dtUltimaGeracao;
	}

	public void setDtUltimaGeracao(Date dtUltimaGeracao) {
		this.dtUltimaGeracao = dtUltimaGeracao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "PRE_SER_MATRICULA", referencedColumnName = "SER_MATRICULA"),
			@JoinColumn(name = "PRE_SER_VIN_CODIGO", referencedColumnName = "SER_VIN_CODIGO"),
			@JoinColumn(name = "PRE_ESP_SEQ", referencedColumnName = "ESP_SEQ") })
	public AghProfEspecialidades getProfEspecialidade() {
		return this.profEspecialidade;
	}

	public void setProfEspecialidade(AghProfEspecialidades profEspecialidade) {
		this.profEspecialidade = profEspecialidade;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}
	
	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA_ALTERADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ALTERADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorAlterado() {
		return this.servidorAlterado;
	}

	public void setServidorAlterado(RapServidores servidorAlterado) {
		this.servidorAlterado = servidorAlterado;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 7)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@Column(name = "IND_EXIGE_PRONTUARIO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getExigeProntuario() {
		return this.exigeProntuario;
	}

	public void setExigeProntuario(Boolean exigeProntuario) {
		this.exigeProntuario = exigeProntuario;
	}

	@Column(name = "IND_AVISA_CONSULTA_TURNO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndAvisaConsultaTurno() {
		return this.indAvisaConsultaTurno;
	}

	public void setIndAvisaConsultaTurno(Boolean indAvisaConsultaTurno) {
		this.indAvisaConsultaTurno = indAvisaConsultaTurno;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FAG_CAA_SEQ")
	public AacCondicaoAtendimento getCondicaoAtendimento() {
		return this.condicaoAtendimento;
	}

	public void setCondicaoAtendimento(AacCondicaoAtendimento condicaoAtendimento) {
		this.condicaoAtendimento = condicaoAtendimento;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FAG_TAG_SEQ")
	public AacTipoAgendamento getTipoAgendamento() {
		return this.tipoAgendamento;
	}

	public void setTipoAgendamento(AacTipoAgendamento tipoAgendamento) {
		this.tipoAgendamento = tipoAgendamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FAG_PGD_SEQ")
	public AacPagador getPagador() {
		return this.pagador;
	}
	
	public void setPagador(AacPagador pagador) {
		this.pagador = pagador;
	}

	@Column(name = "TEMPO_ATEND_ANTERIOR")
	public Integer getTempoAtendAnterior() {
		return this.tempoAtendAnterior;
	}

	public void setTempoAtendAnterior(Integer tempoAtendAnterior) {
		this.tempoAtendAnterior = tempoAtendAnterior;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PJQ_SEQ")
	public AelProjetoPesquisas getProjetoPesquisa() {
		return this.projetoPesquisa;
	}

	public void setProjetoPesquisa(AelProjetoPesquisas projetoPesquisa) {
		this.projetoPesquisa = projetoPesquisa;
	}

	@Column(name = "IND_REF_COMPLETA", length = 1)
	public String getIndRefCompleta() {
		return this.indRefCompleta;
	}

	public void setIndRefCompleta(String indRefCompleta) {
		this.indRefCompleta = indRefCompleta;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gradeAgendamenConsulta")
	public Set<AacConsultas> getAacConsultas() {
		return this.aacConsultas;
	}

	public void setAacConsultas(Set<AacConsultas> aacConsultas) {
		this.aacConsultas = aacConsultas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gradeAgendamentoConsulta")
	public Set<AacHorarioGradeConsulta> getHorarioGradeConsulta() {
		return this.horarioGradeConsulta;
	}

	public void setHorarioGradeConsulta(
			Set<AacHorarioGradeConsulta> horarioGradeConsulta) {
		this.horarioGradeConsulta = horarioGradeConsulta;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gradeAgendamentoConsulta")
	public Set<AacGradeSituacao> getGradeSituacao() {
		return this.gradeSituacao;
	}

	public void setGradeSituacao(Set<AacGradeSituacao> gradeSituacao) {
		this.gradeSituacao = gradeSituacao;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gradeAgendamentoConsulta")
	public Set<AacGradeProcedHospitalar> getGradeProcedimentosHospitalar() {
		return gradeProcedimentosHospitalar;
	}

	public void setGradeProcedimentosHospitalar(
			Set<AacGradeProcedHospitalar> gradeProcedimentosHospitalar) {
		this.gradeProcedimentosHospitalar = gradeProcedimentosHospitalar;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gradeAgendamentoConsulta")
	public Set<AacCaracteristicaGrade> getCaracteristicaGrade() {
		return caracteristicaGrade;
	}

	public void setCaracteristicaGrade(
			Set<AacCaracteristicaGrade> caracteristicaGrade) {
		this.caracteristicaGrade = caracteristicaGrade;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "FAG_CAA_SEQ", referencedColumnName = "CAA_SEQ", insertable=false, updatable=false),
			@JoinColumn(name = "FAG_TAG_SEQ", referencedColumnName = "TAG_SEQ", insertable=false, updatable=false),
			@JoinColumn(name = "FAG_PGD_SEQ", referencedColumnName = "PGD_SEQ", insertable=false, updatable=false)})
	public AacFormaAgendamento getFormaAgendamento() {
		return formaAgendamento;
	}

	public void setFormaAgendamento(AacFormaAgendamento formaAgendamento) {
		this.formaAgendamento = formaAgendamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "PRE_SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = true, insertable = false, updatable = false),
			@JoinColumn(name = "PRE_SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = true, insertable = false, updatable = false) })
	public RapServidores getProfServidor() {
		return profServidor;
	}

	public void setProfServidor(RapServidores profServidor) {
		this.profServidor = profServidor;
	}

	public enum Fields {
		SEQ("seq"), ESP_SEQ("especialidade.seq"), IND_PROGRAMADA("programada"), AAC_UND_FUNC_ID_SALA(
				"aacUnidFuncionalSala.id.sala"), AAC_UND_FUNC_SALA_UNF_SEQ(
				"aacUnidFuncionalSala.id.unfSeq"), IND_ENVIA_SAMIS("enviaSamis"), IND_PROCEDIMENTO(
				"procedimento"), V_AAC_SIGLA_UNF_SALA("siglaUnfSala"), AAC_UND_FUNC_SALA(
				"aacUnidFuncionalSala"), AAC_UND_FUNC_SALA_UND_FUNC(
				"aacUnidFuncionalSala.unidadeFuncional"), AAC_CONSULTA(
				"aacConsultas"), AAC_GRADE_SITUACAO("gradeSituacao"), CRIADO_EM(
				"criadoEm"), EQP_SEQ("equipe.seq"), PRE_SER_MATRICULA(
				"profEspecialidade.id.serMatricula"), PRE_SER_VIN_CODIGO(
				"profEspecialidade.id.serVinCodigo"), PRE_ESP_SEQ(
				"profEspecialidade.id.espSeq"), PJQ_SEQ("projetoPesquisa.seq"), AAC_HORARIO_GRADE_CONSULTAS(
				"horarioGradeConsulta"), ESPECIALIDADE("especialidade"), DT_ULTIMA_GERACAO(
				"dtUltimaGeracao"), PROJETO_PESQUISA("projetoPesquisa"), CONDICAO_ATENDIMENTO(
				"condicaoAtendimento"), TIPO_AGENDAMENTO("tipoAgendamento"), PAGADOR(
				"pagador"), EQUIPE("equipe"), EQUIPE_NOME("equipe.nome"),UNIDADE_FUNCIONAL("unidadeFuncional"),
				IND_SITUACAO("indSituacao"),
				USLSALA("uslSala"),
				PROF_ESPECIALIDADE("profEspecialidade"), 
				PROF_ESPECIALIDADE_SERVIDOR("profEspecialidade.rapServidor"),
				PROF_ESPECIALIDADE_SERVIDOR_PESSOA_FISICA("profEspecialidade.rapServidor.pessoaFisica"),
				GRADE_PROCEDIMENTOS_HOSPITALAR("gradeProcedimentosHospitalar"),
				
				
				FORMA_AGENDAMENTO("formaAgendamento"), USL_UNF_SEQ(
				"aacUnidFuncionalSala.id.unfSeq"), USL_SALA(
				"aacUnidFuncionalSala.id.sala"), FAG_CAA_SEQ(
				"formaAgendamento.id.caaSeq"), FAG_TAG_SEQ(
				"formaAgendamento.id.tagSeq"), FAG_PGD_SEQ(
				"formaAgendamento.id.pgdSeq"), PROF_SERVIDOR("profServidor"), EQUIPE_SERVIDOR(
				"equipe.rapServidores"), EMERGENCIA_ESPECIALIDADES(
				"emgEspecialidades"), SERVIDOR("servidor"), SERVIDOR_ALTERADO("servidorAlterado"),
				PRE_SER_MATRICULA_COD("preSerMatricula"), PRE_SER_VIN_COD("preSerVinCodigo")
				, PESSOA_SERVIDOR("pessoaServidor");
		;

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}
	
	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	// FIXME: Essa mapeamento da View foi feito com a intenção de melhorar o
//	// desempenho da pesquisa.
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "USL_UNF_SEQ", referencedColumnName = "UNF_SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "USL_SALA", referencedColumnName = "SALA", nullable = false, insertable = false, updatable = false) })	
	public VAacSiglaUnfSala getSiglaUnfSala() {
		return siglaUnfSala;
	}

	public void setSiglaUnfSala(VAacSiglaUnfSala siglaUnfSala) {
		this.siglaUnfSala = siglaUnfSala;
	}

	
	@Column(name="USL_SALA", insertable=false, updatable=false)
	public Short getUslSala() {
		return uslSala;
	}

	public void setUslSala(Short uslSala) {
		this.uslSala = uslSala;
	}

	@Column(name = "PRE_SER_MATRICULA", insertable=false, updatable=false)
	public Integer getPreSerMatricula() {
		return preSerMatricula;
	}
	
	public void setPreSerMatricula(Integer preSerMatricula) {
		this.preSerMatricula = preSerMatricula;
	}

	@Column(name = "PRE_SER_VIN_CODIGO", insertable=false, updatable=false)
	public Short getPreSerVinCodigo() {
		return preSerVinCodigo;
	}

	public void setPreSerVinCodigo(Short preSerVinCodigo) {
		this.preSerVinCodigo = preSerVinCodigo;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "PRE_SER_MATRICULA", referencedColumnName = "SER_MATRICULA", nullable = true, insertable = false, updatable = false),
			@JoinColumn(name = "PRE_SER_VIN_CODIGO", referencedColumnName = "SER_VIN_CODIGO", nullable = true, insertable = false, updatable = false) })
	public VRapPessoaServidor getPessoaServidor() {
		return pessoaServidor;
	}
	
	public void setPessoaServidor(VRapPessoaServidor pessoaServidor) {
		this.pessoaServidor = pessoaServidor;
	}
		
	@Column(name = "IND_SITUACAO",nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return indSituacao;
	}
	
	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
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
		if (!(obj instanceof AacGradeAgendamenConsultas)) {
			return false;
		}
		AacGradeAgendamenConsultas other = (AacGradeAgendamenConsultas) obj;
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

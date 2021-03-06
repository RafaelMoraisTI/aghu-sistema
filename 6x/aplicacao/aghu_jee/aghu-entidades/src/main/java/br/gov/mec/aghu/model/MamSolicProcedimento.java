package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
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


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MamSolicProcedimento generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mamSprSq1", sequenceName="AGH.MAM_SPR_SQ1", allocationSize = 1)
@Table(name = "MAM_SOLIC_PROCEDIMENTOS", schema = "AGH")
public class MamSolicProcedimento extends BaseEntitySeq<Long> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -949368508622973032L;
	private Long seq;
	private Integer version;
	private RapServidores rapServidoresByMamSprSerFk3;
	private MamSolicProcedimento mamSolicProcedimento;
	private AacConsultas aacConsultas;
	
	private RapServidores rapServidoresByMamSprSerFk1;
	private MamTipoSolProcedimento mamTipoSolProcedimento;
	private RapServidores rapServidoresByMamSprSerFk4;
	private AipPacientes aipPacientes;
	private String descricao;
	private String justificativa;
	private Short nroVias;
	private Date dthrCriacao;
	private Date dthrValida;
	private Date dthrMvto;
	private Date dthrValidaMvto;
	private String indPendente;
	private String indImpresso;
	private Integer serMatriculaValida;
	private Short serVinCodigoValida;
	private Set<MamSolicProcedimento> mamSolicProcedimentoes = new HashSet<MamSolicProcedimento>(0);
	private Integer conNumero;
	
	public MamSolicProcedimento() {
	}

	public MamSolicProcedimento(Long seq, RapServidores rapServidoresByMamSprSerFk1, MamTipoSolProcedimento mamTipoSolProcedimento,
			AipPacientes aipPacientes, String descricao, Date dthrCriacao, String indPendente, String indImpresso) {
		this.seq = seq;
		this.rapServidoresByMamSprSerFk1 = rapServidoresByMamSprSerFk1;
		this.mamTipoSolProcedimento = mamTipoSolProcedimento;
		this.aipPacientes = aipPacientes;
		this.descricao = descricao;
		this.dthrCriacao = dthrCriacao;
		this.indPendente = indPendente;
		this.indImpresso = indImpresso;
	}

	public MamSolicProcedimento(Long seq, RapServidores rapServidoresByMamSprSerFk3, MamSolicProcedimento mamSolicProcedimento,
			AacConsultas aacConsultas, RapServidores rapServidoresByMamSprSerFk1, MamTipoSolProcedimento mamTipoSolProcedimento,
			RapServidores rapServidoresByMamSprSerFk4, AipPacientes aipPacientes, String descricao, String justificativa,
			Short nroVias, Date dthrCriacao, Date dthrValida, Date dthrMvto, Date dthrValidaMvto, String indPendente,
			String indImpresso, Integer serMatriculaValida, Short serVinCodigoValida,
			Set<MamSolicProcedimento> mamSolicProcedimentoes) {
		this.seq = seq;
		this.rapServidoresByMamSprSerFk3 = rapServidoresByMamSprSerFk3;
		this.mamSolicProcedimento = mamSolicProcedimento;
		this.aacConsultas = aacConsultas;
		this.rapServidoresByMamSprSerFk1 = rapServidoresByMamSprSerFk1;
		this.mamTipoSolProcedimento = mamTipoSolProcedimento;
		this.rapServidoresByMamSprSerFk4 = rapServidoresByMamSprSerFk4;
		this.aipPacientes = aipPacientes;
		this.descricao = descricao;
		this.justificativa = justificativa;
		this.nroVias = nroVias;
		this.dthrCriacao = dthrCriacao;
		this.dthrValida = dthrValida;
		this.dthrMvto = dthrMvto;
		this.dthrValidaMvto = dthrValidaMvto;
		this.indPendente = indPendente;
		this.indImpresso = indImpresso;
		this.serMatriculaValida = serMatriculaValida;
		this.serVinCodigoValida = serVinCodigoValida;
		this.mamSolicProcedimentoes = mamSolicProcedimentoes;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mamSprSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Long getSeq() {
		return this.seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_MVTO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_MVTO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByMamSprSerFk3() {
		return this.rapServidoresByMamSprSerFk3;
	}

	public void setRapServidoresByMamSprSerFk3(RapServidores rapServidoresByMamSprSerFk3) {
		this.rapServidoresByMamSprSerFk3 = rapServidoresByMamSprSerFk3;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SPR_SEQ")
	public MamSolicProcedimento getMamSolicProcedimento() {
		return this.mamSolicProcedimento;
	}

	public void setMamSolicProcedimento(MamSolicProcedimento mamSolicProcedimento) {
		this.mamSolicProcedimento = mamSolicProcedimento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CON_NUMERO")
	public AacConsultas getAacConsultas() {
		return this.aacConsultas;
	}

	public void setAacConsultas(AacConsultas aacConsultas) {
		this.aacConsultas = aacConsultas;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidoresByMamSprSerFk1() {
		return this.rapServidoresByMamSprSerFk1;
	}

	public void setRapServidoresByMamSprSerFk1(RapServidores rapServidoresByMamSprSerFk1) {
		this.rapServidoresByMamSprSerFk1 = rapServidoresByMamSprSerFk1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TLP_SEQ", nullable = false)
	public MamTipoSolProcedimento getMamTipoSolProcedimento() {
		return this.mamTipoSolProcedimento;
	}

	public void setMamTipoSolProcedimento(MamTipoSolProcedimento mamTipoSolProcedimento) {
		this.mamTipoSolProcedimento = mamTipoSolProcedimento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_VALIDA_MVTO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_VALIDA_MVTO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByMamSprSerFk4() {
		return this.rapServidoresByMamSprSerFk4;
	}

	public void setRapServidoresByMamSprSerFk4(RapServidores rapServidoresByMamSprSerFk4) {
		this.rapServidoresByMamSprSerFk4 = rapServidoresByMamSprSerFk4;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PAC_CODIGO", nullable = false)
	public AipPacientes getAipPacientes() {
		return this.aipPacientes;
	}

	public void setAipPacientes(AipPacientes aipPacientes) {
		this.aipPacientes = aipPacientes;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 2000)
	@Length(max = 2000)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "JUSTIFICATIVA", length = 2000)
	@Length(max = 2000)
	public String getJustificativa() {
		return this.justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	@Column(name = "NRO_VIAS")
	public Short getNroVias() {
		return this.nroVias;
	}

	public void setNroVias(Short nroVias) {
		this.nroVias = nroVias;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_CRIACAO", nullable = false, length = 29)
	public Date getDthrCriacao() {
		return this.dthrCriacao;
	}

	public void setDthrCriacao(Date dthrCriacao) {
		this.dthrCriacao = dthrCriacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_VALIDA", length = 29)
	public Date getDthrValida() {
		return this.dthrValida;
	}

	public void setDthrValida(Date dthrValida) {
		this.dthrValida = dthrValida;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_MVTO", length = 29)
	public Date getDthrMvto() {
		return this.dthrMvto;
	}

	public void setDthrMvto(Date dthrMvto) {
		this.dthrMvto = dthrMvto;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_VALIDA_MVTO", length = 29)
	public Date getDthrValidaMvto() {
		return this.dthrValidaMvto;
	}

	public void setDthrValidaMvto(Date dthrValidaMvto) {
		this.dthrValidaMvto = dthrValidaMvto;
	}

	@Column(name = "IND_PENDENTE", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndPendente() {
		return this.indPendente;
	}

	public void setIndPendente(String indPendente) {
		this.indPendente = indPendente;
	}

	@Column(name = "IND_IMPRESSO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndImpresso() {
		return this.indImpresso;
	}

	public void setIndImpresso(String indImpresso) {
		this.indImpresso = indImpresso;
	}

	@Column(name = "SER_MATRICULA_VALIDA")
	public Integer getSerMatriculaValida() {
		return this.serMatriculaValida;
	}

	public void setSerMatriculaValida(Integer serMatriculaValida) {
		this.serMatriculaValida = serMatriculaValida;
	}

	@Column(name = "SER_VIN_CODIGO_VALIDA")
	public Short getSerVinCodigoValida() {
		return this.serVinCodigoValida;
	}

	public void setSerVinCodigoValida(Short serVinCodigoValida) {
		this.serVinCodigoValida = serVinCodigoValida;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mamSolicProcedimento")
	public Set<MamSolicProcedimento> getMamSolicProcedimentoes() {
		return this.mamSolicProcedimentoes;
	}

	public void setMamSolicProcedimentoes(Set<MamSolicProcedimento> mamSolicProcedimentoes) {
		this.mamSolicProcedimentoes = mamSolicProcedimentoes;
	}

	@Column(name = "CON_NUMERO",insertable=false, updatable=false)
	public Integer getConNumero() {
		return conNumero;
	}

	public void setConNumero(Integer conNumero) {
		this.conNumero = conNumero;
	}
	
	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_SERVIDORES_BY_MAM_SPR_SER_FK3("rapServidoresByMamSprSerFk3"),
		MAM_SOLIC_PROCEDIMENTOS("mamSolicProcedimento"),
		AAC_CONSULTAS("aacConsultas"),
		RAP_SERVIDORES_BY_MAM_SPR_SER_FK1("rapServidoresByMamSprSerFk1"),
		MAM_TIPO_SOL_PROCEDIMENTOS("mamTipoSolProcedimento"),
		RAP_SERVIDORES_BY_MAM_SPR_SER_FK4("rapServidoresByMamSprSerFk4"),
		AIP_PACIENTES("aipPacientes"),
		DESCRICAO("descricao"),
		JUSTIFICATIVA("justificativa"),
		NRO_VIAS("nroVias"),
		DTHR_CRIACAO("dthrCriacao"),
		DTHR_VALIDA("dthrValida"),
		DTHR_MVTO("dthrMvto"),
		DTHR_VALIDA_MVTO("dthrValidaMvto"),
		IND_PENDENTE("indPendente"),
		IND_IMPRESSO("indImpresso"),
		SER_MATRICULA_VALIDA("serMatriculaValida"),
		SER_VIN_CODIGO_VALIDA("serVinCodigoValida"),
		MAM_SOLIC_PROCEDIMENTOES("mamSolicProcedimentoes"),
		CON_NUMERO("conNumero");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

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
		if (!(obj instanceof MamSolicProcedimento)) {
			return false;
		}
		MamSolicProcedimento other = (MamSolicProcedimento) obj;
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

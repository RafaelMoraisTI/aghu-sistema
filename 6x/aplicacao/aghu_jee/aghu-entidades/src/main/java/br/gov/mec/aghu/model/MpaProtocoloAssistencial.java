package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

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
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioTipoProtocoAssistencial;
import br.gov.mec.aghu.core.exception.BaseRuntimeException;
import br.gov.mec.aghu.core.exception.BusinessExceptionCode;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MpaProtocoloAssistencial generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mpaPtaSq1", sequenceName="AGH.MPA_PTA_SQ1", allocationSize = 1)
@Table(name = "MPA_PROTOCOLO_ASSISTENCIAIS", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = "titulo"))
public class MpaProtocoloAssistencial extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4415217666336283370L;
	private Short seq;
	private Integer version;
	private AghEspecialidades aghEspecialidades;
	private FatProcedHospInternos fatProcedHospInternos;
	private RapServidores rapServidores;
	private MpaProtocoloAssistencial mpaProtocoloAssistencial;
	private Date criadoEm;
	private String titulo;
	private DominioTipoProtocoAssistencial tipo;
	private String abreviatura;
	private String sigla;
	private Date tempo;
	private Set<MpaProtocoloAssistencial> mpaProtocoloAssistenciales = new HashSet<MpaProtocoloAssistencial>(0);
	private Set<MpaVersaoProtAssistencial> mpaVersaoProtAssistenciales = new HashSet<MpaVersaoProtAssistencial>(0);

	public MpaProtocoloAssistencial() {
	}

	public MpaProtocoloAssistencial(Short seq, RapServidores rapServidores, Date criadoEm, String titulo) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.criadoEm = criadoEm;
		this.titulo = titulo;
	}

	public MpaProtocoloAssistencial(Short seq, AghEspecialidades aghEspecialidades, FatProcedHospInternos fatProcedHospInternos,
			RapServidores rapServidores, MpaProtocoloAssistencial mpaProtocoloAssistencial, Date criadoEm, String titulo,
			DominioTipoProtocoAssistencial tipo, String abreviatura, String sigla, Date tempo, Set<MpaProtocoloAssistencial> mpaProtocoloAssistenciales,
			Set<MpaVersaoProtAssistencial> mpaVersaoProtAssistenciales) {
		this.seq = seq;
		this.aghEspecialidades = aghEspecialidades;
		this.fatProcedHospInternos = fatProcedHospInternos;
		this.rapServidores = rapServidores;
		this.mpaProtocoloAssistencial = mpaProtocoloAssistencial;
		this.criadoEm = criadoEm;
		this.titulo = titulo;
		this.tipo = tipo;
		this.abreviatura = abreviatura;
		this.sigla = sigla;
		this.tempo = tempo;
		this.mpaProtocoloAssistenciales = mpaProtocoloAssistenciales;
		this.mpaVersaoProtAssistenciales = mpaVersaoProtAssistenciales;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mpaPtaSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
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
	@JoinColumn(name = "ESP_SEQ")
	public AghEspecialidades getAghEspecialidades() {
		return this.aghEspecialidades;
	}

	public void setAghEspecialidades(AghEspecialidades aghEspecialidades) {
		this.aghEspecialidades = aghEspecialidades;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PHI_SEQ")
	public FatProcedHospInternos getFatProcedHospInternos() {
		return this.fatProcedHospInternos;
	}

	public void setFatProcedHospInternos(FatProcedHospInternos fatProcedHospInternos) {
		this.fatProcedHospInternos = fatProcedHospInternos;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PTA_SEQ")
	public MpaProtocoloAssistencial getMpaProtocoloAssistencial() {
		return this.mpaProtocoloAssistencial;
	}

	public void setMpaProtocoloAssistencial(MpaProtocoloAssistencial mpaProtocoloAssistencial) {
		this.mpaProtocoloAssistencial = mpaProtocoloAssistencial;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "TITULO", unique = true, nullable = false, length = 120)
	@Length(max = 120)
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Column(name = "TIPO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioTipoProtocoAssistencial getTipo() {
		return this.tipo;
	}

	public void setTipo(DominioTipoProtocoAssistencial tipo) {
		this.tipo = tipo;
	}

	@Column(name = "ABREVIATURA", length = 20)
	@Length(max = 20)
	public String getAbreviatura() {
		return this.abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	@Column(name = "SIGLA", length = 5)
	@Length(max = 5)
	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TEMPO", length = 29)
	public Date getTempo() {
		return this.tempo;
	}

	public void setTempo(Date tempo) {
		this.tempo = tempo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mpaProtocoloAssistencial")
	public Set<MpaProtocoloAssistencial> getMpaProtocoloAssistenciales() {
		return this.mpaProtocoloAssistenciales;
	}

	public void setMpaProtocoloAssistenciales(Set<MpaProtocoloAssistencial> mpaProtocoloAssistenciales) {
		this.mpaProtocoloAssistenciales = mpaProtocoloAssistenciales;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mpaProtocoloAssistencial")
	public Set<MpaVersaoProtAssistencial> getMpaVersaoProtAssistenciales() {
		return this.mpaVersaoProtAssistenciales;
	}

	public void setMpaVersaoProtAssistenciales(Set<MpaVersaoProtAssistencial> mpaVersaoProtAssistenciales) {
		this.mpaVersaoProtAssistenciales = mpaVersaoProtAssistenciales;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		AGH_ESPECIALIDADES("aghEspecialidades"),
		FAT_PROCED_HOSP_INTERNOS("fatProcedHospInternos"),
		RAP_SERVIDORES("rapServidores"),
		MPA_PROTOCOLO_ASSISTENCIAIS("mpaProtocoloAssistencial"),
		CRIADO_EM("criadoEm"),
		TITULO("titulo"),
		TIPO("tipo"),
		ABREVIATURA("abreviatura"),
		SIGLA("sigla"),
		TEMPO("tempo"),
		MPA_PROTOCOLO_ASSISTENCIALES("mpaProtocoloAssistenciales"),
		MPA_VERSAO_PROT_ASSISTENCIALES("mpaVersaoProtAssistenciales");

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
		if (!(obj instanceof MpaProtocoloAssistencial)) {
			return false;
		}
		MpaProtocoloAssistencial other = (MpaProtocoloAssistencial) obj;
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
	
	@PrePersist
	@PreUpdate
	@SuppressWarnings("unused")
	private void validacoes() {
		if (this.mpaProtocoloAssistencial != null && this.mpaProtocoloAssistencial.getSeq() == this.getSeq()) {
			throw new BaseRuntimeException(
					MpaProtocoloAssistencialExceptionCode.mpa_pta_ck3);
		}
		
		if (this.tipo != DominioTipoProtocoAssistencial.D && this.fatProcedHospInternos == null){
			throw new BaseRuntimeException(
					MpaProtocoloAssistencialExceptionCode.mpa_pta_ck4);
		}
	}
	
	private enum MpaProtocoloAssistencialExceptionCode implements BusinessExceptionCode {
		mpa_pta_ck3, mpa_pta_ck4
	}

}

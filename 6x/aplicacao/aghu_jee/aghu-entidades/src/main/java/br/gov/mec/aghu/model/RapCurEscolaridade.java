package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;


import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityCodigo;

/**
 * RapCurEscolaridade generated by hbm2java
 */
@Entity
@Table(name = "RAP_CUR_ESCOLARIDADES", schema = "AGH")
public class RapCurEscolaridade extends BaseEntityCodigo<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -774362209855838133L;
	private Integer pesCodigo;
	private Integer version;
	private RapServidores rapServidores;
	private RapPessoasFisicas rapPessoasFisicas;
	private String primGrau;
	private Short seriePrimGrau;
	private String segGrau;
	private Short serieSegGrau;
	private Date anoConclusao;
	private String cursoProfissionalizante;
	private String nomeCurso;
	private String instituicao;
	private String conselhoProf;
	private String nroRegConselho;
	private Date alteradoEm;

	public RapCurEscolaridade() {
	}

	public RapCurEscolaridade(RapPessoasFisicas rapPessoasFisicas, String primGrau, String segGrau, String cursoProfissionalizante) {
		this.rapPessoasFisicas = rapPessoasFisicas;
		this.primGrau = primGrau;
		this.segGrau = segGrau;
		this.cursoProfissionalizante = cursoProfissionalizante;
	}

	public RapCurEscolaridade(RapServidores rapServidores, RapPessoasFisicas rapPessoasFisicas, String primGrau, Short seriePrimGrau,
			String segGrau, Short serieSegGrau, Date anoConclusao, String cursoProfissionalizante, String nomeCurso,
			String instituicao, String conselhoProf, String nroRegConselho, Date alteradoEm) {
		this.rapServidores = rapServidores;
		this.rapPessoasFisicas = rapPessoasFisicas;
		this.primGrau = primGrau;
		this.seriePrimGrau = seriePrimGrau;
		this.segGrau = segGrau;
		this.serieSegGrau = serieSegGrau;
		this.anoConclusao = anoConclusao;
		this.cursoProfissionalizante = cursoProfissionalizante;
		this.nomeCurso = nomeCurso;
		this.instituicao = instituicao;
		this.conselhoProf = conselhoProf;
		this.nroRegConselho = nroRegConselho;
		this.alteradoEm = alteradoEm;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "rapPessoasFisicas"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "PES_CODIGO", unique = true, nullable = false)
	public Integer getPesCodigo() {
		return this.pesCodigo;
	}

	public void setPesCodigo(Integer pesCodigo) {
		this.pesCodigo = pesCodigo;
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public RapPessoasFisicas getRapPessoasFisicas() {
		return this.rapPessoasFisicas;
	}

	public void setRapPessoasFisicas(RapPessoasFisicas rapPessoasFisicas) {
		this.rapPessoasFisicas = rapPessoasFisicas;
	}

	@Column(name = "PRIM_GRAU", nullable = false, length = 2)
	@Length(max = 2)
	public String getPrimGrau() {
		return this.primGrau;
	}

	public void setPrimGrau(String primGrau) {
		this.primGrau = primGrau;
	}

	@Column(name = "SERIE_PRIM_GRAU")
	public Short getSeriePrimGrau() {
		return this.seriePrimGrau;
	}

	public void setSeriePrimGrau(Short seriePrimGrau) {
		this.seriePrimGrau = seriePrimGrau;
	}

	@Column(name = "SEG_GRAU", nullable = false, length = 2)
	@Length(max = 2)
	public String getSegGrau() {
		return this.segGrau;
	}

	public void setSegGrau(String segGrau) {
		this.segGrau = segGrau;
	}

	@Column(name = "SERIE_SEG_GRAU")
	public Short getSerieSegGrau() {
		return this.serieSegGrau;
	}

	public void setSerieSegGrau(Short serieSegGrau) {
		this.serieSegGrau = serieSegGrau;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ANO_CONCLUSAO", length = 29)
	public Date getAnoConclusao() {
		return this.anoConclusao;
	}

	public void setAnoConclusao(Date anoConclusao) {
		this.anoConclusao = anoConclusao;
	}

	@Column(name = "CURSO_PROFISSIONALIZANTE", nullable = false, length = 1)
	@Length(max = 1)
	public String getCursoProfissionalizante() {
		return this.cursoProfissionalizante;
	}

	public void setCursoProfissionalizante(String cursoProfissionalizante) {
		this.cursoProfissionalizante = cursoProfissionalizante;
	}

	@Column(name = "NOME_CURSO", length = 60)
	@Length(max = 60)
	public String getNomeCurso() {
		return this.nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	@Column(name = "INSTITUICAO", length = 60)
	@Length(max = 60)
	public String getInstituicao() {
		return this.instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	@Column(name = "CONSELHO_PROF", length = 15)
	@Length(max = 15)
	public String getConselhoProf() {
		return this.conselhoProf;
	}

	public void setConselhoProf(String conselhoProf) {
		this.conselhoProf = conselhoProf;
	}

	@Column(name = "NRO_REG_CONSELHO", length = 9)
	@Length(max = 9)
	public String getNroRegConselho() {
		return this.nroRegConselho;
	}

	public void setNroRegConselho(String nroRegConselho) {
		this.nroRegConselho = nroRegConselho;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	public enum Fields {

		PES_CODIGO("pesCodigo"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		RAP_PESSOAS_FISICAS("rapPessoasFisicas"),
		PRIM_GRAU("primGrau"),
		SERIE_PRIM_GRAU("seriePrimGrau"),
		SEG_GRAU("segGrau"),
		SERIE_SEG_GRAU("serieSegGrau"),
		ANO_CONCLUSAO("anoConclusao"),
		CURSO_PROFISSIONALIZANTE("cursoProfissionalizante"),
		NOME_CURSO("nomeCurso"),
		INSTITUICAO("instituicao"),
		CONSELHO_PROF("conselhoProf"),
		NRO_REG_CONSELHO("nroRegConselho"),
		ALTERADO_EM("alteradoEm");

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
		result = prime * result + ((getPesCodigo() == null) ? 0 : getPesCodigo().hashCode());
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
		if (!(obj instanceof RapCurEscolaridade)) {
			return false;
		}
		RapCurEscolaridade other = (RapCurEscolaridade) obj;
		if (getPesCodigo() == null) {
			if (other.getPesCodigo() != null) {
				return false;
			}
		} else if (!getPesCodigo().equals(other.getPesCodigo())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####
 
 @Transient public Integer getCodigo(){ return this.getPesCodigo();} 
 public void setCodigo(Integer codigo){ this.setPesCodigo(codigo);}
}

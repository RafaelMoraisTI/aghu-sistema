package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MamDiagnosticoPreferido generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mamDipSq1", sequenceName="AGH.MAM_DIP_SQ1", allocationSize = 1)
@Table(name = "MAM_DIAGNOSTICO_PREFERIDOS", schema = "AGH")
public class MamDiagnosticoPreferido extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9215305673167134999L;
	private Integer seq;
	private Integer version;
	private AghCid aghCid;
	private RapServidores rapServidores;
	private String descricao;
	private String complemento;
	private String indSituacao;
	private Date criadoEm;
	private String indUsoInternacao;
	private String indUsoAmbulatorio;
	private String indUsoEmergencia;

	public MamDiagnosticoPreferido() {
	}

	public MamDiagnosticoPreferido(Integer seq, RapServidores rapServidores, String indSituacao, Date criadoEm, String indUsoInternacao,
			String indUsoAmbulatorio, String indUsoEmergencia) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
		this.indUsoInternacao = indUsoInternacao;
		this.indUsoAmbulatorio = indUsoAmbulatorio;
		this.indUsoEmergencia = indUsoEmergencia;
	}

	public MamDiagnosticoPreferido(Integer seq, AghCid aghCid, RapServidores rapServidores, String descricao, String complemento,
			String indSituacao, Date criadoEm, String indUsoInternacao, String indUsoAmbulatorio, String indUsoEmergencia) {
		this.seq = seq;
		this.aghCid = aghCid;
		this.rapServidores = rapServidores;
		this.descricao = descricao;
		this.complemento = complemento;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
		this.indUsoInternacao = indUsoInternacao;
		this.indUsoAmbulatorio = indUsoAmbulatorio;
		this.indUsoEmergencia = indUsoEmergencia;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mamDipSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
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
	@JoinColumn(name = "CID_SEQ")
	public AghCid getAghCid() {
		return this.aghCid;
	}

	public void setAghCid(AghCid aghCid) {
		this.aghCid = aghCid;
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

	@Column(name = "DESCRICAO", length = 300)
	@Length(max = 300)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "COMPLEMENTO", length = 45)
	@Length(max = 45)
	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_USO_INTERNACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndUsoInternacao() {
		return this.indUsoInternacao;
	}

	public void setIndUsoInternacao(String indUsoInternacao) {
		this.indUsoInternacao = indUsoInternacao;
	}

	@Column(name = "IND_USO_AMBULATORIO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndUsoAmbulatorio() {
		return this.indUsoAmbulatorio;
	}

	public void setIndUsoAmbulatorio(String indUsoAmbulatorio) {
		this.indUsoAmbulatorio = indUsoAmbulatorio;
	}

	@Column(name = "IND_USO_EMERGENCIA", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndUsoEmergencia() {
		return this.indUsoEmergencia;
	}

	public void setIndUsoEmergencia(String indUsoEmergencia) {
		this.indUsoEmergencia = indUsoEmergencia;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		AGH_CID("aghCid"),
		RAP_SERVIDORES("rapServidores"),
		DESCRICAO("descricao"),
		COMPLEMENTO("complemento"),
		IND_SITUACAO("indSituacao"),
		CRIADO_EM("criadoEm"),
		IND_USO_INTERNACAO("indUsoInternacao"),
		IND_USO_AMBULATORIO("indUsoAmbulatorio"),
		IND_USO_EMERGENCIA("indUsoEmergencia");

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
		if (!(obj instanceof MamDiagnosticoPreferido)) {
			return false;
		}
		MamDiagnosticoPreferido other = (MamDiagnosticoPreferido) obj;
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

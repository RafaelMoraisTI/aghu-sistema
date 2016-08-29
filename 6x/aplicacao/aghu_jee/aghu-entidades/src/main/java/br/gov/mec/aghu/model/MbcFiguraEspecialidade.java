package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MbcFiguraEspecialidade generated by hbm2java
 */
@Entity
@Table(name = "MBC_FIGURA_ESPECIALIDADES", schema = "AGH")
public class MbcFiguraEspecialidade extends BaseEntityId<MbcFiguraEspecialidadeId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2173319903906399274L;
	private MbcFiguraEspecialidadeId id;
	private Integer version;
	private AghEspecialidades aghEspecialidades;
	private RapServidores rapServidores;
	private MbcFigura mbcFigura;
	private DominioSituacao indSituacao;
	private Date criadoEm;
	private String titulo;

	public MbcFiguraEspecialidade() {
	}

	public MbcFiguraEspecialidade(MbcFiguraEspecialidadeId id, AghEspecialidades aghEspecialidades, RapServidores rapServidores,
			MbcFigura mbcFigura, DominioSituacao indSituacao, Date criadoEm) {
		this.id = id;
		this.aghEspecialidades = aghEspecialidades;
		this.rapServidores = rapServidores;
		this.mbcFigura = mbcFigura;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
	}

	public MbcFiguraEspecialidade(MbcFiguraEspecialidadeId id, AghEspecialidades aghEspecialidades, RapServidores rapServidores,
			MbcFigura mbcFigura, DominioSituacao indSituacao, Date criadoEm, String titulo) {
		this.id = id;
		this.aghEspecialidades = aghEspecialidades;
		this.rapServidores = rapServidores;
		this.mbcFigura = mbcFigura;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
		this.titulo = titulo;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "fiuSeq", column = @Column(name = "FIU_SEQ", nullable = false)),
			@AttributeOverride(name = "espSeq", column = @Column(name = "ESP_SEQ", nullable = false)) })
	public MbcFiguraEspecialidadeId getId() {
		return this.id;
	}

	public void setId(MbcFiguraEspecialidadeId id) {
		this.id = id;
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
	@JoinColumn(name = "ESP_SEQ", nullable = false, insertable = false, updatable = false)
	public AghEspecialidades getAghEspecialidades() {
		return this.aghEspecialidades;
	}

	public void setAghEspecialidades(AghEspecialidades aghEspecialidades) {
		this.aghEspecialidades = aghEspecialidades;
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
	@JoinColumn(name = "FIU_SEQ", nullable = false, insertable = false, updatable = false)
	public MbcFigura getMbcFigura() {
		return this.mbcFigura;
	}

	public void setMbcFigura(MbcFigura mbcFigura) {
		this.mbcFigura = mbcFigura;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
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

	@Column(name = "TITULO", length = 60)
	@Length(max = 60)
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		AGH_ESPECIALIDADES("aghEspecialidades"),
		RAP_SERVIDORES("rapServidores"),
		MBC_FIGURAS("mbcFigura"),
		IND_SITUACAO("indSituacao"),
		CRIADO_EM("criadoEm"),
		TITULO("titulo");

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
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
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
		if (!(obj instanceof MbcFiguraEspecialidade)) {
			return false;
		}
		MbcFiguraEspecialidade other = (MbcFiguraEspecialidade) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
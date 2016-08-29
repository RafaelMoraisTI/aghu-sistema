package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * FcpRetencaoAliquota generated by hbm2java
 */
@Entity
@Table(name = "FCP_RETENCAO_ALIQUOTAS", schema = "AGH")
public class FcpRetencaoAliquota extends BaseEntityId<FcpRetencaoAliquotaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2545666877043072794L;
	private FcpRetencaoAliquotaId id;
	private Integer version;
	private RapServidores rapServidores;
	private String descricao;
	private Float aliquota;
	private Date dtFinalValidade;
	private Date criadoEm;
	private Date alteradoEm;
	private Set<FcpValorTributos> fcpValorTributos = new HashSet<FcpValorTributos>(0);

	public FcpRetencaoAliquota() {
	}

	public FcpRetencaoAliquota(FcpRetencaoAliquotaId id, RapServidores rapServidores, String descricao, Float aliquota,
			Date criadoEm, Date alteradoEm) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.descricao = descricao;
		this.aliquota = aliquota;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
	}

	public FcpRetencaoAliquota(FcpRetencaoAliquotaId id, RapServidores rapServidores, String descricao, Float aliquota,
			Date dtFinalValidade, Date criadoEm, Date alteradoEm
			, Set<FcpValorTributos> fcpValorTributos
			) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.descricao = descricao;
		this.aliquota = aliquota;
		this.dtFinalValidade = dtFinalValidade;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
		this.fcpValorTributos = fcpValorTributos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "friCodigo", column = @Column(name = "FRI_CODIGO", nullable = false)),
			@AttributeOverride(name = "imposto", column = @Column(name = "IMPOSTO", nullable = false, length = 10)),
			@AttributeOverride(name = "numero", column = @Column(name = "NUMERO", nullable = false)),
			@AttributeOverride(name = "dtInicioValidade", column = @Column(name = "DT_INICIO_VALIDADE", nullable = false, length = 29)) })
	public FcpRetencaoAliquotaId getId() {
		return this.id;
	}

	public void setId(FcpRetencaoAliquotaId id) {
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "ALIQUOTA", nullable = false, precision = 8, scale = 8)
	public Float getAliquota() {
		return this.aliquota;
	}

	public void setAliquota(Float aliquota) {
		this.aliquota = aliquota;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FINAL_VALIDADE", length = 29)
	public Date getDtFinalValidade() {
		return this.dtFinalValidade;
	}

	public void setDtFinalValidade(Date dtFinalValidade) {
		this.dtFinalValidade = dtFinalValidade;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", nullable = false, length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "retencaoAliquota")
	public Set<FcpValorTributos> getFcpValorTributos() {
		return this.fcpValorTributos;
	}

	public void setFcpValorTributos(Set<FcpValorTributos> fcpValorTributos) {
		this.fcpValorTributos = fcpValorTributos;
	}

	public enum Fields {

		ID("id"),
		IMPOSTO("id.imposto"),
		FRI_CODIGO("id.friCodigo"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		DESCRICAO("descricao"),
		ALIQUOTA("aliquota"),
		DT_FINAL_VALIDADE("dtFinalValidade"),
		CRIADO_EM("criadoEm"),
		ALTERADO_EM("alteradoEm"),
		FCP_VALOR_TRIBUTOS("fcpValorTributos")
		;

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
		if (!(obj instanceof FcpRetencaoAliquota)) {
			return false;
		}
		FcpRetencaoAliquota other = (FcpRetencaoAliquota) obj;
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
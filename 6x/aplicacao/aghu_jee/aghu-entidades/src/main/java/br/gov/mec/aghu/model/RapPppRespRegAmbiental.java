package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * RapPppRespRegAmbiental generated by hbm2java
 */
@Entity
@Table(name = "RAP_PPP_RESPS_REG_AMBIENTAL", schema = "AGH")
public class RapPppRespRegAmbiental extends BaseEntityId<RapPppRespRegAmbientalId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4477166902095755713L;
	private RapPppRespRegAmbientalId id;
	private Integer version;
	private RapServidores rapServidoresByRapRraSerFk3;
	private RapServidores rapServidoresByRapRraSerFk1;
	private RapServidores rapServidoresByRapRraSerFk2;
	private Date dtFim;
	private Date criadoEm;
	private Date alteradoEm;

	public RapPppRespRegAmbiental() {
	}

	public RapPppRespRegAmbiental(RapPppRespRegAmbientalId id, RapServidores rapServidoresByRapRraSerFk1,
			RapServidores rapServidoresByRapRraSerFk2, Date criadoEm) {
		this.id = id;
		this.rapServidoresByRapRraSerFk1 = rapServidoresByRapRraSerFk1;
		this.rapServidoresByRapRraSerFk2 = rapServidoresByRapRraSerFk2;
		this.criadoEm = criadoEm;
	}

	public RapPppRespRegAmbiental(RapPppRespRegAmbientalId id, RapServidores rapServidoresByRapRraSerFk3,
			RapServidores rapServidoresByRapRraSerFk1, RapServidores rapServidoresByRapRraSerFk2, Date dtFim, Date criadoEm,
			Date alteradoEm) {
		this.id = id;
		this.rapServidoresByRapRraSerFk3 = rapServidoresByRapRraSerFk3;
		this.rapServidoresByRapRraSerFk1 = rapServidoresByRapRraSerFk1;
		this.rapServidoresByRapRraSerFk2 = rapServidoresByRapRraSerFk2;
		this.dtFim = dtFim;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "dtInicio", column = @Column(name = "DT_INICIO", nullable = false, length = 29)),
			@AttributeOverride(name = "serMatricula", column = @Column(name = "SER_MATRICULA", nullable = false)),
			@AttributeOverride(name = "serVinCodigo", column = @Column(name = "SER_VIN_CODIGO", nullable = false)) })
	public RapPppRespRegAmbientalId getId() {
		return this.id;
	}

	public void setId(RapPppRespRegAmbientalId id) {
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_ALTERADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ALTERADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByRapRraSerFk3() {
		return this.rapServidoresByRapRraSerFk3;
	}

	public void setRapServidoresByRapRraSerFk3(RapServidores rapServidoresByRapRraSerFk3) {
		this.rapServidoresByRapRraSerFk3 = rapServidoresByRapRraSerFk3;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false, insertable = false, updatable = false) })
	public RapServidores getRapServidoresByRapRraSerFk1() {
		return this.rapServidoresByRapRraSerFk1;
	}

	public void setRapServidoresByRapRraSerFk1(RapServidores rapServidoresByRapRraSerFk1) {
		this.rapServidoresByRapRraSerFk1 = rapServidoresByRapRraSerFk1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_CRIADO", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO_CRIADO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidoresByRapRraSerFk2() {
		return this.rapServidoresByRapRraSerFk2;
	}

	public void setRapServidoresByRapRraSerFk2(RapServidores rapServidoresByRapRraSerFk2) {
		this.rapServidoresByRapRraSerFk2 = rapServidoresByRapRraSerFk2;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FIM", length = 29)
	public Date getDtFim() {
		return this.dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
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
	@Column(name = "ALTERADO_EM", length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		RAP_SERVIDORES_BY_RAP_RRA_SER_FK3("rapServidoresByRapRraSerFk3"),
		RAP_SERVIDORES_BY_RAP_RRA_SER_FK1("rapServidoresByRapRraSerFk1"),
		RAP_SERVIDORES_BY_RAP_RRA_SER_FK2("rapServidoresByRapRraSerFk2"),
		DT_FIM("dtFim"),
		CRIADO_EM("criadoEm"),
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
		if (!(obj instanceof RapPppRespRegAmbiental)) {
			return false;
		}
		RapPppRespRegAmbiental other = (RapPppRespRegAmbiental) obj;
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

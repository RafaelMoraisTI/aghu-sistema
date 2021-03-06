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


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MptProcedimentoApac generated by hbm2java
 */
@Entity
@Table(name = "MPT_PROCEDIMENTO_APACS", schema = "AGH")
public class MptProcedimentoApac extends BaseEntityId<MptProcedimentoApacId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8138985170905168958L;
	private MptProcedimentoApacId id;
	private Integer version;
	private MptLaudo mptLaudo;
	private FatProcedHospInternos fatProcedHospInternos;
	private RapServidores rapServidores;
	private Date alteradoEm;
	private String indPrincipal;

	public MptProcedimentoApac() {
	}

	public MptProcedimentoApac(MptProcedimentoApacId id, MptLaudo mptLaudo, FatProcedHospInternos fatProcedHospInternos,
			RapServidores rapServidores, Date alteradoEm) {
		this.id = id;
		this.mptLaudo = mptLaudo;
		this.fatProcedHospInternos = fatProcedHospInternos;
		this.rapServidores = rapServidores;
		this.alteradoEm = alteradoEm;
	}

	public MptProcedimentoApac(MptProcedimentoApacId id, MptLaudo mptLaudo, FatProcedHospInternos fatProcedHospInternos,
			RapServidores rapServidores, Date alteradoEm, String indPrincipal) {
		this.id = id;
		this.mptLaudo = mptLaudo;
		this.fatProcedHospInternos = fatProcedHospInternos;
		this.rapServidores = rapServidores;
		this.alteradoEm = alteradoEm;
		this.indPrincipal = indPrincipal;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "lauTrpSeq", column = @Column(name = "LAU_TRP_SEQ", nullable = false)),
			@AttributeOverride(name = "lauSeqp", column = @Column(name = "LAU_SEQP", nullable = false)),
			@AttributeOverride(name = "phiSeq", column = @Column(name = "PHI_SEQ", nullable = false)) })
	public MptProcedimentoApacId getId() {
		return this.id;
	}

	public void setId(MptProcedimentoApacId id) {
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
	@JoinColumns({
			@JoinColumn(name = "LAU_TRP_SEQ", referencedColumnName = "TRP_SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "LAU_SEQP", referencedColumnName = "SEQP", nullable = false, insertable = false, updatable = false) })
	public MptLaudo getMptLaudo() {
		return this.mptLaudo;
	}

	public void setMptLaudo(MptLaudo mptLaudo) {
		this.mptLaudo = mptLaudo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PHI_SEQ", nullable = false, insertable = false, updatable = false)
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", nullable = false, length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@Column(name = "IND_PRINCIPAL", length = 1)
	@Length(max = 1)
	public String getIndPrincipal() {
		return this.indPrincipal;
	}

	public void setIndPrincipal(String indPrincipal) {
		this.indPrincipal = indPrincipal;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		MPT_LAUDOS("mptLaudo"),
		FAT_PROCED_HOSP_INTERNOS("fatProcedHospInternos"),
		RAP_SERVIDORES("rapServidores"),
		ALTERADO_EM("alteradoEm"),
		IND_PRINCIPAL("indPrincipal");

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
		if (!(obj instanceof MptProcedimentoApac)) {
			return false;
		}
		MptProcedimentoApac other = (MptProcedimentoApac) obj;
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

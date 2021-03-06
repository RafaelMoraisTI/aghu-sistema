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
 * RapRegistroServidor generated by hbm2java
 */
@Entity
@Table(name = "RAP_REGISTROS_SERVIDOR", schema = "AGH")
public class RapRegistroServidor extends BaseEntityId<RapRegistroServidorId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2496459439265642657L;
	private RapRegistroServidorId id;
	private Integer version;
	private RapServidores rapServidoresByRapRseSerFk3;
	private RapServidores rapServidoresByRapRseSerFk1;
	private RapServidores rapServidoresByRapRseSerFk2;
	private Date dtRegistro;
	private String registro;
	private Date criadoEm;
	private Date alteradoEm;
	private String indServidor;

	public RapRegistroServidor() {
	}

	public RapRegistroServidor(RapRegistroServidorId id, RapServidores rapServidoresByRapRseSerFk1,
			RapServidores rapServidoresByRapRseSerFk2, Date dtRegistro, String registro, Date criadoEm) {
		this.id = id;
		this.rapServidoresByRapRseSerFk1 = rapServidoresByRapRseSerFk1;
		this.rapServidoresByRapRseSerFk2 = rapServidoresByRapRseSerFk2;
		this.dtRegistro = dtRegistro;
		this.registro = registro;
		this.criadoEm = criadoEm;
	}

	public RapRegistroServidor(RapRegistroServidorId id, RapServidores rapServidoresByRapRseSerFk3,
			RapServidores rapServidoresByRapRseSerFk1, RapServidores rapServidoresByRapRseSerFk2, Date dtRegistro, String registro,
			Date criadoEm, Date alteradoEm, String indServidor) {
		this.id = id;
		this.rapServidoresByRapRseSerFk3 = rapServidoresByRapRseSerFk3;
		this.rapServidoresByRapRseSerFk1 = rapServidoresByRapRseSerFk1;
		this.rapServidoresByRapRseSerFk2 = rapServidoresByRapRseSerFk2;
		this.dtRegistro = dtRegistro;
		this.registro = registro;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
		this.indServidor = indServidor;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "serMatricula", column = @Column(name = "SER_MATRICULA", nullable = false)),
			@AttributeOverride(name = "serVinCodigo", column = @Column(name = "SER_VIN_CODIGO", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public RapRegistroServidorId getId() {
		return this.id;
	}

	public void setId(RapRegistroServidorId id) {
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
	public RapServidores getRapServidoresByRapRseSerFk3() {
		return this.rapServidoresByRapRseSerFk3;
	}

	public void setRapServidoresByRapRseSerFk3(RapServidores rapServidoresByRapRseSerFk3) {
		this.rapServidoresByRapRseSerFk3 = rapServidoresByRapRseSerFk3;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false, insertable = false, updatable = false) })
	public RapServidores getRapServidoresByRapRseSerFk1() {
		return this.rapServidoresByRapRseSerFk1;
	}

	public void setRapServidoresByRapRseSerFk1(RapServidores rapServidoresByRapRseSerFk1) {
		this.rapServidoresByRapRseSerFk1 = rapServidoresByRapRseSerFk1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_CRIADO", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO_CRIADO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidoresByRapRseSerFk2() {
		return this.rapServidoresByRapRseSerFk2;
	}

	public void setRapServidoresByRapRseSerFk2(RapServidores rapServidoresByRapRseSerFk2) {
		this.rapServidoresByRapRseSerFk2 = rapServidoresByRapRseSerFk2;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_REGISTRO", nullable = false, length = 29)
	public Date getDtRegistro() {
		return this.dtRegistro;
	}

	public void setDtRegistro(Date dtRegistro) {
		this.dtRegistro = dtRegistro;
	}

	@Column(name = "REGISTRO", nullable = false, length = 240)
	@Length(max = 240)
	public String getRegistro() {
		return this.registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
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

	@Column(name = "IND_SERVIDOR", length = 1)
	@Length(max = 1)
	public String getIndServidor() {
		return this.indServidor;
	}

	public void setIndServidor(String indServidor) {
		this.indServidor = indServidor;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		RAP_SERVIDORES_BY_RAP_RSE_SER_FK3("rapServidoresByRapRseSerFk3"),
		RAP_SERVIDORES_BY_RAP_RSE_SER_FK1("rapServidoresByRapRseSerFk1"),
		RAP_SERVIDORES_BY_RAP_RSE_SER_FK2("rapServidoresByRapRseSerFk2"),
		DT_REGISTRO("dtRegistro"),
		REGISTRO("registro"),
		CRIADO_EM("criadoEm"),
		ALTERADO_EM("alteradoEm"),
		IND_SERVIDOR("indServidor");

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
		if (!(obj instanceof RapRegistroServidor)) {
			return false;
		}
		RapRegistroServidor other = (RapRegistroServidor) obj;
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

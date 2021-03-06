package br.gov.mec.aghu.model;

// Generated 29/10/2009 20:34:47 by Hibernate Tools 3.2.5.Beta

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


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MpaUsoConsultorias generated by hbm2java
 */
@Entity
@Table(name = "MPA_USO_CONSULTORIAS", schema = "AGH")
public class MpaUsoConsultoria extends BaseEntityId<MpaUsoConsultoriaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3666344829165126838L;
	private MpaUsoConsultoriaId id;
	private RapServidores rapServidores;
	private Date criadoEm;
	private String indMarcada;
	private Set<MpaUsoOrdConsultoria> mpaUsoOrdConsultoriases = new HashSet<MpaUsoOrdConsultoria>(
			0);

	public MpaUsoConsultoria() {
	}

	public MpaUsoConsultoria(MpaUsoConsultoriaId id,
			RapServidores rapServidores, Date criadoEm, String indMarcada) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.criadoEm = criadoEm;
		this.indMarcada = indMarcada;
	}

	public MpaUsoConsultoria(MpaUsoConsultoriaId id,
			RapServidores rapServidores, Date criadoEm, String indMarcada,
			Set<MpaUsoOrdConsultoria> mpaUsoOrdConsultoriases) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.criadoEm = criadoEm;
		this.indMarcada = indMarcada;
		this.mpaUsoOrdConsultoriases = mpaUsoOrdConsultoriases;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "uspApaAtdSeq", column = @Column(name = "USP_APA_ATD_SEQ", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "uspApaSeq", column = @Column(name = "USP_APA_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "uspVpaPtaSeq", column = @Column(name = "USP_VPA_PTA_SEQ", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "uspVpaSeqp", column = @Column(name = "USP_VPA_SEQP", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "uspSeq", column = @Column(name = "USP_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "ccnCitVpaPtaSeq", column = @Column(name = "CCN_CIT_VPA_PTA_SEQ", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "ccnCitVpaSeqp", column = @Column(name = "CCN_CIT_VPA_SEQP", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "ccnCitSeqp", column = @Column(name = "CCN_CIT_SEQP", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "ccnSeqp", column = @Column(name = "CCN_SEQP", nullable = false, precision = 4, scale = 0)) })
	public MpaUsoConsultoriaId getId() {
		return this.id;
	}

	public void setId(MpaUsoConsultoriaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_MARCADA", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndMarcada() {
		return this.indMarcada;
	}

	public void setIndMarcada(String indMarcada) {
		this.indMarcada = indMarcada;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usoConsultoria")
	public Set<MpaUsoOrdConsultoria> getMpaUsoOrdConsultoriases() {
		return this.mpaUsoOrdConsultoriases;
	}

	public void setMpaUsoOrdConsultoriases(
			Set<MpaUsoOrdConsultoria> mpaUsoOrdConsultoriases) {
		this.mpaUsoOrdConsultoriases = mpaUsoOrdConsultoriases;
	}

	public enum Fields {

		ID("id"),
		RAP_SERVIDORES("rapServidores"),
		CRIADO_EM("criadoEm"),
		IND_MARCADA("indMarcada"),
		MPA_USO_ORD_CONSULTORIASES("mpaUsoOrdConsultoriases");

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
		if (!(obj instanceof MpaUsoConsultoria)) {
			return false;
		}
		MpaUsoConsultoria other = (MpaUsoConsultoria) obj;
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

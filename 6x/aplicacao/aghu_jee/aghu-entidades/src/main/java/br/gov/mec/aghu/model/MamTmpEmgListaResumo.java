package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.Type;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MamTmpEmgListaResumo generated by hbm2java
 */
@Entity
@Table(name = "MAM_TMP_EMG_LISTA_RESUMOS", schema = "AGH")
public class MamTmpEmgListaResumo extends BaseEntityId<MamTmpEmgListaResumoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8677482634648489364L;
	private MamTmpEmgListaResumoId id;
	private Integer version;
	private MamTmpEmgMinhaLista mamTmpEmgMinhaLista;
	private String resumoCaso;

	public MamTmpEmgListaResumo() {
	}

	public MamTmpEmgListaResumo(MamTmpEmgListaResumoId id, MamTmpEmgMinhaLista mamTmpEmgMinhaLista) {
		this.id = id;
		this.mamTmpEmgMinhaLista = mamTmpEmgMinhaLista;
	}

	public MamTmpEmgListaResumo(MamTmpEmgListaResumoId id, MamTmpEmgMinhaLista mamTmpEmgMinhaLista, String resumoCaso) {
		this.id = id;
		this.mamTmpEmgMinhaLista = mamTmpEmgMinhaLista;
		this.resumoCaso = resumoCaso;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "tm1Seq", column = @Column(name = "TM1_SEQ", nullable = false)),
			@AttributeOverride(name = "tm1Seqp", column = @Column(name = "TM1_SEQP", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public MamTmpEmgListaResumoId getId() {
		return this.id;
	}

	public void setId(MamTmpEmgListaResumoId id) {
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
			@JoinColumn(name = "TM1_SEQ", referencedColumnName = "SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "TM1_SEQP", referencedColumnName = "SEQP", nullable = false, insertable = false, updatable = false) })
	public MamTmpEmgMinhaLista getMamTmpEmgMinhaLista() {
		return this.mamTmpEmgMinhaLista;
	}

	public void setMamTmpEmgMinhaLista(MamTmpEmgMinhaLista mamTmpEmgMinhaLista) {
		this.mamTmpEmgMinhaLista = mamTmpEmgMinhaLista;
	}

	@Lob
	@Type(type="text")
	@Column(name = "RESUMO_CASO")
	public String getResumoCaso() {
		return this.resumoCaso;
	}

	public void setResumoCaso(String resumoCaso) {
		this.resumoCaso = resumoCaso;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		MAM_TMP_EMG_MINHA_LISTAS("mamTmpEmgMinhaLista"),
		RESUMO_CASO("resumoCaso");

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
		if (!(obj instanceof MamTmpEmgListaResumo)) {
			return false;
		}
		MamTmpEmgListaResumo other = (MamTmpEmgListaResumo) obj;
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

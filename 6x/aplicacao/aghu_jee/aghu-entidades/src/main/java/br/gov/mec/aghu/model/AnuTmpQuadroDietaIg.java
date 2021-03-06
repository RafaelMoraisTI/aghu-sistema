package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AnuTmpQuadroDietaIg generated by hbm2java
 */
@Entity
@Table(name = "ANU_TMP_QUADRO_DIETAS_IG", schema = "AGH")
public class AnuTmpQuadroDietaIg extends BaseEntityId<AnuTmpQuadroDietaIgId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4184826241652603310L;
	private AnuTmpQuadroDietaIgId id;

	public AnuTmpQuadroDietaIg() {
	}

	public AnuTmpQuadroDietaIg(AnuTmpQuadroDietaIgId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "atdSeq", column = @Column(name = "ATD_SEQ")),
			@AttributeOverride(name = "gqdSeq", column = @Column(name = "GQD_SEQ")),
			@AttributeOverride(name = "unfSeq", column = @Column(name = "UNF_SEQ")),
			@AttributeOverride(name = "profissional", column = @Column(name = "PROFISSIONAL", length = 9)),
			@AttributeOverride(name = "espSeq", column = @Column(name = "ESP_SEQ")),
			@AttributeOverride(name = "gpgCodigo", column = @Column(name = "GPG_CODIGO")),
			@AttributeOverride(name = "cpgCodigo", column = @Column(name = "CPG_CODIGO")),
			@AttributeOverride(name = "hauSeq", column = @Column(name = "HAU_SEQ")),
			@AttributeOverride(name = "refSeq", column = @Column(name = "REF_SEQ")),
			@AttributeOverride(name = "tipo", column = @Column(name = "TIPO", length = 15)),
			@AttributeOverride(name = "total", column = @Column(name = "TOTAL", nullable = false)),
			@AttributeOverride(name = "dtCompetencia", column = @Column(name = "DT_COMPETENCIA", length = 29)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public AnuTmpQuadroDietaIgId getId() {
		return this.id;
	}

	public void setId(AnuTmpQuadroDietaIgId id) {
		this.id = id;
	}

	public enum Fields {

		ID("id");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}

}

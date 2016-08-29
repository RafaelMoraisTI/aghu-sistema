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
 * AghEmail generated by hbm2java
 */
@Entity
@Table(name = "AGH_EMAIL", schema = "AGH")
public class AghEmail extends BaseEntityId<AghEmailId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8323138591867123911L;
	private AghEmailId id;

	public AghEmail() {
	}

	public AghEmail(AghEmailId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "PTipoMens", column = @Column(name = "P_TIPO_MENS", length = 1)),
			@AttributeOverride(name = "PArqOuTexto", column = @Column(name = "P_ARQ_OU_TEXTO", length = 4000)),
			@AttributeOverride(name = "PAssunto", column = @Column(name = "P_ASSUNTO", length = 200)),
			@AttributeOverride(name = "PEmails", column = @Column(name = "P_EMAILS", length = 1000)),
			@AttributeOverride(name = "PData", column = @Column(name = "P_DATA", length = 29)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public AghEmailId getId() {
		return this.id;
	}

	public void setId(AghEmailId id) {
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
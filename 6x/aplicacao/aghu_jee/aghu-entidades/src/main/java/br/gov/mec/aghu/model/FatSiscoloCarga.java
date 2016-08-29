package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * FatSiscoloCargas generated by hbm2java
 */
@Entity
@Table(name = "FAT_SISCOLO_CARGAS", schema = "AGH")
public class FatSiscoloCarga extends BaseEntityId<FatSiscoloCargaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2756013192306708529L;
	private FatSiscoloCargaId id;

	public FatSiscoloCarga() {
	}

	public FatSiscoloCarga(FatSiscoloCargaId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "numSolic", column = @Column(name = "NUM_SOLIC", length = 15)),
			@AttributeOverride(name = "nomePaciente", column = @Column(name = "NOME_PACIENTE", length = 50)),
			@AttributeOverride(name = "prontuario", column = @Column(name = "PRONTUARIO", length = 10)),
			@AttributeOverride(name = "dtLiberacao", column = @Column(name = "DT_LIBERACAO", nullable = false, length = 10)) })
	public FatSiscoloCargaId getId() {
		return this.id;
	}

	public void setId(FatSiscoloCargaId id) {
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
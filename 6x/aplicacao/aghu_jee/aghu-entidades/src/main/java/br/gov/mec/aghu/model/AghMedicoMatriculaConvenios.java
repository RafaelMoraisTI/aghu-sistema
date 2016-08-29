package br.gov.mec.aghu.model;

// Generated 15/04/2011 14:20:50 by Hibernate Tools 3.3.0.GA

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AghMedicoMatriculaConvenios generated by hbm2java
 */

@Entity
@Table(name = "AGH_MEDICO_MATRICULA_CONVENIOS", schema = "AGH")
public class AghMedicoMatriculaConvenios extends BaseEntityId<AghMedicoMatriculaConveniosId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8781874931085179234L;
	private AghMedicoMatriculaConveniosId id;
	private Integer version;
	private Long matricula;
	private String situacao;

	public AghMedicoMatriculaConvenios() {
	}

	public AghMedicoMatriculaConvenios(AghMedicoMatriculaConveniosId id,
			Long matricula, String situacao) {
		this.id = id;
		this.matricula = matricula;
		this.situacao = situacao;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "mexSeq", column = @Column(name = "MEX_SEQ", nullable = false)),
			@AttributeOverride(name = "cnvCodigo", column = @Column(name = "CNV_CODIGO", nullable = false)) })
	public AghMedicoMatriculaConveniosId getId() {
		return this.id;
	}

	public void setId(AghMedicoMatriculaConveniosId id) {
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

	@Column(name = "MATRICULA", nullable = false)
	public Long getMatricula() {
		return this.matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	@Column(name = "SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getSituacao() {
		return this.situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	public enum Fields {
		MEX_SEQ("id.mexSeq");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
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
		if (!(obj instanceof AghMedicoMatriculaConvenios)) {
			return false;
		}
		AghMedicoMatriculaConvenios other = (AghMedicoMatriculaConvenios) obj;
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
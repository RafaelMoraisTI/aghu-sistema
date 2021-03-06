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
 * CseUsuarioUbs generated by hbm2java
 */
@Entity
@Table(name = "CSE_USUARIOS_UBS", schema = "AGH")
public class CseUsuarioUbs extends BaseEntityId<CseUsuarioUbsId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7986627539646701030L;
	private CseUsuarioUbsId id;

	public CseUsuarioUbs() {
	}

	public CseUsuarioUbs(CseUsuarioUbsId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "ID", length = 30)),
			@AttributeOverride(name = "criadoPor", column = @Column(name = "CRIADO_POR", length = 30)),
			@AttributeOverride(name = "criadoEm", column = @Column(name = "CRIADO_EM", length = 29)),
			@AttributeOverride(name = "tpuCodigo", column = @Column(name = "TPU_CODIGO", length = 2)),
			@AttributeOverride(name = "serMatricula", column = @Column(name = "SER_MATRICULA")),
			@AttributeOverride(name = "serVinCodigo", column = @Column(name = "SER_VIN_CODIGO")),
			@AttributeOverride(name = "exibeLista", column = @Column(name = "EXIBE_LISTA", length = 1)),
			@AttributeOverride(name = "senhaInicial", column = @Column(name = "SENHA_INICIAL", length = 30)),
			@AttributeOverride(name = "criaUserRede", column = @Column(name = "CRIA_USER_REDE", length = 1)),
			@AttributeOverride(name = "consisteRede", column = @Column(name = "CONSISTE_REDE", length = 1)),
			@AttributeOverride(name = "indMultiploLogon", column = @Column(name = "IND_MULTIPLO_LOGON", length = 1)),
			@AttributeOverride(name = "timeout", column = @Column(name = "TIMEOUT")),
			@AttributeOverride(name = "assinadoEm", column = @Column(name = "ASSINADO_EM", length = 29)),
			@AttributeOverride(name = "geradoEmailEm", column = @Column(name = "GERADO_EMAIL_EM", length = 29)),
			@AttributeOverride(name = "desabilitaNtEmailEm", column = @Column(name = "DESABILITA_NT_EMAIL_EM", length = 29)),
			@AttributeOverride(name = "excluiEmailEm", column = @Column(name = "EXCLUI_EMAIL_EM", length = 29)),
			@AttributeOverride(name = "categoriaFavoritos", column = @Column(name = "CATEGORIA_FAVORITOS", length = 1)),
			@AttributeOverride(name = "gueSeq", column = @Column(name = "GUE_SEQ")),
			@AttributeOverride(name = "trocaSenhaEm", column = @Column(name = "TROCA_SENHA_EM", length = 29)),
			@AttributeOverride(name = "expiradoEm", column = @Column(name = "EXPIRADO_EM", length = 29)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public CseUsuarioUbsId getId() {
		return this.id;
	}

	public void setId(CseUsuarioUbsId id) {
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
		if (!(obj instanceof CseUsuarioUbs)) {
			return false;
		}
		CseUsuarioUbs other = (CseUsuarioUbs) obj;
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

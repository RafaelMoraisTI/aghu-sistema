package br.gov.mec.aghu.model;

// Generated 26/02/2010 17:37:25 by Hibernate Tools 3.2.5.Beta

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

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * McoPlanoIniciais generated by hbm2java
 */
@Entity
@Table(name = "MCO_PLANO_INICIAIS", schema = "AGH")
public class McoPlanoIniciais extends BaseEntityId<McoPlanoIniciaisId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1155834267874913901L;
	private McoPlanoIniciaisId id;
	private McoAnamneseEfs mcoAnamneseEfs;
	private String complemento;
	private Date criadoEm;
	private Integer serMatricula;
	private Short serVinCodigo;
	private McoConduta conduta;

	public McoPlanoIniciais() {
	}

	public McoPlanoIniciais(McoPlanoIniciaisId id,
			McoAnamneseEfs mcoAnamneseEfs, Date criadoEm, Integer serMatricula,
			Short serVinCodigo) {
		this.id = id;
		this.mcoAnamneseEfs = mcoAnamneseEfs;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}

	public McoPlanoIniciais(McoPlanoIniciaisId id,
			McoAnamneseEfs mcoAnamneseEfs, String complemento, Date criadoEm,
			Integer serMatricula, Short serVinCodigo) {
		this.id = id;
		this.mcoAnamneseEfs = mcoAnamneseEfs;
		this.complemento = complemento;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "efiGsoPacCodigo", column = @Column(name = "EFI_GSO_PAC_CODIGO", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "efiGsoSeqp", column = @Column(name = "EFI_GSO_SEQP", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "efiConNumero", column = @Column(name = "EFI_CON_NUMERO", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "cdtSeq", column = @Column(name = "CDT_SEQ", nullable = false, precision = 22, scale = 0)) })
	public McoPlanoIniciaisId getId() {
		return this.id;
	}

	public void setId(McoPlanoIniciaisId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "EFI_GSO_PAC_CODIGO", referencedColumnName = "GSO_PAC_CODIGO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "EFI_GSO_SEQP", referencedColumnName = "GSO_SEQP", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "EFI_CON_NUMERO", referencedColumnName = "CON_NUMERO", nullable = false, insertable = false, updatable = false) })
	public McoAnamneseEfs getMcoAnamneseEfs() {
		return this.mcoAnamneseEfs;
	}

	public void setMcoAnamneseEfs(McoAnamneseEfs mcoAnamneseEfs) {
		this.mcoAnamneseEfs = mcoAnamneseEfs;
	}

	@Column(name = "COMPLEMENTO", length = 2000)
	@Length(max = 2000)
	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "SER_MATRICULA", nullable = false, precision = 7, scale = 0)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CDT_SEQ", nullable = false, insertable = false, updatable = false)
	public McoConduta getConduta() {
		return conduta;
	}

	public void setConduta(McoConduta conduta) {
		this.conduta = conduta;
	}
	public enum Fields {
		CODIGO_PACIENTE("id.efiGsoPacCodigo"), 
		SEQUENCE("id.efiGsoSeqp"),
		CON_NUMERO("id.efiConNumero"),
		CONDUTA("conduta"),   
		COMPLEMENTO("complemento");		

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
		if (!(obj instanceof McoPlanoIniciais)) {
			return false;
		}
		McoPlanoIniciais other = (McoPlanoIniciais) obj;
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

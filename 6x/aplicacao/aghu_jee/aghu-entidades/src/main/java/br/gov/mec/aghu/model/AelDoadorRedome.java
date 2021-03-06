package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AelDoadorRedome generated by hbm2java
 */
@Entity
@SequenceGenerator(name="aelDorSq1", sequenceName="AGH.AEL_DOR_SQ1", allocationSize = 1)
@Table(name = "AEL_DOADOR_REDOMES", schema = "AGH", uniqueConstraints = { @UniqueConstraint(columnNames = "pac_codigo"),
		@UniqueConstraint(columnNames = { "codigo_hemocentro", "lae_seq" }) })
public class AelDoadorRedome extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5769091138464826406L;
	private Integer seq;
	private Integer version;
	private AelCampanha aelCampanha;
	private String codigoHemocentro;
	private Integer codigoRedome;
	private String situacao;
	private Date dataColeta;
	private Integer pacCodigo;
	private Integer laeSeq;
	private Date criadoEm;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Date alteradoEm;
	private Integer serMatriculaAlterado;
	private Short serVinCodigoAlterado;
	private String contato1;
	private Short dddFoneContato1;
	private Long foneContato1;
	private String contato2;
	private Short dddFoneContato2;
	private Long foneContato2;
	private String fumante;
	private Set<AelExtratoDoador> aelExtratoDoador = new HashSet<AelExtratoDoador>(0);

	public AelDoadorRedome() {
	}

	public AelDoadorRedome(Integer seq, String codigoHemocentro, Date dataColeta, Integer pacCodigo, Integer laeSeq, Date criadoEm,
			Integer serMatricula, Short serVinCodigo) {
		this.seq = seq;
		this.codigoHemocentro = codigoHemocentro;
		this.dataColeta = dataColeta;
		this.pacCodigo = pacCodigo;
		this.laeSeq = laeSeq;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}

	public AelDoadorRedome(Integer seq, AelCampanha aelCampanha, String codigoHemocentro, Integer codigoRedome, String situacao,
			Date dataColeta, Integer pacCodigo, Integer laeSeq, Date criadoEm, Integer serMatricula, Short serVinCodigo, Date alteradoEm,
			Integer serMatriculaAlterado, Short serVinCodigoAlterado, String contato1, Short dddFoneContato1, Long foneContato1,
			String contato2, Short dddFoneContato2, Long foneContato2, String fumante, Set<AelExtratoDoador> aelExtratoDoador) {
		this.seq = seq;
		this.aelCampanha = aelCampanha;
		this.codigoHemocentro = codigoHemocentro;
		this.codigoRedome = codigoRedome;
		this.situacao = situacao;
		this.dataColeta = dataColeta;
		this.pacCodigo = pacCodigo;
		this.laeSeq = laeSeq;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.alteradoEm = alteradoEm;
		this.serMatriculaAlterado = serMatriculaAlterado;
		this.serVinCodigoAlterado = serVinCodigoAlterado;
		this.contato1 = contato1;
		this.dddFoneContato1 = dddFoneContato1;
		this.foneContato1 = foneContato1;
		this.contato2 = contato2;
		this.dddFoneContato2 = dddFoneContato2;
		this.foneContato2 = foneContato2;
		this.fumante = fumante;
		this.aelExtratoDoador = aelExtratoDoador;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelDorSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
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
	@JoinColumn(name = "CAMP_CODIGO")
	public AelCampanha getAelCampanha() {
		return this.aelCampanha;
	}

	public void setAelCampanha(AelCampanha aelCampanha) {
		this.aelCampanha = aelCampanha;
	}

	@Column(name = "CODIGO_HEMOCENTRO", nullable = false, length = 15)
	@Length(max = 15)
	public String getCodigoHemocentro() {
		return this.codigoHemocentro;
	}

	public void setCodigoHemocentro(String codigoHemocentro) {
		this.codigoHemocentro = codigoHemocentro;
	}

	@Column(name = "CODIGO_REDOME")
	public Integer getCodigoRedome() {
		return this.codigoRedome;
	}

	public void setCodigoRedome(Integer codigoRedome) {
		this.codigoRedome = codigoRedome;
	}

	@Column(name = "SITUACAO", length = 3)
	@Length(max = 3)
	public String getSituacao() {
		return this.situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_COLETA", nullable = false, length = 29)
	public Date getDataColeta() {
		return this.dataColeta;
	}

	public void setDataColeta(Date dataColeta) {
		this.dataColeta = dataColeta;
	}

	@Column(name = "PAC_CODIGO", unique = true, nullable = false)
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "LAE_SEQ", nullable = false)
	public Integer getLaeSeq() {
		return this.laeSeq;
	}

	public void setLaeSeq(Integer laeSeq) {
		this.laeSeq = laeSeq;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "SER_MATRICULA", nullable = false)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@Column(name = "SER_MATRICULA_ALTERADO")
	public Integer getSerMatriculaAlterado() {
		return this.serMatriculaAlterado;
	}

	public void setSerMatriculaAlterado(Integer serMatriculaAlterado) {
		this.serMatriculaAlterado = serMatriculaAlterado;
	}

	@Column(name = "SER_VIN_CODIGO_ALTERADO")
	public Short getSerVinCodigoAlterado() {
		return this.serVinCodigoAlterado;
	}

	public void setSerVinCodigoAlterado(Short serVinCodigoAlterado) {
		this.serVinCodigoAlterado = serVinCodigoAlterado;
	}

	@Column(name = "CONTATO_1", length = 50)
	@Length(max = 50)
	public String getContato1() {
		return this.contato1;
	}

	public void setContato1(String contato1) {
		this.contato1 = contato1;
	}

	@Column(name = "DDD_FONE_CONTATO_1")
	public Short getDddFoneContato1() {
		return this.dddFoneContato1;
	}

	public void setDddFoneContato1(Short dddFoneContato1) {
		this.dddFoneContato1 = dddFoneContato1;
	}

	@Column(name = "FONE_CONTATO_1")
	public Long getFoneContato1() {
		return this.foneContato1;
	}

	public void setFoneContato1(Long foneContato1) {
		this.foneContato1 = foneContato1;
	}

	@Column(name = "CONTATO_2", length = 50)
	@Length(max = 50)
	public String getContato2() {
		return this.contato2;
	}

	public void setContato2(String contato2) {
		this.contato2 = contato2;
	}

	@Column(name = "DDD_FONE_CONTATO_2")
	public Short getDddFoneContato2() {
		return this.dddFoneContato2;
	}

	public void setDddFoneContato2(Short dddFoneContato2) {
		this.dddFoneContato2 = dddFoneContato2;
	}

	@Column(name = "FONE_CONTATO_2")
	public Long getFoneContato2() {
		return this.foneContato2;
	}

	public void setFoneContato2(Long foneContato2) {
		this.foneContato2 = foneContato2;
	}

	@Column(name = "FUMANTE", length = 1)
	@Length(max = 1)
	public String getFumante() {
		return this.fumante;
	}

	public void setFumante(String fumante) {
		this.fumante = fumante;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "aelDoadorRedome")
	public Set<AelExtratoDoador> getAelExtratoDoador() {
		return this.aelExtratoDoador;
	}

	public void setAelExtratoDoador(Set<AelExtratoDoador> aelExtratoDoador) {
		this.aelExtratoDoador = aelExtratoDoador;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		AEL_CAMPANHAS("aelCampanha"),
		CODIGO_HEMOCENTRO("codigoHemocentro"),
		CODIGO_REDOME("codigoRedome"),
		SITUACAO("situacao"),
		DATA_COLETA("dataColeta"),
		PAC_CODIGO("pacCodigo"),
		LAE_SEQ("laeSeq"),
		CRIADO_EM("criadoEm"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		ALTERADO_EM("alteradoEm"),
		SER_MATRICULA_ALTERADO("serMatriculaAlterado"),
		SER_VIN_CODIGO_ALTERADO("serVinCodigoAlterado"),
		CONTATO1("contato1"),
		DDD_FONE_CONTATO1("dddFoneContato1"),
		FONE_CONTATO1("foneContato1"),
		CONTATO2("contato2"),
		DDD_FONE_CONTATO2("dddFoneContato2"),
		FONE_CONTATO2("foneContato2"),
		FUMANTE("fumante"),
		AEL_EXTRATO_DOADORES("aelExtratoDoador");

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
		result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
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
		if (!(obj instanceof AelDoadorRedome)) {
			return false;
		}
		AelDoadorRedome other = (AelDoadorRedome) obj;
		if (getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}

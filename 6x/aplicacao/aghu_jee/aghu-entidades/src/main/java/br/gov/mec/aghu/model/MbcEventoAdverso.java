package br.gov.mec.aghu.model;

// Generated 28/03/2012 15:17:44 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MbcEventoAdversos generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mbcEadSq1", sequenceName="AGH.MBC_EAD_SQ1", allocationSize = 1)
@Table(name = "MBC_EVENTO_ADVERSOS", schema = "AGH")
public class MbcEventoAdverso extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5219404168334184320L;
	private Short seq;
	private Integer version;
	private String nome;
	private String nomeReduzido;
	private DominioSituacao situacao;
	private RapServidores servidor;
	private Date criadoEm;
	private Set<MbcFichaEvento> mbcFichaEventoses = new HashSet<MbcFichaEvento>(
			0);

	public MbcEventoAdverso() {
	}

	public MbcEventoAdverso(Short seq, String nome, String nomeReduzido,
			DominioSituacao situacao, RapServidores servidor, Date criadoEm) {
		this.seq = seq;
		this.nome = nome;
		this.nomeReduzido = nomeReduzido;
		this.situacao = situacao;
		this.setServidor(servidor);
		this.criadoEm = criadoEm;
	}

	public MbcEventoAdverso(Short seq, String nome, String nomeReduzido,
			DominioSituacao situacao, RapServidores servidor,
			Date criadoEm, Set<MbcFichaEvento> mbcFichaEventoses) {
		this.seq = seq;
		this.nome = nome;
		this.nomeReduzido = nomeReduzido;
		this.situacao = situacao;
		this.setServidor(servidor);
		this.criadoEm = criadoEm;
		this.mbcFichaEventoses = mbcFichaEventoses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mbcEadSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
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

	@Column(name = "NOME", nullable = false, length = 120)
	@Length(max = 120)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "NOME_REDUZIDO", nullable = false, length = 30)
	@Length(max = 30)
	public String getNomeReduzido() {
		return this.nomeReduzido;
	}

	public void setNomeReduzido(String nomeReduzido) {
		this.nomeReduzido = nomeReduzido;
	}

	@Column(name = "SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mbcEventoAdversos")
	public Set<MbcFichaEvento> getMbcFichaEventoses() {
		return this.mbcFichaEventoses;
	}

	public void setMbcFichaEventoses(Set<MbcFichaEvento> mbcFichaEventoses) {
		this.mbcFichaEventoses = mbcFichaEventoses;
	}

	public enum Fields {

		SEQ("seq"),
		NOME("nome"),
		NOME_REDUZIDO("nomeReduzido"),
		SITUACAO("situacao"),
		SER_MATRICULA("servidor.id.matricula"),
		SER_VIN_CODIGO("servidor.id.vinCodigo"),
		CRIADO_EM("criadoEm"),
		MBC_FICHA_EVENTOSES("mbcFichaEventoses");

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
		if (!(obj instanceof MbcEventoAdverso)) {
			return false;
		}
		MbcEventoAdverso other = (MbcEventoAdverso) obj;
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

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return servidor;
	}

}
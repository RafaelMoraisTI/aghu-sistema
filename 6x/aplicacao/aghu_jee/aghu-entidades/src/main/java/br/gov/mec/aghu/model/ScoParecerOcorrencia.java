package br.gov.mec.aghu.model;

// Generated 04/01/2012 11:23:42 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioParecerOcorrencia;
import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntityCodigo;


/**
 * ScoParecer Ocorrencia generated by hbm2java
 */
@Entity
@Table(name = "SCO_PARECER_OCORRENCIA", schema = "AGH")
@SequenceGenerator(name="scoPocSq1", sequenceName="AGH.SCO_POC_SQ1", allocationSize = 1)
public class ScoParecerOcorrencia extends BaseEntityCodigo<Integer> implements java.io.Serializable {
		
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 4595856713767669915L;
	
	
	private Integer codigo;
	private ScoParecerMaterial parecerMaterial;
	private DominioParecerOcorrencia parecerOcorrencia;
	private Date dtOcorrencia;
	private RapServidores servidorResponsavel;	
	private Date dtCriacao;
	private RapServidores servidorCriacao;	
	private String descricao;
	private DominioSituacao indSituacao;
	private String lote;
	private Integer version;	
	
	public ScoParecerOcorrencia() {
	}

	@Id
	@Column(name = "CODIGO", nullable = false, precision = 6, scale = 0)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "scoPocSq1")
	public Integer getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PMT_CODIGO", referencedColumnName = "CODIGO")
	public ScoParecerMaterial getParecerMaterial() {
		return parecerMaterial;
	}

	public void setParecerMaterial(ScoParecerMaterial parecerMaterial) {
		this.parecerMaterial = parecerMaterial;
	}
	
	@Column(name = "PARECER", length = 2, nullable = false)
	@Enumerated(EnumType.STRING)
	public DominioParecerOcorrencia getParecerOcorrencia() {
		return parecerOcorrencia;
	}

	public void setParecerOcorrencia(DominioParecerOcorrencia parecerOcorrencia) {
		this.parecerOcorrencia = parecerOcorrencia;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_OCORRENCIA", length = 7)	
	public Date getDtOcorrencia() {
		return dtOcorrencia;
	}

	public void setDtOcorrencia(Date dtOcorrencia) {
		this.dtOcorrencia = dtOcorrencia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA_RESP", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_RESP", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorResponsavel() {
		return servidorResponsavel;
	}

	public void setServidorResponsavel(RapServidores servidorResponsavel) {
		this.servidorResponsavel = servidorResponsavel;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_CRIACAO", length = 7)
	public Date getDtCriacao() {
		return dtCriacao;
	}

	public void setDtCriacao(Date dtCriacao) {
		this.dtCriacao = dtCriacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA_CRIACAO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_CRIACAO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorCriacao() {
		return servidorCriacao;
	}

	public void setServidorCriacao(RapServidores servidorCriacao) {
		this.servidorCriacao = servidorCriacao;
	}
	

	@Column(name = "DESCRICAO", length = 500)
	@Length(max = 500)
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)	
	public DominioSituacao getIndSituacao() {
		return indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "LOTE", length = 20)
	@Length(max = 20)
	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

		
	@Column(name = "VERSION", nullable = false)
	@Version
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object other) {
		if (other instanceof ScoParecerOcorrencia){
			ScoParecerOcorrencia castOther = (ScoParecerOcorrencia) other;
			return new EqualsBuilder()
				.append(this.codigo, castOther.codigo)
			.isEquals();
		}
		else {
			return false;
		}	
	}
	
	
	
	public enum Fields {
		CODIGO("codigo"),
		PARECER_MATERIAL("parecerMaterial"),
		PARECER_MATERIAL_CODIGO("parecerMaterial.codigo"),
		PARECER_OCORRENCIA("parecerOcorrencia"),	
		DT_OCORRENCIA("dtOcorrencia"),
		SERVIDOR_RESPONSAVEL("servidorResponsavel"),
		MATRICULA_SERVIDOR_RESPONSAVEL("servidorResponsavel.id.matricula"),
		CODIGO_VINCULO_SERVIDOR_RESPONSAVEL("servidorResponsavel.id.vinCodigo"),
		DT_CRIACAO("dtCriacao"),
		SERVIDOR_CRIACAO("servidorCriacao"),
		MATRICULA_SERVIDOR_CRIACAO("servidorCriacao.id.matricula"),
		CODIGO_VINCULO_SERVIDOR_CRIACAO("servidorCriacao.id.vinCodigo"),
		DESCRICAO("descricao"),
		SITUACAO("indSituacao"),
		LOTE("lote");
		
		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}	

}

package br.gov.mec.aghu.model;

// Generated 20/04/2010 15:15:50 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacaoMovimentoProntuario;
import br.gov.mec.aghu.dominio.DominioTipoEnvioProntuario;
import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AipMovimentacaoProntuarioJn generated by hbm2java
 */
@Entity
@Table(name = "AIP_MOVIMENTACAO_PRONTUARIO_JN", schema = "AGH")
@SequenceGenerator(name = "aipMvpJnSeq", sequenceName = "AGH.AIP_MVP_JN_SEQ", allocationSize = 1)

@Immutable
public class AipMovimentacaoProntuarioJn extends BaseJournal implements
		java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8195532795377794574L;
	private Integer seq;
	private String observacoes;
	private Short volumes;
	private DominioTipoEnvioProntuario tipoEnvio;
	private DominioSituacaoMovimentoProntuario situacao;
	private Date dataMovimento;
	private Date dataRetirada;
	private Date dataDevolucao;
	private Integer pacCodigo;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Integer serMatriculaRetirado;
	private Short serVinCodigoRetirado;
	private Short sopSeq;
	private Integer slpCodigo;
	private String local;
	private String localAtual;
	private Short samisSeq;
	private Date dataCadastroOrigem;
	

	public AipMovimentacaoProntuarioJn() {
	}
	
	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aipMvpJnSeq")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}

	@Column(name = "SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "OBSERVACOES", length = 200)
	@Length(max = 200)
	public String getObservacoes() {
		return this.observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	@Column(name = "VOLUMES", precision = 3, scale = 0)
	public Short getVolumes() {
		return this.volumes;
	}

	public void setVolumes(Short volumes) {
		this.volumes = volumes;
	}

	@Column(name = "TIPO_ENVIO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioTipoEnvioProntuario getTipoEnvio() {
		return this.tipoEnvio;
	}

	public void setTipoEnvio(DominioTipoEnvioProntuario tipoEnvio) {
		this.tipoEnvio = tipoEnvio;
	}

	@Column(name = "SITUACAO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacaoMovimentoProntuario getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacaoMovimentoProntuario situacao) {
		this.situacao = situacao;
	}

	@Column(name = "DATA_MOVIMENTO", length = 7)
	public Date getDataMovimento() {
		return this.dataMovimento;
	}

	public void setDataMovimento(Date dataMovimento) {
		this.dataMovimento = dataMovimento;
	}

	@Column(name = "DATA_RETIRADA", length = 7)
	public Date getDataRetirada() {
		return this.dataRetirada;
	}

	public void setDataRetirada(Date dataRetirada) {
		this.dataRetirada = dataRetirada;
	}

	@Column(name = "DATA_DEVOLUCAO", length = 7)
	public Date getDataDevolucao() {
		return this.dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	@Column(name = "PAC_CODIGO", precision = 8, scale = 0)
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "SER_MATRICULA", precision = 7, scale = 0)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", precision = 3, scale = 0)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "SER_MATRICULA_RETIRADO", precision = 7, scale = 0)
	public Integer getSerMatriculaRetirado() {
		return this.serMatriculaRetirado;
	}

	public void setSerMatriculaRetirado(Integer serMatriculaRetirado) {
		this.serMatriculaRetirado = serMatriculaRetirado;
	}

	@Column(name = "SER_VIN_CODIGO_RETIRADO", precision = 3, scale = 0)
	public Short getSerVinCodigoRetirado() {
		return this.serVinCodigoRetirado;
	}

	public void setSerVinCodigoRetirado(Short serVinCodigoRetirado) {
		this.serVinCodigoRetirado = serVinCodigoRetirado;
	}

	@Column(name = "SOP_SEQ", precision = 4, scale = 0)
	public Short getSopSeq() {
		return this.sopSeq;
	}

	public void setSopSeq(Short sopSeq) {
		this.sopSeq = sopSeq;
	}

	@Column(name = "SLP_CODIGO", precision = 8, scale = 0)
	public Integer getSlpCodigo() {
		return this.slpCodigo;
	}

	public void setSlpCodigo(Integer slpCodigo) {
		this.slpCodigo = slpCodigo;
	}

	@Column(name = "LOCAL", length = 50)
	@Length(max = 50)
	public String getLocal() {
		return this.local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
	@Column(name = "LOCAL_ATUAL", length = 50)
	@Length(max = 50)
	public String getLocalAtual() {
		return localAtual;
	}

	public void setLocalAtual(String localAtual) {
		this.localAtual = localAtual;
	}

	@Column(name = "SAMIS_SEQ", precision = 4, scale = 0)
	public Short getSamisSeq() {
		return samisSeq;
	}

	public void setSamisSeq(Short samisSeq) {
		this.samisSeq = samisSeq;
	}
	

	@Column(name = "DT_CADASTRO_ORIGEM", length = 7)
	public Date getDataCadastroOrigem() {
		return dataCadastroOrigem;
	}

	public void setDataCadastroOrigem(Date dataCadastroOrigem) {
		this.dataCadastroOrigem = dataCadastroOrigem;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((getSeqJn() == null) ? 0 : getSeqJn().hashCode());
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		AipMovimentacaoProntuarioJn other = (AipMovimentacaoProntuarioJn) obj;
		if (getSeqJn() == null) {
			if (other.getSeqJn() != null) {
				return false;
			}
		} else if (!getSeqJn().equals(other.getSeqJn())) {
			return false;
		}
		return true;
	}

	public enum Fields {

		SEQ("seq"),
		OBSERVACOES("observacoes"),
		VOLUMES("volumes"),
		TIPO_ENVIO("tipoEnvio"),
		SITUACAO("situacao"),
		DATA_MOVIMENTO("dataMovimento"),
		DATA_RETIRADA("dataRetirada"),
		DATA_DEVOLUCAO("dataDevolucao"),
		PAC_CODIGO("pacCodigo"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		SER_MATRICULA_RETIRADO("serMatriculaRetirado"),
		SER_VIN_CODIGO_RETIRADO("serVinCodigoRetirado"),
		SOP_SEQ("sopSeq"),
		SLP_CODIGO("slpCodigo"),
		LOCAL("local"),
		JN_OPERATION("jnOperation"),
		JN_DATE_TIME("jnDateTime"),
		JN_USER("jnUser"),
		DT_CADASTRO_ORIGEM("dataCadastroOrigem"),
		SAMIS_DESCRICAO("samisDescricao"),
		LOCAL_ATUAL("localAtual")
		;


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

package br.gov.mec.aghu.model;

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
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

@Entity
@Table(name = "AEL_RESULTADOS_EXAMES", schema = "AGH")
@SecondaryTable(name = "AEL_DESCRICOES_RESULTADO", schema = "AGH", pkJoinColumns = {
		@PrimaryKeyJoinColumn(referencedColumnName = "ISE_SOE_SEQ", 			name = "REE_ISE_SOE_SEQ"),
		@PrimaryKeyJoinColumn(referencedColumnName = "ISE_SEQP",  				name = "REE_ISE_SEQP"),
		@PrimaryKeyJoinColumn(referencedColumnName = "PCL_VEL_EMA_EXA_SIGLA", 	name = "REE_PCL_VEL_EMA_EXA_SIGLA"),
		@PrimaryKeyJoinColumn(referencedColumnName = "PCL_VEL_EMA_MAN_SEQ", 	name = "REE_PCL_VEL_EMA_MAN_SEQ"),
		@PrimaryKeyJoinColumn(referencedColumnName = "PCL_VEL_SEQP", 			name = "REE_PCL_VEL_SEQP"),
		@PrimaryKeyJoinColumn(referencedColumnName = "PCL_CAL_SEQ", 			name = "REE_PCL_CAL_SEQ"),
		@PrimaryKeyJoinColumn(referencedColumnName = "PCL_SEQP", 				name = "REE_PCL_SEQP"),
		@PrimaryKeyJoinColumn(referencedColumnName = "SEQP", 					name = "REE_SEQP") })
public class AelResultadoExame extends BaseEntityId<AelResultadoExameId> implements java.io.Serializable,
		IAelResultadoExame {

	private static final long serialVersionUID = 8603393238648210998L;
	private AelResultadoExameId id;
	private Boolean anulacaoLaudo;
	private Long valor;
	private AelResultadoCaracteristica resultadoCaracteristica;
	private AelResultadoCodificado resultadoCodificado;
	private AelParametroCamposLaudo parametroCampoLaudo;
	private AelItemSolicitacaoExames itemSolicitacaoExame;
	private Date criadoEm;
	private Date alteradoEm;
	private AelExames exame;
	private String descricao;

	// private MtxExameUltResults mtxExameUltResults;

	public AelResultadoExame() {
	}

	public AelResultadoExame(AelResultadoExameId id, AelParametroCamposLaudo parametroCampoLaudo, Boolean anulacaoLaudo) {
		this.id = id;
		this.parametroCampoLaudo = parametroCampoLaudo;
		this.anulacaoLaudo = anulacaoLaudo;
	}

	public AelResultadoExame(AelResultadoExameId id, AelParametroCamposLaudo parametroCampoLaudo,
			Boolean anulacaoLaudo, Long valor, AelResultadoCaracteristica resultadoCaracteristica,
			AelResultadoCodificado resultadoCodificado, Date criadoEm, Date alteradoEm,
			AelItemSolicitacaoExames itemSolicitacaoExame) {
		this.id = id;
		this.parametroCampoLaudo = parametroCampoLaudo;
		this.anulacaoLaudo = anulacaoLaudo;
		this.valor = valor;
		this.resultadoCaracteristica = resultadoCaracteristica;
		this.resultadoCodificado = resultadoCodificado;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
		this.itemSolicitacaoExame = itemSolicitacaoExame;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "iseSoeSeq", column = @Column(name = "ISE_SOE_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "iseSeqp", column = @Column(name = "ISE_SEQP", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "pclVelEmaExaSigla", column = @Column(name = "PCL_VEL_EMA_EXA_SIGLA", nullable = false, length = 5)),
			@AttributeOverride(name = "pclVelEmaManSeq", column = @Column(name = "PCL_VEL_EMA_MAN_SEQ", nullable = false, precision = 5, scale = 0)),
			@AttributeOverride(name = "pclVelSeqp", column = @Column(name = "PCL_VEL_SEQP", nullable = false, precision = 5, scale = 0)),
			@AttributeOverride(name = "pclCalSeq", column = @Column(name = "PCL_CAL_SEQ", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "pclSeqp", column = @Column(name = "PCL_SEQP", nullable = false, precision = 5, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 5, scale = 0)) })
	public AelResultadoExameId getId() {
		return this.id;
	}

	public void setId(AelResultadoExameId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "PCL_VEL_EMA_EXA_SIGLA", referencedColumnName = "VEL_EMA_EXA_SIGLA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "PCL_VEL_EMA_MAN_SEQ", referencedColumnName = "VEL_EMA_MAN_SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "PCL_VEL_SEQP", referencedColumnName = "VEL_SEQP", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "PCL_CAL_SEQ", referencedColumnName = "CAL_SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "PCL_SEQP", referencedColumnName = "SEQP", nullable = false, insertable = false, updatable = false) })
	public AelParametroCamposLaudo getParametroCampoLaudo() {
		return this.parametroCampoLaudo;
	}

	public void setParametroCampoLaudo(AelParametroCamposLaudo parametroCampoLaudo) {
		this.parametroCampoLaudo = parametroCampoLaudo;
	}

	@Column(name = "IND_ANULACAO_LAUDO", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getAnulacaoLaudo() {
		return this.anulacaoLaudo;
	}

	public void setAnulacaoLaudo(Boolean anulacaoLaudo) {
		this.anulacaoLaudo = anulacaoLaudo;
	}

	@Column(name = "VALOR", precision = 13, scale = 0)
	public Long getValor() {
		return this.valor;
	}

	public void setValor(Long valor) {
		this.valor = valor;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 7)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "ISE_SOE_SEQ", referencedColumnName = "SOE_SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "ISE_SEQP", referencedColumnName = "SEQP", nullable = false, insertable = false, updatable = false) })
	public AelItemSolicitacaoExames getItemSolicitacaoExame() {
		return itemSolicitacaoExame;
	}

	public void setItemSolicitacaoExame(AelItemSolicitacaoExames itemSolicitacaoExame) {
		this.itemSolicitacaoExame = itemSolicitacaoExame;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		AelResultadoExame other = (AelResultadoExame) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

	@PrePersist
	@PreUpdate
	@SuppressWarnings("unused")
	private void validar() {
		if (this.anulacaoLaudo == null) {
			this.anulacaoLaudo = false;
		}
	}

	public enum Fields {

		ID("id"),
		ISE_SOE_SEQ("id.iseSoeSeq"),
		ISE_SEQP("id.iseSeqp"),
		SEQP("id.seqp"),
		IND_ANULACAO_LAUDO("anulacaoLaudo"),
		ANULACAO_LAUDO("anulacaoLaudo"),
		VALOR("valor"),
		CAC_SEQ("resultadoCaracteristica.seq"),
		PARAMETRO_CAMPO_LAUDO("parametroCampoLaudo"),
		ITEM_SOLICITACAO_EXAME("itemSolicitacaoExame"),
		CRIADO_EM("criadoEm"),
		ALTERADO_EM("alteradoEm"),
		RESULTADO_CODIFICADO("resultadoCodificado"),
		RCD_GTC_SEQ("resultadoCodificado.id.gtcSeq"),
		RCD_SEQP("resultadoCodificado.id.seqp"),
		DESCRICAO("descricao"),
		CAMPO_LAUDO("parametroCampoLaudo.campoLaudo"),
		RESULTADO_CARACTERISTICAS("resultadoCaracteristica"),
		PCL_CAL_SEQ("id.pclCalSeq"),
		PCL_VEL_EMA_EXA_SIGLA("id.pclVelEmaExaSigla"),
		PCL_VEL_EMA_MAN_SEQ("id.pclVelEmaManSeq"),
		PCL_VEL_SEQP("id.pclVelSeqp"),
		PCL_SEQP("id.pclSeqp"),
		// MTX_EXAME_ULT_RESULTS("mtxExameUltResults"),
		EXAME("exame");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "RCD_GTC_SEQ", referencedColumnName = "GTC_SEQ"),
			@JoinColumn(name = "RCD_SEQP", referencedColumnName = "SEQP") })
	public AelResultadoCodificado getResultadoCodificado() {
		return resultadoCodificado;
	}

	public void setResultadoCodificado(AelResultadoCodificado resultadoCodificado) {
		this.resultadoCodificado = resultadoCodificado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CAC_SEQ")
	public AelResultadoCaracteristica getResultadoCaracteristica() {
		return resultadoCaracteristica;
	}

	public void setResultadoCaracteristica(AelResultadoCaracteristica resultadoCaracteristica) {
		this.resultadoCaracteristica = resultadoCaracteristica;
	}

	@Column(name = "DESCRICAO", table = "AEL_DESCRICOES_RESULTADO" )
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/*
	 * @ManyToOne(fetch = FetchType.LAZY)
	 * 
	 * @JoinColumns( {
	 * 
	 * @JoinColumn(name = "PCL_CAL_SEQ", referencedColumnName = "CAL_SEQ",
	 * insertable=false, updatable=false),
	 * 
	 * @JoinColumn(name = "PCL_VEL_EMA_EXA_SIGLA", referencedColumnName =
	 * "SIGLA", insertable=false, updatable=false ) }) public MtxExameUltResults
	 * getMtxExameUltResults() { return mtxExameUltResults; }
	 * 
	 * public void setMtxExameUltResults(MtxExameUltResults mtxExameUltResults)
	 * { this.mtxExameUltResults = mtxExameUltResults; }
	 */

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PCL_VEL_EMA_EXA_SIGLA", referencedColumnName = "SIGLA", nullable = false, insertable = false, updatable = false)
	public AelExames getExame() {
		return exame;
	}

	public void setExame(AelExames exame) {
		this.exame = exame;
	}

}
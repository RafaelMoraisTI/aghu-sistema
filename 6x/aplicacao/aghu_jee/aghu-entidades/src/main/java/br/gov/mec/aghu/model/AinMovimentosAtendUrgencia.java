package br.gov.mec.aghu.model;

// Generated 21/06/2010 20:55:38 by Hibernate Tools 3.2.5.Beta

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


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AinMovimentosAtendUrgencia generated by hbm2java
 */

@Entity
@Table(name = "AIN_MOVIMENTOS_ATEND_URGENCIA", schema = "AGH")
public class AinMovimentosAtendUrgencia extends BaseEntityId<AinMovimentosAtendUrgenciaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4158780895239128537L;

	private AinMovimentosAtendUrgenciaId id;
	
	private RapServidores servidor;
	
	private Date dthrLancamento;
	
	private AinTiposMvtoInternacao tipoMovimentoInternacao;
	
	private AghClinicas clinica;

	private AinQuartos quarto;
	
	private AghUnidadesFuncionais unidadeFuncional;
	
	private AinLeitos leito;
	
	private AinAtendimentosUrgencia atendimentoUrgencia;
	
	public AinMovimentosAtendUrgencia() {
	}

	public AinMovimentosAtendUrgencia(AinMovimentosAtendUrgenciaId id,
			RapServidores servidor, AinTiposMvtoInternacao tipoMovimentoInternacao,
			Date dthrLancamento) {
		this.id = id;
		this.servidor = servidor;
		this.tipoMovimentoInternacao = tipoMovimentoInternacao;
		this.dthrLancamento = dthrLancamento;
	}

	public AinMovimentosAtendUrgencia(AinMovimentosAtendUrgenciaId id,
			RapServidores servidor, AinTiposMvtoInternacao tipoMovimentoInternacao,
			Date dthrLancamento, AghClinicas clinica, AinQuartos quarto, AghUnidadesFuncionais unidadeFuncional,
			AinLeitos leito) {
		this.id = id;
		this.servidor = servidor;
		this.tipoMovimentoInternacao = tipoMovimentoInternacao;
		this.dthrLancamento = dthrLancamento;
		this.clinica = clinica;
		this.quarto = quarto;
		this.unidadeFuncional = unidadeFuncional;
		this.leito = leito;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "seqAtendimentoUrgencia", column = @Column(name = "ATU_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "criadoEm", column = @Column(name = "CRIADO_EM", nullable = false, length = 7)) })
	public AinMovimentosAtendUrgenciaId getId() {
		return this.id;
	}

	public void setId(AinMovimentosAtendUrgenciaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TMI_SEQ")
	public AinTiposMvtoInternacao getTipoMovimentoInternacao() {
		return tipoMovimentoInternacao;
	}

	public void setTipoMovimentoInternacao(
			AinTiposMvtoInternacao tipoMovimentoInternacao) {
		this.tipoMovimentoInternacao = tipoMovimentoInternacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_LANCAMENTO", nullable = false, length = 7)
	public Date getDthrLancamento() {
		return this.dthrLancamento;
	}

	public void setDthrLancamento(Date dthrLancamento) {
		this.dthrLancamento = dthrLancamento;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CLC_CODIGO")
	public AghClinicas getClinica() {
		return clinica;
	}

	public void setClinica(AghClinicas clinica) {
		this.clinica = clinica;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "QRT_NUMERO")
	public AinQuartos getQuarto() {
		return quarto;
	}

	public void setQuarto(AinQuartos quarto) {
		this.quarto = quarto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UNF_SEQ")
	public AghUnidadesFuncionais getUnidadeFuncional() {
		return unidadeFuncional;
	}

	public void setUnidadeFuncional(AghUnidadesFuncionais unidadeFuncional) {
		this.unidadeFuncional = unidadeFuncional;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LTO_LTO_ID")
	public AinLeitos getLeito() {
		return leito;
	}

	public void setLeito(AinLeitos leito) {
		this.leito = leito;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATU_SEQ", insertable = false, updatable = false)
	public AinAtendimentosUrgencia getAtendimentoUrgencia() {
		return atendimentoUrgencia;
	}

	public void setAtendimentoUrgencia(AinAtendimentosUrgencia atendimentoUrgencia) {
		this.atendimentoUrgencia = atendimentoUrgencia;
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
		AinMovimentosAtendUrgencia other = (AinMovimentosAtendUrgencia) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

	public enum Fields {
		
		ID("id"),
		CRIADO_EM("id.criadoEm"),
		ID_SEQ_ATENDIMENTO_URGENCIA("id.seqAtendimentoUrgencia"),
		ATENDIMENTO_URGENCIA("atendimentoUrgencia"),
		ATENDIMENTO_URGENCIA_SEQ("atendimentoUrgencia.seq"),
		SERVIDOR("servidor"),
		SERVIDOR_MATRICULA("servidor.id.matricula"),
		SERVIDOR_VINCULO("servidor.id.vinCodigo"),
		DATA_HORA_LANCAMENTO("dthrLancamento"),
		TIPO_MOVIMENTO_INTERNACAO("tipoMovimentoInternacao"),
		TIPO_MOVIMENTO_INTERNACAO_CODIGO("tipoMovimentoInternacao.codigo"),
		CLINICA("clinica"),
		CLINICA_CODIGO("clinica.codigo"),
		QUARTO("quarto"),
		QUARTO_NUMERO("quarto.numero"),
		UNIDADE_FUNCIONAL("unidadeFuncional"),
		UNIDADE_FUNCIONAL_SEQ("unidadeFuncional.seq"),
		LEITO("leito"),
		LEITO_ID("leito.leitoID");	
		
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
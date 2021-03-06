package br.gov.mec.aghu.model;

// Generated 14/07/2011 10:42:18 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * SceReqMaterialRetornos generated by hbm2java
 */
@Entity
@SequenceGenerator(name="sceRmrSq1", sequenceName="AGH.SCE_RMR_SQ1", allocationSize = 1)
@Table(name = "SCE_REQ_MATERIAL_RETORNOS", schema = "AGH")
public class SceReqMaterialRetornos extends BaseEntitySeq<Integer> implements java.io.Serializable {

	private static final long serialVersionUID = -286810838093230030L;
	private Integer seq;
	private SceAlmoxarifado almoxarifado;
	private FccCentroCustos fccCentroCustos;
	private FccCentroCustos fccCentroCustosAplica;
	private Short tmvSeq;
	private Byte tmvComplemento;
	private Date dtGeracao;
	private RapServidores servidor;
	private String indSituacao;
	private Boolean indEstorno;
	private Date dtEnviado;
	private RapServidores servidorEnviado;
	private Date dtEstorno;
	private RapServidores servidorEstornado;
	private Date dtEfetivacao;
	private RapServidores servidorEfetivado;
	private ScePacoteMateriais scePacoteMateriais;
	private Date dtCancelamento;
	private RapServidores servidorCancelado;
	private AipPacientes aipPaciente;
	private Integer version;

	public SceReqMaterialRetornos() {
	}

	public SceReqMaterialRetornos(Integer seq, SceAlmoxarifado almoxarifado, FccCentroCustos fccCentroCustos, FccCentroCustos fccCentroCustosAplica, Short tmvSeq, Byte tmvComplemento, Date dtGeracao,
			RapServidores servidor, String indSituacao, Boolean indEstorno) {
		this.seq = seq;
		this.almoxarifado = almoxarifado;
		this.fccCentroCustos = fccCentroCustos;
		this.fccCentroCustosAplica = fccCentroCustosAplica;
		this.tmvSeq = tmvSeq;
		this.tmvComplemento = tmvComplemento;
		this.dtGeracao = dtGeracao;
		this.servidor = servidor;
		this.indSituacao = indSituacao;
		this.indEstorno = indEstorno;
	}

	public SceReqMaterialRetornos(Integer seq, SceAlmoxarifado almoxarifado, FccCentroCustos fccCentroCustos, FccCentroCustos fccCentroCustosAplica, Short tmvSeq, Byte tmvComplemento, Date dtGeracao,
			RapServidores servidor, String indSituacao, Boolean indEstorno, Date dtEnviado, RapServidores servidorEnviado, Date dtEstorno, RapServidores servidorEstornado, Date dtEfetivacao,
			RapServidores servidorEfetivado, ScePacoteMateriais scePacoteMateriais, Date dtCancelamento,
			RapServidores servidorCancelado, AipPacientes aipPaciente, Integer version) {
		this.seq = seq;
		this.almoxarifado = almoxarifado;
		this.fccCentroCustos = fccCentroCustos;
		this.fccCentroCustosAplica = fccCentroCustosAplica;
		this.tmvSeq = tmvSeq;
		this.tmvComplemento = tmvComplemento;
		this.dtGeracao = dtGeracao;
		this.servidor = servidor;
		this.indSituacao = indSituacao;
		this.indEstorno = indEstorno;
		this.dtEnviado = dtEnviado;
		this.servidorEnviado = servidorEnviado;
		this.dtEstorno = dtEstorno;
		this.servidorEstornado = servidorEstornado;
		this.dtEfetivacao = dtEfetivacao;
		this.servidorEfetivado = servidorEfetivado;
		this.scePacoteMateriais = scePacoteMateriais;
		this.dtCancelamento = dtCancelamento;
		this.servidorCancelado = servidorCancelado;
		this.aipPaciente = aipPaciente;
		this.version = version;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "sceRmrSq1")
	@Column(name = "SEQ", nullable = false, precision = 7, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ALM_SEQ", referencedColumnName = "SEQ", nullable = false)
	public SceAlmoxarifado getAlmoxarifado() {
		return almoxarifado;
	}

	public void setAlmoxarifado(SceAlmoxarifado almoxarifado) {
		this.almoxarifado = almoxarifado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CCT_CODIGO", referencedColumnName = "CODIGO", nullable = false)
	public FccCentroCustos getFccCentroCustos() {
		return this.fccCentroCustos;
	}

	public void setFccCentroCustos(FccCentroCustos fccCentroCustos) {
		this.fccCentroCustos = fccCentroCustos;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CCT_CODIGO_APLICA", referencedColumnName = "CODIGO", nullable = false)
	public FccCentroCustos getFccCentroCustosAplica() {
		return this.fccCentroCustosAplica;
	}

	public void setFccCentroCustosAplica(FccCentroCustos fccCentroCustosAplica) {
		this.fccCentroCustosAplica = fccCentroCustosAplica;
	}

	@Column(name = "TMV_SEQ", nullable = false, precision = 3, scale = 0)
	public Short getTmvSeq() {
		return this.tmvSeq;
	}

	public void setTmvSeq(Short tmvSeq) {
		this.tmvSeq = tmvSeq;
	}

	@Column(name = "TMV_COMPLEMENTO", nullable = false, precision = 2, scale = 0)
	public Byte getTmvComplemento() {
		return this.tmvComplemento;
	}

	public void setTmvComplemento(Byte tmvComplemento) {
		this.tmvComplemento = tmvComplemento;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_GERACAO", nullable = false, length = 7)
	public Date getDtGeracao() {
		return this.dtGeracao;
	}

	public void setDtGeracao(Date dtGeracao) {
		this.dtGeracao = dtGeracao;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}
	
	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "IND_ESTORNO", nullable = false, length = 1)
	public Boolean getIndEstorno() {
		return this.indEstorno;
	}

	public void setIndEstorno(Boolean indEstorno) {
		this.indEstorno = indEstorno;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_ENVIADO", length = 7)
	public Date getDtEnviado() {
		return this.dtEnviado;
	}

	public void setDtEnviado(Date dtEnviado) {
		this.dtEnviado = dtEnviado;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_ENVIADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ENVIADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorEnviado() {
		return this.servidorEnviado;
	}
	
	public void setServidorEnviado(RapServidores servidorEnviado) {
		this.servidorEnviado = servidorEnviado;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DT_ESTORNO", length = 7)
	public Date getDtEstorno() {
		return this.dtEstorno;
	}

	public void setDtEstorno(Date dtEstorno) {
		this.dtEstorno = dtEstorno;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_ESTORNADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ESTORNADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorEstornado() {
		return this.servidorEstornado;
	}
	
	public void setServidorEstornado(RapServidores servidorEstornado) {
		this.servidorEstornado = servidorEstornado;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DT_EFETIVACAO", length = 7)
	public Date getDtEfetivacao() {
		return this.dtEfetivacao;
	}

	public void setDtEfetivacao(Date dtEfetivacao) {
		this.dtEfetivacao = dtEfetivacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_EFETIVADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_EFETIVADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorEfetivado() {
		return this.servidorEfetivado;
	}
	
	public void setServidorEfetivado(RapServidores servidorEfetivado) {
		this.servidorEfetivado = servidorEfetivado;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "PMT_CCT_CODIGO_REFERE", referencedColumnName = "CCT_CODIGO_REFERE"),
			@JoinColumn(name = "PMT_CCT_CODIGO", referencedColumnName = "CCT_CODIGO"),
			@JoinColumn(name = "PMT_NUMERO", referencedColumnName = "NUMERO") })
	public ScePacoteMateriais getScePacoteMateriais() {
		return this.scePacoteMateriais;
	}

	public void setScePacoteMateriais(ScePacoteMateriais scePacoteMateriais) {
		this.scePacoteMateriais = scePacoteMateriais;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_CANCELAMENTO", length = 7)
	public Date getDtCancelamento() {
		return this.dtCancelamento;
	}

	public void setDtCancelamento(Date dtCancelamento) {
		this.dtCancelamento = dtCancelamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_CANCELADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_CANCELADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorCancelado() {
		return this.servidorCancelado;
	}
	
	public void setServidorCancelado(RapServidores servidorCancelado) {
		this.servidorCancelado = servidorCancelado;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PAC_CODIGO", referencedColumnName = "CODIGO")
	public AipPacientes getAipPaciente() {
		return this.aipPaciente;
	}

	public void setAipPaciente(AipPacientes aipPaciente) {
		this.aipPaciente = aipPaciente;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((seq == null) ? 0 : seq.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		SceReqMaterialRetornos other = (SceReqMaterialRetornos) obj;
		if (seq == null) {
			if (other.seq != null){
				return false;
			}
		} else if (!seq.equals(other.seq)){
			return false;
		}
		return true;
	}
	
	public enum Fields {
		
		PACOTE_MATERIAL("scePacoteMateriais");
		
		private String field;

		private Fields(String field) {
			this.field = field;
		}

		@Override
		public String toString() {
			return this.field;
		}
	}
	
	
}

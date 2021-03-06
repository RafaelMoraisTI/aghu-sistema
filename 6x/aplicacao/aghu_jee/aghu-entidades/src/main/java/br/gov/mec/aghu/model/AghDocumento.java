package br.gov.mec.aghu.model;

// Generated 26/01/2011 14:50:37 by Hibernate Tools 3.3.0.GA

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;


import br.gov.mec.aghu.dominio.DominioTipoDocumento;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AghDocumentos generated by hbm2java
 */
@Entity
@SequenceGenerator(name = "aghdoksq1", sequenceName = "AGH.AGH_DOK_SQ1", allocationSize = 1)
@Table(name = "AGH_DOCUMENTOS", schema = "AGH")
public class AghDocumento extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 95960901841287602L;
	private Integer seq;
	private AghAtendimentos aghAtendimento;
	private AelAtendimentoDiversos aelAtendimentoDiversos;
	private MbcCirurgias cirurgia;
	private MbcFichaAnestesias fichaAnestesia;
	private MamNotaAdicionalEvolucoes notaAdicionalEvolucao;
	private MbcAgendas agenda;
	private MamLaudoAih laudoAih;
	private DominioTipoDocumento tipo;
	private Set<AghVersaoDocumento> AghVersaoDocumentoes = new HashSet<AghVersaoDocumento>(
			0);

	public AghDocumento() {
	}

	public AghDocumento(Integer seq, DominioTipoDocumento tipo) {
		this.seq = seq;
		this.tipo = tipo;
	}

	public AghDocumento(Integer seq, AghAtendimentos aghAtendimento, DominioTipoDocumento tipo, MbcCirurgias cirurgia,
			MbcFichaAnestesias fichaAnestesia, MamNotaAdicionalEvolucoes notaAdicionalEvolucao,
			Set<AghVersaoDocumento> AghVersaoDocumentoes) {
		this.seq = seq;
		this.aghAtendimento = aghAtendimento;
		this.tipo = tipo;
		this.cirurgia = cirurgia;
		this.fichaAnestesia = fichaAnestesia;
		this.notaAdicionalEvolucao = notaAdicionalEvolucao;
		this.AghVersaoDocumentoes = AghVersaoDocumentoes;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aghdoksq1")
	@Column(name = "SEQ", unique = true, nullable = false, precision = 7, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATD_SEQ")
	public AghAtendimentos getAghAtendimento() {
		return this.aghAtendimento;
	}
	
	public void setAghAtendimento(AghAtendimentos aghAtendimento) {
		this.aghAtendimento = aghAtendimento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CRG_SEQ")
	public MbcCirurgias getCirurgia() {
		return cirurgia;
	}

	public void setCirurgia(MbcCirurgias cirurgia) {
		this.cirurgia = cirurgia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FIC_SEQ")
	public MbcFichaAnestesias getFichaAnestesia() {
		return fichaAnestesia;
	}

	public void setFichaAnestesia(MbcFichaAnestesias fichaAnestesia) {
		this.fichaAnestesia = fichaAnestesia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NPO_SEQ")
	public MamNotaAdicionalEvolucoes getNotaAdicionalEvolucao() {
		return notaAdicionalEvolucao;
	}

	public void setNotaAdicionalEvolucao(
			MamNotaAdicionalEvolucoes notaAdicionalEvolucao) {
		this.notaAdicionalEvolucao = notaAdicionalEvolucao;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AGD_SEQ")
	public MbcAgendas getAgenda() {
		return this.agenda;
	}
	
	public void setAgenda(MbcAgendas agenda) {
		this.agenda = agenda;
	}

	@Column(name = "TIPO", nullable = false, length = 3)
	@Enumerated(EnumType.STRING)
	public DominioTipoDocumento getTipo() {
		return this.tipo;
	}

	public void setTipo(DominioTipoDocumento tipo) {
		this.tipo = tipo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "aghDocumentos")
	public Set<AghVersaoDocumento> getAghVersaoDocumentoes() {
		return this.AghVersaoDocumentoes;
	}

	public void setAghVersaoDocumentoes(
			Set<AghVersaoDocumento> AghVersaoDocumentoes) {
		this.AghVersaoDocumentoes = AghVersaoDocumentoes;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATV_SEQ")
	public AelAtendimentoDiversos getAelAtendimentoDiversos() {
		return aelAtendimentoDiversos;
	}

	public void setAelAtendimentoDiversos(
			AelAtendimentoDiversos aelAtendimentoDiversos) {
		this.aelAtendimentoDiversos = aelAtendimentoDiversos;
	}
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LAI_SEQ")
	public MamLaudoAih getLaudoAih() {
		return laudoAih;
	}

	public void setLaudoAih(MamLaudoAih laudoAih) {
		this.laudoAih = laudoAih;
	}


	@Transient
	public AipPacientes getPaciente() {
		if (aghAtendimento != null) {
			return aghAtendimento.getPaciente();
		} else if (cirurgia != null) {
			return cirurgia.getPaciente();
		} else if (fichaAnestesia != null) {
			return fichaAnestesia.getPaciente();
		} else if (notaAdicionalEvolucao != null) {
			return notaAdicionalEvolucao.getPaciente();
		}

		return null;
	}

	public enum Fields {
		
		SEQ("seq"),
		ATENDIMENTO("aghAtendimento"),
		ATD_SEQ("aghAtendimento.seq"),
		ATENDIMENTO_DIVERSOS("aelAtendimentoDiversos"),
		ATV_SEQ("aelAtendimentoDiversos.seq"),
		CIRURGIA("cirurgia"),
		CRG_SEQ("cirurgia.seq"),
		LAI_SEQ("laudoAih.seq"),
		FICHA_ANESTESICA("fichaAnestesia"),
		FIC_SEQ("fichaAnestesia.seq"),
		NOTA_ADICIONAL_EVOLUCAO("notaAdicionalEvolucao"),
		NPO_SEQ("notaAdicionalEvolucao.seq"),
		TIPO("tipo"),
		AGD_SEQ("agenda.seq");

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
		if (!(obj instanceof AghDocumento)) {
			return false;
		}
		AghDocumento other = (AghDocumento) obj;
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

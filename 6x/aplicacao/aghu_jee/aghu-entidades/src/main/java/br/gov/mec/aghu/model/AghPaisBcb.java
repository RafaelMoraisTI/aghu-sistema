package br.gov.mec.aghu.model;

// Generated 04/02/2010 19:35:53 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AghPaisesBCB generated by hbm2java
 */

@Entity
@SequenceGenerator(name="aghPaiSq1", sequenceName="AGH.AGH_PAI_SQ1", allocationSize = 1)
@Table(name = "AGH_PAISES_BCB", schema = "AGH")
public class AghPaisBcb extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5151058398965161148L;
	private Integer seq;
	private Integer codigoBcb;
	private String nome;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aghPaiSq1")
	@Column(name = "SEQ", nullable = false, precision = 3, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	
	@Column(name = "CODIGO_BCB", precision = 8, scale = 0) 
	public Integer getCodigoBcb() {
		return codigoBcb;
	}

	public void setCodigoBcb(Integer codigoBcb) {
		this.codigoBcb = codigoBcb;
	}

	@Column(name = "NOME", length = 100)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
	
	
	public enum Fields {
		SEQ("seq"), 
		CODIGO_BCB("codigoBcb"),
		NOME("nome");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((seq == null) ? 0 : seq.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (!super.equals(obj)){
			return false;
		}
		if (!(obj instanceof AghPaisBcb)){
			return false;
		}
		AghPaisBcb other = (AghPaisBcb) obj;
		if (seq == null) {
			if (other.seq != null){
				return false;
			}
		} else if (!seq.equals(other.seq)){
			return false;
		}
		return true;
	}

	

}

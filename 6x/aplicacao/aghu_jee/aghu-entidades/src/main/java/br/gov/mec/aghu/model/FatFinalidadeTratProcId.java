package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * FatFinalidadeTratProcsId generated by hbm2java
 */
@Embeddable
public class FatFinalidadeTratProcId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7555243537912479858L;
	private Byte ftrSeq;
	private Short iphPhoSeq;
	private Integer iphSeq;

	public FatFinalidadeTratProcId() {
	}

	public FatFinalidadeTratProcId(Byte ftrSeq, Short iphPhoSeq, Integer iphSeq) {
		this.ftrSeq = ftrSeq;
		this.iphPhoSeq = iphPhoSeq;
		this.iphSeq = iphSeq;
	}

	@Column(name = "FTR_SEQ", nullable = false, precision = 2, scale = 0)
	public Byte getFtrSeq() {
		return this.ftrSeq;
	}

	public void setFtrSeq(Byte ftrSeq) {
		this.ftrSeq = ftrSeq;
	}

	@Column(name = "IPH_PHO_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getIphPhoSeq() {
		return this.iphPhoSeq;
	}

	public void setIphPhoSeq(Short iphPhoSeq) {
		this.iphPhoSeq = iphPhoSeq;
	}

	@Column(name = "IPH_SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getIphSeq() {
		return this.iphSeq;
	}

	public void setIphSeq(Integer iphSeq) {
		this.iphSeq = iphSeq;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof FatFinalidadeTratProcId)) {
			return false;
		}
		FatFinalidadeTratProcId castOther = (FatFinalidadeTratProcId) other;

		return (this.getFtrSeq() == castOther.getFtrSeq())
				&& (this.getIphPhoSeq() == castOther.getIphPhoSeq())
				&& (this.getIphSeq() == castOther.getIphSeq());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getFtrSeq();
		result = 37 * result + this.getIphPhoSeq();
		result = 37 * result + this.getIphSeq();
		return result;
	}

}

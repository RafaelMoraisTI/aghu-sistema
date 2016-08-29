package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AgfaAdt generated by hbm2java
 */
@Entity
@Table(name = "AGFA_ADT", schema = "AGH")
public class AgfaAdt extends BaseEntityId<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2374641280809564122L;
	private Integer msh10Id;
	private String msh04Sendingfacility;
	private Date msh07Date;
	private String mshStatus;
	private String evn01Typecode;
	private Date evn02Recdate;
	private String pid02Id;
	private String pid05Lnamef;
	private String pid05Lnamem;
	private String pid05Fname;
	private Date pid07Dob;
	private String pid08Sex;
	private String pid11Street;
	private String pid11Streetnr;
	private String pid11Town;
	private String pid11City;
	private String pid13Phone;
	private String pid16Maritstat;
	private String pid28Nationality;
	private Date pid29Dod;
	private String nk102Fname;
	private String nk103Relation;
	private String nk102Fname2;
	private String nk103Relation2;
	private String mrg01Oldpid;
	private String pv118Status;
	private String pv103Location;
	private String pv103Room;
	private String pv103Bed;
	private String pv104Admtype;
	private String pv107Attdoc;
	private String pv119Visitnr;
	private Date pv144Admitdate;
	private Date pv145Dischargedate;
	private String in1Planid;
	private String in1Planname;
	private String in1Compid;
	private String in1Compname;
	private Date in1Startdate;
	private Date in1Enddate;
	private String in1Policynr;
	private String hisRequestnr;

	public AgfaAdt() {
	}

	public AgfaAdt(Integer msh10Id) {
		this.msh10Id = msh10Id;
	}

	@SuppressWarnings({"PMD.ExcessiveParameterList"})
	public AgfaAdt(Integer msh10Id, String msh04Sendingfacility, Date msh07Date, String mshStatus, String evn01Typecode,
			Date evn02Recdate, String pid02Id, String pid05Lnamef, String pid05Lnamem, String pid05Fname, Date pid07Dob,
			String pid08Sex, String pid11Street, String pid11Streetnr, String pid11Town, String pid11City, String pid13Phone,
			String pid16Maritstat, String pid28Nationality, Date pid29Dod, String nk102Fname, String nk103Relation,
			String nk102Fname2, String nk103Relation2, String mrg01Oldpid, String pv118Status, String pv103Location, String pv103Room,
			String pv103Bed, String pv104Admtype, String pv107Attdoc, String pv119Visitnr, Date pv144Admitdate,
			Date pv145Dischargedate, String in1Planid, String in1Planname, String in1Compid, String in1Compname, Date in1Startdate,
			Date in1Enddate, String in1Policynr, String hisRequestnr) {
		this.msh10Id = msh10Id;
		this.msh04Sendingfacility = msh04Sendingfacility;
		this.msh07Date = msh07Date;
		this.mshStatus = mshStatus;
		this.evn01Typecode = evn01Typecode;
		this.evn02Recdate = evn02Recdate;
		this.pid02Id = pid02Id;
		this.pid05Lnamef = pid05Lnamef;
		this.pid05Lnamem = pid05Lnamem;
		this.pid05Fname = pid05Fname;
		this.pid07Dob = pid07Dob;
		this.pid08Sex = pid08Sex;
		this.pid11Street = pid11Street;
		this.pid11Streetnr = pid11Streetnr;
		this.pid11Town = pid11Town;
		this.pid11City = pid11City;
		this.pid13Phone = pid13Phone;
		this.pid16Maritstat = pid16Maritstat;
		this.pid28Nationality = pid28Nationality;
		this.pid29Dod = pid29Dod;
		this.nk102Fname = nk102Fname;
		this.nk103Relation = nk103Relation;
		this.nk102Fname2 = nk102Fname2;
		this.nk103Relation2 = nk103Relation2;
		this.mrg01Oldpid = mrg01Oldpid;
		this.pv118Status = pv118Status;
		this.pv103Location = pv103Location;
		this.pv103Room = pv103Room;
		this.pv103Bed = pv103Bed;
		this.pv104Admtype = pv104Admtype;
		this.pv107Attdoc = pv107Attdoc;
		this.pv119Visitnr = pv119Visitnr;
		this.pv144Admitdate = pv144Admitdate;
		this.pv145Dischargedate = pv145Dischargedate;
		this.in1Planid = in1Planid;
		this.in1Planname = in1Planname;
		this.in1Compid = in1Compid;
		this.in1Compname = in1Compname;
		this.in1Startdate = in1Startdate;
		this.in1Enddate = in1Enddate;
		this.in1Policynr = in1Policynr;
		this.hisRequestnr = hisRequestnr;
	}

	@Id
	@Column(name = "MSH_10_ID", unique = true, nullable = false)
	public Integer getMsh10Id() {
		return this.msh10Id;
	}

	public void setMsh10Id(Integer msh10Id) {
		this.msh10Id = msh10Id;
	}

	@Column(name = "MSH_04_SENDINGFACILITY", length = 80)
	@Length(max = 80)
	public String getMsh04Sendingfacility() {
		return this.msh04Sendingfacility;
	}

	public void setMsh04Sendingfacility(String msh04Sendingfacility) {
		this.msh04Sendingfacility = msh04Sendingfacility;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MSH_07_DATE", length = 29)
	public Date getMsh07Date() {
		return this.msh07Date;
	}

	public void setMsh07Date(Date msh07Date) {
		this.msh07Date = msh07Date;
	}

	@Column(name = "MSH_STATUS", length = 1)
	@Length(max = 1)
	public String getMshStatus() {
		return this.mshStatus;
	}

	public void setMshStatus(String mshStatus) {
		this.mshStatus = mshStatus;
	}

	@Column(name = "EVN_01_TYPECODE", length = 3)
	@Length(max = 3)
	public String getEvn01Typecode() {
		return this.evn01Typecode;
	}

	public void setEvn01Typecode(String evn01Typecode) {
		this.evn01Typecode = evn01Typecode;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "EVN_02_RECDATE", length = 29)
	public Date getEvn02Recdate() {
		return this.evn02Recdate;
	}

	public void setEvn02Recdate(Date evn02Recdate) {
		this.evn02Recdate = evn02Recdate;
	}

	@Column(name = "PID_02_ID", length = 20)
	@Length(max = 20)
	public String getPid02Id() {
		return this.pid02Id;
	}

	public void setPid02Id(String pid02Id) {
		this.pid02Id = pid02Id;
	}

	@Column(name = "PID_05_LNAMEF", length = 80)
	@Length(max = 80)
	public String getPid05Lnamef() {
		return this.pid05Lnamef;
	}

	public void setPid05Lnamef(String pid05Lnamef) {
		this.pid05Lnamef = pid05Lnamef;
	}

	@Column(name = "PID_05_LNAMEM", length = 80)
	@Length(max = 80)
	public String getPid05Lnamem() {
		return this.pid05Lnamem;
	}

	public void setPid05Lnamem(String pid05Lnamem) {
		this.pid05Lnamem = pid05Lnamem;
	}

	@Column(name = "PID_05_FNAME", length = 80)
	@Length(max = 80)
	public String getPid05Fname() {
		return this.pid05Fname;
	}

	public void setPid05Fname(String pid05Fname) {
		this.pid05Fname = pid05Fname;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PID_07_DOB", length = 29)
	public Date getPid07Dob() {
		return this.pid07Dob;
	}

	public void setPid07Dob(Date pid07Dob) {
		this.pid07Dob = pid07Dob;
	}

	@Column(name = "PID_08_SEX", length = 1)
	@Length(max = 1)
	public String getPid08Sex() {
		return this.pid08Sex;
	}

	public void setPid08Sex(String pid08Sex) {
		this.pid08Sex = pid08Sex;
	}

	@Column(name = "PID_11_STREET", length = 55)
	@Length(max = 55)
	public String getPid11Street() {
		return this.pid11Street;
	}

	public void setPid11Street(String pid11Street) {
		this.pid11Street = pid11Street;
	}

	@Column(name = "PID_11_STREETNR", length = 15)
	@Length(max = 15)
	public String getPid11Streetnr() {
		return this.pid11Streetnr;
	}

	public void setPid11Streetnr(String pid11Streetnr) {
		this.pid11Streetnr = pid11Streetnr;
	}

	@Column(name = "PID_11_TOWN", length = 40)
	@Length(max = 40)
	public String getPid11Town() {
		return this.pid11Town;
	}

	public void setPid11Town(String pid11Town) {
		this.pid11Town = pid11Town;
	}

	@Column(name = "PID_11_CITY", length = 40)
	@Length(max = 40)
	public String getPid11City() {
		return this.pid11City;
	}

	public void setPid11City(String pid11City) {
		this.pid11City = pid11City;
	}

	@Column(name = "PID_13_PHONE", length = 40)
	@Length(max = 40)
	public String getPid13Phone() {
		return this.pid13Phone;
	}

	public void setPid13Phone(String pid13Phone) {
		this.pid13Phone = pid13Phone;
	}

	@Column(name = "PID_16_MARITSTAT", length = 1)
	@Length(max = 1)
	public String getPid16Maritstat() {
		return this.pid16Maritstat;
	}

	public void setPid16Maritstat(String pid16Maritstat) {
		this.pid16Maritstat = pid16Maritstat;
	}

	@Column(name = "PID_28_NATIONALITY", length = 80)
	@Length(max = 80)
	public String getPid28Nationality() {
		return this.pid28Nationality;
	}

	public void setPid28Nationality(String pid28Nationality) {
		this.pid28Nationality = pid28Nationality;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PID_29_DOD", length = 29)
	public Date getPid29Dod() {
		return this.pid29Dod;
	}

	public void setPid29Dod(Date pid29Dod) {
		this.pid29Dod = pid29Dod;
	}

	@Column(name = "NK1_02_FNAME", length = 80)
	@Length(max = 80)
	public String getNk102Fname() {
		return this.nk102Fname;
	}

	public void setNk102Fname(String nk102Fname) {
		this.nk102Fname = nk102Fname;
	}

	@Column(name = "NK1_03_RELATION", length = 60)
	@Length(max = 60)
	public String getNk103Relation() {
		return this.nk103Relation;
	}

	public void setNk103Relation(String nk103Relation) {
		this.nk103Relation = nk103Relation;
	}

	@Column(name = "NK1_02_FNAME2", length = 80)
	@Length(max = 80)
	public String getNk102Fname2() {
		return this.nk102Fname2;
	}

	public void setNk102Fname2(String nk102Fname2) {
		this.nk102Fname2 = nk102Fname2;
	}

	@Column(name = "NK1_03_RELATION2", length = 60)
	@Length(max = 60)
	public String getNk103Relation2() {
		return this.nk103Relation2;
	}

	public void setNk103Relation2(String nk103Relation2) {
		this.nk103Relation2 = nk103Relation2;
	}

	@Column(name = "MRG_01_OLDPID", length = 20)
	@Length(max = 20)
	public String getMrg01Oldpid() {
		return this.mrg01Oldpid;
	}

	public void setMrg01Oldpid(String mrg01Oldpid) {
		this.mrg01Oldpid = mrg01Oldpid;
	}

	@Column(name = "PV1_18_STATUS", length = 2)
	@Length(max = 2)
	public String getPv118Status() {
		return this.pv118Status;
	}

	public void setPv118Status(String pv118Status) {
		this.pv118Status = pv118Status;
	}

	@Column(name = "PV1_03_LOCATION", length = 250)
	@Length(max = 250)
	public String getPv103Location() {
		return this.pv103Location;
	}

	public void setPv103Location(String pv103Location) {
		this.pv103Location = pv103Location;
	}

	@Column(name = "PV1_03_ROOM", length = 25)
	@Length(max = 25)
	public String getPv103Room() {
		return this.pv103Room;
	}

	public void setPv103Room(String pv103Room) {
		this.pv103Room = pv103Room;
	}

	@Column(name = "PV1_03_BED", length = 25)
	@Length(max = 25)
	public String getPv103Bed() {
		return this.pv103Bed;
	}

	public void setPv103Bed(String pv103Bed) {
		this.pv103Bed = pv103Bed;
	}

	@Column(name = "PV1_04_ADMTYPE", length = 2)
	@Length(max = 2)
	public String getPv104Admtype() {
		return this.pv104Admtype;
	}

	public void setPv104Admtype(String pv104Admtype) {
		this.pv104Admtype = pv104Admtype;
	}

	@Column(name = "PV1_07_ATTDOC", length = 250)
	@Length(max = 250)
	public String getPv107Attdoc() {
		return this.pv107Attdoc;
	}

	public void setPv107Attdoc(String pv107Attdoc) {
		this.pv107Attdoc = pv107Attdoc;
	}

	@Column(name = "PV1_19_VISITNR", length = 20)
	@Length(max = 20)
	public String getPv119Visitnr() {
		return this.pv119Visitnr;
	}

	public void setPv119Visitnr(String pv119Visitnr) {
		this.pv119Visitnr = pv119Visitnr;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PV1_44_ADMITDATE", length = 29)
	public Date getPv144Admitdate() {
		return this.pv144Admitdate;
	}

	public void setPv144Admitdate(Date pv144Admitdate) {
		this.pv144Admitdate = pv144Admitdate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PV1_45_DISCHARGEDATE", length = 29)
	public Date getPv145Dischargedate() {
		return this.pv145Dischargedate;
	}

	public void setPv145Dischargedate(Date pv145Dischargedate) {
		this.pv145Dischargedate = pv145Dischargedate;
	}

	@Column(name = "IN1_PLANID", length = 60)
	@Length(max = 60)
	public String getIn1Planid() {
		return this.in1Planid;
	}

	public void setIn1Planid(String in1Planid) {
		this.in1Planid = in1Planid;
	}

	@Column(name = "IN1_PLANNAME", length = 130)
	@Length(max = 130)
	public String getIn1Planname() {
		return this.in1Planname;
	}

	public void setIn1Planname(String in1Planname) {
		this.in1Planname = in1Planname;
	}

	@Column(name = "IN1_COMPID", length = 59)
	@Length(max = 59)
	public String getIn1Compid() {
		return this.in1Compid;
	}

	public void setIn1Compid(String in1Compid) {
		this.in1Compid = in1Compid;
	}

	@Column(name = "IN1_COMPNAME", length = 130)
	@Length(max = 130)
	public String getIn1Compname() {
		return this.in1Compname;
	}

	public void setIn1Compname(String in1Compname) {
		this.in1Compname = in1Compname;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "IN1_STARTDATE", length = 29)
	public Date getIn1Startdate() {
		return this.in1Startdate;
	}

	public void setIn1Startdate(Date in1Startdate) {
		this.in1Startdate = in1Startdate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "IN1_ENDDATE", length = 29)
	public Date getIn1Enddate() {
		return this.in1Enddate;
	}

	public void setIn1Enddate(Date in1Enddate) {
		this.in1Enddate = in1Enddate;
	}

	@Column(name = "IN1_POLICYNR", length = 15)
	@Length(max = 15)
	public String getIn1Policynr() {
		return this.in1Policynr;
	}

	public void setIn1Policynr(String in1Policynr) {
		this.in1Policynr = in1Policynr;
	}

	@Column(name = "HIS_REQUESTNR", length = 10)
	@Length(max = 10)
	public String getHisRequestnr() {
		return this.hisRequestnr;
	}

	public void setHisRequestnr(String hisRequestnr) {
		this.hisRequestnr = hisRequestnr;
	}

	public enum Fields {

		MSH10_ID("msh10Id"),
		MSH04_SENDINGFACILITY("msh04Sendingfacility"),
		MSH07_DATE("msh07Date"),
		MSH_STATUS("mshStatus"),
		EVN01_TYPECODE("evn01Typecode"),
		EVN02_RECDATE("evn02Recdate"),
		PID02_ID("pid02Id"),
		PID05_LNAMEF("pid05Lnamef"),
		PID05_LNAMEM("pid05Lnamem"),
		PID05_FNAME("pid05Fname"),
		PID07_DOB("pid07Dob"),
		PID08_SEX("pid08Sex"),
		PID11_STREET("pid11Street"),
		PID11_STREETNR("pid11Streetnr"),
		PID11_TOWN("pid11Town"),
		PID11_CITY("pid11City"),
		PID13_PHONE("pid13Phone"),
		PID16_MARITSTAT("pid16Maritstat"),
		PID28_NATIONALITY("pid28Nationality"),
		PID29_DOD("pid29Dod"),
		NK102_FNAME("nk102Fname"),
		NK103_RELATION("nk103Relation"),
		NK102_FNAME2("nk102Fname2"),
		NK103_RELATION2("nk103Relation2"),
		MRG01_OLDPID("mrg01Oldpid"),
		PV118_STATUS("pv118Status"),
		PV103_LOCATION("pv103Location"),
		PV103_ROOM("pv103Room"),
		PV103_BED("pv103Bed"),
		PV104_ADMTYPE("pv104Admtype"),
		PV107_ATTDOC("pv107Attdoc"),
		PV119_VISITNR("pv119Visitnr"),
		PV144_ADMITDATE("pv144Admitdate"),
		PV145_DISCHARGEDATE("pv145Dischargedate"),
		IN1_PLANID("in1Planid"),
		IN1_PLANNAME("in1Planname"),
		IN1_COMPID("in1Compid"),
		IN1_COMPNAME("in1Compname"),
		IN1_STARTDATE("in1Startdate"),
		IN1_ENDDATE("in1Enddate"),
		IN1_POLICYNR("in1Policynr"),
		HIS_REQUESTNR("hisRequestnr");

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
		result = prime * result + ((getMsh10Id() == null) ? 0 : getMsh10Id().hashCode());
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
		if (!(obj instanceof AgfaAdt)) {
			return false;
		}
		AgfaAdt other = (AgfaAdt) obj;
		if (getMsh10Id() == null) {
			if (other.getMsh10Id() != null) {
				return false;
			}
		} else if (!getMsh10Id().equals(other.getMsh10Id())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####
 
 @Transient public Integer getId(){ return this.getMsh10Id();} 
 public void setId(Integer id){ this.setMsh10Id(id);}
}
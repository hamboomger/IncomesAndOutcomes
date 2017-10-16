package pl.piterpti.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "outcome")
public class Outcome {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "outcome_id")
	private long id;

	@Column(name = "value", precision = 10, scale = 2)
	private BigDecimal value;

	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name = "outcomeDate")
	private Date outcomeDate;

	@Column(name = "short_desc")
	private String shortDesc;

	@ManyToOne(cascade = CascadeType.REFRESH)
	private Category category;
	
	public Outcome() {
		
	}
	
	public Outcome(BigDecimal value, Date outcomeDate, String shortDesc) {
		this.value = value;
		this.outcomeDate = outcomeDate;
		this.shortDesc = shortDesc;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public Date getOutcomeDate() {
		return outcomeDate;
	}

	public void setOutcomeDate(Date outcomeDate) {
		this.outcomeDate = outcomeDate;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Outcome [id=" + id + ", value=" + value + ", shortDesc=" + shortDesc + "]";
	}

}

package hrms.projecthrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "job_advertisements")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class JobAdvertisements {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id",nullable = false)
	private int id;
	@Column(name = "job_description",nullable = false)
	private String jobDescription;
	
	@Column(name = "minimum_salary")
	private int minimumSalary;
	@Column(name = "maximum_salary")
	private int maximumSalary;
	@Column(name = "last_apply_date",nullable = false)
	private Date lastApplyDate;
	@Column(name = "opening_date",nullable = false)
	private Date openingDate;
	@Column(name = "is_active",nullable = false)
	private boolean isActive;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "company_name",referencedColumnName = "id")
	
	private Employer employer;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "job_title",referencedColumnName = "id")
	private Job job;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "city_name",referencedColumnName = "id")
	private Cities cities;
}

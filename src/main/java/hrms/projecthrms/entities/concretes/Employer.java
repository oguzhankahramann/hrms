package hrms.projecthrms.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "id",referencedColumnName = "id")
@EqualsAndHashCode(callSuper = false)
@Table(name = "employers")
@JsonIgnoreProperties({"hibernateLazyInitializer","employers"})// ic ice 
public class Employer extends User{
	
	
	@Column(name = "company_name",nullable = false)
	private String companyName;
	@Column(name = "web_adress",nullable = false)
	private String webAdress;
	@Column(name = "phone_number",nullable = false)
	private String phoneNumber;
	
	@JsonIgnore
	@OneToMany(mappedBy = "employer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<JobAdvertisements> jobAdvertisements;


}

package hrms.projecthrms.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name="job_titles")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Job {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id",nullable = false)
	private int id;
	@Column(name="title",unique = true)
	private String title;

	@OneToMany(mappedBy="job",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<JobAdvertisements> jobAdvertisements;	
}

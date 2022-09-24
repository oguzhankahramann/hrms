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

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cities")
@Entity


public class Cities {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //pgsql
	@Column(name = "id",nullable = false)
	private int id;
	@Column(name="city_name",unique = true, nullable=false)
	private String cityName;
	
	
	@OneToMany(mappedBy="cities",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<JobAdvertisements> jobAdvertisements;

}

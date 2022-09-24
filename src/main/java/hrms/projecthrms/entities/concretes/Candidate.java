package hrms.projecthrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table (name="candidates")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "id",referencedColumnName = "id")
@Entity
public class Candidate extends User {
	
	
	
	
		@Column(name = "first_name", nullable = false)
		private String firstName;
		@Column(name = "last_name", nullable = false)
		private String lastName;
		@Column(name = "identity_number", nullable = false,unique = true)
		private String identityNumber;
		
	

}

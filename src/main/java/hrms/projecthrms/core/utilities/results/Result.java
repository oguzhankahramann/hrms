package hrms.projecthrms.core.utilities.results;

public class Result {
	
	private String message;
	private boolean success;
  public Result(boolean success) {
	  this.success=success;
  }	
  public Result (boolean success, String message) {
	  this(success); //this demek bu class demek , tek parametreli olan ctorunu cagırıyoruz success i set ediyor
	  this.message=message; //kendi mesajini set ediyor
	  
	  
  }
  public boolean isSuccess() {
	  return this.success;
  }
  public String getMessage() {
	  return this.message;
  }
  
  
}

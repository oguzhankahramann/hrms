package hrms.projecthrms.core.utilities.results;

public class DataResult<T> extends Result {

	private T data;

	// message dahil
	public DataResult(T data, boolean success, String message) {
		super(success, message);
		this.data = data;
		// TODO Auto-generated constructor stub
	}

	// message yollamayabiliriz
	public DataResult(T data, boolean success) {
		super(success);
		this.data = data;
		// TODO Auto-generated constructor stub
	}

	// getter
	public T getData() {
		return this.data;
	}
}

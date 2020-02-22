
public class CommercialClient extends Client{

	protected String commercialID;
	
	public CommercialClient(Account _account) {
		super(_account);
		commercialID = "00000000000000";
	}

	public void setCommercialID(String _commercialID) {
		commercialID = _commercialID;
	}
	
	public String getCommercialID() {
		return commercialID;
	}
	
	public String toString() {
		return "Name: "+name+", commercial ID: "+commercialID+", address: "+address+", phone number: "+phone+", account: "+account;
	}
}

package votingmgmtsys;

public class Voter {

	private String voter_id;
	private String voter_name;
	private Long voter_adhar;
	private int age;
	
	public Voter(String id,String name,Long no,int age) {
		this.voter_id = id;
		this.voter_name=name;
		this.voter_adhar=no;
		this.age=age;
	}
	
	public String getVoterId() {
		return this.voter_id;
	}
	
	public String getVoterName() {
		return this.voter_name;
	}
	public Long getAdhaar() {
		return this.voter_adhar;
	}
	public int getVoterAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Voter id :\s"+voter_id+"\tName:\s"+voter_name+"\n";
	}
}

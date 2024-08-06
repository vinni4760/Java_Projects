package votingmgmtsys;

public class Candidate {
	
	private String candidate_id;
	private String candidate_name;
	private String candidate_address;
	private int candidate_age;
	
	private boolean isfirst;
	private int no_of_election;
	private String name_of_election;
	private Boolean win_lose;
	private int win_count;
	private int loose_count;
	private int Countvotes;
	private int numberof_votes = 0;
	
	
	
	

	public String getCandidate_id() {
		return candidate_id;
	}
	
	public void setCandidate_id(String candidate_id) {
		this.candidate_id = candidate_id;
	}
	
	public String getCandidate_name() {
		return candidate_name;
	}
	
	public void setCandidate_name(String candidate_name) {
		this.candidate_name = candidate_name;
	}
	
	public String getCandidate_adhaar() {
		return candidate_address;
	}
	
	public void setCandidate_adhaar(String candidate_adhaar) {
		this.candidate_address = candidate_adhaar;
	}
	
	public int getCandidate_age() {
		return candidate_age;
	}
	
	public void setCandidate_age(int candidate_age) {
		this.candidate_age = candidate_age;
	}
	
	public boolean getIsfirst() {
		return this.isfirst;
	}
	
	public void setIsfirst(boolean isfirst) {
		this.isfirst = isfirst;
	}
	
	public int getNo_of_election() {
		return no_of_election;
	}
	
	public void setNo_of_election(int no_of_election) {
		this.no_of_election = no_of_election;
	}
	
	public String getName_of_election() {
		return name_of_election;
	}
	
	public void setName_of_election(String name_of_election) {
		this.name_of_election = name_of_election;
	}
	public boolean getWin_lose() {
		   return this.win_lose;
		}
	
	public void setWin_lose(boolean win_lose) {
		this.win_lose = win_lose;
	}
	public int getCountvotes() {
		return Countvotes;
	}
	public void setCountvotes(int countvotes) {
		Countvotes = countvotes;
	}

	public int getWin_count() {
		return win_count;
	}

	public void setWin_count(int win_count) {
		this.win_count = win_count;
	}

	public int getLoose_count() {
		return loose_count;
	}

	public void setLoose_count(int loose_count) {
		this.loose_count = loose_count;
	}
	
	
     public void setNumberofVotes() {
    	 this.numberof_votes++;
     }
	
	 

}

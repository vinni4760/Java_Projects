package votingmgmtsys;

import java.util.List;
import java.util.Scanner;

public class Admin {
	

	 public List<Candidate> registorCandidates() {
		 Candidate c1 = new Candidate();
		 c1.setCandidate_id("shyam@1232");
		 c1.setCandidate_name("Shyam Chouhan");
		 c1.setCandidate_adhaar("Khandwa");
		 c1.setCandidate_age(23);
		 c1.setIsfirst(true);
		 
		 Candidate c2 = new Candidate();
		 c2.setCandidate_id("mohan@1232");
		 c2.setCandidate_name("Madan Mohan");
		 c2.setCandidate_adhaar("Sanawad");
		 c2.setCandidate_age(32);
		 c2.setIsfirst(false);
		 c2.setWin_lose(true);
		 c2.setNo_of_election(5);
		 c2.setWin_count(4);
		 c2.setLoose_count(1);
		 
		 Candidate c3 = new Candidate();
		 c3.setCandidate_id("goutam@1232");
		 c3.setCandidate_name("goutam Ganni");
		 c3.setCandidate_adhaar("Barwah");
		 c3.setCandidate_age(36);
		 c3.setIsfirst(false);
		 c3.setWin_lose(false);
		 c3.setNo_of_election(6);
		 c3.setWin_count(6);
		 c3.setLoose_count(0);
		 

		 return List.of(c1,c2,c3);
		 
		 
	 }

}

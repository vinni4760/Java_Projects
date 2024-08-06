package votingmgmtsys;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VotingMachine {
	
	private List<Voter> voter;
	private List<Candidate> candidate;
	
	private Admin admin;
	Scanner scn = new Scanner(System.in);
	public VotingMachine() {
		this.voter=new ArrayList<Voter>();
		this.candidate=new ArrayList<Candidate>();
		this.admin=new Admin();
	
	}
	public void addVoter(Voter voter) {
		this.voter.add(voter);
	}
	public void getVoterList() {
		System.out.println(voter);
	}
	public void addCandidate(Candidate candidate) {
		this.candidate.add(candidate);
	}
	
	
	public void showMore(Candidate candidate) {
		System.out.println("\sName    :"+candidate.getCandidate_name());
		System.out.println("\sAddress :"+candidate.getCandidate_adhaar());
		if(!candidate.getIsfirst()) {
			System.out.println("\sNo of Election Fought :"+candidate.getNo_of_election());
			
				System.out.println("\sNumber of Wins    :"+candidate.getWin_count());
			
				System.out.println("\sNumber of loose   :"+candidate.getLoose_count());
			
		}
		
	}
	
	public void showCandidates() {
		System.out.println("\t===Candidates=== :");
		for(int i=0;i<candidate.size();i++) {
			System.out.println("\sName :"+candidate.get(i).getCandidate_name());
		}
		
	}
	
	public void vote() {
		for(int i=0;i<candidate.size();i++) {
			System.out.println("\sPress -> "+i+"\sto vote for :"+candidate.get(i).getCandidate_name());	
			
		}
		int vote = scn.nextInt();
		System.out.println("\sPress yes to show more details of your candidate:");
		char show = scn.next().charAt(0);
		if(show==89||show==121) {
			showMore(candidate.get(vote));
			System.out.println("\sPlease conform to vote press yes/no:");
			char confirm = scn.next().charAt(0);
			if(confirm==89||confirm==121) {
				candidate.get(vote).setNumberofVotes();	
			}
			else {
				System.out.println("\s===Reloading Candidates list=== ");
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				vote();
			}
				
		}
		
		 
		 System.out.println("***You have voted Successfully***");
		System.out.println(" ");
	}
	public void votingMenu() {
		candidate = admin.registorCandidates();
		while(true) {
			System.out.println("   \s    Welcome to Voting Menu         ");
			System.out.println("\s.Press 1 for Vote ");
			System.out.println("\s.Press 2 for exist ");
			System.out.println("\s.Press 3 to get Voters list");
			int i = scn.nextInt();
			
			
			if(i==1) {
			System.out.println("\t===Please Enter Details===");
			System.out.print("\sID    :-");
			String id = scn.next();
			System.out.print("\sName  :-");
			String name = scn.next();
			System.out.print("\sAge   :-");
			int age = scn.nextInt();
			System.out.print("\sAdhaar:-");
			Long adhaar = scn.nextLong();
			addVoter(new Voter(id,name,adhaar,age));
			showCandidates();
			vote();
			}
			else if(i==3) {
				System.out.println("\t===Voters info===");
				getVoterList();
			}
			else
				break;
		}
		
	}

}

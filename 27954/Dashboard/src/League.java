package cricketdashboardmanagement;
public class League {
	private String leagueName;
	private int noOfTeam;
	
	
	public League() {
		
	}
	
	public League(String leagueName) {
		this.leagueName = leagueName;
	}


	public League(String leagueName, int noOfTeam) {
		super();
		this.leagueName = leagueName;
		this.noOfTeam = noOfTeam;
	}


	public String getLeagueName() {
		return leagueName;
	}


	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}


	public int getNoOfTeam() {
		return noOfTeam;
	}


	public void setNoOfTeam(int noOfTeam) {
		this.noOfTeam = noOfTeam;
	}
	
	
	
	
	
	
}

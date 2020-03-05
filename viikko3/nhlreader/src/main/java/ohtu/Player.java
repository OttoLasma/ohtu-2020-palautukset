
package ohtu;

public class Player {
    private String name;
    private String team;
    private int goals;
    private int assists;
    private String nationality;
    private int penalties;
    private String birthdate;
    

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
	public String toString() {
		return "Player [name=" + name + ", team=" + team + ", goals=" + goals + ", assists=" + assists
				+ ", nationality=" + nationality + ", penalties=" + penalties + ", birthdate=" + birthdate + "]";
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getGoals() {
		return goals;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}

	public int getAssists() {
		return assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}
	public int getPoints() {
		return assists + goals;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public int getPenalties() {
		return penalties;
	}

	public void setPenalties(int penalties) {
		this.penalties = penalties;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
      
}

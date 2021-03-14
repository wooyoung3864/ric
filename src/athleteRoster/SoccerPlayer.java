package athleteRoster;

public class SoccerPlayer extends Athlete {
    private int pass;
    private int shoot;

    public SoccerPlayer(String name, String position, int number, String team, String height, int pass, int shoot) {
        super(name, position, number, team, height);
        this.pass = pass;
        this.shoot = shoot;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public int getShoot() {
        return shoot;
    }

    public void setShoot(int shoot) {
        this.shoot = shoot;
    }

    public String toString()
    {
        return super.getName() + ", " + super.getPosition() + ", " + super.getNumber() + ", plays for the " + super.getTeam() + ". " + "\n" + "Height: " + super.getHeight() + ", " +
                pass + " passing, " + shoot + " shooting.";
    }
}

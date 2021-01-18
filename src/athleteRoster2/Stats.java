package athleteRoster2;

public class Stats
{
	private int pts;
	private int fga;
	private int fgm;
	private int tpa;
	private int tpm;
	private int fta;
	private int ftm;
	private int reb;
	private int asst;
	private int fouls;
	
	public Stats(int pts, int fga, int fgm, int tpa, int tpm, int fta, int ftm, int reb, int asst, int fouls)
	{
		this.pts = pts;
		this.asst = asst;
		this.fouls = fouls;
		this.reb = reb;
		this.tpa = tpa;	
		this.tpm = tpm;
		this.fga = fga;
		this.fgm = fgm;
		this.fta = fta;
		this.ftm = ftm;
	}
	
	public int getPts() {
		return pts;
	}

	public void setPts(int pts) {
		this.pts = pts;
	}

	public int getFga() {
		return fga;
	}

	public void setFga(int fga) {
		this.fga = fga;
	}

	public int getFgm() {
		return fgm;
	}

	public void setFgm(int fgm) {
		this.fgm = fgm;
	}

	public int getTpa() {
		return tpa;
	}

	public void setTpa(int tpa) {
		this.tpa = tpa;
	}

	public int getTpm() {
		return tpm;
	}

	public void setTpm(int tpm) {
		this.tpm = tpm;
	}

	public int getFta() {
		return fta;
	}

	public void setFta(int fta) {
		this.fta = fta;
	}

	public int getFtm() {
		return ftm;
	}

	public void setFtm(int ftm) {
		this.ftm = ftm;
	}

	public int getReb() {
		return reb;
	}

	public void setReb(int reb) {
		this.reb = reb;
	}

	public int getAsst() {
		return asst;
	}

	public void setAsst(int asst) {
		this.asst = asst;
	}

	public int getFouls() {
		return fouls;
	}

	public void setFouls(int fouls) {
		this.fouls = fouls;
	}

	public String fouledOut(int fouls)
	{
		if(fouls >= 5)
		{
			return "Fouled out" + "\n";
		} else {
			return "Not fouled out" + "\n";
		}
	}
	
	public String fgp(int fgm, int fga)
	{
		double fgRatio = (double) (fgm/fga) * 100;
		double fgPercent = Math.round(fgRatio * 10d) / 10d;
		return "Field goal percentage: " + fgPercent + "%";
	}
	
	public String tpp(int tpm, int tpa)
	{
		double tpRatio = (double) (tpm/tpa) * 100;
		double tpPercent = Math.round(tpRatio * 10d) / 10d;
		return "3-point percentage: " + tpPercent + "%";
	}
	
	public String ftp(int ftm, int fta)
	{
		double ftRatio = (double) (ftm/fta) * 100;
		double ftPercent = Math.round(ftRatio * 10d) / 10d;
		return "Free throw percentage: " + ftPercent + "%";
	}
	
	public String toString()
	{
		return "Player stats " + "\nPoints: " + pts + "\nField goals: " + fgm + "\n3-pointers: " + tpm + "\nFree throws: " + ftm + "\nRebounds: " + reb + "\nAssists: " + asst + "\nFouls: " + fouls + "\n";  
	}

}

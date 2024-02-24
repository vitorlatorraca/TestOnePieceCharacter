public class OnePieceCharacter {
    private String name;
    private int bounty;
    private String pirateCrew;

    public OnePieceCharacter() {
        this.name = "Monkey D. Luffy";
        this.bounty = 150000000;
        this.pirateCrew = "Straw Hat Pirates";
    }

    public OnePieceCharacter(String name, int bounty, String pirateCrew) {
        this.name = name;
        this.bounty = bounty;
        this.pirateCrew = pirateCrew;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBounty(int bounty) {
        this.bounty = bounty;
    }

    public int getBounty() {
        return bounty;
    }

    public void setPirateCrew(String pirateCrew) {
        this.pirateCrew = pirateCrew;
    }

    public String getPirateCrew() {
        return pirateCrew;
    }

    public void printCharacter() {
        System.out.println("Name: " + name);
        System.out.println("Bounty: " + bounty + " Berries");
        System.out.println("Pirate Crew: " + pirateCrew);
    }
}

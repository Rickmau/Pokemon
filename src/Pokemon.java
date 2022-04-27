public class Pokemon {
    //Type --------- String
    //Skills ------- skill
    //isLegendary -- boolean
    //weakAgainst -- String
    //strongAgainst  String
    private String type;
    private Skills skill;
    private int hp;
    private boolean isLegendary;
    private String weakAgainst;
    private String strongAgainst;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Skills getSkill() {
        return skill;
    }

    public void setSkill(Skills skill) {
        this.skill = skill;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isLegendary() {
        return isLegendary;
    }

    public void setLegendary(boolean legendary) {
        isLegendary = legendary;
    }

    public String getWeakAgainst() {
        return weakAgainst;
    }

    public void setWeakAgainst(String weakAgainst) {
        this.weakAgainst = weakAgainst;
    }

    public String getStrongAgainst() {
        return strongAgainst;
    }

    public void setStrongAgainst(String strongAgainst) {
        this.strongAgainst = strongAgainst;
    }

    public Pokemon(String type, Skills skill, int hp, boolean isLegendary, String weakAgainst, String strongAgainst) {
        this.type = type;
        this.skill = skill;
        this.hp = hp;
        this.isLegendary = isLegendary;
        this.weakAgainst = weakAgainst;
        this.strongAgainst = strongAgainst;
    }
}

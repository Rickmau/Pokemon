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
    private int strenght;
    private int  speed;

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

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Pokemon(String type, Skills skill, int hp, boolean isLegendary, String weakAgainst, String strongAgainst, int strenght, int speed) {
        this.type = type;
        this.skill = skill;
        this.hp = hp;
        this.isLegendary = isLegendary;
        this.weakAgainst = weakAgainst;
        this.strongAgainst = strongAgainst;
        this.strenght = strenght;
        this.speed = speed;
    }

    public boolean Fight(Pokemon pokemonCont) {
        if(this.strongAgainst.equals(pokemonCont.getType())){
            this.skill.setbaseAta(this.skill.getbaseAta() + 20);
            pokemonCont.getSkill().setbaseAta(pokemonCont.getSkill().getbaseAta() - 20);
        }else if(pokemonCont.getStrongAgainst().equals(this.type)){
            this.skill.setbaseAta(this.skill.getbaseAta() -30);
            pokemonCont.getSkill().setbaseAta(pokemonCont.getSkill().getbaseAta() + 20);
        }else{

        }

        do {
            if(this.speed >= pokemonCont.speed){
                pokemonCont.setHp(pokemonCont.getHp() - this.skill.getbaseAta());
                if (pokemonCont.getHp() <= 0){
                    return true;
                }else{
                    this.hp -= pokemonCont.getSkill().getbaseAta();
                    if(this.hp <= 0){
                        return false;
                    }
                }
            }else{
                this.hp -= pokemonCont.getSkill().getbaseAta();
                if(this.hp <= 0){
                    return false;
                }
            }
        }while(true);
    }
}

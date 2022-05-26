public abstract class Character {
    //Atributes
    //Name ---------- String protected
    //Level --------- Int protected
    //Gender -------- Char protected

    protected String name;
    protected int level;
    protected char gender;

    public Character() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    //Create a constructor

    public Character(String name, int level, char gender) {
        this.name = name;
        this.level = level;
        this.gender = gender;
    }


    public abstract boolean Figth(Pokemon pokemon);

    //fight --------- Abstract
    public abstract boolean Fight(Pokemon pokemonCont);
}

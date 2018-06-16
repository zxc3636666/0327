public class Man {
    public String name, gender, attack, attribute;

    public Man(String name1, String gender1, String attack1, String attribute1) {
        name = name1;
        gender = gender1;
        attack = attack1;
        attribute = attribute1;
    }

    public void setName(String name1) {
        this.name = name1;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender1) {
        this.gender = gender1;
    }

    public String getGender() {
        return gender;
    }

    public void setAttack(String attack1) {
        this.attack = attack1;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttribute(String attribute1) {
        this.attribute = attribute1;
    }

    public String getAttribute() {
        return attribute;
    }

    public void showinfo() {
        System.out.println(name);
        System.out.println(gender);
        System.out.println(attack);
        System.out.println(attribute);
    }
}
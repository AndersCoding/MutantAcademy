package MutantAcademy;

import java.util.Random;

public class Students {
    public int getPowerLvl() {
        return powerLvl;
    }

    public void setPowerLvl(int powerLvl) {
        this.powerLvl = powerLvl;
    }

    public String[] getFirstName() {
        return firstName;
    }

    public void setFirstName(String[] firstName) {
        this.firstName = firstName;
    }

    public String[] getLastName() {
        return lastName;
    }

    public void setLastName(String[] lastName) {
        this.lastName = lastName;
    }

    public String[] getPowers() {
        return powers;
    }

    public void setPowers(String[] powers) {
        this.powers = powers;
    }

    //Fields
    private int powerLvl;

    //Array of names and powers
    private String[] firstName = {"Frank","Julie","George","Bellatrix","Arthur","Tom","Ginny","Connor","Luna","Franklin","Bengal","Gregorio","Shiobvhan","Romulus","Gerrie","Ava","Kendal","Logan","Jean","Scott","Sara"};
    private String[] lastName = {"McKullen","Svendsen","Artiero","LoganRoy","Bolrio","McAstori","Xi","Ngyen","Alphonso","LeNormal","Miklio","Thyrion","Judicios","Drexxor","Betlopin","Knocher","McTollin","Crevish","Devon","Trepidio","Stronzo"};
    private String[] powers = {"flight","strength","IQ","shapeshifting","ice","telekinesis","water","luck","invisibility","speed","cosmic power","immorality","time travel","animal powers","plant control","wealth","steel sknin","gravitational","healing"};

    //Constructor
    /*public Students (String[] firstname, String[] lastname, String[] powers, int powerLvl){
        this.firstName = firstname;
        this.lastName = lastname;
        this.powers = powers;
        this.powerLvl = powerLvl;
    }*/

    //Methods that randomly generates names from the arrays
    public String firstNameGen(){
        Random random = new Random();
        int index = random.nextInt(firstName.length);
        return firstName[index];
    }

    public String lastNameGen(){
        Random random = new Random();
        int index = random.nextInt(lastName.length);
        return lastName[index];
    }

    public String powerGen(){
        Random random = new Random();
        int index = random.nextInt(powers.length);
        return powers[index];
    }

    public int powerLvl(){
        Random random = new Random();
        return random.nextInt(200)+1;
    }
}

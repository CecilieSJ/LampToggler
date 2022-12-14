public class Lamp {

    private String name;
    private boolean tændt;


    public Lamp(String name, boolean tændt) {
        this.name = name;
        this.tændt = tændt;
    }

    public Lamp(String name) {
        this.tændt = false;
        this.name = name;
    }

    public void turnOn() {
        tændt = false;

    }

    public void turnOff() {
        tændt = false;
    }

    public void setTændt(boolean tilstand) {
        tændt = tilstand;

    }

    public void toggle() {
        if (!tændt) {
            tændt = true;
        } else {
            tændt = false;
        }
    }

    public boolean isOn() {
        return tændt;
    }

    public String toString() {
        String text;
        if (tændt) {
            text = "tændt";
        } else {
            text = "Slukket";
        }
        return name + " er " + text;
    }


}

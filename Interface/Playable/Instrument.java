package Interface.Playable;

public class Instrument implements Playable {
    private String name;

    public Instrument() {}

    public Instrument(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void play() {
        System.out.println("Play me!");
    }

    public boolean equals(Object obj) {
        boolean ans = false;
        if (obj instanceof Instrument) {
            Instrument instrument = (Instrument) obj;
            if (instrument.getName().equals(this.name)) {
                ans = true;
            }
        }
        return ans;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(name);
        return sb.toString();
    }
}
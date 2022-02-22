public class RockPlanet extends Planet{
    private boolean habitable;

    public RockPlanet(int orbitT, String desig, boolean habitable){
        super(orbitT, desig);
        this.habitable = habitable;
    }

    public boolean isHabitable() {
        return habitable;
    }

    public void setHabitable(boolean habitable) {
        this.habitable = habitable;
    }

    @Override
    public String toString() {
        return "RockPlanet{" +
                "habitable=" + habitable +
                '}';
    }
}

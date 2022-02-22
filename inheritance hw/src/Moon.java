import java.util.ArrayList;
import java.util.Objects;

public class Moon {
    private Planet planet;
    private int orbitTime;
    private boolean atmosphere;
    private String designation;

    public Moon (Planet planet, int orbitTime, boolean atmosphere, String designation){
        this.planet = planet;
        this.orbitTime = orbitTime;
        this.atmosphere = atmosphere;
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    public int getOrbitTime() {
        return orbitTime;
    }

    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }

    public boolean isAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(boolean atmosphere) {
        this.atmosphere = atmosphere;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Moon){
            Moon aMoon = (Moon) o;
            if(designation.equals("")||(aMoon.getDesignation().equals(""))){
                System.out.println("The moon is not defined");
                return false;
            }
            return(this.designation.equals(aMoon.getDesignation())
                    && this.orbitTime == (aMoon.getOrbitTime()));
        }
        return false;
    }
}

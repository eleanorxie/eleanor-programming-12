import java.awt.*;

public class GasPlanet extends Planet {
    private boolean hasRings;
    private Color color;

    public GasPlanet (int orbitT, String desig, boolean hasRings, Color color){
        super(orbitT, desig);
        this.hasRings = hasRings;
        this.color = color;
    }

    public boolean isHasRings() {
        return hasRings;
    }

    public void setHasRings(boolean hasRings) {
        this.hasRings = hasRings;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String toString() {
        return "GasPlanet{" + "orbit time: " + super.getOrbitTime() +
                "designation: " + super.getDesignation() +
                "hasRings: " + hasRings +
                ", color: " + color +
                '}';
    }
}

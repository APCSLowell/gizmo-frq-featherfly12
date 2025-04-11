public class Gizmo {
    private String maker;
    private boolean isElec;

    /** Returns the name of the manufacturer of this Gizmo. */
    public String getMaker() {
        return maker;
    }

    /** Returns true if this Gizmo is electronic, and false otherwise. */
    public boolean isElectronic() {
        return isElec;
    }

    /** Returns true if this Gizmo is equivalent to the Gizmo object represented by the
     * parameter, and false otherwise.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof Gizmo)) {
            return false;  // Return false if `other` is null or not a `Gizmo`
        }
        Gizmo otherGizmo = (Gizmo) other;  // Safely cast `other` to a Gizmo
        boolean sameMaker = (maker == null) ? otherGizmo.getMaker() == null : maker.equals(otherGizmo.getMaker());
        boolean bothElec = isElec == otherGizmo.isElectronic();
        return sameMaker && bothElec;
    }

    // Constructor to initialize the Gizmo object
    public Gizmo(String s, boolean e) {
        maker = s;
        isElec = e;
    }
}

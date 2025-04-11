public class Gizmo
 {
   private String maker;
   private boolean isElec;
   
   /** Returns the name of the manufacturer of this Gizmo. */
   public String getMaker()
   {
     return maker;
   }
   /** Returns true if this Gizmo is electronic, and false
   * otherwise.
   */
   public boolean isElectronic()
   {
     return isElec;
   }
   /** Returns true if this Gizmo is equivalent to the Gizmo
   * object represented by the
   * parameter, and false otherwise.
   */
   public boolean equals(Object other) {
    if (this == other) return true; // Check if both are the same object
    if (other == null || getClass() != other.getClass()) return false; // Check for null and same class
    Gizmo gizmo = (Gizmo) other; // Cast to Gizmo
    boolean sameMaker = maker.equals(gizmo.getMaker());
    boolean bothElec = isElec == gizmo.isElectronic();
    return sameMaker && bothElec;
}

   public Gizmo(String s, boolean e)
   {
     maker = s;
     isElec = e;
   }

import java.util.ArrayList;

public class OnlinePurchaseManager {
    /** An ArrayList of purchased Gizmo objects, instantiated in the constructor. */
    private ArrayList<Gizmo> purchases;

    // Constructor to initialize the purchases list
    public OnlinePurchaseManager() {
        purchases = new ArrayList<Gizmo>();
    }

    /** Returns the number of purchased Gizmo objects that are electronic
     * whose manufacturer is maker, as described in part (a).
     */
    public int countElectronicsByMaker(String maker) {
        int count = 0;
        for (Gizmo g : purchases) {
            // Check if the Gizmo is electronic and made by the specified manufacturer
            if (g.isElectronic() && g.getMaker().equals(maker)) {
                count++;
            }
        }
        return count;
    }

    /** Returns true if any pair of adjacent purchased Gizmo objects are
     * equivalent, and false otherwise, as described in part (b).
     */
    public boolean hasAdjacentEqualPair() {
        // If there are fewer than two purchases, there can't be adjacent pairs
        if (purchases.size() < 2) {
            return false;
        }

        // Check each pair of adjacent Gizmo objects
        for (int i = 0; i < purchases.size() - 1; i++) {
            // If two adjacent Gizmos are equivalent, return true
            if (purchases.get(i).equals(purchases.get(i + 1))) {
                return true;
            }
        }

        // If no adjacent equal pair is found, return false
        return false;
    }

    // Additional method to add Gizmos to the purchases list
    public void addPurchase(Gizmo g) {
        purchases.add(g);
    }

    // Optional: A method to print purchases (for debugging purposes)
    public void printPurchases() {
        for (Gizmo g : purchases) {
            System.out.println("Gizmo - Maker: " + g.getMaker() + ", Electronic: " + g.isElectronic());
        }
    }
}

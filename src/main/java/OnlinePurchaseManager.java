import java.util.*;

public class GizmoList
{
  private ArrayList<Gizmo> inventory;

  public GizmoList()
  {
    inventory = new ArrayList<Gizmo>();
  }

  public void addGizmo(Gizmo g)
  {
    inventory.add(g);
  }

  /** Returns the number of Gizmos in inventory by maker
   *  that are electronic.
   */
  public int countElectronicsByMaker(String maker)
  {
    int count = 0;
    for (Gizmo g : inventory)
    {
      if (g.isElectronic() && g.getMaker().equals(maker))
      {
        count++;
      }
    }
    return count;
  }

  /** Returns true if any two Gizmos in inventory are
   *  equivalent, but not the same object.
   */
  public boolean hasAdjacentEqualPair()
  {
    for (int i = 0; i < inventory.size() - 1; i++)
    {
      if (inventory.get(i).equals(inventory.get(i + 1)) &&
          inventory.get(i) != inventory.get(i + 1))
      {
        return true;
      }
    }
    return false;
  }
}

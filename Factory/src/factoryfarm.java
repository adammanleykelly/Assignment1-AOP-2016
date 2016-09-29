/*
 * Adam Manley Kelly R00113196
 */
public class factoryfarm
{
    public vegtable getVegtable(String vegtableType)
    {
        if(vegtableType == null)
        {
        return null;
        }
        if(vegtableType.equalsIgnoreCase("potatoe"))
        {
            return new potatoe();
        }
        else if(vegtableType.equalsIgnoreCase("carrot"))
        {
            return new carrot();
        }
        
        return null;
    }
}
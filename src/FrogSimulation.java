public class FrogSimulation
{
    private int goalDistance;
    private int maxHops;

    private int Hops; private int newHop; int startHop = 0;
    int simCount = 0; int negCount = 0;

    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance()
    {
        return goalDistance;
    }

    public boolean simulate()
    {
        for (int i = 0; i < 4; i++)
        {
            newHop = (int) (Math.random() * 7);
            startHop += newHop;
        }
        if (startHop >= maxHops)
        {
            simCount++;
            return true;
        }
        else
        {
            negCount++;
            return false;
        }
    }

    public double runSimulations()
    {
        int totalCount = simCount + negCount;

        return (simCount/totalCount);
    }
}

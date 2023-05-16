import java.util.ArrayList;

public class Neuron {


    //Cell Body
    private CellBody cellBody;
    //Axon
    private ArrayList<Axon> axonList;
    //Dendrite
    private ArrayList<Dendrite> dendList;

    private int typeOfNeuron;//0,1,2

    private String[] typesOfNeurons = new String[]{"Sensory", "Motor", "interneurons"};



    public Neuron()
    {

    }

    public void SetAxons(ArrayList<Axon> axs)
    {
        axonList = axs;
    }

    public void SetDendrites(ArrayList<Dendrite> dends)
    {
        dendList = dends;
    }

    public void SetCellBody(CellBody cb)
    {
        cellBody = cb;
    }

    public void Fire()
    {

    }

    public void Fire(Message m)
    {

    }
}

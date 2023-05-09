import java.util.ArrayList;

public class Neuron {


    //Cell Body
    private CellBody cb;
    //Axon
    private ArrayList<Axon> axonList;
    //Dendrite
    private ArrayList<Dendrite> dendList;

    private int typeOfNeuron;//0,1,2

    private String[] typesOfNeurons = new String[]{"Sensory", "Motor", "interneurons"};



    public Neuron()
    {

    }



    public void Fire()
    {

    }
}

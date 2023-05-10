import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        Neuron neu = new Neuron();

        CellBody cb = new CellBody();
        Nucleus nuc = new Nucleus();
        cb.SetNucleus(nuc);

        ArrayList<Axon> axonList = new ArrayList<>();
        Axon aOne = new Axon();
        Axon aTwo = new Axon();
        axonList.add(aOne);
        axonList.add(aTwo);

        ArrayList<Dendrite> dendriteList = new ArrayList<>();
        Dendrite dOne = new Dendrite();
        Dendrite dTwo = new Dendrite();
        dendriteList.add(dOne);
        dendriteList.add(dTwo);


        //Cell Body processes message
        Message m = new Message();


    }
}

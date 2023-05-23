import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        Neuron neu = new Neuron();

        CellBody cb = new CellBody(new Nucleus(), new Mitochondria(), new ArrayList<Ribosome>(), new EndoplasmicReticulum(), new Golgiapparatus(), new Cytoplasm(), new Membrane() );


        Nucleus nuc = new Nucleus();
        //cb.SetNucleus(nuc);
        neu.SetCellBody(cb);


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

        neu.SetAxons(axonList);
        neu.SetDendrites(dendriteList);




        //Cell Body processes message
        Message m = new Message();
        //Or a neurotransmitter
        Acetylcholine acet = new Acetylcholine();
        Adrenaline adren = new Adrenaline();
        Dopamine dopamine = new Dopamine();
        GABA gaba = new GABA();
        Glutamate glutamate = new Glutamate();
        Oxytocin oxy = new Oxytocin();
        Serotonin ser = new Serotonin();



    }
}

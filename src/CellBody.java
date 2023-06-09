import java.util.List;

public class CellBody {

        //Nucleus
        private Nucleus nucleus;

        private Mitochondria mito;
        private List<Ribosome> ribosomes;
        private EndoplasmicReticulum endoret;
        private Golgiapparatus golapp;
        private Cytoplasm cyto;
        private Membrane mem;
        private List<AxonHillock> axonHillocks;


        public CellBody()
        {

        }

        public CellBody(Nucleus n, Mitochondria m, List<Ribosome> ribo, EndoplasmicReticulum er, Golgiapparatus ga, Cytoplasm c, Membrane me, List<AxonHillock> axHills)
        {
            nucleus = n;
            mito = m;
            ribosomes = ribo;
            endoret = er;
            golapp = ga;
            cyto = c;
            mem = me;
            axonHillocks = axHills;
            System.out.println("A new cell body has been created.");
        }



        public void SetNucleus(Nucleus nuc)
        {
                nucleus = nuc;
        }




}

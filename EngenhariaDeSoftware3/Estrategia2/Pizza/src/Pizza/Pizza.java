package Pizza;

import Backend.Catupiry;
import Backend.Com;


public class Pizza {

    private Catupiry catupiry;

    public void setCatupiry(Catupiry lancar){
        catupiry = lancar;
    }

    public void realizarCatupiry(){
        catupiry.catupiry();
    }

    private Entrega entrega;

    public void setEntrega(Entrega lancar) {entrega = lancar; }

    public void realizarEntrega() { entrega.entrega();}
}

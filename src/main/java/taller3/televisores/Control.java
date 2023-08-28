package taller3.televisores;
public class Control {
    TV tv;
    public void canalUp(){
        if (canal<120)
            canal++;
    }
    public void canalDown(){
        if (volumen>1)
            canal--;
    }
    public void volumenUp(){
        if (volumen<7)
            volumen++;
    }
    public void volumenDown() {
        if (volumen>0)
            volumen--;
    }
    public void W   enlazar(TV televisor) {
        televisor.control = this;
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }
}

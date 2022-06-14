package hunia.company;

public class Wielorybek extends Zwierzeta
{
    @Override
    public void plyn() {
        super.plyn();
        System.out.println("plynie");
    }

    @Override
    public void wynruz() {
        super.wynruz();
        System.out.println("wynurza");
    }

    @Override
    public void zanurz() {
        super.zanurz();
        System.out.println("zanurza");
    }


}

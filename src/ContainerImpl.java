/**
 * Created by Fabian on 24.05.2017.
 */
public class ContainerImpl implements Container {

    protected String[] elemente;
    protected int size = 0;

    public ContainerImpl(int n)
    {
        elemente = new String[n];
    }

    @Override
    public int anzahl() {
        return size;
    }

    @Override
    public int maxAnzahl() {
       return size;
    }

    @Override
    public boolean istLeer() {
        return size==0;
    }

    @Override
    public boolean istVoll() {
        return size==elemente.length;
    }

    @Override
    public int schreiben(String element) {
        if(istVoll())
        {
            return -1;
        }
        else
        {
            elemente[size++]=element;
            return element.length();
        }

    }

    @Override
    public String lesen() {
        return null;
    }
}

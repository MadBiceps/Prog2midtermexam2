/**
 * Created by Fabian on 24.05.2017.
 */
public class StapelImpl extends ContainerImpl implements Stapel{

    public StapelImpl(int n)
    {
        super(n);
    }

    @Override
    public String lesen() {

        if(istLeer())
        {
            return null;
        }
        else
        {
            return elemente[--size];
        }
    }
}

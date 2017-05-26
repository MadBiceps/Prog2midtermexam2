/**
 * Created by Fabian on 24.05.2017.
 */
public class SchlangeImpl extends ContainerImpl implements Schlange {

    public SchlangeImpl(int n)
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
            String x = elemente[0];
            size--;
            for(int i=0; i<size; i++)
            {
                elemente[i]=elemente[i+1];
            }
            return x;
        }
    }
}

/**
 * Created by Fabian on 24.05.2017.
 */
public class SSchlangeImpl extends ContainerImpl implements SSchlange {

    public SSchlangeImpl(int n)
    {
        super(n);
    }


    @Override
    public double avg() {
        if(istLeer())
        {
            return 0.0;
        }
        else
        {
            int x=0;
            for(int i=0; i<size; i++)
            {
                x+=elemente[i].length();
            }
            x/=size;
            return x;
        }
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

    @Override
    public int schreiben(String element)
    {
        if(istVoll())
        {
            return -1;
        }
        else
        {
            if(istLeer())
            {
                size++;
                elemente[0]=element;
                return element.length();
            }
            else {
                int i = 0;
                while ((elemente[i].length() < element.length()) && (i < size)) {
                    i++;
                }
                size++;
                for (int j = size - 1; j > i; j--) {
                    elemente[j] = elemente[j - 1];
                }
                elemente[i] = element;
                return element.length();
            }
        }
    }
}

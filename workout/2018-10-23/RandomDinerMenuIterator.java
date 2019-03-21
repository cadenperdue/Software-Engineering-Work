import java.util.*;

public class RandomDinerMenuIterator implements Iterator {
    MenuItem[] list;
    int position = 0;
    ArrayList<MenuItem> arrList;
    public RandomDinerMenuIterator(MenuItem[] list)
    {
        this.list = list;
        
        arrList = new ArrayList<MenuItem>(Arrays.asList(list));
        Collections.shuffle(arrList);
        
    }

    public Object next()
    {
        MenuItem menuItem = arrList.get(position);
        position++;
        return menuItem;
    }

    public boolean hasNext()
    {
        if(position >= arrList.size() || arrList.get(position) == null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}


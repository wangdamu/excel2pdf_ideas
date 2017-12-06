package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class DocumentPropertyCollection
  implements Iterable
{
  private ArrayList a = new ArrayList();
  
  public int getCount()
  {
    return this.a.size();
  }
  
  public DocumentProperty get(String name)
  {
    if (!zbrg.a(name)) {
      throw new CellsException(7, "The argument cannot be null or empty string.");
    }
    zbrg.a(name, "name");
    for (int i = 0; i < this.a.size(); i++)
    {
      DocumentProperty localDocumentProperty = (DocumentProperty)this.a.get(i);
      if (zw.b(localDocumentProperty.getName().toLowerCase(), name.toLowerCase())) {
        return localDocumentProperty;
      }
    }
    return null;
  }
  
  public DocumentProperty get(int index)
  {
    return (DocumentProperty)this.a.get(index);
  }
  
  public Iterator iterator()
  {
    return this.a.iterator();
  }
  
  DocumentProperty a(int paramInt1, int paramInt2, String paramString, Object paramObject, boolean paramBoolean)
  {
    DocumentProperty localDocumentProperty = new DocumentProperty(this, paramInt1, paramInt2, paramString, paramObject, paramBoolean);
    zf.a(this.a, localDocumentProperty);
    return localDocumentProperty;
  }
  
  public boolean contains(String name)
  {
    int i = indexOf(name);
    return i != -1;
  }
  
  public int indexOf(String name)
  {
    for (int i = 0; i < this.a.size(); i++)
    {
      DocumentProperty localDocumentProperty = (DocumentProperty)this.a.get(i);
      if (zw.b(localDocumentProperty.getName().toLowerCase(), name.toLowerCase())) {
        return i;
      }
    }
    return -1;
  }
  
  public void remove(String name)
  {
    zbrg.a(name, "name");
    int i = indexOf(name);
    if (i != -1) {
      removeAt(i);
    }
  }
  
  public void removeAt(int index)
  {
    DocumentProperty localDocumentProperty1 = get(index);
    this.a.remove(index);
    for (int i = 0; i < getCount(); i++)
    {
      DocumentProperty localDocumentProperty2 = get(i);
      if ((localDocumentProperty2.c()) && (localDocumentProperty2.b() == localDocumentProperty1.a()))
      {
        this.a.remove(i);
        break;
      }
    }
  }
  
  public void clear()
  {
    this.a.clear();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/DocumentPropertyCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
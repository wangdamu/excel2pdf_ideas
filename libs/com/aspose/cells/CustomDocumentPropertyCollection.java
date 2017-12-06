package com.aspose.cells;

import java.util.Iterator;

public class CustomDocumentPropertyCollection
  extends DocumentPropertyCollection
{
  private WorksheetCollection a;
  
  CustomDocumentPropertyCollection(WorksheetCollection sheets)
  {
    this.a = sheets;
  }
  
  DocumentProperty a(String paramString, Object paramObject)
  {
    zbrg.a(paramString, "name");
    return a(2, a(), paramString, paramObject, false);
  }
  
  public DocumentProperty add(String name, String value)
  {
    zbrg.a(name, "name");
    remove(name);
    return a(2, a(), name, value, false);
  }
  
  public DocumentProperty add(String name, int value)
  {
    zbrg.a(name, "name");
    remove(name);
    return a(2, a(), name, Integer.valueOf(value), false);
  }
  
  public DocumentProperty add(String name, DateTime value)
  {
    zbrg.a(name, "name");
    remove(name);
    return a(2, a(), name, value, false);
  }
  
  public DocumentProperty add(String name, boolean value)
  {
    zbrg.a(name, "name");
    remove(name);
    return a(2, a(), name, Boolean.valueOf(value), false);
  }
  
  public DocumentProperty add(String name, double value)
  {
    zbrg.a(name, "name");
    remove(name);
    return a(2, a(), name, Double.valueOf(value), false);
  }
  
  public DocumentProperty addLinkToContent(String name, String source)
  {
    zbrg.a(name, "name");
    remove(name);
    Name localName = this.a.getNames().get(source);
    String str = "";
    if (localName != null)
    {
      localObject = localName.getRange();
      if (localObject != null)
      {
        Cell localCell = ((Range)localObject).getWorksheet().getCells().checkCell(((Range)localObject).getFirstRow(), ((Range)localObject).getFirstColumn());
        if (localCell != null) {
          str = localCell.k();
        }
      }
    }
    Object localObject = a(2, a(), name, str, false);
    int i = ((DocumentProperty)localObject).a() | 0x1000000;
    name = "?_generated_" + ((DocumentProperty)localObject).a() + "." + i;
    a(2, i, name, source, true);
    return (DocumentProperty)localObject;
  }
  
  public void updateLinkedPropertyValue()
  {
    if (getCount() > 0)
    {
      Iterator localIterator = iterator();
      while (localIterator.hasNext())
      {
        DocumentProperty localDocumentProperty = (DocumentProperty)localIterator.next();
        if ((!localDocumentProperty.c()) && (localDocumentProperty.isLinkedToContent())) {
          localDocumentProperty.setValue(this.a.getRangeByName(localDocumentProperty.getSource()).getValue());
        }
      }
    }
  }
  
  public void updateLinkedRange()
  {
    if (getCount() > 0)
    {
      Iterator localIterator = iterator();
      while (localIterator.hasNext())
      {
        DocumentProperty localDocumentProperty = (DocumentProperty)localIterator.next();
        if ((!localDocumentProperty.c()) && (localDocumentProperty.isLinkedToContent()))
        {
          Range localRange = this.a.getRangeByName(localDocumentProperty.getSource());
          if (localRange != null) {
            localRange.setValue(localDocumentProperty.getValue());
          }
        }
      }
    }
  }
  
  private int a()
  {
    int i = 1;
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      DocumentProperty localDocumentProperty = (DocumentProperty)localIterator.next();
      i = Math.max(i, localDocumentProperty.b());
    }
    return i + 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/CustomDocumentPropertyCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.aspose.cells;

import java.util.Iterator;

public class TextParagraphCollection
{
  private FontSettingCollection a;
  
  TextParagraphCollection(FontSettingCollection runs)
  {
    this.a = runs;
  }
  
  public int getCount()
  {
    int i = 0;
    Iterator localIterator = iterator();
    while (localIterator.hasNext()) {
      i++;
    }
    return i;
  }
  
  public TextParagraph get(int index)
  {
    int i = 0;
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      if (i == index) {
        return (TextParagraph)localIterator.next();
      }
      i++;
    }
    return null;
  }
  
  public Iterator iterator()
  {
    return new zbwb(this.a);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/TextParagraphCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
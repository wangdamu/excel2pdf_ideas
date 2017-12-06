package com.aspose.cells.b.a.b.d;

import java.awt.Font;
import java.util.Hashtable;

public class za
{
  private Hashtable a;
  
  protected za(Hashtable paramHashtable)
  {
    this.a = paramHashtable;
  }
  
  public void a(String paramString, Font paramFont)
  {
    if (!this.a.containsKey(paramString)) {
      this.a.put(paramString, paramFont);
    }
  }
  
  public boolean a(String paramString)
  {
    return this.a.containsKey(paramString);
  }
  
  public Font b(String paramString)
  {
    return (Font)this.a.get(paramString);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/d/za.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.aspose.cells.b.a.b.d.a;

import com.aspose.cells.a.e.ze;
import com.aspose.cells.b.a.b.d.za;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.util.Hashtable;

public class zb
  extends za
{
  private static Hashtable a = ;
  
  public zb()
  {
    super(a);
  }
  
  static
  {
    Font[] arrayOfFont = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();
    for (int i = 0; i < arrayOfFont.length; i++)
    {
      String str = arrayOfFont[i].getFamily();
      if (!a.containsKey(str)) {
        a.put(str, arrayOfFont[i]);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/d/a/zb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
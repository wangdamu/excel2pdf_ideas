package com.aspose.cells.b.a.b;

import com.aspose.cells.Color;
import java.util.Hashtable;

public class zl
{
  private static Hashtable a = new Hashtable();
  
  public static Color a(zk paramzk)
  {
    if (a.containsKey(paramzk)) {
      return (Color)a.get(paramzk);
    }
    Color localColor = Color.fromArgb(paramzk.b());
    a.put(paramzk, localColor);
    return localColor;
  }
  
  static
  {
    a.put(zk.E, Color.a(zk.E));
    a.put(zk.J, Color.a(zk.J));
    a.put(zk.L, Color.a(zk.L));
    a.put(zk.av, Color.a(zk.av));
    a.put(zk.ba, Color.a(zk.ba));
    a.put(zk.be, Color.a(zk.be));
    a.put(zk.bt, Color.a(zk.bt));
    a.put(zk.bv, Color.a(zk.bv));
    a.put(zk.bK, Color.a(zk.bK));
    a.put(zk.bL, Color.a(zk.bL));
    a.put(zk.bU, Color.a(zk.bU));
    a.put(zk.cc, Color.a(zk.cc));
    a.put(zk.ci, Color.a(zk.ci));
    a.put(zk.B, Color.a(zk.B));
    a.put(zk.A, Color.a(zk.A));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/zl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
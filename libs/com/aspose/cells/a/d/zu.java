package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.zo;
import java.util.ArrayList;

public class zu
  extends zn
{
  private ArrayList a = new ArrayList();
  
  public zu() {}
  
  public zu(float[] paramArrayOfFloat)
  {
    int i = paramArrayOfFloat.length / 2;
    for (int j = 0; j < i; j++) {
      com.aspose.cells.b.a.a.zf.a(this.a, new zo(paramArrayOfFloat[(j * 2)], paramArrayOfFloat[(j * 2 + 1)]));
    }
  }
  
  public ArrayList a()
  {
    return this.a;
  }
  
  public void a(zf paramzf)
    throws Exception
  {
    paramzf.a(this);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
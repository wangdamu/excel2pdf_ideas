package com.aspose.cells;

import com.aspose.cells.a.d.zb;
import com.aspose.cells.a.d.zf;
import java.util.ArrayList;

class zmy
{
  private zgz a;
  
  zmy(ArrayList paramArrayList, float paramFloat1, float paramFloat2, float paramFloat3, double[] paramArrayOfDouble, int paramInt, zf paramzf)
    throws Exception
  {
    zgz.a(paramArrayList, false);
    zgw localzgw = new zgw();
    localzgw.b(paramInt);
    localzgw.a(new Style());
    localzgw.c().setTextWrapped(true);
    localzgw.a(paramArrayList);
    localzgw.b(false);
    this.a = zha.a(localzgw, paramFloat1, paramFloat2, paramFloat3, paramArrayOfDouble, paramzf, false);
  }
  
  void a(zb paramzb)
    throws Exception
  {
    this.a.a(paramzb);
  }
  
  int a()
  {
    return this.a.i.size();
  }
  
  float b()
  {
    return this.a.e;
  }
  
  float c()
  {
    return this.a.f;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zmy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.aspose.cells;

import com.aspose.cells.a.d.zf;

class zha
{
  static zhb a(zgw paramzgw, float paramFloat1, float paramFloat2)
    throws Exception
  {
    zhb localzhb = new zhb(paramzgw, paramFloat1, paramFloat2);
    localzhb.a();
    return localzhb;
  }
  
  static zgz a(zgw paramzgw, float paramFloat1, float paramFloat2, float paramFloat3, double[] paramArrayOfDouble, zf paramzf, boolean paramBoolean)
    throws Exception
  {
    Object localObject;
    if (paramBoolean) {
      localObject = new zbye(paramzgw, paramFloat1, paramFloat2, paramFloat3, paramArrayOfDouble);
    } else {
      localObject = new zaen(paramzgw, paramFloat1, paramFloat2, paramFloat3, paramArrayOfDouble);
    }
    ((zgz)localObject).a();
    ((zgz)localObject).j = paramzf;
    return (zgz)localObject;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcbe
  extends zche
{
  private boolean a = false;
  
  zcbe(boolean paramBoolean)
  {
    this.a = paramBoolean;
    if (paramBoolean) {
      this.d = 1052;
    } else {
      this.d = 465;
    }
  }
  
  void a(IconSet paramIconSet)
  {
    int i = this.a ? 4 : 0;
    this.c = new byte[6 + i];
    System.arraycopy(zc.a(zcij.r(paramIconSet.a)), 0, this.c, i + 0, 4);
    if (!paramIconSet.getShowValue())
    {
      int tmp59_58 = (i + 4);
      byte[] tmp59_53 = this.c;
      tmp59_53[tmp59_58] = ((byte)(tmp59_53[tmp59_58] | 0x2));
    }
    if (paramIconSet.b)
    {
      int tmp79_78 = (i + 4);
      byte[] tmp79_73 = this.c;
      tmp79_73[tmp79_78] = ((byte)(tmp79_73[tmp79_78] | 0x4));
    }
    if (paramIconSet.isCustom())
    {
      int tmp99_98 = (i + 4);
      byte[] tmp99_93 = this.c;
      tmp99_93[tmp99_98] = ((byte)(tmp99_93[tmp99_98] | 0x1));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcbe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
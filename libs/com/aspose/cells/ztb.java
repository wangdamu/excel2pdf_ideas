package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class ztb
  extends zcd
{
  private short a;
  
  ztb()
  {
    c(255);
    this.a = 8;
  }
  
  void a(zrg paramzrg, ArrayList paramArrayList)
    throws Exception
  {
    int i = paramArrayList.size() * 8 + 2;
    int j = 0;
    if (i <= 8224)
    {
      this.b = new byte[i];
      this.b[0] = ((byte)this.a);
      j = 2;
      for (k = 0; k < paramArrayList.size(); k++)
      {
        zatv localzatv1 = (zatv)paramArrayList.get(k);
        System.arraycopy(zc.a(localzatv1.a), 0, this.b, j, 4);
        System.arraycopy(zc.a(localzatv1.b), 0, this.b, j + 4, 2);
        j += 8;
      }
      paramzrg.a(f());
      paramzrg.b(i);
      paramzrg.a(this.b, this.b.length);
      return;
    }
    int k = 8222 / this.a;
    i = k * this.a;
    for (int m = 0; m < paramArrayList.size(); m++)
    {
      if (m == 0)
      {
        this.b = new byte[i];
        this.b[0] = ((byte)this.a);
        j = 2;
      }
      else if (m % k == 0)
      {
        paramzrg.a(f());
        paramzrg.b(this.b.length);
        paramzrg.a(this.b, this.b.length);
        int n = 2 + this.a * (paramArrayList.size() - m);
        if (n <= 8224) {
          this.b = new byte[n];
        } else {
          this.b = new byte[i];
        }
        this.b[0] = ((byte)this.a);
        j = 2;
      }
      zatv localzatv2 = (zatv)paramArrayList.get(m);
      System.arraycopy(zc.a(localzatv2.a), 0, this.b, j, 4);
      System.arraycopy(zc.a(localzatv2.b), 0, this.b, j + 4, 2);
      j += 8;
    }
    if (j != 2)
    {
      paramzrg.a(f());
      paramzrg.b(this.b.length);
      paramzrg.a(this.b, this.b.length);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ztb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
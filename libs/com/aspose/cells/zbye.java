package com.aspose.cells;

import com.aspose.cells.a.d.zb;
import com.aspose.cells.a.d.zbj;
import com.aspose.cells.a.d.zh;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zo;
import java.util.ArrayList;
import java.util.Iterator;

class zbye
  extends zbyd
{
  zbye(zgw paramzgw, float paramFloat1, float paramFloat2, float paramFloat3, double[] paramArrayOfDouble)
  {
    super(paramzgw, paramFloat1, paramFloat2, paramFloat3, paramArrayOfDouble);
  }
  
  protected void a(double[] paramArrayOfDouble)
    throws Exception
  {
    while (this.k.r().size() > 0)
    {
      zbyg localzbyg = new zbyg(this.i.size() == 0, this.n, this.c, this.d - this.k.a() * a / 72.0F, this.k, this.m, paramArrayOfDouble);
      localzbyg.m = this.j;
      localzbyg.a();
      zf.a(this.i, localzbyg);
    }
  }
  
  protected float a(double paramDouble, float paramFloat)
  {
    return zgz.b(paramDouble, paramFloat);
  }
  
  void a(zb paramzb)
    throws Exception
  {
    zb localzb = null;
    float f2 = 0.0F;
    for (int i = 0; i < this.i.size(); i++)
    {
      zanw localzanw = (zanw)this.i.get(i);
      int j = 0;
      Iterator localIterator = localzanw.b.iterator();
      while (localIterator.hasNext())
      {
        zbeu localzbeu = (zbeu)localIterator.next();
        if (localzbeu != null)
        {
          if (localzbeu.a.d == 1)
          {
            f2 = this.d / a * 72.0F - this.f;
            if (f2 < 0.0F) {
              f2 = 0.0F;
            }
            if (this.f < this.d / a * 72.0F) {
              this.f = (this.d / a * 72.0F);
            }
          }
          Color localColor = Color.fromArgb(localzbeu.a.b.getColor().toArgb());
          int k = localzbeu.a.b.p();
          localzbeu.a.a = localzbeu.a.a.replace('\r', ' ');
          String str = localzbeu.a.a;
          if (str.length() != 0)
          {
            float f1 = Math.max(0.1F, a(localzbeu.a.b.getDoubleSize(), this.m));
            if ((localzbeu.a.b.isSubscript()) || (localzbeu.a.b.isSuperscript())) {
              f1 *= b;
            }
            zbj localzbj = zbj.a(localzbeu.a.b.getName(), f1, k);
            zh localzh = new zh(localzbj, localColor, new zo(localzanw.f + (localzanw.d - localzbeu.d) / 2.0F, localzanw.c + localzbeu.c + f2 + j * localzanw.i - localzbeu.f), str, localzbeu.a.b.isSuperscript(), localzbeu.a.b.isSubscript());
            localzb = a(localzanw, localzbeu, localzh);
            localzh.c = localzbeu.a.b.getUnderline();
            if (localzbeu.a.d != 4)
            {
              localzh.b(localzbeu.e);
              if (localzb != null)
              {
                paramzb.a(localzb);
                localzb = null;
              }
              else
              {
                paramzb.a(localzh);
              }
            }
            j++;
          }
        }
      }
    }
  }
  
  private zb a(zanw paramzanw, zbeu paramzbeu, zh paramzh)
  {
    zb localzb = null;
    String str = paramzh.h();
    if ((this.k.c().getRotationAngle() == 255) && (str.length() == 1) && (zbbt.a(str.charAt(0))))
    {
      float f1 = paramzh.g().d();
      float f2 = paramzh.g().e() + paramzbeu.f - paramzbeu.e / 2.0F - paramzbeu.d / 2.0F;
      f1 -= (paramzbeu.e - paramzbeu.d) / 2.0F;
      localzb = new zb();
      localzb.a(new zi(1.0F, 0.0F, 0.0F, 1.0F, f1, f2));
      localzb.a().a(90.0F, new zo(0.0F, 0.0F));
      paramzh.a(new zo(0.0F, -paramzbeu.f));
      localzb.a(paramzh);
    }
    return localzb;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbye.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
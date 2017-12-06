package com.aspose.cells;

import com.aspose.cells.a.d.zb;
import com.aspose.cells.a.d.zbj;
import com.aspose.cells.a.d.zh;
import com.aspose.cells.a.d.zn;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

class zaen
  extends zaem
{
  zaen(zgw paramzgw, float paramFloat1, float paramFloat2, float paramFloat3, double[] paramArrayOfDouble)
  {
    super(paramzgw, paramFloat1, paramFloat2, paramFloat3, paramArrayOfDouble);
  }
  
  protected void a(double[] paramArrayOfDouble)
    throws Exception
  {
    while (this.k.r().size() > 0)
    {
      zaew localzaew = new zaew(this.i.size() == 0, this.n, this.c - this.k.a() * a / 72.0F, this.d, this.k, this.m, paramArrayOfDouble);
      localzaew.m = this.j;
      localzaew.a();
      zf.a(this.i, localzaew);
    }
  }
  
  protected float a(double paramDouble, float paramFloat)
  {
    return zgz.b(paramDouble, paramFloat);
  }
  
  protected void b(zgw paramzgw)
  {
    ArrayList localArrayList = paramzgw.r();
    if ((paramzgw.c() != null) && (paramzgw.c().isTextWrapped())) {
      for (int i = localArrayList.size() - 1; i > 0; i--)
      {
        zqb localzqb1 = (zqb)localArrayList.get(i);
        if (((localzqb1.d != 8) || (localzqb1.a == null) || (zw.a(localzqb1.a).length() != 0)) && ((localzqb1.d != 4) || (paramzgw.c().getHorizontalAlignment() != 8) || (paramzgw.a))) {
          break;
        }
        zqb localzqb2 = (zqb)localArrayList.get(i - 1);
        if (localzqb2.d == 16) {
          break;
        }
        localArrayList.remove(i);
      }
    }
  }
  
  void a(zb paramzb)
    throws Exception
  {
    zb localzb = null;
    float f2 = 0.0F;
    b(paramzb);
    for (int i = 0; i < this.i.size(); i++)
    {
      zanw localzanw = (zanw)this.i.get(i);
      int j = 0;
      float f3 = localzanw.f;
      Iterator localIterator = localzanw.b.iterator();
      while (localIterator.hasNext())
      {
        zbeu localzbeu = (zbeu)localIterator.next();
        if (localzbeu != null)
        {
          if (localzbeu.a.d == 1)
          {
            f2 = this.c / a * 72.0F - 2.0F - this.e;
            if (f2 < 0.0F) {
              f2 = 0.0F;
            }
            if (this.e < this.c / a * 72.0F) {
              this.e = (this.c / a * 72.0F);
            }
          }
          Color localColor = Color.fromArgb(localzbeu.a.b.getColor().toArgb());
          int k = localzbeu.a.b.p();
          localzbeu.a.a = localzbeu.a.a.replace('\r', ' ');
          float f4 = 0.0F;
          String str = localzbeu.a.a;
          if ((str.length() != 0) || (localzbeu.a.b.getUnderline() != 0))
          {
            float f1 = Math.max(0.1F, a(localzbeu.a.b.getDoubleSize(), this.m));
            if ((localzbeu.a.b.isSubscript()) || (localzbeu.a.b.isSuperscript())) {
              f1 *= b;
            }
            zbj localzbj = zbj.a(localzbeu.a.b.getName(), f1, k);
            zh localzh;
            if (this.k.t())
            {
              f4 = this.e - (localzanw.f + localzbeu.b + localzbeu.d) - j * localzanw.i;
              localzh = new zh(localzbj, localColor, new zo(f4, localzanw.c - localzanw.g), str, localzbeu.a.b.isSuperscript(), localzbeu.a.b.isSubscript());
            }
            else
            {
              f4 = localzanw.f + localzbeu.b;
              if ((this.h == 3) || (this.h == 6))
              {
                localzh = new zh(localzbj, localColor, new zo(f4 + j * localzanw.i + f2, localzanw.c - localzanw.g), str, localzbeu.a.b.isSuperscript(), localzbeu.a.b.isSubscript());
                localzb = a(localzanw, localzbeu, localzh);
              }
              else
              {
                localzh = new zh(localzbj, localColor, new zo(localzbeu.a.d == 1 ? f3 : f3 + f2, localzanw.c - localzanw.g), str, localzbeu.a.b.isSuperscript(), localzbeu.a.b.isSubscript());
                localzb = a(localzanw, localzbeu, localzh);
                f3 += localzbeu.d;
                localzh.a(f3 + f2);
              }
            }
            localzh.c = localzbeu.a.b.getUnderline();
            if (localzbeu.a.d != 4)
            {
              if (this.k.e() != 2) {
                localzh.b(localzanw.e);
              }
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
      float f2 = paramzanw.c - paramzanw.e / 2.0F - paramzbeu.d / 2.0F;
      if (this.h == 1) {
        f1 -= (paramzanw.e - paramzanw.d) / 2.0F;
      } else if (this.h == 8) {
        f1 -= paramzh.j().c() - paramzanw.d;
      }
      localzb = new zb();
      localzb.a(new zi(1.0F, 0.0F, 0.0F, 1.0F, f1, f2));
      localzb.a().a(90.0F, new zo(0.0F, 0.0F));
      paramzh.a(new zo(0.0F, -paramzanw.g));
      localzb.a(paramzh);
    }
    return localzb;
  }
  
  private void b(zb paramzb)
    throws Exception
  {
    if (this.i.size() == 0) {
      return;
    }
    if ((this.k.h() == null) || (this.k.c() == null) || (this.k.c().getFont() == null)) {
      return;
    }
    Font localFont = this.k.c().getFont();
    if ((localFont.getUnderline() != 3) && (localFont.getUnderline() != 4)) {
      return;
    }
    if (this.k.h().getType() != 5) {
      return;
    }
    Color localColor = Color.fromArgb(localFont.getColor().toArgb());
    float f1 = Math.max(0.1F, a(localFont.getDoubleSize(), this.m));
    if ((localFont.isSubscript()) || (localFont.isSuperscript())) {
      f1 *= b;
    }
    zbj localzbj = zbj.a(localFont.getName(), f1, localFont.p());
    zanw localzanw = (zanw)this.i.get(this.i.size() - 1);
    float f2 = 0.0F;
    float f3 = 0.0F;
    if (localzanw.b.size() > 0)
    {
      localObject = (zbeu)localzanw.b.get(0);
      if (((zbeu)localObject).a.d == 4) {
        f2 = ((zbeu)localObject).d;
      }
    }
    if (localzanw.b.size() > 1)
    {
      localObject = (zbeu)localzanw.b.get(localzanw.b.size() - 1);
      if (((zbeu)localObject).a.d == 4) {
        f3 = ((zbeu)localObject).d;
      }
    }
    Object localObject = new zh(localzbj, localColor, new zo(f2, localzanw.c - localzanw.g), "", localFont.isSuperscript(), localFont.isSubscript());
    ((zh)localObject).a(this.c / a * 72.0F - f2 - f3);
    ((zh)localObject).c = localFont.getUnderline();
    paramzb.a((zn)localObject);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
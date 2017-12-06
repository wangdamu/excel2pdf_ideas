package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.zm;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class zet
{
  private zdz a;
  private zes b;
  private Stack c = new Stack();
  
  private zet() {}
  
  public zet(zdz paramzdz)
  {
    this.a = paramzdz;
  }
  
  public void a()
  {
    this.b = new zes();
  }
  
  public void a(zfu paramzfu)
    throws Exception
  {
    paramzfu.c("q");
    this.c.push(this.b.a());
  }
  
  public void b(zfu paramzfu)
    throws Exception
  {
    paramzfu.c("Q");
    this.b = ((zes)zm.a(this.c.pop(), zes.class));
  }
  
  public void a(zi paramzi, zfu paramzfu)
    throws Exception
  {
    paramzfu.a(paramzi, "cm");
    this.b.b().b(paramzi);
  }
  
  public void a(zp paramzp, zfu paramzfu)
    throws Exception
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    Iterator localIterator1 = paramzp.h().iterator();
    while (localIterator1.hasNext())
    {
      zq localzq = (zq)localIterator1.next();
      zgd.a(localzq.a(), localStringBuilder);
      localStringBuilder.append(" m ");
      Iterator localIterator2 = localzq.h().iterator();
      while (localIterator2.hasNext())
      {
        zn localzn = (zn)localIterator2.next();
        Object localObject1;
        Object localObject2;
        if ((localzn instanceof zu))
        {
          localObject1 = (zu)localzn;
          localObject2 = ((zu)localObject1).a();
          float f1 = 0.0F;
          float f2 = 0.0F;
          float[] arrayOfFloat1 = { f1 };
          float[] arrayOfFloat2 = { f2 };
          int k = (this.a.b().a == 1) && (paramzp.h().size() == 1) && (localzq.h().size() == 1) && (a(localzq.a(), (ArrayList)localObject2, arrayOfFloat1, arrayOfFloat2)) ? 1 : 0;
          f1 = arrayOfFloat1[0];
          f2 = arrayOfFloat2[0];
          if (k != 0)
          {
            localStringBuilder.setLength(0);
            zgd.a(localzq.a(), localStringBuilder);
            localStringBuilder.append(" ");
            zgd.a(new zo(f1, f2), localStringBuilder);
            localStringBuilder.append(" re ");
          }
          else
          {
            for (int m = 0; m < ((ArrayList)localObject2).size(); m++)
            {
              zgd.a((zo)((ArrayList)localObject2).get(m), localStringBuilder);
              localStringBuilder.append(" l ");
            }
          }
        }
        else
        {
          Object localObject3;
          if ((localzn instanceof za))
          {
            localObject1 = (za)localzn;
            localObject2 = ((za)localObject1).b();
            localObject3 = new zo[3];
            for (Object localObject5 : localObject2)
            {
              localObject3[0] = ((zy)localObject5).b();
              localObject3[1] = ((zy)localObject5).c();
              localObject3[2] = ((zy)localObject5).d();
              zgd.a((zo[])localObject3, localStringBuilder);
              localStringBuilder.append(" c ");
            }
          }
          else if ((localzn instanceof zt))
          {
            localObject1 = (zt)localzn;
            localObject2 = new zo[3];
            localObject3 = ((zt)localObject1).a().iterator();
            while (((Iterator)localObject3).hasNext())
            {
              ??? = (zy)((Iterator)localObject3).next();
              localObject2[0] = ((zy)???).b();
              localObject2[1] = ((zy)???).c();
              localObject2[2] = ((zy)???).d();
              zgd.a((zo[])localObject2, localStringBuilder);
              localStringBuilder.append(" c ");
            }
          }
        }
      }
    }
    paramzfu.a(zs.a(localStringBuilder));
    if (paramzp.h().size() > 0) {
      paramzfu.c("h W n");
    }
  }
  
  private boolean a(zo paramzo, ArrayList paramArrayList, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    paramArrayOfFloat1[0] = (paramArrayOfFloat2[0] = 0.0F);
    if (paramArrayList.size() != 3) {
      return false;
    }
    zo localzo1 = (zo)paramArrayList.get(0);
    zo localzo2 = (zo)paramArrayList.get(1);
    zo localzo3 = (zo)paramArrayList.get(2);
    if ((Math.abs(paramzo.d() - localzo3.d()) >= 0.01D) || (Math.abs(paramzo.e() - localzo1.e()) >= 0.01D)) {
      return false;
    }
    paramArrayOfFloat1[0] = Math.abs(paramzo.d() - localzo1.d());
    if (Math.abs(paramArrayOfFloat1[0] - Math.abs(localzo2.d() - localzo3.d())) >= 0.01D) {
      return false;
    }
    paramArrayOfFloat2[0] = Math.abs(paramzo.e() - localzo3.e());
    return Math.abs(paramArrayOfFloat2[0] - Math.abs(localzo1.e() - localzo2.e())) < 0.01D;
  }
  
  public void a(zdy paramzdy, boolean paramBoolean, zfu paramzfu)
    throws Exception
  {
    if (paramBoolean)
    {
      if (paramzdy == this.b.c()) {
        return;
      }
      this.b.a(paramzdy);
    }
    else
    {
      if (paramzdy == this.b.d()) {
        return;
      }
      this.b.b(paramzdy);
    }
    StringBuilder localStringBuilder = new StringBuilder(32);
    localStringBuilder.append('/');
    localStringBuilder.append(paramzdy.e());
    localStringBuilder.append(paramBoolean ? " CS" : " cs");
    paramzfu.c(zs.a(localStringBuilder));
  }
  
  public void a(Color paramColor, boolean paramBoolean, zfu paramzfu)
    throws Exception
  {
    if (paramBoolean)
    {
      if ((this.b.c() == zdy.b()) && (paramColor.toArgb() == this.b.e().toArgb())) {
        return;
      }
      this.b.a(zdy.b());
      this.b.a(paramColor);
    }
    else
    {
      if ((this.b.d() == zdy.b()) && (paramColor.toArgb() == this.b.f().toArgb())) {
        return;
      }
      this.b.b(zdy.b());
      this.b.b(paramColor);
    }
    float f;
    if ((paramColor.getA() & 0xFF) < 255)
    {
      localObject = this.a.c().a();
      if (this.a.i() != null) {
        ((zee)localObject).b(this.a.i().n());
      }
      f = (paramColor.getA() & 0xFF) / 255.0F;
      if (paramBoolean) {
        this.b.a(f);
      } else {
        this.b.b(f);
      }
      ((zee)localObject).b(this.b.h());
      ((zee)localObject).a(this.b.g());
      a((zee)localObject, paramzfu);
    }
    else if (c())
    {
      localObject = this.a.c().a();
      if (this.a.i() != null) {
        ((zee)localObject).b(this.a.i().n());
      }
      f = 1.0F;
      if (paramBoolean) {
        this.b.a(f);
      } else {
        this.b.b(f);
      }
      ((zee)localObject).b(this.b.h());
      ((zee)localObject).a(this.b.g());
      a((zee)localObject, paramzfu);
    }
    Object localObject = new StringBuilder(64);
    zgd.a(paramColor, (StringBuilder)localObject);
    ((StringBuilder)localObject).append(paramBoolean ? " RG" : " rg");
    paramzfu.c(zs.a(localObject));
  }
  
  public void a(float paramFloat, zfu paramzfu)
    throws Exception
  {
    if (paramFloat == this.b.i()) {
      return;
    }
    this.b.c(paramFloat);
    StringBuilder localStringBuilder = new StringBuilder(16);
    zgd.a(paramFloat, localStringBuilder);
    localStringBuilder.append(" TL");
    paramzfu.c(zs.a(localStringBuilder));
  }
  
  public void a(zep paramzep, float paramFloat, zfu paramzfu)
    throws Exception
  {
    if ((paramzep == this.b.j()) && (paramFloat == this.b.k())) {
      return;
    }
    this.b.a(paramzep);
    this.b.d(paramFloat);
    StringBuilder localStringBuilder = new StringBuilder(64);
    localStringBuilder.append('/');
    localStringBuilder.append(paramzep.q());
    localStringBuilder.append(' ');
    zgd.a(paramFloat, localStringBuilder);
    localStringBuilder.append(" Tf");
    paramzfu.c(zs.a(localStringBuilder));
  }
  
  public void a(int paramInt, zfu paramzfu)
    throws Exception
  {
    if (paramInt == this.b.l()) {
      return;
    }
    this.b.a(paramInt);
    paramzfu.c(paramInt + " Tr");
  }
  
  public void b(float paramFloat, zfu paramzfu)
    throws Exception
  {
    StringBuilder localStringBuilder = new StringBuilder(16);
    zgd.a(paramFloat, localStringBuilder);
    localStringBuilder.append(" Tc");
    paramzfu.c(zs.a(localStringBuilder));
  }
  
  public void c(float paramFloat, zfu paramzfu)
    throws Exception
  {
    if (paramFloat == this.b.m()) {
      return;
    }
    this.b.e(paramFloat);
    StringBuilder localStringBuilder = new StringBuilder(16);
    zgd.a(paramFloat, localStringBuilder);
    localStringBuilder.append(" w");
    paramzfu.c(zs.a(localStringBuilder));
  }
  
  public void b(int paramInt, zfu paramzfu)
    throws Exception
  {
    if (paramInt == this.b.n()) {
      return;
    }
    this.b.b(paramInt);
    paramzfu.c(paramInt + " J");
  }
  
  public void c(int paramInt, zfu paramzfu)
    throws Exception
  {
    if (paramInt == this.b.o()) {
      return;
    }
    this.b.c(paramInt);
    paramzfu.c(paramInt + " j");
  }
  
  public void d(float paramFloat, zfu paramzfu)
    throws Exception
  {
    if (paramFloat == this.b.p()) {
      return;
    }
    this.b.f(paramFloat);
    StringBuilder localStringBuilder = new StringBuilder(16);
    zgd.a(paramFloat, localStringBuilder);
    localStringBuilder.append(" M");
    paramzfu.c(zs.a(localStringBuilder));
  }
  
  public void a(float[] paramArrayOfFloat, float paramFloat, zfu paramzfu)
    throws Exception
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    zgd.a(paramArrayOfFloat, localStringBuilder);
    localStringBuilder.append(" ");
    zgd.a(paramFloat, localStringBuilder);
    localStringBuilder.append(" d");
    paramzfu.c(zs.a(localStringBuilder));
  }
  
  private void a(zee paramzee, zfu paramzfu)
    throws Exception
  {
    if (paramzee.a(this.b.q())) {
      return;
    }
    this.b.a(paramzee);
    paramzfu.c("/" + paramzee.q() + " gs");
  }
  
  public com.aspose.cells.b.a.b.zq a(com.aspose.cells.b.a.b.zq paramzq)
  {
    zo[] arrayOfzo = new zo[2];
    arrayOfzo[0] = new zo(paramzq.j(), paramzq.k());
    arrayOfzo[1] = new zo(paramzq.l(), paramzq.m());
    this.b.b().a(arrayOfzo);
    com.aspose.cells.b.a.b.zq localzq = new com.aspose.cells.b.a.b.zq();
    localzq.a(Math.min(arrayOfzo[0].d(), arrayOfzo[1].d()));
    localzq.b(Math.min(arrayOfzo[0].e(), arrayOfzo[1].e()));
    localzq.c(Math.abs(arrayOfzo[0].d() - arrayOfzo[1].d()));
    localzq.d(Math.abs(arrayOfzo[0].e() - arrayOfzo[1].e()));
    return localzq;
  }
  
  public zes b()
  {
    return this.b;
  }
  
  public boolean c()
  {
    return (this.b.g() < 1.0F) || (this.b.h() < 1.0F);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
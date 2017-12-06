package com.aspose.cells.a.d;

import com.aspose.cells.b.a.d.zm;

public class zgw
{
  private zgl a = new zgl();
  private zgl b = new zgl();
  private zgs c;
  
  public zgw(zgs paramzgs, boolean paramBoolean)
  {
    this.c = paramzgs;
    if ((paramzgs.w()) || (paramBoolean)) {
      b();
    } else {
      a(65535);
    }
  }
  
  public int a(int paramInt)
  {
    Object localObject = this.a.e(paramInt);
    int i;
    if (localObject != null)
    {
      i = ((Integer)localObject).intValue();
    }
    else
    {
      zgx localzgx = this.c.e().b(paramInt);
      if (localzgx.c() == 0) {
        return -1;
      }
      localObject = this.b.e(localzgx.b());
      if (localObject != null)
      {
        i = ((Integer)localObject).intValue();
        this.a.a(paramInt, Integer.valueOf(i));
      }
      else
      {
        i = localzgx.b();
        this.b.a(localzgx.b(), Integer.valueOf(i));
        this.a.a(paramInt, Integer.valueOf(i));
      }
    }
    return i;
  }
  
  public void a(zm paramzm, boolean paramBoolean1, boolean paramBoolean2)
    throws Exception
  {
    zgu localzgu = new zgu();
    try
    {
      localzgu.a(this.c, this.a, this.b, paramzm, paramBoolean1, paramBoolean2);
    }
    catch (Exception localException)
    {
      localzgu.a(this.c, this.a, this.b, paramzm, paramBoolean1, true);
    }
  }
  
  public zgs a()
  {
    return this.c;
  }
  
  private void b()
  {
    int i = this.c.m().d / 2;
    int k;
    int m;
    for (int j = 0; j < i; j++)
    {
      k = this.c.m().i[j];
      m = this.c.m().h[j];
      for (int n = k; n <= m; n++)
      {
        int i1 = (char)n;
        zgx localzgx2 = this.c.e().b(i1);
        this.a.a(i1, Integer.valueOf(localzgx2.b()));
      }
    }
    if (this.c.m().m)
    {
      zaf localzaf = this.c.m();
      for (k = 0; k < localzaf.q; k++) {
        for (m = localzaf.r[k]; m < localzaf.s[k]; m++)
        {
          zgx localzgx1 = this.c.e().b(m);
          this.a.a(m, Integer.valueOf(localzgx1.b()));
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zgw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
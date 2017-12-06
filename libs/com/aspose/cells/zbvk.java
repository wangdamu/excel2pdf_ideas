package com.aspose.cells;

import com.aspose.cells.b.a.zj;
import java.util.HashMap;

class zbvk
  implements zj
{
  public HashMap a;
  public HashMap b;
  public HashMap c;
  public boolean d = false;
  public boolean e = false;
  public long f;
  public long g;
  public int h = Integer.MAX_VALUE;
  public int i;
  public int j;
  private int k = -1;
  
  public void dispose()
  {
    if (this.a != null)
    {
      this.a.clear();
      this.a = null;
    }
    if (this.b != null)
    {
      this.b.clear();
      this.b = null;
    }
    if (this.c != null)
    {
      this.c.clear();
      this.c = null;
    }
  }
  
  void a(zabz paramzabz)
  {
    long l = paramzabz.D[paramzabz.E];
    if (this.d) {
      if (this.i > paramzabz.E)
      {
        if (!this.b.containsKey(Long.valueOf(l))) {
          this.b.put(Long.valueOf(l), znq.d);
        }
        this.i = paramzabz.E;
      }
      else if (!this.b.containsKey(Long.valueOf(l)))
      {
        this.b.put(Long.valueOf(l), znq.e);
      }
    }
    if (this.e) {
      if (this.j > paramzabz.E)
      {
        if (!this.c.containsKey(Long.valueOf(l))) {
          this.c.put(Long.valueOf(l), znq.d);
        }
        this.j = paramzabz.E;
      }
      else if (!this.c.containsKey(Long.valueOf(l)))
      {
        this.c.put(Long.valueOf(l), znq.e);
      }
    }
  }
  
  boolean a(int paramInt, zaai paramzaai, boolean paramBoolean, zabz paramzabz)
  {
    long l;
    if (paramzabz.L.i == 1)
    {
      l = zaai.a(paramInt, paramzaai.a);
      if (this.d)
      {
        localObject = this.b.get(Long.valueOf(l));
        if (localObject != null)
        {
          if (((Boolean)localObject).booleanValue())
          {
            this.i = paramzabz.E;
            if (this.e)
            {
              localObject = this.c.get(Long.valueOf(l));
              if ((localObject != null) && (((Boolean)localObject).booleanValue())) {
                this.j = paramzabz.E;
              }
            }
          }
          else if (this.e)
          {
            localObject = this.c.get(Long.valueOf(l));
            if (localObject != null) {
              if (((Boolean)localObject).booleanValue()) {
                this.j = paramzabz.E;
              } else {
                return false;
              }
            }
          }
          else
          {
            return false;
          }
        }
        else if (this.e)
        {
          localObject = this.c.get(Long.valueOf(l));
          if ((localObject != null) && (((Boolean)localObject).booleanValue())) {
            this.j = paramzabz.E;
          }
        }
      }
      else if (this.e)
      {
        localObject = this.c.get(Long.valueOf(l));
        if (localObject != null) {
          if (((Boolean)localObject).booleanValue()) {
            this.j = paramzabz.E;
          } else {
            return false;
          }
        }
      }
      if (paramzaai.a(paramzabz.e.get(paramInt).getCells()))
      {
        if (this.d) {
          this.b.put(Long.valueOf(l), znq.e);
        }
        if (this.e) {
          this.c.put(Long.valueOf(l), znq.e);
        }
        return false;
      }
      if ((paramzabz.B == null) || (paramzabz.B[paramInt] == null) || (paramzabz.B[paramInt][paramzaai.a] == null)) {
        return true;
      }
      Object localObject = paramzabz.B[paramInt][paramzaai.a];
      if ((((zaak)localObject).a > -1) && (((zaak)localObject).a != paramzabz.A))
      {
        if (paramBoolean) {
          ((zaak)localObject).a = paramzabz.A;
        }
        return true;
      }
    }
    else if (paramzabz.L.i == 2)
    {
      l = zaai.a(paramInt, paramzaai.a);
      boolean bool = false;
      if (this.d)
      {
        bool = zfn.a(l, this.b, paramzabz.A, paramBoolean);
        if ((bool) && (!paramBoolean)) {
          return true;
        }
      }
      if ((this.e) && (zfn.a(l, this.c, paramzabz.A, paramBoolean))) {
        bool = true;
      }
      if (bool) {
        return true;
      }
    }
    return false;
  }
  
  void a(long paramLong, int paramInt)
  {
    if (paramLong == this.f) {
      this.i = paramInt;
    } else if (paramLong == this.g) {
      this.j = paramInt;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbvk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
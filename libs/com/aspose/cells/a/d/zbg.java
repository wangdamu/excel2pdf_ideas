package com.aspose.cells.a.d;

import com.aspose.cells.b.a.zm;
import java.util.HashMap;

public class zbg
  extends HashMap
{
  private boolean a;
  private long b = 0L;
  
  public zbg(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  public zbw a(long paramLong)
  {
    if (super.containsKey(Long.valueOf(paramLong))) {
      return (zbw)zm.a(super.get(Long.valueOf(paramLong)), zbw.class);
    }
    return null;
  }
  
  public void a(zbw paramzbw)
    throws Exception
  {
    long l;
    if (this.a)
    {
      if (super.size() <= 19)
      {
        l = this.b++;
        l |= 0x80000000;
        paramzbw.a(l);
      }
      else
      {
        l = paramzbw.b();
      }
    }
    else if (paramzbw == null) {
      l = this.b++;
    } else {
      l = a();
    }
    super.put(Long.valueOf(l), paramzbw);
  }
  
  public void b(long paramLong)
  {
    if (this.a)
    {
      if ((paramLong & 0xFFFFFFFF & 0x80000000) == 2147483648L) {
        return;
      }
      super.remove(Long.valueOf(paramLong));
    }
    else
    {
      super.put(Long.valueOf(paramLong), null);
    }
  }
  
  private long a()
    throws Exception
  {
    for (long l = 0L; (l & 0xFFFFFFFF) < super.size(); l += 1L)
    {
      if (!super.containsKey(Long.valueOf(l))) {
        throw new Exception("WMF Objects find slot error");
      }
      if (super.get(Long.valueOf(l)) == null) {
        return l;
      }
    }
    throw new Exception("Object count is out of range.");
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zbg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
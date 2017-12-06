package com.aspose.cells;

import com.aspose.cells.a.a.za;
import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.zw;
import java.util.HashMap;

class zaah
  extends zaao
{
  public HashMap g;
  public HashMap h;
  public boolean i = false;
  public char j = ',';
  public zaoc k = new zaoc();
  public char l;
  public char m;
  public int n;
  
  public zaah(Workbook paramWorkbook)
  {
    super(paramWorkbook);
    if (paramWorkbook.getFileFormat() == 14)
    {
      this.l = '|';
      this.m = ';';
      this.n = 14;
    }
    else
    {
      this.l = ';';
      this.m = ',';
      this.n = 255;
    }
  }
  
  public String a(double paramDouble)
  {
    String str;
    if ((paramDouble >= 1.0E21D) || (Math.abs(paramDouble) <= 1.0E-21D)) {
      str = zp.b(paramDouble);
    } else {
      str = zarb.a(paramDouble);
    }
    if ((this.i) && (this.t.getSettings().f().f().b())) {
      return str.replace('.', this.t.getSettings().f().f().d());
    }
    return str;
  }
  
  public String a(boolean paramBoolean)
  {
    if (this.i) {
      return this.t.getSettings().getGlobalizationSettings().getBooleanValueString(paramBoolean);
    }
    return paramBoolean ? "TRUE" : "FALSE";
  }
  
  public String a(String paramString)
  {
    if (this.i) {
      return this.t.getSettings().getGlobalizationSettings().getErrorValueString(paramString);
    }
    return paramString;
  }
  
  public boolean c()
  {
    switch (this.n)
    {
    case 6: 
    case 7: 
    case 8: 
    case 9: 
      return true;
    }
    return false;
  }
  
  public int a(int paramInt)
  {
    return ((Integer)this.g.get(Integer.valueOf(paramInt))).intValue();
  }
  
  public String b(String paramString)
  {
    if (this.h == null) {
      this.h = new HashMap();
    }
    Object localObject = this.h.get(paramString);
    if (localObject != null) {
      return (String)localObject;
    }
    boolean bool = false;
    if (this.n == 14) {
      bool = zabq.a(paramString);
    } else {
      bool = zabq.a(paramString, this);
    }
    String str;
    if (bool) {
      str = '\'' + zw.a(paramString, "'", "''") + '\'';
    } else {
      str = paramString;
    }
    this.h.put(paramString, str);
    return str;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
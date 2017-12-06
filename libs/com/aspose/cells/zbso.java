package com.aspose.cells;

import com.aspose.cells.b.a.g.a.ze;

class zbso
  implements zajj
{
  private FindOptions a;
  private String b;
  private zajj c;
  private ze d;
  
  zbso(String paramString, FindOptions paramFindOptions)
  {
    this.a = paramFindOptions;
    if (paramFindOptions.getRegexKey())
    {
      switch (this.a.getLookAtType())
      {
      case 1: 
        if (!paramString.startsWith("^")) {
          paramString = "^" + paramString;
        }
        break;
      case 2: 
        if (!paramString.endsWith("$")) {
          paramString = paramString + "$";
        }
        break;
      }
      this.d = new ze(paramString, paramFindOptions.getCaseSensitive() ? 0 : 66);
    }
    else
    {
      switch (this.a.getLookAtType())
      {
      case 3: 
        this.c = new zbsr(paramString, !paramFindOptions.getCaseSensitive());
        break;
      default: 
        if (paramFindOptions.getCaseSensitive()) {
          this.b = paramString;
        } else {
          this.b = paramString.toUpperCase();
        }
        break;
      }
    }
  }
  
  public boolean a(String paramString)
  {
    switch (this.a.getLookAtType())
    {
    case 3: 
      if (this.a.getRegexKey()) {
        return this.d.d(paramString);
      }
      return this.c.a(paramString);
    case 1: 
      if (!this.a.getCaseSensitive()) {
        paramString = paramString.toUpperCase();
      }
      return paramString.startsWith(this.b);
    case 0: 
      if (this.a.getRegexKey()) {
        return this.d.d(paramString);
      }
      if (!this.a.getCaseSensitive()) {
        paramString = paramString.toUpperCase();
      }
      return paramString.indexOf(this.b) != -1;
    case 2: 
      if (!this.a.getCaseSensitive()) {
        paramString = paramString.toUpperCase();
      }
      return paramString.endsWith(this.b);
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbso.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
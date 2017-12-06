package com.aspose.cells;

public class zcjr
{
  private int a;
  private za[] b = new za[this.d + 1];
  private int c;
  private int d = 31;
  
  public zcjr()
  {
    double d1 = CellsHelper.getDoubleFromDateTime(DateTime.getNow(), false);
    this.c = ((int)(d1 - d1) * 24 * 3600 * 1000);
  }
  
  public String a(String paramString)
  {
    if (paramString == null) {
      return "";
    }
    int i = paramString.length();
    if (i == 0) {
      return "";
    }
    int j = i + this.c;
    for (int k = 0; k < paramString.length(); k++) {
      j += (j << 7 ^ paramString.charAt(k));
    }
    j -= (j >> 17);
    j -= (j >> 11);
    j -= (j >> 5);
    for (za localza = this.b[(j & this.d)]; localza != null; localza = localza.b) {
      if ((localza.a == j) && (localza.c.equals(paramString))) {
        return localza.c;
      }
    }
    return a(paramString, j);
  }
  
  public String a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return "";
    }
    int i = paramInt2 + this.c;
    i += (i << 7 ^ paramArrayOfChar[paramInt1]);
    int j = paramInt1 + paramInt2;
    for (int k = paramInt1 + 1; k < j; k++) {
      i += (i << 7 ^ paramArrayOfChar[k]);
    }
    i -= (i >> 17);
    i -= (i >> 11);
    i -= (i >> 5);
    for (za localza = this.b[(i & this.d)]; localza != null; localza = localza.b) {
      if ((localza.a == i) && (a(localza.c, paramArrayOfChar, paramInt1, paramInt2))) {
        return localza.c;
      }
    }
    return a(new String(paramArrayOfChar, paramInt1, paramInt2), i);
  }
  
  private String a(String paramString, int paramInt)
  {
    int i = paramInt & this.d;
    za localza = new za(paramString, paramInt, this.b[i]);
    this.b[i] = localza;
    if (this.a++ == this.d) {
      a();
    }
    return localza.c;
  }
  
  private void a()
  {
    int i = this.d * 2 + 1;
    za[] arrayOfza1 = this.b;
    za[] arrayOfza2 = new za[i + 1];
    for (int j = 0; j < arrayOfza1.length; j++)
    {
      za localza;
      for (Object localObject = arrayOfza1[j]; localObject != null; localObject = localza)
      {
        int k = ((za)localObject).a & i;
        localza = ((za)localObject).b;
        ((za)localObject).b = arrayOfza2[k];
        arrayOfza2[k] = localObject;
      }
    }
    this.b = arrayOfza2;
    this.d = i;
  }
  
  private static boolean a(String paramString, char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (paramString.length() != paramInt2) {
      return false;
    }
    for (int i = 0; i < paramString.length(); i++) {
      if (paramString.charAt(i) != paramArrayOfChar[(paramInt1 + i)]) {
        return false;
      }
    }
    return true;
  }
  
  private class za
  {
    public int a;
    public za b;
    public String c;
    
    public za(String paramString, int paramInt, za paramza)
    {
      this.c = paramString;
      this.a = paramInt;
      this.b = paramza;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcjr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
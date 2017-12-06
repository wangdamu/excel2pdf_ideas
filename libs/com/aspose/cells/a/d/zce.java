package com.aspose.cells.a.d;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.g.a.zc;
import com.aspose.cells.b.a.g.a.ze;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;
import java.util.Iterator;

public class zce
{
  private ze a;
  private boolean b = false;
  private static zce c = new zce();
  
  private zce()
  {
    try
    {
      this.a = new ze("[𐀀-􏿿]");
      this.b = true;
    }
    catch (Exception localException)
    {
      this.b = false;
    }
  }
  
  public zcd[] a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return new zcd[0];
    }
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    if (this.b)
    {
      localObject = this.a.b(paramString);
      Iterator localIterator = ((Iterable)localObject).iterator();
      while (localIterator.hasNext())
      {
        zc localzc = (zc)localIterator.next();
        for (int k = i; k < localzc.d(); k++) {
          zf.a(localArrayList, new zcd(paramString.charAt(k), k));
        }
        k = localzc.a().charAt(1) - 56320 + (localzc.a().charAt(0) - 55296) * 1024 + 65536;
        zf.a(localArrayList, new zcd(k, localzc.d()));
        i = localzc.d() + 2;
      }
    }
    for (Object localObject = i; localObject < paramString.length(); localObject++) {
      zf.a(localArrayList, new zcd(paramString.charAt(localObject), localObject));
    }
    localObject = new zcd[localArrayList.size()];
    for (int j = 0; j < localArrayList.size(); j++) {
      localObject[j] = ((zcd)localArrayList.get(j));
    }
    return (zcd[])localObject;
  }
  
  public char[] a(int paramInt)
  {
    if (paramInt < 65536) {
      return new char[] { (char)paramInt };
    }
    char[] arrayOfChar = new char[2];
    int i = paramInt - 65536;
    int j = 1024;
    arrayOfChar[0] = ((char)(i / j + 55296));
    arrayOfChar[1] = ((char)(i % j + 56320));
    return arrayOfChar;
  }
  
  public String b(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    char[] arrayOfChar1 = a(paramInt);
    for (char c1 : arrayOfChar1) {
      localStringBuilder.append(c1);
    }
    return zs.a(localStringBuilder);
  }
  
  public static zce a()
  {
    return c;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
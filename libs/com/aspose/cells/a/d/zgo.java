package com.aspose.cells.a.d;

import com.aspose.cells.a.c.zf;
import java.util.Comparator;

public class zgo
  implements Comparator
{
  public static Comparator a = new zgo();
  
  public int compare(Object a, Object b)
  {
    if (a == b) {
      return 0;
    }
    if (a == null) {
      return -1;
    }
    if (b == null) {
      return 1;
    }
    String str1 = (String)a;
    String str2 = (String)b;
    int i = str1.length();
    int j = str2.length();
    int k = 0;
    for (int m = 0; (k < i) && (m < j); m++)
    {
      int n = str1.charAt(k);
      int i1 = str2.charAt(m);
      if ((n | i1) <= 127)
      {
        if ((n >= 97) && (n <= 122)) {
          n ^= 0x20;
        }
        if ((i1 >= 97) && (i1 <= 122)) {
          i1 ^= 0x20;
        }
        if (n != i1) {
          return n - i1;
        }
      }
      else if (n != i1)
      {
        n = zf.a((char)n);
        i1 = zf.a((char)i1);
        if (n != i1)
        {
          n = zf.b((char)n);
          i1 = zf.b((char)i1);
          if (n != i1) {
            return n - i1;
          }
        }
      }
      k++;
    }
    return i - j;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zgo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
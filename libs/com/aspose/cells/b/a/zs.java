package com.aspose.cells.b.a;

public class zs
{
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == paramObject2) {
      return true;
    }
    return (paramObject1 != null) && (paramObject2 != null) && (paramObject1.equals(paramObject2));
  }
  
  public static String a(Object paramObject)
  {
    if ((paramObject instanceof Double)) {
      return zo.b(((Double)paramObject).doubleValue());
    }
    if ((paramObject instanceof Float)) {
      return zv.a(((Float)paramObject).floatValue());
    }
    return paramObject.toString();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/zs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
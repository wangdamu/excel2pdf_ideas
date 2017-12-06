package com.aspose.cells;

class zchq
  extends zche
{
  private static zchq a = null;
  private static Object b = new Object();
  
  static zchq a()
  {
    if (null == a) {
      synchronized (b)
      {
        if (null == a) {
          a = new zchq();
        }
      }
    }
    return a;
  }
  
  zche a(zbos paramzbos)
    throws Exception
  {
    Object localObject = null;
    if (((paramzbos.a instanceof Double)) || ((paramzbos.a instanceof Integer)) || ((paramzbos.a instanceof Long))) {
      localObject = new zcdr(paramzbos);
    } else if ((paramzbos.a instanceof String)) {
      localObject = new zcds(paramzbos);
    } else if ((paramzbos.a instanceof Boolean)) {
      localObject = new zcdn(paramzbos);
    } else if ((paramzbos.a instanceof DateTime)) {
      localObject = new zcdo(paramzbos);
    } else if (paramzbos.a == null) {
      localObject = new zcdq(paramzbos);
    } else {
      localObject = new zcdp(paramzbos);
    }
    return (zche)localObject;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zchq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
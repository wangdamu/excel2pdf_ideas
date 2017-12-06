package com.aspose.cells;

import com.aspose.cells.a.e.zf;
import com.aspose.cells.b.a.d.za;
import com.aspose.cells.b.a.d.zb;

class zxf
{
  private boolean b = false;
  private com.aspose.cells.b.a.d.zm c;
  private zagp d;
  private zwz e;
  private zbes f;
  private zso g;
  private com.aspose.cells.b.a.d.zh h;
  private zaoz i;
  
  public zxf(zaoz paramzaoz)
  {
    this.i = paramzaoz;
  }
  
  public zxf(com.aspose.cells.b.a.zh paramzh)
  {
    this(new zaoz(paramzh));
  }
  
  /* Error */
  public zxf(String paramString)
    throws Exception
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 134	java/lang/Object:<init>	()V
    //   4: aload_0
    //   5: iconst_0
    //   6: putfield 56	com/aspose/cells/zxf:b	Z
    //   9: aload_1
    //   10: invokestatic 69	com/aspose/cells/b/a/d/zd:b	(Ljava/lang/String;)Lcom/aspose/cells/b/a/d/ze;
    //   13: astore_2
    //   14: aload_0
    //   15: aload_2
    //   16: invokespecial 126	com/aspose/cells/zxf:b	(Lcom/aspose/cells/b/a/d/zm;)V
    //   19: aload_0
    //   20: invokespecial 128	com/aspose/cells/zxf:d	()V
    //   23: aload_2
    //   24: ifnull +21 -> 45
    //   27: aload_2
    //   28: invokevirtual 75	com/aspose/cells/b/a/d/zm:a	()V
    //   31: goto +14 -> 45
    //   34: astore_3
    //   35: aload_2
    //   36: ifnull +7 -> 43
    //   39: aload_2
    //   40: invokevirtual 75	com/aspose/cells/b/a/d/zm:a	()V
    //   43: aload_3
    //   44: athrow
    //   45: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	46	0	this	zxf
    //   0	46	1	paramString	String
    //   13	27	2	localze	com.aspose.cells.b.a.d.ze
    //   34	10	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   14	23	34	finally
  }
  
  public zxf(com.aspose.cells.b.a.d.zm paramzm)
    throws Exception
  {
    b(paramzm);
    d();
  }
  
  public zxf(com.aspose.cells.b.a.d.zm paramzm, boolean paramBoolean)
    throws Exception
  {
    this(paramzm);
  }
  
  private void b(com.aspose.cells.b.a.d.zm paramzm)
    throws Exception
  {
    if ((!a) && (paramzm == null)) {
      throw new AssertionError();
    }
    this.c = paramzm;
    this.c.b(0L);
    this.d = new zagp(new za(this.c, Encoding.getUnicode()));
    this.e = new zwz(this.c, this.d);
    if (!this.e.a()) {
      throw new IllegalStateException("The file seems to be corrupted.");
    }
    b();
    this.f = new zbes(a(this.d.i, this.d.a(), this.d.a(), true));
    c();
  }
  
  private void b()
  {
    int j = 10;
    int k = Math.min(j, this.e.d());
    for (long l = 0L; (l & 0xFFFFFFFF) < k; l += 1L) {
      if ((this.e.b(l) & 0xFFFFFFFF) != 0L) {
        return;
      }
    }
    throw new IllegalStateException("The FAT in the structured storage document seems to be corrupted.");
  }
  
  /* Error */
  public void a(String paramString)
    throws Exception
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 68	com/aspose/cells/b/a/d/zd:a	(Ljava/lang/String;)Lcom/aspose/cells/b/a/d/ze;
    //   4: astore_2
    //   5: aload_0
    //   6: aload_2
    //   7: invokevirtual 120	com/aspose/cells/zxf:a	(Lcom/aspose/cells/b/a/d/zm;)V
    //   10: aload_2
    //   11: ifnull +21 -> 32
    //   14: aload_2
    //   15: invokevirtual 75	com/aspose/cells/b/a/d/zm:a	()V
    //   18: goto +14 -> 32
    //   21: astore_3
    //   22: aload_2
    //   23: ifnull +7 -> 30
    //   26: aload_2
    //   27: invokevirtual 75	com/aspose/cells/b/a/d/zm:a	()V
    //   30: aload_3
    //   31: athrow
    //   32: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	33	0	this	zxf
    //   0	33	1	paramString	String
    //   4	23	2	localze	com.aspose.cells.b.a.d.ze
    //   21	10	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   5	10	21	finally
  }
  
  public void a(com.aspose.cells.b.a.d.zm paramzm)
    throws Exception
  {
    if ((!a) && (paramzm == null)) {
      throw new AssertionError();
    }
    this.c = paramzm;
    this.c.b(512L);
    this.d = new zagp();
    this.e = new zwz(this.c, this.d);
    this.f = new zbes();
    this.h = new com.aspose.cells.b.a.d.zh();
    this.g = new zso();
    a(this.i, null);
    if (this.h.h() > 0L)
    {
      this.g.a(0L).k = a(this.h, true);
      this.g.a(0L).l = this.h.h();
      int j = 0;
      int[] arrayOfInt = { j };
      this.d.i = a(this.f.c(), true, arrayOfInt);
      j = arrayOfInt[0];
      this.d.j = j;
    }
    else
    {
      this.d.i = 4294967294L;
    }
    this.d.g = a(this.g.b(), true);
    this.e.b();
    this.c.b(0L);
    this.d.a(new zb(this.c, Encoding.getUnicode()));
    this.c.b(this.c.h());
  }
  
  private void a(zaoz paramzaoz, zsn paramzsn)
    throws Exception
  {
    if (paramzsn == null)
    {
      paramzsn = new zsn("Root Entry", true, paramzaoz.a());
      this.g.a(paramzsn);
    }
    if (paramzaoz.b() > 0) {
      paramzsn.f = this.g.a();
    }
    for (int j = 0; j < paramzaoz.b(); j++)
    {
      String str = (String)com.aspose.cells.b.a.zm.a(paramzaoz.c(j), String.class);
      Object localObject1 = paramzaoz.b(j);
      Object localObject2;
      zsn localzsn;
      if ((localObject1 instanceof zaoz))
      {
        localObject2 = (zaoz)com.aspose.cells.b.a.zm.a(localObject1, zaoz.class);
        localzsn = new zsn(str, false, ((zaoz)localObject2).a());
        this.g.a(localzsn);
        a((zaoz)localObject2, localzsn);
      }
      else if ((localObject1 instanceof com.aspose.cells.b.a.d.zm))
      {
        localObject2 = (com.aspose.cells.b.a.d.zm)localObject1;
        localzsn = new zsn(str, 2, ((com.aspose.cells.b.a.d.zm)localObject2).h());
        this.g.a(localzsn);
        localzsn.k = a((com.aspose.cells.b.a.d.zm)localObject2, false);
      }
      else
      {
        throw new IllegalStateException("Unknown object in memory storage.");
      }
      if (j < paramzaoz.b() - 1) {
        localzsn.e = this.g.a();
      }
    }
  }
  
  private long a(com.aspose.cells.b.a.d.zm paramzm, boolean paramBoolean, int[] paramArrayOfInt)
    throws Exception
  {
    paramArrayOfInt[0] = 0;
    if (paramzm.h() == 0L) {
      return 4294967294L;
    }
    boolean bool = (this.d.a(paramzm.h())) || (paramBoolean);
    zbes localzbes = bool ? this.e : this.f;
    com.aspose.cells.b.a.d.zh localzh = bool ? this.c : this.h;
    int j = bool ? 512 : 64;
    long l1 = zbet.b(localzh.i(), bool);
    paramzm.b(0L);
    zbrg.a(paramzm, localzh);
    zbrg.a(localzh, j);
    paramArrayOfInt[0] = zbrg.a(paramzm.h(), j);
    for (long l2 = 1L; (l2 & 0xFFFFFFFF) < paramArrayOfInt[0]; l2 += 1L) {
      localzbes.a((l1 & 0xFFFFFFFF) + (l2 & 0xFFFFFFFF));
    }
    localzbes.a(4294967294L);
    return l1;
  }
  
  private long a(com.aspose.cells.b.a.d.zm paramzm, boolean paramBoolean)
    throws Exception
  {
    int j = 0;
    int[] arrayOfInt = { j };
    long l = a(paramzm, paramBoolean, arrayOfInt);
    j = arrayOfInt[0];
    return l;
  }
  
  private void c()
    throws Exception
  {
    if ((!a) && (this.d == null)) {
      throw new AssertionError("Header must be read before.");
    }
    if ((!a) && (this.e == null)) {
      throw new AssertionError("Fat must be read before.");
    }
    this.g = new zso();
    za localza = new za(this.c, Encoding.getUnicode());
    int j = 4;
    for (long l = this.d.g; l != 4294967294L; l = this.e.b(l))
    {
      this.c.b(zbet.a(l, true));
      for (int k = 0; k < j; k++) {
        this.g.a(new zsn(localza));
      }
    }
  }
  
  private com.aspose.cells.b.a.d.zh a(long paramLong, int paramInt1, int paramInt2, boolean paramBoolean)
    throws Exception
  {
    paramInt2 = Math.min(paramInt1, paramInt2);
    com.aspose.cells.b.a.d.zh localzh1 = new com.aspose.cells.b.a.d.zh(paramInt2);
    localzh1.a(paramInt2);
    boolean bool = (paramBoolean) || (this.d.a(paramInt1));
    if (!bool)
    {
      localObject = this.g.a(0L);
      if ((((zsn)localObject).k != 4294967295L) && (this.h == null)) {
        this.h = a(((zsn)localObject).k, (int)((zsn)localObject).l, (int)((zsn)localObject).l, true);
      }
      if ((this.d.a() == 0) || (this.h == null))
      {
        localzh1.a(0L);
        return localzh1;
      }
    }
    Object localObject = bool ? this.e : this.f;
    com.aspose.cells.b.a.d.zh localzh2 = bool ? this.c : this.h;
    int j = bool ? 512 : 64;
    int k = 0;
    long l1 = localzh2.i();
    for (long l2 = paramLong; (l2 != 4294967294L) && (l2 != 4294967295L); l2 = ((zbes)localObject).b(l2))
    {
      long l3 = zbet.a(l2, bool);
      if (l1 != l3) {
        localzh2.b(l1 = l3);
      }
      int m = paramInt2 - k;
      if (m == 0) {
        break;
      }
      int n = Math.min(j, m);
      int i1 = localzh2.a(localzh1.m(), k, n);
      if (i1 != n) {
        zf.a("The structured file is probably corrupt. Cannot read all data that was expected, but okay to continue.");
      }
      k += n;
      l1 += n;
    }
    return localzh1;
  }
  
  private void d()
    throws Exception
  {
    a(this.g.a(0L), null);
  }
  
  private void a(zsn paramzsn, zaoz paramzaoz)
    throws Exception
  {
    if (paramzsn.m)
    {
      zf.a("The structured storage file seems to be corrupt. This directory entry was already read, ignoring.");
      return;
    }
    paramzsn.m = true;
    if ((paramzaoz != null) && (this.b) && (paramzaoz.b() > 256)) {
      return;
    }
    switch (paramzsn.b)
    {
    case 1: 
    case 5: 
      localObject = new zaoz(paramzsn.g);
      if ((paramzsn.b == 5) && (this.i == null)) {
        this.i = ((zaoz)localObject);
      } else {
        paramzaoz.a(paramzsn.a, (zaoz)localObject);
      }
      localzsn = this.g.a(paramzsn, paramzsn.f);
      if (localzsn != null) {
        a(localzsn, (zaoz)localObject);
      }
      break;
    case 2: 
      paramzaoz.a(paramzsn.a, a(paramzsn.k, (int)paramzsn.l, (int)paramzsn.l, false));
      break;
    case 0: 
      return;
    case 3: 
    case 4: 
    default: 
      throw new IllegalStateException("Unknown type of directory entry in the structured storage.");
    }
    Object localObject = this.g.a(paramzsn, paramzsn.d);
    if (localObject != null) {
      a((zsn)localObject, paramzaoz);
    }
    zsn localzsn = this.g.a(paramzsn, paramzsn.e);
    if (localzsn != null) {
      a(localzsn, paramzaoz);
    }
  }
  
  public zaoz a()
  {
    return this.i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zxf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
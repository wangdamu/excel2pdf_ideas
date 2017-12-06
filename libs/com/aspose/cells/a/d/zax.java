package com.aspose.cells.a.d;

import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Hashtable;

public class zax
  extends zaw
{
  private HashMap b = com.aspose.cells.a.c.zg.a();
  private HashMap c = com.aspose.cells.a.c.zg.a();
  private HashMap d = com.aspose.cells.a.c.zg.a();
  
  public zax(zaz[] paramArrayOfzaz)
  {
    super(paramArrayOfzaz);
  }
  
  public Font a(String paramString, int paramInt, float paramFloat, boolean paramBoolean)
    throws Exception
  {
    String str = paramString + paramInt + "_" + paramFloat;
    Object localObject1 = this.c.get(str);
    if (localObject1 != null) {
      return (Font)localObject1;
    }
    synchronized (this.c)
    {
      localObject1 = this.c.get(str);
      if (localObject1 != null) {
        return (Font)localObject1;
      }
      localObject1 = this.b.get(paramString + paramInt);
      Font localFont = null;
      if (localObject1 == null) {
        localFont = c(paramString, paramInt, paramBoolean);
      } else {
        localFont = (Font)localObject1;
      }
      localFont = localFont.deriveFont(paramInt, paramFloat);
      Hashtable localHashtable = new Hashtable();
      if (!a(localFont.getFamily()).equals(paramString)) {
        localHashtable.put(TextAttribute.FAMILY, paramString);
      }
      localHashtable.put(TextAttribute.POSTURE, TextAttribute.POSTURE_REGULAR);
      localHashtable.put(TextAttribute.SIZE, new Float(paramFloat));
      com.aspose.cells.b.a.b.zg.a(localHashtable, paramInt, false);
      localFont = localFont.deriveFont(localHashtable);
      this.c.put(str, localFont);
      return localFont;
    }
  }
  
  private Font c(String paramString, int paramInt, boolean paramBoolean)
    throws Exception
  {
    synchronized (this.b)
    {
      Object localObject1 = this.b.get(paramString + paramInt);
      if (localObject1 != null) {
        return (Font)localObject1;
      }
      zgs localzgs = null;
      String str = " ";
      try
      {
        if (paramString.startsWith("UNHCR_Map_")) {
          paramString = "Wingdings";
        }
        str = paramString + paramInt + (paramBoolean ? 'T' : 'F');
        localzgs = (zgs)this.a.get(str);
        if (localzgs == null) {
          localzgs = a(a(paramString), paramInt, paramBoolean);
        }
      }
      catch (Exception localException)
      {
        localzgs = a("Arial", paramInt, paramBoolean);
      }
      if (localzgs == null) {
        if (zff.a())
        {
          localzgs = a("Arial Unicode MS", paramInt, paramBoolean);
          if (localzgs == null) {
            localzgs = a("Arial", paramInt, paramBoolean);
          }
        }
        else
        {
          localzgs = a("Arial", paramInt, paramBoolean);
        }
      }
      Font localFont;
      if (localzgs == null)
      {
        localFont = new Font("Serif", paramInt, 10);
        this.b.put(paramString + paramInt, localFont);
      }
      else
      {
        synchronized (this.a)
        {
          if (!this.a.containsKey(str)) {
            this.a.put(str, localzgs);
          }
        }
        localObject1 = this.d.get(localzgs.d());
        if (localObject1 == null) {
          localFont = a(localzgs.d());
        } else {
          localFont = (Font)localObject1;
        }
      }
      return localFont;
    }
  }
  
  private Font a(zaz paramzaz)
    throws Exception
  {
    synchronized (this.d)
    {
      Object localObject1 = this.d.get(paramzaz);
      if (localObject1 != null) {
        return (Font)localObject1;
      }
      Object localObject2;
      Font localFont;
      if ((paramzaz instanceof zau))
      {
        localObject2 = (zau)paramzaz;
        localFont = Font.createFont(0, new File(((zau)localObject2).a()));
      }
      else
      {
        localObject2 = new ByteArrayInputStream(b(paramzaz));
        localFont = Font.createFont(0, (InputStream)localObject2);
        ((ByteArrayInputStream)localObject2).close();
      }
      this.d.put(paramzaz, localFont);
      return localFont;
    }
  }
  
  private byte[] b(zaz paramzaz)
    throws Exception
  {
    zm localzm = paramzaz.b();
    zh localzh = new zh((int)localzm.h());
    zdh.a(localzm, localzh);
    localzm.a();
    byte[] arrayOfByte = localzh.o();
    localzh.a();
    return arrayOfByte;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.aspose.cells;

import com.aspose.cells.a.d.zcc;
import com.aspose.cells.a.d.zgh;
import com.aspose.cells.b.a.b.za;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.ze;
import java.util.ArrayList;
import java.util.HashMap;

class zafd
{
  private zafo a = null;
  
  zafd(zafo paramzafo)
  {
    this.a = paramzafo;
  }
  
  void a(zago paramzago, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean)
    throws Exception
  {
    zawd localzawd = new zawd();
    localzawd.a(this.a.j.getWorksheets());
    int i = localzawd.size();
    if (i == 0) {
      return;
    }
    this.a.a(new HashMap(i));
    if (!paramBoolean) {
      this.a.b(new HashMap(i));
    }
    int j = 0;
    for (int k = 0; k < i; k++)
    {
      zawc localzawc = localzawd.a(k);
      if (localzawc.a() != null)
      {
        Object localObject2;
        Object localObject5;
        if (this.a.c().getExportHiddenWorksheet())
        {
          if (this.a.u.size() == 1)
          {
            int m = 0;
            localObject2 = (Worksheet)this.a.u.get(0);
            int n;
            int i1;
            if (((Worksheet)localObject2).u() != null)
            {
              n = ((Worksheet)localObject2).u().getCount();
              for (i1 = 0; i1 < n; i1++)
              {
                localObject5 = ((Worksheet)localObject2).getPictures().get(i1);
                if ((((Picture)localObject5).b() == k + 1) && (!zagn.a((Picture)localObject5)))
                {
                  m = 1;
                  break;
                }
              }
            }
            if (((Worksheet)localObject2).v() != null)
            {
              n = ((Worksheet)localObject2).v().getCount();
              for (i1 = 0; i1 < n; i1++)
              {
                localObject5 = ((Worksheet)localObject2).getOleObjects().get(i1);
                if (((OleObject)localObject5).e() == k + 1)
                {
                  m = 1;
                  break;
                }
              }
            }
            if (m == 0) {
              continue;
            }
          }
        }
        else {
          if (!a(k)) {
            continue;
          }
        }
        Object localObject1;
        Object localObject3;
        if (localzawc.a)
        {
          localObject1 = "image" + zagn.a(j, 3) + ".pict";
          j++;
          this.a.g().put(Integer.valueOf(k), this.a.b(paramString1) + (String)localObject1);
          if ((this.a.c().getExportImagesAsBase64()) && (paramzago == null)) {
            return;
          }
          if (paramzago == null)
          {
            if (!paramBoolean)
            {
              localObject2 = new StreamProviderOptions();
              ((StreamProviderOptions)localObject2).a = (this.a.r + "/" + (String)localObject1);
              this.a.x.initStream((StreamProviderOptions)localObject2);
              if (((StreamProviderOptions)localObject2).b != null) {
                this.a.h().put(Integer.valueOf(k), ((StreamProviderOptions)localObject2).b);
              }
              localObject3 = ((StreamProviderOptions)localObject2).c;
              ((zm)localObject3).b(localzawc.a(), 0, localzawc.a().length);
              this.a.x.closeStream((StreamProviderOptions)localObject2);
            }
          }
          else if (paramBoolean) {
            a(paramzago, paramString1, paramString2 + (String)localObject1, paramString3, localzawc.a(), paramString4);
          }
        }
        else
        {
          localObject1 = localzawc.b();
          localObject2 = localzawc.a();
          if (localObject1 == ImageFormat.getPng()) {
            try
            {
              localObject3 = new zgh();
              ((zgh)localObject3).a(new zh((byte[])localObject2));
              localObject4 = ((zgh)localObject3).d();
              if (localObject4 != null)
              {
                localObject2 = localObject4;
                localObject1 = ImageFormat.getGif();
              }
            }
            catch (Exception localException1) {}
          }
          String str = FileFormatUtil.a((ImageFormat)localObject1);
          if (str == null)
          {
            str = ".jpg";
            localObject1 = ImageFormat.getJpeg();
          }
          Object localObject4 = "image" + zagn.a(j, 3) + str;
          j++;
          this.a.g().put(Integer.valueOf(k), this.a.b(paramString1) + (String)localObject4);
          if ((!this.a.c().getExportImagesAsBase64()) || (paramzago != null))
          {
            localObject5 = this.a.q + (String)localObject4;
            try
            {
              zh localzh = new zh((byte[])localObject2);
              za localza = new za(localzh);
              if (localza != null)
              {
                if (localObject1 == ImageFormat.getJpeg()) {
                  localza = zcc.a(localza, 1);
                }
                if (paramzago == null)
                {
                  if ((paramBoolean) || ((this.a.c().getImageOptions().d) && (localzawc.b() != this.a.c().getImageOptions().getImageFormat()))) {
                    continue;
                  }
                  localStreamProviderOptions = new StreamProviderOptions();
                  localStreamProviderOptions.a = (this.a.r + "/" + (String)localObject4);
                  this.a.x.initStream(localStreamProviderOptions);
                  if (localStreamProviderOptions.b != null) {
                    this.a.h().put(Integer.valueOf(k), localStreamProviderOptions.b);
                  }
                  localzm = localStreamProviderOptions.c;
                  localzm.b((byte[])localObject2, 0, localObject2.length);
                  this.a.x.closeStream(localStreamProviderOptions);
                }
                else if (paramBoolean)
                {
                  a(paramzago, paramString1, paramString2 + (String)localObject4, paramString3, (byte[])localObject2, paramString4);
                }
              }
            }
            catch (Exception localException2)
            {
              StreamProviderOptions localStreamProviderOptions;
              zm localzm;
              if (paramzago == null)
              {
                if ((paramBoolean) || ((this.a.c().getImageOptions().d) && (localzawc.b() != this.a.c().getImageOptions().getImageFormat()))) {
                  continue;
                }
                localStreamProviderOptions = new StreamProviderOptions();
                localStreamProviderOptions.a = (this.a.r + "/" + (String)localObject4);
                this.a.x.initStream(localStreamProviderOptions);
                if (localStreamProviderOptions.b != null) {
                  this.a.h().put(Integer.valueOf(k), localStreamProviderOptions.b);
                }
                localzm = localStreamProviderOptions.c;
                localzm.b((byte[])localObject2, 0, localObject2.length);
                this.a.x.closeStream(localStreamProviderOptions);
              }
              else if (paramBoolean)
              {
                a(paramzago, paramString1, paramString2 + (String)localObject4, paramString3, (byte[])localObject2, paramString4);
              }
            }
          }
        }
      }
    }
  }
  
  private boolean a(int paramInt)
  {
    for (int i = 0; i < this.a.u.size(); i++)
    {
      Worksheet localWorksheet = (Worksheet)this.a.u.get(i);
      if (localWorksheet.isVisible())
      {
        int j;
        int k;
        Object localObject;
        if (localWorksheet.u() != null)
        {
          j = localWorksheet.u().getCount();
          for (k = 0; k < j; k++)
          {
            localObject = localWorksheet.getPictures().get(k);
            if (((Picture)localObject).b() == paramInt + 1) {
              return true;
            }
          }
        }
        if (localWorksheet.v() != null)
        {
          j = localWorksheet.v().getCount();
          for (k = 0; k < j; k++)
          {
            localObject = localWorksheet.getOleObjects().get(k);
            if (((OleObject)localObject).e() == paramInt + 1) {
              return true;
            }
          }
        }
      }
    }
    return false;
  }
  
  private void a(zago paramzago, String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte, String paramString4)
    throws Exception
  {
    zafo.b(paramzago, paramString1, paramString2, paramString3, paramString4);
    paramzago.a(ze.a(paramArrayOfByte));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zafd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
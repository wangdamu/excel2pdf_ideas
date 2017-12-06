package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

class zagb
  extends zaga
{
  private ArrayList b = new ArrayList();
  
  private String o()
    throws Exception
  {
    StringBuilder localStringBuilder = new StringBuilder();
    e();
    while (!f()) {
      if (l() == '/')
      {
        j();
        if (l() == '*')
        {
          j();
          for (;;)
          {
            if (f()) {
              break label93;
            }
            if (l() == '*')
            {
              j();
              if (l() == '/')
              {
                j();
                break;
              }
              j();
              continue;
            }
            j();
          }
        }
      }
      else
      {
        label93:
        if ((l() == '.') || (l() == 0) || (l() == '\r') || (l() == '\n') || (l() == '\t'))
        {
          if ((l() == '.') && (zs.a(localStringBuilder).trim().length() > 0)) {
            localStringBuilder.append(l());
          }
          j();
        }
        else
        {
          if (l() == '{')
          {
            j();
            break;
          }
          localStringBuilder.append(l());
          j();
        }
      }
    }
    e();
    String str = zs.a(localStringBuilder).trim();
    if (str.indexOf(" ") != -1)
    {
      if (str.indexOf(",") != -1)
      {
        arrayOfString = zw.d(str, new char[] { ',' });
        str = "";
        i = arrayOfString.length - 1;
        for (j = 0; j < i; j++) {
          str = str + arrayOfString[j].trim() + ",";
        }
        str = str + arrayOfString[i].trim();
      }
      String[] arrayOfString = zw.d(str, new char[] { ' ' });
      str = "";
      int i = arrayOfString.length - 1;
      for (int j = 0; j < i; j++) {
        str = str + arrayOfString[j].trim() + "#";
      }
      str = str + arrayOfString[i].trim();
    }
    return str;
  }
  
  public ArrayList m()
    throws Exception
  {
    while (!f())
    {
      String str1 = o();
      if (str1.equals("")) {
        break;
      }
      if (l() == '}')
      {
        j();
      }
      else
      {
        zaga localzaga = new zaga(str1);
        String str2 = g();
        for (String str3 = h(); (str2 != null) && (str3 != null); str3 = h())
        {
          if ((str2.toLowerCase().indexOf("mso-number-format") == -1) && (str3.indexOf(";") != -1))
          {
            if (str3.indexOf(":") == -1)
            {
              localzaga.a(str2, str3);
            }
            else
            {
              String[] arrayOfString = zw.d(str3, new char[] { ';' });
              localzaga.a(str2, arrayOfString[0]);
              for (int i = 1; i < arrayOfString.length; i++)
              {
                int j = arrayOfString[i].indexOf(":");
                if (j != -1)
                {
                  String str4 = arrayOfString[i].substring(j + 1);
                  String str5 = arrayOfString[i].substring(0, 0 + (arrayOfString[i].length() - str4.length() - 1));
                  localzaga.a(str5.trim(), str4.trim());
                }
              }
            }
          }
          else {
            localzaga.a(str2, str3);
          }
          e();
          if (l() == '}')
          {
            j();
            break;
          }
          str2 = g();
        }
        zf.a(this.b, localzaga);
      }
    }
    n();
    return this.b;
  }
  
  private ArrayList b(String paramString)
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      zaga localzaga = (zaga)localIterator.next();
      if (localzaga.k().equals(paramString)) {
        return localzaga.d();
      }
    }
    return null;
  }
  
  public void n()
  {
    Iterator localIterator1 = this.b.iterator();
    while (localIterator1.hasNext())
    {
      zaga localzaga = (zaga)localIterator1.next();
      ArrayList localArrayList1 = new ArrayList();
      localArrayList1 = (ArrayList)localzaga.d().clone();
      Iterator localIterator2 = localArrayList1.iterator();
      while (localIterator2.hasNext())
      {
        zafw localzafw = (zafw)localIterator2.next();
        if (localzafw.a().equals("mso-style-parent"))
        {
          localzaga.d().remove(localzafw);
          ArrayList localArrayList2 = new ArrayList();
          if ((!localzaga.k().equals("td")) && (localzafw.b().equals("style0"))) {
            localArrayList2 = b("td");
          } else {
            localArrayList2 = b(localzafw.b());
          }
          if (localArrayList2 != null) {
            a(localzaga.d(), localArrayList2);
          }
        }
      }
    }
  }
  
  private void a(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramArrayList2.iterator();
    while (localIterator.hasNext())
    {
      zafw localzafw = (zafw)localIterator.next();
      if (!a(paramArrayList1, localzafw)) {
        zf.a(localArrayList, localzafw);
      }
    }
    if (localArrayList.size() > 0) {
      paramArrayList1.addAll(0, localArrayList);
    }
  }
  
  private boolean a(ArrayList paramArrayList, zafw paramzafw)
  {
    if ((paramzafw.a().toLowerCase().equals("border")) && (paramzafw.b().toLowerCase().equals("none")) && (a(paramArrayList))) {
      return true;
    }
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      zafw localzafw = (zafw)localIterator.next();
      if (localzafw.a().equals(paramzafw.a())) {
        return true;
      }
    }
    return false;
  }
  
  private boolean a(ArrayList paramArrayList)
  {
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      zafw localzafw = (zafw)localIterator.next();
      if (localzafw.a().toLowerCase().indexOf("border") != -1) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zagb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
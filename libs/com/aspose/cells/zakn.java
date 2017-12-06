package com.aspose.cells;

import com.aspose.cells.a.c.zk;

class zakn
{
  private zqh a = null;
  
  zakn(zqh paramzqh)
  {
    this.a = paramzqh;
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    b(paramzcjy);
    if (paramzcjy.o()) {
      return;
    }
    BuiltInDocumentPropertyCollection localBuiltInDocumentPropertyCollection = this.a.a.getWorksheets().getBuiltInDocumentProperties();
    paramzcjy.d();
    try
    {
      while (paramzcjy.s() != 4)
      {
        paramzcjy.k();
        if (paramzcjy.s() != 1)
        {
          paramzcjy.a();
        }
        else if ("title".equals(paramzcjy.q()))
        {
          localBuiltInDocumentPropertyCollection.setTitle(paramzcjy.j());
        }
        else if ("creator".equals(paramzcjy.q()))
        {
          localBuiltInDocumentPropertyCollection.setAuthor(paramzcjy.j());
        }
        else if ("subject".equals(paramzcjy.q()))
        {
          localBuiltInDocumentPropertyCollection.setSubject(paramzcjy.j());
        }
        else if ("description".equals(paramzcjy.q()))
        {
          localBuiltInDocumentPropertyCollection.setComments(paramzcjy.j());
        }
        else if ("lastModifiedBy".equals(paramzcjy.q()))
        {
          localBuiltInDocumentPropertyCollection.setLastSavedBy(paramzcjy.j());
        }
        else if ("keywords".equals(paramzcjy.q()))
        {
          localBuiltInDocumentPropertyCollection.setKeywords(paramzcjy.j());
        }
        else if ("category".equals(paramzcjy.q()))
        {
          localBuiltInDocumentPropertyCollection.setCategory(paramzcjy.j());
        }
        else if ("contentType".equals(paramzcjy.q()))
        {
          localBuiltInDocumentPropertyCollection.setContentType(paramzcjy.j());
        }
        else if ("contentStatus".equals(paramzcjy.q()))
        {
          localBuiltInDocumentPropertyCollection.setContentStatus(paramzcjy.j());
        }
        else if ("revision".equals(paramzcjy.q()))
        {
          try
          {
            String str1 = paramzcjy.j();
            localBuiltInDocumentPropertyCollection.setRevision(str1);
          }
          catch (Exception localException1) {}
        }
        else
        {
          String str2;
          if ("lastPrinted".equals(paramzcjy.q()))
          {
            str2 = paramzcjy.j();
            if (str2.length() > 0) {
              localBuiltInDocumentPropertyCollection.setLastPrinted(zk.a(str2));
            }
          }
          else if ("created".equals(paramzcjy.q()))
          {
            str2 = paramzcjy.j();
            if (str2.length() > 0) {
              localBuiltInDocumentPropertyCollection.setCreatedTime(zk.a(str2));
            }
          }
          else if ("modified".equals(paramzcjy.q()))
          {
            str2 = paramzcjy.j();
            if (str2.length() > 0) {
              localBuiltInDocumentPropertyCollection.setLastSavedTime(zk.a(str2));
            }
          }
          else
          {
            paramzcjy.a();
          }
        }
      }
    }
    catch (Exception localException2) {}
  }
  
  private void b(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.k();
    if ((paramzcjy.s() != 1) || (!"coreProperties".equals(paramzcjy.q()))) {
      throw new CellsException(6, "coreProperties root element eror");
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zakn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
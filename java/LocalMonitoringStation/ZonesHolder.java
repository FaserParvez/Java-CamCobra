package LocalMonitoringStation;


/**
* LocalMonitoringStation/ZonesHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./idl/lms.idl
* Friday, 29 April 2016 00:01:59 o'clock BST
*/

public final class ZonesHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public ZonesHolder ()
  {
  }

  public ZonesHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = LocalMonitoringStation.ZonesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    LocalMonitoringStation.ZonesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return LocalMonitoringStation.ZonesHelper.type ();
  }

}

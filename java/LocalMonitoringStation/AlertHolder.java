package LocalMonitoringStation;

/**
* LocalMonitoringStation/AlertHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./idl/lms.idl
* Friday, 29 April 2016 00:01:59 o'clock BST
*/

public final class AlertHolder implements org.omg.CORBA.portable.Streamable
{
  public LocalMonitoringStation.Alert value = null;

  public AlertHolder ()
  {
  }

  public AlertHolder (LocalMonitoringStation.Alert initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = LocalMonitoringStation.AlertHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    LocalMonitoringStation.AlertHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return LocalMonitoringStation.AlertHelper.type ();
  }

}

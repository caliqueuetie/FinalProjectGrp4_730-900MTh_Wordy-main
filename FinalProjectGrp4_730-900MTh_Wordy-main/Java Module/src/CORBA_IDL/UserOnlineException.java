package CORBA_IDL;


/**
* CORBA_IDL/UserOnlineException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameActions.idl
* Tuesday, May 9, 2023 9:47:20 AM CST
*/

public final class UserOnlineException extends org.omg.CORBA.UserException
{

  public UserOnlineException ()
  {
    super(UserOnlineExceptionHelper.id());
  } // ctor


  public UserOnlineException (String $reason)
  {
    super(UserOnlineExceptionHelper.id() + "  " + $reason);
  } // ctor

} // class UserOnlineException
